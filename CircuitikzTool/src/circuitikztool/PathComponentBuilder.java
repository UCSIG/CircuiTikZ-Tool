/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitikztool;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class PathComponentBuilder extends javax.swing.JPanel {

    String componentType;

    public void parseLatexParameters(String input) {
        try {
            try {
                componentType = input.substring(input.indexOf("to[") + 3, input.indexOf(","));
            } catch (IndexOutOfBoundsException e) {
                componentType = input.substring(input.indexOf("to[") + 3, input.indexOf("]"));
            }
            componentLabel.setText(getParameter(input, "l"));
            voltageLabel.setText(getParameter(input, "v"));
            if (input.contains("f=")) {
                currentLabel.setText(getParameter(input, "f"));
                currentLabelToSide.setSelected(true);
            } else if (input.contains("i=")) {
                currentLabel.setText(getParameter(input, "i"));
                currentLabelInSeries.setSelected(true);
            }
            if (input.contains("*-*")) {
                endDot.setSelected(true);
                startDot.setSelected(true);
            } else if (input.contains("*-")) {
                startDot.setSelected(true);
            } else if (input.contains("-*")) {
                endDot.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("Failed to parse path component in parseLatexParameters string: " + input + " could not be parsed" + e.getMessage());
        }
    }

    public String getLatexParameters() {
        String ret = "to[" + componentType;
        if (!componentLabel.getText().isEmpty()) {
            ret += ",l=" + componentLabel.getText();
        }
        if (!voltageLabel.getText().isEmpty()) {
            ret += ",v=" + voltageLabel.getText();
        }
        if (!currentLabel.getText().isEmpty()) {
            if (currentLabelInSeries.isSelected()) {
                ret += ",i=" + currentLabel.getText();
            } else {
                ret += ",f=" + currentLabel.getText();
            }
        }
        if (startDot.isSelected() && endDot.isSelected()) {
            ret += ",*-*";
        } else if (startDot.isSelected()) {
            ret += ",*-";
        } else if (endDot.isSelected()) {
            ret += ",-*";
        }
        ret += "]";
        return ret;
    }

    private String getParameter(String text, String parameter) {
        String cleaned = text.replace("to[", "").replace("]", "");
        String[] params = cleaned.split(",");
        for (int a = 0; a < params.length; a++) {
            if (params[a].contains(parameter + "=")) {
                return params[a].replace(parameter + "=", "");
            }
        }
        return "";
    }

    /**
     * Creates new form pathComponentBuilder
     *
     * @param latexParams
     */
    public PathComponentBuilder(String latexParams) {

        initComponents();

        parseLatexParameters(latexParams);
        setBackground(Preferences.themeBackgroundColor);
        startDot.setBackground(Preferences.themeBackgroundColor);
        endDot.setBackground(Preferences.themeBackgroundColor);
        jLabel1.setBackground(Preferences.themeBackgroundColor);
        jLabel2.setBackground(Preferences.themeBackgroundColor);
        jLabel3.setBackground(Preferences.themeBackgroundColor);
        jLabel4.setBackground(Preferences.themeBackgroundColor);
        currentLabelInSeries.setBackground(Preferences.themeBackgroundColor);
        currentLabelToSide.setBackground(Preferences.themeBackgroundColor);
        componentLabel.setBackground(Preferences.themeBackgroundColor);
        voltageLabel.setBackground(Preferences.themeBackgroundColor);
        currentLabel.setBackground(Preferences.themeBackgroundColor);

        startDot.setForeground(Preferences.themeText);
        endDot.setForeground(Preferences.themeText);
        jLabel1.setForeground(Preferences.themeText);
        jLabel2.setForeground(Preferences.themeText);
        jLabel3.setForeground(Preferences.themeText);
        jLabel4.setForeground(Preferences.themeText);
        currentLabelInSeries.setForeground(Preferences.themeText);
        currentLabelToSide.setForeground(Preferences.themeText);
        componentLabel.setForeground(Preferences.themeText);
        voltageLabel.setForeground(Preferences.themeText);
        currentLabel.setForeground(Preferences.themeText);

        componentLabel.setCaretColor(Preferences.themeText);
        voltageLabel.setCaretColor(Preferences.themeText);
        currentLabel.setCaretColor(Preferences.themeText);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        currentLabelInSeries = new javax.swing.JRadioButton();
        currentLabelToSide = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        startDot = new javax.swing.JCheckBox();
        endDot = new javax.swing.JCheckBox();
        componentLabel = new javax.swing.JTextField();
        voltageLabel = new javax.swing.JTextField();
        currentLabel = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(320, 150));

        jLabel1.setBackground(Preferences.themeBackgroundColor);
        jLabel1.setForeground(Preferences.themeBackgroundColor);
        jLabel1.setText("Label ");

        jLabel2.setBackground(Preferences.themeBackgroundColor);
        jLabel2.setForeground(Preferences.themeBackgroundColor);
        jLabel2.setText("Voltage Label");

        jLabel3.setBackground(Preferences.themeBackgroundColor);
        jLabel3.setForeground(Preferences.themeBackgroundColor);
        jLabel3.setText("Current Label");

        currentLabelInSeries.setForeground(Preferences.themeBackgroundColor);
        currentLabelInSeries.setText("Current Label in Series");
        currentLabelInSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentLabelInSeriesActionPerformed(evt);
            }
        });

        currentLabelToSide.setForeground(Preferences.themeBackgroundColor);
        currentLabelToSide.setText("Current Label To The Side");
        currentLabelToSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentLabelToSideActionPerformed(evt);
            }
        });

        jLabel4.setBackground(Preferences.themeBackgroundColor);
        jLabel4.setForeground(Preferences.themeBackgroundColor);
        jLabel4.setText("Connection Dots");

        startDot.setForeground(Preferences.themeBackgroundColor);
        startDot.setText("At Beginning of Path");
        startDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDotActionPerformed(evt);
            }
        });

        endDot.setForeground(Preferences.themeBackgroundColor);
        endDot.setText("At End of Path");
        endDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDotActionPerformed(evt);
            }
        });

        componentLabel.setBackground(Preferences.themeAccent);
        componentLabel.setForeground(Preferences.themeBackgroundColor);

        voltageLabel.setBackground(Preferences.themeAccent);
        voltageLabel.setForeground(Preferences.themeBackgroundColor);

        currentLabel.setBackground(Preferences.themeAccent);
        currentLabel.setForeground(Preferences.themeBackgroundColor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(currentLabelInSeries)
                .addGap(2, 2, 2)
                .addComponent(currentLabelToSide))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(startDot)
                .addGap(2, 2, 2)
                .addComponent(endDot))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(componentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltageLabel))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(componentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(voltageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(currentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentLabelInSeries)
                    .addComponent(currentLabelToSide))
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDot)
                    .addComponent(endDot)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDotActionPerformed

    }//GEN-LAST:event_startDotActionPerformed

    private void endDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDotActionPerformed

    private void currentLabelInSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentLabelInSeriesActionPerformed
        currentLabelToSide.setSelected(false);
    }//GEN-LAST:event_currentLabelInSeriesActionPerformed

    private void currentLabelToSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentLabelToSideActionPerformed
        currentLabelInSeries.setSelected(false);
    }//GEN-LAST:event_currentLabelToSideActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField componentLabel;
    private javax.swing.JTextField currentLabel;
    private javax.swing.JRadioButton currentLabelInSeries;
    private javax.swing.JRadioButton currentLabelToSide;
    private javax.swing.JCheckBox endDot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox startDot;
    private javax.swing.JTextField voltageLabel;
    // End of variables declaration//GEN-END:variables
}
