/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LibTest;

//import PetriObj.PetriObjModel;
import LibNet.NetLibrary;
import PetriObj.ExceptionInvalidNetStructure;
import PetriObj.ExceptionInvalidTimeDelay;
import PetriObj.PetriObjModel;
import PetriObj.PetriSim;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Inna V. Stetsenko
 */
public class TestPetriObjSimulation {
      public static void main(String[] args) throws ExceptionInvalidTimeDelay, ExceptionInvalidNetStructure {
          runModel();
          //runModelWithResult(16);
      }

    public static void runModel() throws ExceptionInvalidNetStructure, ExceptionInvalidTimeDelay {
        PetriObjModel model = getTestModel();
        model.setIsProtokol(false);
        double timeModeling = 310_000;
        model.go(timeModeling);
    }

      public static void runModelExperiment() throws ExceptionInvalidTimeDelay, ExceptionInvalidNetStructure {
          double min1 = 9.5, max1 = 11;
          double min2 = 4.5, max2 = 6;
          double min3 = 4, max3 = 5;
          double min4 = 7, max4 = 10.0;

          List<Double> dispList = new ArrayList<>();
          dispList.add(makeExp(max1, max2, max3, max4));
          dispList.add(makeExp(min1, max2, max3, max4));
          dispList.add(makeExp(max1, min2, max3, max4));
          dispList.add(makeExp(min1, min2, max3, max4));
          dispList.add(makeExp(max1, max2, min3, max4));

          dispList.add(makeExp(min1, max2, min3, max4));
          dispList.add(makeExp(max1, min2, min3, max4));
          dispList.add(makeExp(min1, min2, min3, max4));
          dispList.add(makeExp(max1, max2, max3, min4));
          dispList.add(makeExp(min1, max2, max3, min4));

          dispList.add(makeExp(max1, min2, max3, min4));
          dispList.add(makeExp(min1, min2, max3, min4));
          dispList.add(makeExp(max1, max2, min3, min4));
          dispList.add(makeExp(min1, max2, min3, min4));
          dispList.add(makeExp(max1, min2, min3, min4));
          dispList.add(makeExp(min1, min2, min3, min4));
          double max = Collections.max(dispList);
          double sum = 0;
          for(double d: dispList) {
              System.out.print(d + " ");
              sum += d;
          }

          System.out.println("\nRes: " + max/sum);
      }

      public static double makeExp(double p1, double p2, double p3, double p4) throws ExceptionInvalidTimeDelay, ExceptionInvalidNetStructure {
          int n = 16;
          List<Double> undMT = new ArrayList<>();
          double timeModeling = 310000;
          double meanT = 0d;
          for(int i=0; i<n; i++) {
              PetriObjModel model = getTestModelExp(p1, p2, p3, p4);
              model.setIsProtokol(false);
              model.setIsStatistics(true);
              double t = model.goWithResult(timeModeling);
              undMT.add(t);
              meanT += t;
          }

          meanT = meanT/n;
          double disp = 0d;
          for(int i=0; i<n; i++) {
              disp += Math.pow(undMT.get(i) - meanT, 2);
          }
          disp = disp/(n-1);
          //System.out.println("meanT: " + meanT);
          //System.out.println("disp: " + disp);
          System.out.print(new DecimalFormat("#0.0000").format(meanT) + " ");
          System.out.print(new DecimalFormat("#0.0000").format(disp) + "\n");
          return disp;
      }

      public static void runModelWithResult(int n) throws ExceptionInvalidTimeDelay, ExceptionInvalidNetStructure {
          List<Double> undMT = new ArrayList<>();
          double timeModeling = 290000;
          double meanT = 0d;
          for(int i=0; i<n; i++) {
              PetriObjModel model = getTestModel();
              model.setIsProtokol(false);
              model.setIsStatistics(true);
              double t = model.goWithResult(timeModeling);
              System.out.println(t);
              undMT.add(t);
              meanT += t;
          }

          meanT = meanT/n;
          double disp = 0d;
          for(int i=0; i<n; i++) {
              disp += Math.pow(undMT.get(i) - meanT, 2);
          }
          disp = disp/(n-1);
          System.out.println("meanT: " + meanT);
          System.out.println("disp: " + disp);
          System.out.print(new DecimalFormat("#0.0000").format(meanT) + " ");
          System.out.print(new DecimalFormat("#0.0000").format(disp) + " ");

      }


      public static PetriObjModel getTestModel() throws ExceptionInvalidTimeDelay, ExceptionInvalidNetStructure {
          ArrayList<PetriSim> list = new ArrayList<>();
          double genT = 10;
          double divideSuitT = 6.0;
          double gatherUndamagedSuitsT = 5.0;
          double gatherDamagedSuitsT = 8.0;
          list.add(new PetriSim(NetLibrary.CreateDryCleaningNet(genT, divideSuitT, gatherUndamagedSuitsT,
                  gatherDamagedSuitsT)));
          return new PetriObjModel(list);
      }

    public static PetriObjModel getTestModelExp(double genT, double divideSuitT, double gatherUndamagedSuitsT,
                                             double gatherDamagedSuitsT) throws ExceptionInvalidTimeDelay,
            ExceptionInvalidNetStructure {
        ArrayList<PetriSim> list = new ArrayList<>();
        list.add(new PetriSim(NetLibrary.CreateDryCleaningNet(genT, divideSuitT, gatherUndamagedSuitsT, gatherDamagedSuitsT)));
        return new PetriObjModel(list);
    }
}
