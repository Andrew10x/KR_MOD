package graphpresentation;

import graphnet.GraphPetriPlace;
import PetriObj.PetriP;
import java.awt.*;
import utils.Utils;

import javax.swing.*;

/**
 *
 * @author Оля
 */
public class SetPosition extends javax.swing.JFrame {

    /**
     * Creates new form SetPosition
     */
    public SetPosition(PetriNetsPanel panel) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.panel = panel;
        this.setSize(new Dimension(320, 222));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPositionPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        markLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        markTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setTitle("Place parameters");

        setPositionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic parameters"));

        nameLabel.setText("Name");

        markLabel.setText("Markers");

        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        markTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout setPositionPanelLayout = new javax.swing.GroupLayout(setPositionPanel);
        setPositionPanel.setLayout(setPositionPanelLayout);
        setPositionPanelLayout.setHorizontalGroup(
            setPositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setPositionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setPositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setPositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(markTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addContainerGap())
        );
        setPositionPanelLayout.setVerticalGroup(
            setPositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setPositionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setPositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setPositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(markLabel)
                    .addComponent(markTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setPositionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setPositionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//<-- destroy only this frame

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            setPName();
            setPMark();
            choosenPetriP = null;
            panel.repaint();
            this.setVisible(false);
        } catch (NumberFormatException e) {
            markTextField.setText("");
            markTextField.setToolTipText("Enter an integer");
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        choosenPetriP = null;
        panel.repaint();
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void setPName() {
        choosenPetriP.getPetriPlace().setName(nameTextField.getText());
    }

    private void setPMark() { // modified by Katya 08.12.2016
        PetriP petriPlace = choosenPetriP.getPetriPlace();
        String markValueStr = markTextField.getText();
        if (Utils.tryParseInt(markValueStr)) {
            petriPlace.setMark(Integer.valueOf(markValueStr));
            petriPlace.setMarkParam(null);
        } else {
            petriPlace.setMarkParam(markValueStr);
        }
    }

    private void setChoosen(GraphElement e) {
        choosenPetriP = (GraphPetriPlace) e;
    }

    private void getPName() {
        nameTextField.setText(choosenPetriP.getPetriPlace().getName());
    }

    private void getPMark() { // modified by Katya 08.12.2016
        PetriP petriPlace = choosenPetriP.getPetriPlace();
        String markStr = petriPlace.markIsParam()
            ? petriPlace.getMarkParamName()
            : Integer.toString(petriPlace.getMark());
        markTextField.setText(markStr);
    }

    public void setInfo(GraphElement e) {
        setChoosen(e);
        getPName();
        getPMark();
    }
    private PetriNetsPanel panel;
    private GraphPetriPlace choosenPetriP;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel markLabel;
    private javax.swing.JTextField markTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel setPositionPanel;
    // End of variables declaration//GEN-END:variables
}
