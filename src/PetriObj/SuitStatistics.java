package PetriObj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SuitStatistics {
    private final LinkedList<Double> arrivedQ;
    private final LinkedList<Double> dsQ;

    private double dMaxt;
    private double undMeant;
    private double dMeant;
    private double undMaxt;

    private int arrivedN;
    private int dsN;
    private int gdsN;
    private int gundsN;

    private int startArrivedN;
    private int startDsN;
    private int startGdsN;
    private int startGundsN;

    private int skip;
    private int skip2;

    private final List<Double> meanUndInIntervals;

    private boolean startIsSet = false;

    public SuitStatistics() {
        arrivedQ = new LinkedList<>();
        dsQ = new LinkedList<>();
        meanUndInIntervals = new ArrayList<>();
        dMaxt = 0d;
        undMeant = 0d;
        dMeant = 0d;
        undMaxt = 0d;
        arrivedN = 0;
        dsN = 0;
        gdsN = 0;
        gundsN = 0;
        startArrivedN = 0;
        startDsN = 0;
        startGdsN = 0;
        startGundsN = 0;
        skip = 0;
        skip2 = 0;
    }

    /***/

    public boolean getStartIsSet() {
        return startIsSet;
    }

    public void setStartParams(int startArrivedN, int startDsN, int startGdsN, int startGundsN, int skip, int skip2) {
        this.startArrivedN = startArrivedN;
        this.startDsN = startDsN;
        this.startGdsN = startGdsN;
        this.startGundsN = startGundsN;
        this.skip = skip;
        this.skip2 = skip2;
        startIsSet = true;
    }

    public void addInMeanUndInIntervals() {
        if(gundsN != 0)
            meanUndInIntervals.add(undMeant/gundsN);
    }

    public List<Double> getMeanUndInIntervals() {
        return meanUndInIntervals;
    }

    public void ifArrivedNIncreased(int an0, double curT) {
        if(an0 > arrivedN + startArrivedN) {
            arrivedQ.add(curT);
            arrivedN++;
        }
    }

    public void ifDsNIncreased(int dsn0) {
        if(dsn0 > dsN + startDsN) {
            if(skip > 0) {
                startDsN++;
                skip--;
                skip2++;
                return;
            }
            addDsQFromArrivedQ();
        }
    }

    public void addDsQFromArrivedQ() {
        if(arrivedQ.size() == 0) {
            startDsN++;
            return;
        }
        double t = arrivedQ.removeFirst();
        dsQ.add(t);
        dsN++;
    }

    public void ifGdsNIncreased(int gdsn0, double curT) {
        if(gdsn0 > gdsN + startGdsN) {
            if(skip2 > 0) {
                startGdsN++;
                skip2--;
                return;
            }
            if(dsQ.size() == 0) {
                startGdsN++;
                return;
            }
            double t0 = dsQ.removeFirst();
            double t = curT - t0;
            if(dMaxt < t)
                dMaxt = t;
            dMeant += t;
            gdsN++;
        }
    }

    public void ifGundsNIncreased(int gundsn0, double curT) {
        if(gundsn0 > gundsN + startGundsN) {
            if(skip>0) {
                startGundsN++;
                skip--;
                return;
            }
            if(arrivedQ.size() == 0) {
                startGundsN++;
                return;
            }
            double t0 = arrivedQ.removeFirst();
            double t = curT - t0;
            if(t==6) {
                int a=1;
            }
            //System.out.println("T: " + t);
            if(undMaxt < t)
                undMaxt = t;
            undMeant += t;
            gundsN++;
        }
    }

    public double getdMeant() {
        return dMeant / gdsN;
    }

    public double getUndMeant() {
        return undMeant / gundsN;
    }

    public int getGdsN() {
        return gdsN;
    }

    public int getGundsN() {
        return gundsN;
    }

    public double getdMaxt() {
        return dMaxt;
    }

    public double getUndMaxt() {
        return undMaxt;
    }

    /***/

    public double getFirstArrivedQ() {
        return  arrivedQ.getFirst();
    }

    public void addArrivedQ(double t) {
        arrivedQ.add(t);
        arrivedN++;
    }

    public double removeFirstArrivedQ() {
        return arrivedQ.removeFirst();

    }

    public double getFirstDsQ() {
        return dsQ.getFirst();
    }


    public double removeFirstDsQ() {
        return dsQ.removeFirst();
    }

    public void setUndMaxt(double undMaxt) {
        this.undMaxt = undMaxt;
    }


    public void setdMaxt(double dMaxt) {
        this.dMaxt = dMaxt;
    }

    public void setUndMeant(double undMeant) {
        this.undMeant = undMeant;
    }

    public void setdMeant(double dMeant) {
        this.dMeant = dMeant;
    }
}
