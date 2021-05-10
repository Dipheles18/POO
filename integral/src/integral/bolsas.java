
package integral;
import java.awt.Color;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Arrays;


public class bolsas extends javax.swing.JFrame {

    /**
     * Creates new form bolsas
     */
    public bolsas() {
        initComponents();
        Ventas.setVisible(false);
        areacorreo.setVisible(false);
        areaContrasena.setVisible(false);
        correo.setVisible(false);
        contraseña.setVisible(false);
        validar.setVisible(false);
        cerrarX.setVisible(false);
        
        formulario.setVisible(false);
        Usuarios.setVisible(false);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        areacorreo = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        validar = new javax.swing.JButton();
        Fondogris = new javax.swing.JButton();
        Fondoazul = new javax.swing.JButton();
        Fondoverde = new javax.swing.JButton();
        cerrarX = new javax.swing.JButton();
        formulario = new javax.swing.JLabel();
        menuSeleccionado = new javax.swing.JLabel();
        vMD5 = new javax.swing.JLabel();
        areaContrasena = new javax.swing.JPasswordField();
        Crear_usuario = new javax.swing.JButton();
        usuario_activo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        iniciarsesion = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        exposiciones = new javax.swing.JMenu();
        ofertas = new javax.swing.JMenu();
        Productos = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenuItem();
        Lista_producto = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu = new javax.swing.JMenu();
        vision = new javax.swing.JMenu();
        valores = new javax.swing.JMenu();
        historia = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/mandado-bolsas-vintage-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        correo.setText("Correo Electrónico");

        contraseña.setText("Contraseña");

        validar.setText("Validar datos");
        validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarActionPerformed(evt);
            }
        });

        Fondogris.setBackground(new java.awt.Color(153, 153, 153));
        Fondogris.setText("Fondogris");
        Fondogris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FondogrisActionPerformed(evt);
            }
        });

        Fondoazul.setBackground(new java.awt.Color(51, 51, 255));
        Fondoazul.setText("Fondoazul");
        Fondoazul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FondoazulActionPerformed(evt);
            }
        });

        Fondoverde.setBackground(new java.awt.Color(0, 204, 51));
        Fondoverde.setText("Fondoverde");
        Fondoverde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FondoverdeActionPerformed(evt);
            }
        });

        cerrarX.setText("X");
        cerrarX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarXMouseClicked(evt);
            }
        });
        cerrarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarXActionPerformed(evt);
            }
        });

        formulario.setText("Formulario de inicio de sesión");

        menuSeleccionado.setText("Opción del menú");

        vMD5.setText("Encriptación:");

        Crear_usuario.setText("Crear perfil");
        Crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_usuarioActionPerformed(evt);
            }
        });

        home.setText("Home");

        iniciarsesion.setText("Iniciar sesión");
        iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarsesionMouseClicked(evt);
            }
        });
        home.add(iniciarsesion);

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        home.add(Salir);

        jMenuBar1.add(home);

        jMenu2.setText("Menu");

        exposiciones.setText("Exposiciones");
        jMenu2.add(exposiciones);

        ofertas.setText("Ofertas");
        jMenu2.add(ofertas);

        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jMenu2.add(Productos);

        Ventas.setText("Ventas");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        jMenu2.add(Ventas);

        Lista_producto.setText("Lista Productos");
        Lista_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_productoActionPerformed(evt);
            }
        });
        jMenu2.add(Lista_producto);

        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(Usuarios);

        jMenuItem1.setText("Lista Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Nuestra Empresa");

        menu.setText("Misión");
        jMenu3.add(menu);

        vision.setText("Visión");
        jMenu3.add(vision);

        valores.setText("Valores");
        jMenu3.add(valores);

        historia.setText("Historia");
        jMenu3.add(historia);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(192, 541, Short.MAX_VALUE)
                .addComponent(cerrarX)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(menuSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Fondogris)
                                    .addGap(27, 27, 27)
                                    .addComponent(Fondoazul)
                                    .addGap(18, 18, 18)
                                    .addComponent(Fondoverde)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(areacorreo)
                                    .addComponent(areaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(vMD5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(validar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Crear_usuario)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fondogris)
                    .addComponent(Fondoazul)
                    .addComponent(Fondoverde))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cerrarX))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(menuSeleccionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formulario)
                            .addComponent(usuario_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contraseña)
                    .addComponent(areaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validar)
                    .addComponent(Crear_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vMD5)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarActionPerformed
        vMD5.setText(getMD5(Arrays.toString(areaContrasena.getPassword())));
       
       connBD op = new connBD();

       try{

        op.Conectar();

        String sql = "SELECT nombreUsuario FROM usuarios where Correo_electronico='"

           +areacorreo.getText()+"' and encriptado='"

           +getMD5(Arrays.toString(areaContrasena.getPassword()))+"'";

        op.rs = op.st.executeQuery(sql);

        while(op.rs.next()){

          usuario_activo.setText("Usuario activo: "+op.rs.getString("nombreUsuario"));

           areacorreo.setVisible(false);
           areaContrasena.setVisible(false);
           correo.setVisible(false);
           contraseña.setVisible(false);
           validar.setVisible(false);
           cerrarX.setVisible(false);
           formulario.setVisible(false);
           Usuarios.setVisible(true);

        }

         }catch(SQLException ex){

          System.out.println("Ha habido un fallo en la conexion a la BD : "+ex.getMessage());

         }finally{

          try{

            op.conexion.close();

            op.st.close();

            op.rs.close();

          }catch(SQLException ex){}

        }

    
    }//GEN-LAST:event_validarActionPerformed

    private void FondogrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FondogrisActionPerformed
       getContentPane().setBackground( Color.gray);
    }//GEN-LAST:event_FondogrisActionPerformed

    private void cerrarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarXActionPerformed

    private void FondoazulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FondoazulActionPerformed
       getContentPane().setBackground( Color.blue);
    }//GEN-LAST:event_FondoazulActionPerformed

    private void FondoverdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FondoverdeActionPerformed
       getContentPane().setBackground( Color.green);
    }//GEN-LAST:event_FondoverdeActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void iniciarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarsesionMouseClicked
       areacorreo.setVisible(true);
       areaContrasena.setVisible(true);
       correo.setVisible(true);
       contraseña.setVisible(true);
       validar.setVisible(true);
       cerrarX.setVisible(true);
       
       formulario.setVisible(true);
    }//GEN-LAST:event_iniciarsesionMouseClicked

    private void cerrarXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarXMouseClicked
       areacorreo.setVisible(false);
       areaContrasena.setVisible(false);
       correo.setVisible(false);
       contraseña.setVisible(false);
       validar.setVisible(false);
       cerrarX.setVisible(false);
       formulario.setVisible(false);
    }//GEN-LAST:event_cerrarXMouseClicked

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
       Registro_usuario_Registro_productos obj = new Registro_usuario_Registro_productos();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ProductosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        Registro_usuario obj = new Registro_usuario();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsuariosActionPerformed

    private void Crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_usuarioActionPerformed
        Registro_usuario obj = new Registro_usuario();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Crear_usuarioActionPerformed

    private void Lista_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_productoActionPerformed
        Lista_Productos obj = new Lista_Productos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Lista_productoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Lista_Usuarios obj = new Lista_Usuarios();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
       Ventas.setVisible(true);
       vender obj = new vender();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_VentasActionPerformed

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
            java.util.logging.Logger.getLogger(bolsas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bolsas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bolsas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bolsas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bolsas().setVisible(true);
            }
        });
        
    }
