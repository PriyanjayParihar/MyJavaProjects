/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApplication.gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.text.Style;

/**
 *
 * @author priya
 */
public class FontFrame extends javax.swing.JFrame {

    private Font font = null;
    String fontFamilyNames[] = null;
    String[] fontStyleNames = null;
    String[] fontSizes = null;
    TextEditor textEditor = null;

    /**
     * Creates new form Font
     */
    public FontFrame() {
        initComponents();
            
        System.out.println("init fine");
        fontFamilyNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JLFonts.setListData(fontFamilyNames);
        fontStyleNames = new String[]{"PLAIN", "BOLD", "ITALIC"};
        System.out.println("fine" + fontStyleNames);
        JLFontStyle.setListData(fontStyleNames);
        fontSizes = new String[]{"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};
        JLSize.setListData(fontSizes);
        System.out.println("fine" + fontStyleNames);

    }

    public FontFrame(Font font, TextEditor textEditor) {

        this();
        this.textEditor = textEditor;
        this.font = font;
        lblLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JLFonts.setSelectedValue(font.getFamily(), true);
        tfFont.setText(font.getFamily());
        JLFontStyle.setSelectedValue(fontStyleNames[font.getStyle()], true);

        tfFontStyle.setText(fontStyleNames[font.getStyle()]);
        JLSize.setSelectedValue(font.getSize() + "", true);
        tfSize.setText((font.getSize()) + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfFont = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfFontStyle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLFonts = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLFontStyle = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        JLSize = new javax.swing.JList<>();
        lblFontDemo = new javax.swing.JLabel();
        lblLink = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Font:");

        tfFont.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFontActionPerformed(evt);
            }
        });
        tfFont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFontKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFontKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Font Style:");

        tfFontStyle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFontStyle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFontStyleKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Size:");

        tfSize.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSizeActionPerformed(evt);
            }
        });
        tfSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSizeKeyReleased(evt);
            }
        });

        JLFonts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JLFonts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JLFontsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JLFonts);

        JLFontStyle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JLFontStyle.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JLFontStyleValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(JLFontStyle);

        JLSize.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JLSize.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JLSizeValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(JLSize);

        lblFontDemo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFontDemo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFontDemo.setText("AaBbCc");
        lblFontDemo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sample", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        lblLink.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLink.setForeground(new java.awt.Color(51, 102, 255));
        lblLink.setText("Show more  fonts..");
        lblLink.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 255)));
        lblLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLinkMouseEntered(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFont))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(tfFontStyle)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSize)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                            .addComponent(lblFontDemo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLink)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfFontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLink)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFontDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFontKeyTyped

    }//GEN-LAST:event_tfFontKeyTyped

    private void tfFontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFontKeyReleased

        String fontname = tfFont.getText();
        JLFonts.clearSelection();
//        System.out.println(" size of ll i"+fontFamilyNames.length);
//        System.out.println("In A C tf "+fontname);
//        
        for (int i = 0; i < fontFamilyNames.length; i++) {
            String name = fontFamilyNames[i];
//            System.out.println(fontname.length());
            if (name.equalsIgnoreCase(fontname)) {
                JLFonts.setSelectedValue(name, true);
                break;
            }
            if (name.startsWith(fontname)) {
                System.out.println(name.startsWith(fontname));
                System.out.println(name);

//                    JLFonts.ensureIndexIsVisible(i);
                JLFonts.scrollRectToVisible(JLFonts.getCellBounds(i, i + 6));

//                    JLFonts.setSelectedValue(name, true);
//                    JLFonts.ensureIndexIsVisible(0);
                break;
            }
            JLFonts.scrollRectToVisible(JLFonts.getCellBounds(0, 0));

        }
        System.out.println("end of loop");
    }//GEN-LAST:event_tfFontKeyReleased

    private void tfFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFontActionPerformed
//        String fontname=tfFont.getText();
//        System.out.println("In A C tf  bbhbhb"+fontname);
//        for(String name:fontFamilyNames){
//            if(name.startsWith(fontname)){
//                System.out.println("loop m"+name);
//                JLFonts.setSelectedValue(name, true);
//                
//                break;
//            }
//        }
    }//GEN-LAST:event_tfFontActionPerformed

    private void JLFontsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JLFontsValueChanged
