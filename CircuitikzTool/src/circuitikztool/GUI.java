/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitikztool;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        schematicWindow = new CircuitMaker();
        wireSelectButton = new javax.swing.JRadioButton();
        twoTerminalSelectButton = new javax.swing.JRadioButton();
        threeTerminalSelectButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        componentString = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        componentList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        schematicWindow.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout schematicWindowLayout = new javax.swing.GroupLayout(schematicWindow);
        schematicWindow.setLayout(schematicWindowLayout);
        schematicWindowLayout.setHorizontalGroup(
            schematicWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        schematicWindowLayout.setVerticalGroup(
            schematicWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        wireSelectButton.setSelected(true);
        wireSelectButton.setText("Wire");
        wireSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wireSelectButtonActionPerformed(evt);
            }
        });

        twoTerminalSelectButton.setText("Two Terminal Generic");
        twoTerminalSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTerminalSelectButtonActionPerformed(evt);
            }
        });

        threeTerminalSelectButton.setText("Three Terminal Generic");
        threeTerminalSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeTerminalSelectButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Component String");

        componentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        componentList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentListFocusGained(evt);
            }
        });
        componentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                componentListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(componentList);

        jLabel2.setText("Components");

        jMenu1.setText("File");

        jMenuItem1.setText("Save");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("About");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(schematicWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wireSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoTerminalSelectButton)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(componentString, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(threeTerminalSelectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wireSelectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoTerminalSelectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeTerminalSelectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componentString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(schematicWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JDialog d = new JDialog(this, "currently unsupported");
        d.setSize(500, 100);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JDialog d = new JDialog(this, "currently unsupported");
        d.setSize(100, 100);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void wireSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wireSelectButtonActionPerformed
        // TODO add your handling code here:
        twoTerminalSelectButton.setSelected(false);
        threeTerminalSelectButton.setSelected(false);
    }//GEN-LAST:event_wireSelectButtonActionPerformed

    private void twoTerminalSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTerminalSelectButtonActionPerformed
        wireSelectButton.setSelected(false);
        threeTerminalSelectButton.setSelected(false);
    }//GEN-LAST:event_twoTerminalSelectButtonActionPerformed

    private void threeTerminalSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeTerminalSelectButtonActionPerformed
        wireSelectButton.setSelected(false);
        twoTerminalSelectButton.setSelected(false);
    }//GEN-LAST:event_threeTerminalSelectButtonActionPerformed

    private void componentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_componentListValueChanged

//        CircuitikzTool.cm.setSelectedComponentIndex(componentList.getSelectedIndex());

    }//GEN-LAST:event_componentListValueChanged

    private void componentListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_componentListFocusGained
//      CircuitikzTool.cm.setSelectedComponentIndex(componentList.getSelectedIndex());
    }//GEN-LAST:event_componentListFocusGained

    public int getCurrentToolSelected() {
        if (twoTerminalSelectButton.isSelected()) {
            return Component.TWO_TERMINAL;
        } else if (threeTerminalSelectButton.isSelected()) {
            return Component.THREE_TERMINAL;
        } else {
            return Component.WIRE;
        }
    }

    public void deslectList() {
        componentList.clearSelection();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    public javax.swing.JList<String> componentList;
    private javax.swing.JTextField componentString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel schematicWindow;
    private javax.swing.JRadioButton threeTerminalSelectButton;
    private javax.swing.JRadioButton twoTerminalSelectButton;
    private javax.swing.JRadioButton wireSelectButton;
    // End of variables declaration//GEN-END:variables
}
