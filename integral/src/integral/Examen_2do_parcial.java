package integral;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Examen_2do_parcial extends javax.swing.JFrame {
    public static Stack pila=new Stack();
    public static Queue cola=new LinkedList();
    public static List List = new ArrayList(); 
    
    
    public Examen_2do_parcial() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pila = new javax.swing.JLabel();
        Push = new javax.swing.JButton();
        Pop = new javax.swing.JButton();
        Imprimirpila = new javax.swing.JButton();
        Texto = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        Cola = new javax.swing.JLabel();
        AddCola = new javax.swing.JButton();
        removeCola = new javax.swing.JButton();
        ImprimirCola = new javax.swing.JButton();
        Lista = new javax.swing.JLabel();
        AddLista = new javax.swing.JButton();
        removeLista = new javax.swing.JButton();
        iterator = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        Clear = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pila.setText("Pila");

        Push.setLabel("Push");
        Push.setName(""); // NOI18N
        Push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PushActionPerformed(evt);
            }
        });

        Pop.setLabel("Pop");
        Pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopActionPerformed(evt);
            }
        });

        Imprimirpila.setText("Imprimir pila");
        Imprimirpila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirpilaActionPerformed(evt);
            }
        });

        Texto.setText("TEXTO");

        textoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoUsuarioMouseClicked(evt);
            }
        });

        Cola.setText("Cola");

        AddCola.setText("Add");
        AddCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddColaActionPerformed(evt);
            }
        });

        removeCola.setText("Remove");
        removeCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeColaActionPerformed(evt);
            }
        });

        ImprimirCola.setText("Imprimir Cola");
        ImprimirCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirColaActionPerformed(evt);
            }
        });

        Lista.setText("Lista");

        AddLista.setText("Add");
        AddLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddListaActionPerformed(evt);
            }
        });

        removeLista.setText("remove (\"Especificar\")");
        removeLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeListaActionPerformed(evt);
            }
        });

        iterator.setText("iterator");
        iterator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteratorActionPerformed(evt);
            }
        });

        Resultado.setText("RESULTADO:");

        resultado.setColumns(20);
        resultado.setRows(5);
        resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultado);

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Menu.setName(""); // NOI18N
        Menu.setOpaque(false);

        jMenu1.setText("Estructuras de Datos");
        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pila, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cola)
                            .addComponent(Lista))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Push)
                                    .addComponent(AddCola))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pop)
                                    .addComponent(removeCola)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddLista)
                                .addGap(18, 18, 18)
                                .addComponent(removeLista)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Imprimirpila)
                                .addGap(48, 48, 48)
                                .addComponent(Texto))
                            .addComponent(iterator)
                            .addComponent(ImprimirCola)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(Clear)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pila, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Push)
                    .addComponent(Pop)
                    .addComponent(Imprimirpila)
                    .addComponent(Texto)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Resultado)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cola)
                            .addComponent(AddCola)
                            .addComponent(removeCola)
                            .addComponent(ImprimirCola))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lista)
                            .addComponent(AddLista)
                            .addComponent(removeLista)
                            .addComponent(iterator))
                        .addGap(18, 18, 18)
                        .addComponent(Clear)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PushActionPerformed
      pila.push(textoUsuario.getText());
    }//GEN-LAST:event_PushActionPerformed

    private void textoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoUsuarioMouseClicked
        textoUsuario.setText("");
    }//GEN-LAST:event_textoUsuarioMouseClicked

    private void ImprimirpilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirpilaActionPerformed
       resultado.setText(pila.toString());
    }//GEN-LAST:event_ImprimirpilaActionPerformed

    private void PopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopActionPerformed
       pila.pop();
    }//GEN-LAST:event_PopActionPerformed

    private void AddListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddListaActionPerformed
       List.add(textoUsuario.getText());
    }//GEN-LAST:event_AddListaActionPerformed

    private void removeListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeListaActionPerformed
       List.remove(textoUsuario.getText());
    }//GEN-LAST:event_removeListaActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
       List.clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void iteratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteratorActionPerformed
      Iterator iter = List.iterator();
      String datoslista="";
        while (iter.hasNext())
        datoslista += iter.next();
        resultado.setText(datoslista);
    }//GEN-LAST:event_iteratorActionPerformed

    private void resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadoMouseClicked
    
     
    }//GEN-LAST:event_resultadoMouseClicked

    private void AddColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddColaActionPerformed
        cola.add(textoUsuario.getText());
    }//GEN-LAST:event_AddColaActionPerformed

    private void removeColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeColaActionPerformed
       cola.poll();
    }//GEN-LAST:event_removeColaActionPerformed

    private void ImprimirColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirColaActionPerformed
      resultado.setText(cola.toString());
    }//GEN-LAST:event_ImprimirColaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen_2do_parcial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCola;
    private javax.swing.JButton AddLista;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel Cola;
    private javax.swing.JButton ImprimirCola;
    private javax.swing.JButton Imprimirpila;
    private javax.swing.JLabel Lista;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel Pila;
    private javax.swing.JButton Pop;
    private javax.swing.JButton Push;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel Texto;
    private javax.swing.JButton iterator;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeCola;
    private javax.swing.JButton removeLista;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
