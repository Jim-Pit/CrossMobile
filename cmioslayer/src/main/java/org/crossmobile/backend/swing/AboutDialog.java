/*
 * (c) 2019 by Panayotis Katsaloulis
 *
 * CrossMobile is free software; you can redistribute it and/or modify
 * it under the terms of the CrossMobile Community License as published
 * by the CrossMobile team.
 *
 * CrossMobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CrossMobile Community License for more details.
 *
 * You should have received a copy of the CrossMobile Community
 * License along with CrossMobile; if not, please contact the
 * CrossMobile team at https://crossmobile.tech/contact/
 */
package org.crossmobile.backend.swing;

import org.crossmobile.bind.system.AppConstants;

import static org.crossmobile.bridge.system.MaterialsCommon.MATERIALS_TAG;

public class AboutDialog extends javax.swing.JDialog {

    public AboutDialog() {
        super(SwingGraphicsBridge.frame, true);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        versionL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        iconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/crossmobile/" + MATERIALS_TAG + "/sys/appicon.png")));
        iconL.setAlignmentX(0.5F);
        iconL.setAutoscrolls(true);
        iconL.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 120, 15, 120));
        getContentPane().add(iconL);

        nameL.setFont(nameL.getFont().deriveFont(nameL.getFont().getStyle() | java.awt.Font.BOLD));
        nameL.setText(org.crossmobile.bind.system.AppConstants.DISPLAY_NAME);
        nameL.setAlignmentX(0.5F);
        getContentPane().add(nameL);

        versionL.setFont(versionL.getFont().deriveFont(versionL.getFont().getSize() - 1f));
        versionL.setText("Version " + AppConstants.DISPLAY_VERSION);
        versionL.setAlignmentX(0.5F);
        versionL.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 0));
        getContentPane().add(versionL);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconL;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel versionL;
    // End of variables declaration//GEN-END:variables
}
