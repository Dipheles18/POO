
package integral;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel; 

public class Lista_Productos extends javax.swing.JFrame {

 
    public Lista_Productos() {
        initComponents();
        formProductos.setVisible(false);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtProductos.setModel(modelo);
            ResultSet rs = null;
            connBD op = new connBD();
            op.Conectar();
            String sql = "SELECT * FROM productos";
            op.rs = op.st.executeQuery(sql);
            int cantidadColumnas = 4;
            modelo.addColumn("nProducto");
            modelo.addColumn("Nombre");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Costo");
            int[] anchos = {30, 50, 100, 30};
            for (int i = 0; i < 4; i++) {
                jtProductos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (op.rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = op.rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        boton_lupa = new javax.swing.JButton();
        formProductos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        nump = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Productos existentes:");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nombre");

        boton_lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Lupa chica.jpg"))); // NOI18N
        boton_lupa.setText("Buscar");
        boton_lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_lupaActionPerformed(evt);
            }
        });

        jLabel3.setText("Número del producto:");

        jLabel4.setText("Nombre:");

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar 2.jpg"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Lapiz.jpg"))); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel5.setText("Descripción");

        des.setColumns(20);
        des.setRows(5);
        jScrollPane2.setViewportView(des);

        jLabel6.setText("Precio:");

        javax.swing.GroupLayout formProductosLayout = new javax.swing.GroupLayout(formProductos);
        formProductos.setLayout(formProductosLayout);
        formProductosLayout.setHorizontalGroup(
            formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formProductosLayout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Modificar))
                    .addGroup(formProductosLayout.createSequentialGroup()
                        .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(formProductosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nom))
                            .addGroup(formProductosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(nump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(formProductosLayout.createSequentialGroup()
                                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(pre))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formProductosLayout.setVerticalGroup(
            formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formProductosLayout.createSequentialGroup()
                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nump, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(formProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Modificar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_lupa)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(formProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_lupa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bolsas obj = new bolsas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_lupaActionPerformed
       String campo = buscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE Nombre like '%" +campo+ "%'";      
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtProductos.setModel(modelo);
            ResultSet rs = null;
            connBD op = new connBD();
            op.Conectar();
            String sql = "SELECT * FROM productos "+where;
            op.rs = op.st.executeQuery(sql);
            int cantidadColumnas = 4;
            modelo.addColumn("nProducto");
            modelo.addColumn("Nombre");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Costo");
            int[] anchos = {30, 50, 100, 30};
            for (int i = 0; i < 4; i++) {
                jtProductos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (op.rs.next()) {
                Object[] filas = new Object[cantidadColumnas+1];
                for (int i = 0; i<cantidadColumnas; i++) {
                    filas[i] = op.rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }//GEN-LAST:event_boton_lupaActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
       formProductos.setVisible(true);
        buscar.setText("");
        ResultSet rs = null;
        try {
            connBD op = new connBD();
            op.Conectar();
            int Fila = jtProductos.getSelectedRow();
            String codigo = jtProductos.getValueAt(Fila, 0).toString();
            String sql = "SELECT * FROM productos where nProducto='"+codigo+"'";
            op.rs = op.st.executeQuery(sql);
            while (op.rs.next()) {
                nump.setText(op.rs.getString("nProducto"));
                nom.setText(op.rs.getString("Nombre"));
                des.setText(op.rs.getString("Descripcion"));
                pre.setText(op.rs.getString("Costo"));

            }

        } catch (SQLException ex) {

            System.out.println(ex.toString());

        }
    }//GEN-LAST:event_jtProductosMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        connBD op = new connBD();
        try{

            op.Conectar();
            String sql = "update productos set Nombre='"+nom.getText()+"', Descripcion='"+
            des.getText()+"', Costo='"+
            pre.getText()+"' where nProducto="+nump.getText();
            int executeUpdate;
            executeUpdate = op.st.executeUpdate(sql);
            if(executeUpdate>0){

                formProductos.setVisible(false);

                nump.setText("");

                nom.setText("");

                des.setText("");

                pre.setText("");

                boton_lupa.doClick();

            }
        }catch(SQLException ex){
            System.out.println("Ha habido un fallo en la conexion a la BD : "+ex.getMessage());
        }finally{
            try{
                op.conexion.close();
                op.st.close();
            }catch(SQLException ex){}
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        connBD op = new connBD();

        try{

            op.Conectar();

            String sql = "delete from productos where nProducto="+nump.getText();

            int executeUpdate;

            executeUpdate = op.st.executeUpdate(sql);

            if(executeUpdate>0){

                formProductos.setVisible(false);

                nump.setText("");

                nom.setText("");

                des.setText("");

                pre.setText("");

                boton_lupa.doClick();

            }

        }catch(SQLException ex){

            System.out.println("Ha habido un fallo en la conexion a la BD : "+ex.getMessage());

        }finally{

            try{

                op.conexion.close();

                op.st.close();

            }catch(SQLException ex){}

        }

    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton boton_lupa;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextArea des;
    private javax.swing.JPanel formProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nump;
    private javax.swing.JTextField pre;
    // End of variables declaration//GEN-END:variables
}
