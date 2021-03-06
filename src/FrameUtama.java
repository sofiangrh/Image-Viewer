// Take it, use it and share it.
// Human knowledge belongs to the world

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whosyourdaddy
 */
    public class FrameUtama extends javax.swing.JFrame {

    Filter filter = new Filter();
    BufferedImage image;
    double angle, theta, size;
    int flip;
    JFileChooser fc = new JFileChooser();

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnOpen = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnZoomIn = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnRotateCcw = new javax.swing.JButton();
        btnRotateCw = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnActual = new javax.swing.JButton();
        btnFit = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnFlipVer = new javax.swing.JButton();
        btnFlipHor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageBox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Viewer");

        jToolBar1.setRollover(true);

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open.png"))); // NOI18N
        btnOpen.setToolTipText("Open Image");
        btnOpen.setFocusable(false);
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpen);
        jToolBar1.add(jSeparator1);

        btnZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoomin.png"))); // NOI18N
        btnZoomIn.setToolTipText("Zoom In");
        btnZoomIn.setEnabled(false);
        btnZoomIn.setFocusable(false);
        btnZoomIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnZoomIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });
        jToolBar1.add(btnZoomIn);

        btnZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoomout.png"))); // NOI18N
        btnZoomOut.setToolTipText("Zoom Out");
        btnZoomOut.setEnabled(false);
        btnZoomOut.setFocusable(false);
        btnZoomOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnZoomOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnZoomOut);

        jSeparator2.setEnabled(false);
        jToolBar1.add(jSeparator2);

        btnRotateCcw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rotateccw.png"))); // NOI18N
        btnRotateCcw.setToolTipText("Rotate CCW");
        btnRotateCcw.setEnabled(false);
        btnRotateCcw.setFocusable(false);
        btnRotateCcw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRotateCcw.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRotateCcw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateCcwActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRotateCcw);

        btnRotateCw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rotatecw.png"))); // NOI18N
        btnRotateCw.setToolTipText("Rotate CW");
        btnRotateCw.setEnabled(false);
        btnRotateCw.setFocusable(false);
        btnRotateCw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRotateCw.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRotateCw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateCwActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRotateCw);

        jSeparator3.setEnabled(false);
        jToolBar1.add(jSeparator3);

        btnActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windowactual.png"))); // NOI18N
        btnActual.setToolTipText("Actual Size");
        btnActual.setEnabled(false);
        btnActual.setFocusable(false);
        btnActual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActual);

        btnFit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windowfit.png"))); // NOI18N
        btnFit.setToolTipText("Fit Window");
        btnFit.setEnabled(false);
        btnFit.setFocusable(false);
        btnFit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFit);

        jSeparator4.setEnabled(false);
        jToolBar1.add(jSeparator4);

        btnFlipVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flipvertical.png"))); // NOI18N
        btnFlipVer.setToolTipText("Flip Vertical");
        btnFlipVer.setEnabled(false);
        btnFlipVer.setFocusable(false);
        btnFlipVer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFlipVer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFlipVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlipVerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFlipVer);

        btnFlipHor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fliphorizontal.png"))); // NOI18N
        btnFlipHor.setToolTipText("Flip Horizontal");
        btnFlipHor.setEnabled(false);
        btnFlipHor.setFocusable(false);
        btnFlipHor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFlipHor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFlipHor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlipHorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFlipHor);

        imageBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(imageBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // Tombol Buka Gambar
        fc.setFileFilter(filter);
        int fileValid = fc.showOpenDialog(this);
        if (fileValid == javax.swing.JFileChooser.APPROVE_OPTION) {
            if (filter.accept(fc.getSelectedFile())) {
                String imageFile = fc.getSelectedFile().getPath();
                try {
                    BufferedImage bi = ImageIO.read(new File(imageFile));
                    loadImage(bi);
                } catch (Exception ex) {
                    imageBox.setText("Error Load Image");
                }
            } else {
                imageBox.setText("Format Image tidak mendukung");
            }
        } else {
            return;
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        // Tombol Perbesar Gambar
        size = size * 2;
        zoomImage();
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        // Tombol Perkecil Gambar
        size = size / 2;
        zoomImage();
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnRotateCcwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateCcwActionPerformed
        // Tombol Putar Gambar
        angle = -90;
        theta = Math.toRadians(angle);
        rotateImage();
    }//GEN-LAST:event_btnRotateCcwActionPerformed

    private void btnRotateCwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateCwActionPerformed
        // Tombol Putar Gambar
        angle = 90;
        theta = Math.toRadians(angle);
        rotateImage();
    }//GEN-LAST:event_btnRotateCwActionPerformed

    private void btnActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualActionPerformed
        // Tombol Perkecil Layar
        size = 1;
        zoomImage();
    }//GEN-LAST:event_btnActualActionPerformed

    private void btnFitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFitActionPerformed
        // Tombol Perbesar Layar
        size = getSizeFit();
        zoomImage();
    }//GEN-LAST:event_btnFitActionPerformed

    private void btnFlipVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlipVerActionPerformed
        // Tombol Putar Vertikal
        flip = 1;
        flipImage();
    }//GEN-LAST:event_btnFlipVerActionPerformed

    private void btnFlipHorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlipHorActionPerformed
        // Tombol Putar Horizontal
        flip = 0;
        flipImage();
    }//GEN-LAST:event_btnFlipHorActionPerformed

    public void loadImage(BufferedImage img) {
        image = img;
        angle = 0;
        size = getSizeFit();
        zoomImage();
        setEnabledButton(true);
    }
    
    public void setEnabledButton(boolean bol) {
        btnZoomIn.setEnabled(bol);
        btnZoomOut.setEnabled(bol);
        btnRotateCcw.setEnabled(bol);
        btnRotateCw.setEnabled(bol);
        btnFit.setEnabled(bol);
        btnActual.setEnabled(bol);
        btnFlipHor.setEnabled(bol);
        btnFlipVer.setEnabled(bol);
    }
    
     public double getSizeFit() {
        double sizeFit;
        double widthBox = jScrollPane1.getWidth();
        double heightBox = jScrollPane1.getHeight();
        if ((widthBox >= image.getWidth()) && (heightBox >= image.getHeight())) {
            sizeFit = 1;
        } else {
            double widthRatio = widthBox / image.getWidth();
            double heightRatio = heightBox / image.getHeight();

            if (widthRatio > heightRatio) {
                sizeFit = heightRatio;
            } else {
                sizeFit = widthRatio;
            }
        }
        return sizeFit;
        }
    
      public void zoomImage() {
        Icon icon = new ImageIcon(image.getScaledInstance(
                (int) ((double) image.getWidth() * size),
                (int) ((double) image.getHeight() * size),
                Image.SCALE_DEFAULT));
        imageBox.setIcon(icon);
       }
     
      public void rotateImage() {
        double cos = Math.abs(Math.cos(theta));
        double sin = Math.abs(Math.sin(theta));
        double width = image.getWidth();
        double height = image.getHeight();
        int w = (int) (width * cos + height * sin);
        int h = (int) (width * sin + height * cos);
        BufferedImage bfi = new BufferedImage(w, h, image.getType());
        Graphics2D g2 = bfi.createGraphics();
        g2.fillRect(0, 0, w, h);
        double x = w / 2;
        double y = h / 2;
        AffineTransform at = AffineTransform.getRotateInstance(theta, x, y);
        x = (w - width) / 2;
        y = (h - height) / 2;
        at.translate(x, y);
        g2.drawRenderedImage(image, at);
        g2.dispose();
        image = bfi;
        zoomImage();
    }
      
     public void flipImage() {
        int w = image.getWidth();
        int h = image.getHeight();
        double sx, sy, tx, ty;
        BufferedImage bfi = new BufferedImage(w, h, image.getType());
        Graphics2D g2 = bfi.createGraphics();
        g2.fillRect(0, 0, w, h);
        if (flip == 0) {
            sx = -1;
            sy = 1;
            tx = -image.getWidth();
            ty = 0;
        } else {
            sx = 1;
            sy = -1;
            tx = 0;
            ty = -image.getHeight();
        }
        AffineTransform at = AffineTransform.getScaleInstance(sx, sy);
        at.translate(tx, ty);
        g2.drawRenderedImage(image, at);
        g2.dispose();
        image = bfi;
        zoomImage();
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
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActual;
    private javax.swing.JButton btnFit;
    private javax.swing.JButton btnFlipHor;
    private javax.swing.JButton btnFlipVer;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnRotateCcw;
    private javax.swing.JButton btnRotateCw;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JLabel imageBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