//        System.out.println("the valye changed");
//        System.out.println(JLFonts.getSelectedValue());
        tfFont.setText(JLFonts.getSelectedValue());
        demoFontChange();
    }//GEN-LAST:event_JLFontsValueChanged

    private void tfFontStyleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFontStyleKeyReleased
        String fontStyle = tfFontStyle.getText();
        System.out.println("in tfkey" + fontStyle);
        JLFontStyle.clearSelection();
        for (int i = 0; i < fontStyleNames.length; i++) {
            String name = fontStyleNames[i];
            System.out.println(name);
            if (name.equalsIgnoreCase(fontStyle)) {
                System.out.println("if rrk");
                JLFontStyle.setSelectedValue(name, true);
                break;
            }

        }


    }//GEN-LAST:event_tfFontStyleKeyReleased

    private void tfSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSizeActionPerformed

    private void JLFontStyleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JLFontStyleValueChanged
        tfFontStyle.setText(JLFontStyle.getSelectedValue());
        demoFontChange();
    }//GEN-LAST:event_JLFontStyleValueChanged

    private void tfSizeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSizeKeyReleased
        String fontSize = tfSize.getText();
        System.out.println(fontSize);
        JLSize.clearSelection();
        for (int i = 0; i < fontSizes.length; i++) {
            String size = fontSizes[i];

            if (size.equalsIgnoreCase(fontSize)) {
                System.out.println("if rrk");
                JLSize.setSelectedValue(size, true);
                JLSize.scrollRectToVisible(JLFonts.getCellBounds(i, i + 6));

                break;
            }
            JLSize.scrollRectToVisible(JLFonts.getCellBounds(0, 0));

        }
    }//GEN-LAST:event_tfSizeKeyReleased

    private void JLSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JLSizeValueChanged
        tfSize.setText(JLSize.getSelectedValue());
        demoFontChange();
    }//GEN-LAST:event_JLSizeValueChanged

    private void lblLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkMouseEntered
        // 
    }//GEN-LAST:event_lblLinkMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("evnt ok perf");
        int fontSize = 0;
        int fontStyle = 100;
        if (!(JLFonts.isSelectionEmpty() && JLFontStyle.isSelectionEmpty() && JLSize.isSelectionEmpty())) {
            String fontName = JLFonts.getSelectedValue();
            System.out.println("ok ka if h ye");
//        if(fontName=="" || fontName==null){
//            fontName=lblFontDemo.getFont().getFontName();
//        }

            fontStyle = JLFontStyle.getSelectedIndex();

//        if(fontStyle==-1){
//            fontStyle=lblFontDemo.getFont().getStyle();
//        }
            fontSize = Integer.parseInt(JLSize.getSelectedValue());
            //        if(fontSize==-1){
//            fontSize=lblFontDemo.getFont().getSize();
//        }
            Font font = new Font(fontName, fontStyle, fontSize);
            textEditor.setChangedFont(font);
            textEditor.setFocusable(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FontFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JLFontStyle;
    private javax.swing.JList<String> JLFonts;
    private javax.swing.JList<String> JLSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFontDemo;
    private javax.swing.JLabel lblLink;
    private javax.swing.JTextField tfFont;
    private javax.swing.JTextField tfFontStyle;
    private javax.swing.JTextField tfSize;
    // End of variables declaration//GEN-END:variables

    private void demoFontChange() {
        int fontSize = 0;
        int fontStyle = 100;
        if (!(JLFonts.isSelectionEmpty() && JLFontStyle.isSelectionEmpty() && JLSize.isSelectionEmpty())) {
            String fontName = JLFonts.getSelectedValue();

//        if(fontName=="" || fontName==null){
//            fontName=lblFontDemo.getFont().getFontName();
//        }
            if (JLFontStyle.getSelectedValue() != null) {
                fontStyle = JLFontStyle.getSelectedIndex();
            }

//        if(fontStyle==-1){
//            fontStyle=lblFontDemo.getFont().getStyle();
//        }
            if (JLSize.getSelectedValue() != null) {
                fontSize = Integer.parseInt(JLSize.getSelectedValue());
            }
//        if(fontSize==-1){
//            fontSize=lblFontDemo.getFont().getSize();
//        }
            Font font = new Font(fontName, fontStyle, fontSize);
            lblFontDemo.setFont(font);

        }
    }
}
