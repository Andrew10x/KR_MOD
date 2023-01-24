/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetTransition.java
 *
 * Created on 02.12.2011, 18:21:37
 */
package graphpresentation;

import graphnet.GraphPetriTransition;
import PetriObj.*;
import java.awt.*;
import utils.Utils;

import javax.swing.*;

/**
 *
 * @author User
 */
public class SetTransition extends javax.swing.JFrame {

    /** Creates new form SetTransition */
    public SetTransition(PetriNetsPanel panel) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.panel=panel;
        this.setSize(new Dimension(374, 564));

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//<-- destroy only this frame
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseParametersPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        timeDelayPanel = new javax.swing.JPanel();
        parametrLabel = new javax.swing.JLabel();
        parametrTextField = new javax.swing.JTextField();
        destributionLabel = new javax.swing.JLabel();
        destributionComboBox = new javax.swing.JComboBox();
        paramDeviationLabel = new javax.swing.JLabel();
        paramDeviationTextField = new javax.swing.JTextField();
        destributionLabel1 = new javax.swing.JLabel();
        distributionParamNameField = new javax.swing.JTextField();
        priorityPanel = new javax.swing.JPanel();
        priorityLabel = new javax.swing.JLabel();
        prioritySpinner = new javax.swing.JSpinner();
        priorityLabel1 = new javax.swing.JLabel();
        priorityParamNameField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        probabilityLabel = new javax.swing.JLabel();
        probabilityTextField = new javax.swing.JTextField();

        setTitle("Transition parameters");

        baseParametersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic parameters"));
		baseParametersPanel.setSize(new Dimension(300, 74));
		
