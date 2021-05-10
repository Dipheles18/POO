
package integral;

import java.awt.Color;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
        tabla.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        mensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tabla = new javax.swing.JButton();
        NumMulti = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        verde = new javax.swing.JMenuItem();
        gris = new javax.swing.JMenuItem();
        azul = new javax.swing.JMenuItem();
        Ventana = new javax.swing.JMenu();
        Chica = new javax.swing.JMenuItem();
        Mediana = new javax.swing.JMenuItem();
        Grande = new javax.swing.JMenuItem();

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensaje.setText("Marco Antonio Muñíz Rodríguez");
        mensaje.setName(""); // NOI18N

        jButton1.setText("Saludo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setText("Multiplicar x10");
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });

        NumMulti.setText("Escribe un número...");
        NumMulti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumMultiMouseClicked(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        texto.setText("Tu resultado es:");
        texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(texto);

        jMenu1.setText("Archivo");

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenu3.setText("Color fondo");

        verde.setText("Color verde");
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });
        jMenu3.add(verde);

        gris.setText("Color gris");
        gris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grisActionPerformed(evt);
            }
        });
        jMenu3.add(gris);

        azul.setText("Color azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        jMenu3.add(azul);

        jMenu2.add(jMenu3);

        Ventana.setText("Ventana");

        Chica.setText("Chica");
        Chica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChicaActionPerformed(evt);
            }
        });
        Ventana.add(Chica);

        Mediana.setText("Mediana");
        Mediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedianaActionPerformed(evt);
            }
        });
        Ventana.add(Mediana);

        Grande.setText("Grande");
        Grande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrandeActionPerformed(evt);
            }
        });
        Ventana.add(Grande);

        jMenu2.add(Ventana);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(99, 99, 99))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     mensaje.setText("Buenas tardes");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NumMultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumMultiMouseClicked
        NumMulti.setText("");
    }//GEN-LAST:event_NumMultiMouseClicked

    private void textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoMouseClicked
     tabla.setVisible(true);
    }//GEN-LAST:event_textoMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
    int numM= Integer.parseInt(NumMulti.getText());
    String valores = "Resultado:";
      for(int j=1; j<11; j++){
          valores+="\n"+numM+"X"+j+"="+numM*j;
      }
      texto.setText(valores);
    }//GEN-LAST:event_tablaMouseClicked

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        getContentPane().setBackground(new Color (134, 240, 30));
    }//GEN-LAST:event_verdeActionPerformed

    private void grisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grisActionPerformed
        getContentPane().setBackground(Color.GRAY);
    }//GEN-LAST:event_grisActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        getContentPane().setBackground(new Color (30, 207, 240));
    }//GEN-LAST:event_azulActionPerformed

    private void ChicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChicaActionPerformed
       setSize(451, 400);
    }//GEN-LAST:event_ChicaActionPerformed

    private void MedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedianaActionPerformed
       setSize(551, 500);
    }//GEN-LAST:event_MedianaActionPerformed

    private void GrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrandeActionPerformed
       setSize(651, 600);
    }//GEN-LAST:event_GrandeActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Chica;
    private javax.swing.JMenuItem Grande;
    private javax.swing.JMenuItem Mediana;
    private javax.swing.JTextField NumMulti;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenu Ventana;
    private javax.swing.JMenuItem azul;
    private javax.swing.JMenuItem gris;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton tabla;
    private javax.swing.JTextArea texto;
    private javax.swing.JMenuItem verde;
    // End of variables declaration//GEN-END:variables
}
