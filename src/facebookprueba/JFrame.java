/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookprueba;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PostUpdate;
import facebook4j.auth.AccessToken;
import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nabor
 */
public class JFrame extends javax.swing.JFrame {

       
    public JFrame() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textMensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        areaId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idPost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comentarioPost = new javax.swing.JTextField();
        enviarEstado = new javax.swing.JButton();
        enviarLike = new javax.swing.JButton();
        enviarComentario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        areaLink = new javax.swing.JTextField();
        enviarLink = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMensajeActionPerformed(evt);
            }
        });

        jLabel1.setText("Que estas pensando?->");

        areaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Introduce ID para dar like->");

        jLabel3.setText("Introduce ID de post ->");

        idPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPostActionPerformed(evt);
            }
        });

        jLabel4.setText("Introduce comentario en post ->");

        comentarioPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comentarioPostActionPerformed(evt);
            }
        });

        enviarEstado.setText("Enviar");
        enviarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarEstadoActionPerformed(evt);
            }
        });

        enviarLike.setText("Enviar");
        enviarLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarLikeActionPerformed(evt);
            }
        });

        enviarComentario.setText("Enviar");
        enviarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarComentarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Postear Link/Foto  -->");

        enviarLink.setText("Enviar");
        enviarLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarLinkActionPerformed(evt);
            }
        });

        jLabel6.setText("Comentario link/foto ->");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areaId)
                    .addComponent(textMensaje)
                    .addComponent(idPost, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(comentarioPost)
                    .addComponent(areaLink)
                    .addComponent(comField))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enviarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarLike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(enviarLink))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enviarEstado))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarLike))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(idPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comentarioPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(enviarComentario)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(areaLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarLink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMensajeActionPerformed
     
        
    }//GEN-LAST:event_textMensajeActionPerformed

    private void areaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaIdActionPerformed
      
    }//GEN-LAST:event_areaIdActionPerformed

    private void idPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPostActionPerformed
        
    }//GEN-LAST:event_idPostActionPerformed

    private void comentarioPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comentarioPostActionPerformed
     
    }//GEN-LAST:event_comentarioPostActionPerformed

    private void enviarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarEstadoActionPerformed
         ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAKY8vq45xlG9ZACShKZAInrT8hB8EFmbtGZCO1ITyYQEqevvO64iZADb6gqFKYYmLDrAPmIvZArVkwLtRkYfbYNcb90cCxI9spyl5YOiIJO3QU4bfnj9ZAxVjqwSvlXNZAa3Lx8ZBWLq76vca2bmfaZA3rf7IvtC2ML7cbOnk5wHF")
  .setOAuthPermissions("email,publish_stream,...");
FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();   
        try {
            facebook.postStatusMessage(textMensaje.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }//GEN-LAST:event_enviarEstadoActionPerformed

    private void enviarLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarLikeActionPerformed
                 ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAKY8vq45xlG9ZACShKZAInrT8hB8EFmbtGZCO1ITyYQEqevvO64iZADb6gqFKYYmLDrAPmIvZArVkwLtRkYfbYNcb90cCxI9spyl5YOiIJO3QU4bfnj9ZAxVjqwSvlXNZAa3Lx8ZBWLq76vca2bmfaZA3rf7IvtC2ML7cbOnk5wHF")
  .setOAuthPermissions("email,publish_stream,...");
FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
            try {
                facebook.likeVideo(areaId.getText());
            } catch (FacebookException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_enviarLikeActionPerformed

    private void enviarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarComentarioActionPerformed
               ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAKY8vq45xlG9ZACShKZAInrT8hB8EFmbtGZCO1ITyYQEqevvO64iZADb6gqFKYYmLDrAPmIvZArVkwLtRkYfbYNcb90cCxI9spyl5YOiIJO3QU4bfnj9ZAxVjqwSvlXNZAa3Lx8ZBWLq76vca2bmfaZA3rf7IvtC2ML7cbOnk5wHF")
  .setOAuthPermissions("email,publish_stream,...");
FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
        try {
            facebook.commentPhoto(idPost.getText(),comentarioPost.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarComentarioActionPerformed

    private void enviarLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarLinkActionPerformed
          ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAKY8vq45xlG9ZACShKZAInrT8hB8EFmbtGZCO1ITyYQEqevvO64iZADb6gqFKYYmLDrAPmIvZArVkwLtRkYfbYNcb90cCxI9spyl5YOiIJO3QU4bfnj9ZAxVjqwSvlXNZAa3Lx8ZBWLq76vca2bmfaZA3rf7IvtC2ML7cbOnk5wHF")
  .setOAuthPermissions("email,publish_stream,...");
        FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
        try {
            facebook.postLink(new URL(areaLink.getText()), comField.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarLinkActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
        
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaId;
    private javax.swing.JTextField areaLink;
    private javax.swing.JTextField comField;
    private javax.swing.JTextField comentarioPost;
    private javax.swing.JButton enviarComentario;
    private javax.swing.JButton enviarEstado;
    private javax.swing.JButton enviarLike;
    private javax.swing.JButton enviarLink;
    private javax.swing.JTextField idPost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textMensaje;
    // End of variables declaration//GEN-END:variables
}