        nameLabel.setText("Name");

        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout baseParametersPanelLayout = new javax.swing.GroupLayout(baseParametersPanel);
        baseParametersPanel.setLayout(baseParametersPanelLayout);
        baseParametersPanelLayout.setHorizontalGroup(
            baseParametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseParametersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        baseParametersPanelLayout.setVerticalGroup(
            baseParametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseParametersPanelLayout.createSequentialGroup()
                .addGroup(baseParametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeDelayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Time delay"));

        parametrLabel.setText("Delay mean value");

        parametrTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        parametrTextField.setText("0.0");

        destributionLabel.setText("Time delay distribution");

        destributionComboBox.setEditable(true);
        destributionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "exp", "unif", "norm" }));
        destributionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destributionComboBoxActionPerformed(evt);
            }
        });

        paramDeviationLabel.setText("Standard deviation");

        paramDeviationTextField.setEditable(false);
        paramDeviationTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paramDeviationTextField.setText("0.0");

        destributionLabel1.setText("Distribution (parameter name)");

        distributionParamNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout timeDelayPanelLayout = new javax.swing.GroupLayout(timeDelayPanel);
        timeDelayPanel.setLayout(timeDelayPanelLayout);
        timeDelayPanelLayout.setHorizontalGroup(
            timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeDelayPanelLayout.createSequentialGroup()
                .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeDelayPanelLayout.createSequentialGroup()
                        .addComponent(parametrLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(parametrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timeDelayPanelLayout.createSequentialGroup()
                        .addComponent(destributionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(destributionComboBox, 0, 99, Short.MAX_VALUE))
                    .addGroup(timeDelayPanelLayout.createSequentialGroup()
                        .addComponent(destributionLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(distributionParamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(timeDelayPanelLayout.createSequentialGroup()
                    .addComponent(paramDeviationLabel)
                    .addContainerGap(106, Short.MAX_VALUE)))
            .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeDelayPanelLayout.createSequentialGroup()
                    .addContainerGap(156, Short.MAX_VALUE)
                    .addComponent(paramDeviationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        timeDelayPanelLayout.setVerticalGroup(
            timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeDelayPanelLayout.createSequentialGroup()
                .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parametrLabel)
                    .addComponent(parametrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destributionLabel)
                    .addComponent(destributionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destributionLabel1)
                    .addComponent(distributionParamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(timeDelayPanelLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(paramDeviationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
            .addGroup(timeDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(timeDelayPanelLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(paramDeviationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        priorityPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Transition priority"));

        priorityLabel.setText("Priority value");

        prioritySpinner.setModel(new javax.swing.SpinnerNumberModel());

        priorityLabel1.setText("Priority (parameter name)");

        priorityParamNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout priorityPanelLayout = new javax.swing.GroupLayout(priorityPanel);
        priorityPanel.setLayout(priorityPanelLayout);
        priorityPanelLayout.setHorizontalGroup(
            priorityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priorityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(priorityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priorityPanelLayout.createSequentialGroup()
                        .addComponent(priorityLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priorityParamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(priorityPanelLayout.createSequentialGroup()
                        .addComponent(priorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(prioritySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        priorityPanelLayout.setVerticalGroup(
            priorityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priorityPanelLayout.createSequentialGroup()
                .addGroup(priorityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLabel)
                    .addComponent(prioritySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(priorityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLabel1)
                    .addComponent(priorityParamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Activation probability"));

        probabilityLabel.setText("Probability value");

        probabilityTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        probabilityTextField.setText("1.0");
        probabilityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probabilityTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(probabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(probabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(probabilityLabel)
                    .addComponent(probabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeDelayPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baseParametersPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priorityPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baseParametersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeDelayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priorityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Probability");

        getAccessibleContext().setAccessibleName(""); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
     try{
        setTName();
        setTimeDelay();
        setPriority();
        choosenPetriT=null;
        this.setVisible(false);
        panel.repaint();
     }
      catch (NumberFormatException e){        
       } 
    }//GEN-LAST:event_okButtonActionPerformed
 
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        panel.repaint();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void destributionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destributionComboBoxActionPerformed
     
        if ((destributionComboBox.getSelectedIndex()==2)||(destributionComboBox.getSelectedIndex()==3)) 
        paramDeviationTextField.setEditable(true);
     
       // TODO add your handling code here:
    }//GEN-LAST:event_destributionComboBoxActionPerformed

    private void probabilityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probabilityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probabilityTextFieldActionPerformed

     /**
      * @param args the command line arguments
      */

    private void setTName(){
        choosenPetriT.getPetriTransition().setName(nameTextField.getText());
    }

    private void setTimeDelay() { // modified by Katya 08.12.2016
        PetriT petriTran = choosenPetriT.getPetriTransition();
        String parametrValueStr = parametrTextField.getText();
        double parametrValue = 0;
        if (Utils.tryParseDouble(parametrValueStr)) {
            parametrValue = Double.valueOf(parametrValueStr);
            petriTran.setParametr(parametrValue);
            petriTran.setParametrParam(null);
        } else {
            petriTran.setParametrParam(parametrValueStr);
        }
        
        String probabilityValueStr = probabilityTextField.getText();
        if (Utils.tryParseDouble(probabilityValueStr)) {
            petriTran.setProbability(Double.valueOf(probabilityValueStr));
            petriTran.setProbabilityParam(null);
        } else {
            petriTran.setProbabilityParam(probabilityValueStr);
        }
        
        String distributionParamName = distributionParamNameField.getText();
        if (distributionParamName != null && !distributionParamName.isEmpty()) {
            petriTran.setDistributionParam(distributionParamName);
        } else {
            if (destributionComboBox.getSelectedIndex()==0) {
                petriTran.setDistribution(null, parametrValue);
                paramDeviationTextField.setEditable(false);
            }
            if (destributionComboBox.getSelectedIndex()==1) {
                petriTran.setDistribution("exp", parametrValue);
                paramDeviationTextField.setEditable(false);
            }
            if (destributionComboBox.getSelectedIndex()==2) { 
                petriTran.setDistribution("unif", parametrValue);
                paramDeviationTextField.setEditable(true);
                petriTran.setParamDeviation(Double.valueOf(paramDeviationTextField.getText()));
            }
            if (destributionComboBox.getSelectedIndex()==3) { 
                petriTran.setDistribution("norm", parametrValue);
                paramDeviationTextField.setEditable(true);
                petriTran.setParamDeviation(Double.valueOf(paramDeviationTextField.getText()));
            }
            petriTran.setDistributionParam(null);
        }
    }

    private void setPriority() { // modified by Katya 08.12.2016
        PetriT petriTran = choosenPetriT.getPetriTransition();
        int priorityValue = (Integer) prioritySpinner.getModel().getValue();
        String priorityParamName = priorityParamNameField.getText();
        if (priorityParamName != null && !priorityParamName.isEmpty()) {
            petriTran.setPriorityParam(priorityParamName);
        } else {
            petriTran.setPriority(priorityValue);
            petriTran.setPriorityParam(null);
        }
    }

    public void getPriority() { // modified by Katya 08.12.2016
        PetriT petriTran = choosenPetriT.getPetriTransition();
        prioritySpinner.setValue(petriTran.getPriority());
        priorityParamNameField.setText(petriTran.getPriorityParamName());
    }
    
    private void getTName() {
        nameTextField.setText(choosenPetriT.getPetriTransition().getName());
    }
    
    private void getTimeDelay() { // modified by Katya 08.12.2016
        PetriT petriTran = choosenPetriT.getPetriTransition();
        String parametrStr = petriTran.parametrIsParam()
            ? petriTran.getParametrParamName()
            : Double.toString(petriTran.getParametr());
        parametrTextField.setText(parametrStr);
        
        String probabilityStr = petriTran.probabilityIsParam()
            ? petriTran.getProbabilityParamName()
            : Double.toString(petriTran.getProbability());
        probabilityTextField.setText(probabilityStr);
        
        String distribution = petriTran.getDistribution();
        if (distribution == null) {
            destributionComboBox.setSelectedIndex(0);
            paramDeviationTextField.setEditable(false);
        }
        if ("exp".equals(distribution)) {
            destributionComboBox.setSelectedIndex(1);
            paramDeviationTextField.setEditable(false);
        }
        if ("unif".equals(distribution)) {
            destributionComboBox.setSelectedIndex(2);
            paramDeviationTextField.setEditable(true);
            paramDeviationTextField.setText(Double.toString(petriTran.getParamDeviation()));
        }
        if ("norm".equals(distribution)) {
            destributionComboBox.setSelectedIndex(3);
            paramDeviationTextField.setEditable(true);
            paramDeviationTextField.setText(Double.toString(petriTran.getParamDeviation()));
        }
        distributionParamNameField.setText(petriTran.getDistributionParamName());
    }
    
    private void setChoosen(GraphElement e){
        choosenPetriT=(GraphPetriTransition)e;
    }
    
    public void setInfo(GraphElement e){
        setChoosen(e);
        getTName();
        getTimeDelay();
        getPriority();
    }
    
    private PetriNetsPanel panel;
    private GraphPetriTransition choosenPetriT;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseParametersPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox destributionComboBox;
    private javax.swing.JLabel destributionLabel;
    private javax.swing.JLabel destributionLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priorityParamNameField;
    private javax.swing.JTextField distributionParamNameField;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel paramDeviationLabel;
    private javax.swing.JTextField paramDeviationTextField;
    private javax.swing.JLabel parametrLabel;
    private javax.swing.JTextField parametrTextField;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JLabel priorityLabel1;
    private javax.swing.JPanel priorityPanel;
    private javax.swing.JSpinner prioritySpinner;
    private javax.swing.JLabel probabilityLabel;
    private javax.swing.JTextField probabilityTextField;
    private javax.swing.JPanel timeDelayPanel;
    // End of variables declaration//GEN-END:variables
}
