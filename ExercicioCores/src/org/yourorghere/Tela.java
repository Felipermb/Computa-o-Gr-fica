/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Tela extends javax.swing.JFrame {

    File file = new File("C:\\Users\\Felipe Reis\\Pictures\\perfil.jpg");
    BufferedImage original = ImageIO.read(file);
    ImageIcon iconOriginal = new ImageIcon(original);

    public Tela() throws IOException {
        initComponents();
        jLabel1.setIcon(iconOriginal);
        jLabel1.setVisible(true);

        jLabel2.setIcon(iconOriginal);
        jLabel2.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        preto_branco = new javax.swing.JButton();
        escala_cinza = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        quatro = new javax.swing.JButton();
        dezesseis = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        preto_branco.setText("Preto e Branco");
        preto_branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preto_brancoActionPerformed(evt);
            }
        });

        escala_cinza.setText("Escala de Cinza");
        escala_cinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escala_cinzaActionPerformed(evt);
            }
        });

        jLabel3.setText("Cores:");

        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        dezesseis.setText("16");
        dezesseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezesseisActionPerformed(evt);
            }
        });

        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manipulação de Cores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(preto_branco, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dezesseis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(escala_cinza, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dezesseis, oito, quatro});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dezesseis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preto_branco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escala_cinza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preto_brancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preto_brancoActionPerformed
        try {
            preto_branco();
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_preto_brancoActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        try {
            cores(4);
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_quatroActionPerformed

    private void dezesseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezesseisActionPerformed
        try {
            cores(16);
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dezesseisActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        try {
            cores(8);
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_oitoActionPerformed

    private void escala_cinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escala_cinzaActionPerformed

        BufferedImage manipulada;
        try {
            manipulada = ImageIO.read(file);
            int w = manipulada.getWidth();
            int h = manipulada.getHeight();
            int[] pixels = manipulada.getRGB(0, 0, w, h, null, 0, w);
            int cor;
            for (int col = 0; col < w - 1; col++) {
                for (int lin = 0; lin < h - 1; lin++) {
                    int pos = col * w + lin;
                    Color c = new Color(manipulada.getRGB(col, lin));
                    cor = (c.getBlue() + c.getGreen() + c.getRed()) / 3;
                    if (cor > 200) {
                        manipulada.setRGB(col, lin, Color.LIGHT_GRAY.getRGB());
                    } else if (cor <200 && cor >= 190 ) {
                        manipulada.setRGB(col, lin, Color.GRAY.getRGB());
                    }else{
                        manipulada.setRGB(col, lin, Color.DARK_GRAY.getRGB());
                    }
                }
            }
            ImageIcon iconManipulado = new ImageIcon(manipulada);

            jLabel2.setIcon(iconManipulado);
            jLabel2.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_escala_cinzaActionPerformed

    public Color quatroCores(float val) {
        Color cor;
        if (val >= 192) {
            cor = new Color(255);
            return cor;
        } else if (val < 192 && val >= 128) {
            cor = new Color(192);
            return cor;
        } else if (val < 128 && val >= 64) {
            cor = new Color(128);
            return cor;
        } else if (val < 64 && val >= 0) {
            cor = new Color(64);
            return cor;
        } else {
            return Color.WHITE;
        }
    }

    public int oitoCores(float val) {
        if (val >= 192) {
            return 255;
        } else if (val < 192 && val >= 160) {
            return 192;
        } else if (val < 160 && val >= 128) {
            return 160;
        } else if (val < 128 && val >= 96) {
            return 128;
        } else if (val < 96 && val >= 64) {
            return 96;
        } else if (val < 64 && val >= 32) {
            return 64;
        } else if (val < 32 && val >= 0) {
            return 32;
        } else {
            return 0;
        }
    }

    public int dezesseisCores(float val) {
        if (val >= 240) {
            return 255;
        } else if (val < 240 && val >= 225) {
            return 240;
        } else if (val < 225 && val >= 218) {
            return 225;
        } else if (val < 218 && val >= 208) {
            return 218;
        } else if (val < 208 && val >= 192) {
            return 208;
        } else if (val < 192 && val >= 176) {
            return 192;
        } else if (val < 176 && val >= 160) {
            return 176;
        } else if (val < 160 && val >= 144) {
            return 160;
        } else if (val < 144 && val >= 128) {
            return 144;
        } else if (val < 128 && val >= 112) {
            return 128;
        } else if (val < 112 && val >= 96) {
            return 112;
        } else if (val < 96 && val >= 80) {
            return 80;
        } else if (val < 80 && val >= 64) {
            return 80;
        } else if (val < 64 && val >= 48) {
            return 64;
        } else if (val < 48 && val >= 32) {
            return 48;
        } else if (val < 32 && val >= 16) {
            return 32;
        } else if (val < 16 && val > 0) {
            return 16;
        } else {
            return 0;
        }
    }

    public void cores(int x) throws IOException {
        BufferedImage manipulada = ImageIO.read(file);
        int w = manipulada.getWidth();
        int h = manipulada.getHeight();
        int[] pixels = manipulada.getRGB(0, 0, w, h, null, 0, w);
        int cor;
        for (int col = 0; col < w - 1; col++) {
            for (int lin = 0; lin < h - 1; lin++) {
                int pos = col * w + lin;
                Color c = new Color(manipulada.getRGB(col, lin));
                cor = (c.getBlue() + c.getGreen() + c.getRed()) / 3;
                int corImagem;
                if (x == 4) {
                    corImagem = quatroCores(cor).getRGB();
                } else if (x == 8) {
                    corImagem = oitoCores(cor);
                } else {
                    corImagem = dezesseisCores(cor);
                }

                manipulada.setRGB(col, lin, corImagem);

            }
        }
        ImageIcon iconManipulado = new ImageIcon(manipulada);

        jLabel2.setIcon(iconManipulado);
        jLabel2.setVisible(true);
    }

    public void preto_branco() throws IOException {

        BufferedImage manipulada = ImageIO.read(file);

        int w = manipulada.getWidth();
        int h = manipulada.getHeight();
        int[] pixels = manipulada.getRGB(0, 0, w, h, null, 0, w);
        int cor;
        for (int col = 0; col < w - 1; col++) {
            for (int lin = 0; lin < h - 1; lin++) {
                int pos = col * w + lin;
                Color c = new Color(manipulada.getRGB(col, lin));
                cor = (c.getBlue() + c.getGreen() + c.getRed()) / 3;
                if (cor < 128) {
                    manipulada.setRGB(col, lin, Color.BLACK.getRGB());
                } else {
                    manipulada.setRGB(col, lin, Color.WHITE.getRGB());
                }
            }
        }
        ImageIcon iconManipulado = new ImageIcon(manipulada);

        jLabel2.setIcon(iconManipulado);
        jLabel2.setVisible(true);

    }

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dezesseis;
    private javax.swing.JButton escala_cinza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton oito;
    private javax.swing.JButton preto_branco;
    private javax.swing.JButton quatro;
    // End of variables declaration//GEN-END:variables
}