public static String getMD5(String input) {
 try {
    MessageDigest md = MessageDigest.getInstance("MD5");
    byte[] messageDigest = md.digest(input.getBytes());
    BigInteger number = new BigInteger(1, messageDigest);
    String hashtext = number.toString(16);
    while (hashtext.length() < 32) {
        hashtext = "0" + hashtext;
    }
    return hashtext;
 }
 catch (NoSuchAlgorithmException e) {
    throw new RuntimeException(e);
 }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear_usuario;
    private javax.swing.JButton Fondoazul;
    private javax.swing.JButton Fondogris;
    private javax.swing.JButton Fondoverde;
    private javax.swing.JMenuItem Lista_producto;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuItem Ventas;
    private javax.swing.JPasswordField areaContrasena;
    private javax.swing.JTextField areacorreo;
    private javax.swing.JButton cerrarX;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JMenu exposiciones;
    private javax.swing.JLabel formulario;
    private javax.swing.JMenu historia;
    private javax.swing.JMenu home;
    private javax.swing.JMenu iniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel menuSeleccionado;
    private javax.swing.JMenu ofertas;
    private javax.swing.JLabel usuario_activo;
    private javax.swing.JLabel vMD5;
    private javax.swing.JButton validar;
    private javax.swing.JMenu valores;
    private javax.swing.JMenu vision;
    // End of variables declaration//GEN-END:variables
}
