
package View;
/**
 * Esta clase permite al usuario la consulta sobre la base de datos
 */
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Familia
 */
public class frm_Consultar extends javax.swing.JFrame {

    /**
     * Creates new form frm_Consultar
     */
    public frm_Consultar() {
        initComponents();
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Parametri = new javax.swing.JMenu();
        CrearUsuario = new javax.swing.JMenuItem();
        CrearMateria = new javax.swing.JMenuItem();
        CrearTema = new javax.swing.JMenuItem();
        CrearPregunta = new javax.swing.JMenuItem();
        Exam = new javax.swing.JMenu();
        CrearExamen = new javax.swing.JMenuItem();
        ConsultarExamen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Nombre");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        Parametri.setText("Parametrizacion");

        CrearUsuario.setText("Crear Usuario");
        CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioActionPerformed(evt);
            }
        });
        Parametri.add(CrearUsuario);

        CrearMateria.setText("Crear Materia");
        CrearMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearMateriaActionPerformed(evt);
            }
        });
        Parametri.add(CrearMateria);

        CrearTema.setText("Crear Tema");
        CrearTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTemaActionPerformed(evt);
            }
        });
        Parametri.add(CrearTema);

        CrearPregunta.setText("Crear Pregunta");
        CrearPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPreguntaActionPerformed(evt);
            }
        });
        Parametri.add(CrearPregunta);

        jMenuBar1.add(Parametri);

        Exam.setText("Examen");

        CrearExamen.setText("Crear Examen");
        CrearExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearExamenActionPerformed(evt);
            }
        });
        Exam.add(CrearExamen);

        ConsultarExamen.setText("Consultar Examen");
        ConsultarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarExamenActionPerformed(evt);
            }
        });
        Exam.add(ConsultarExamen);

        jMenuBar1.add(Exam);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 126, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioActionPerformed
        try {
            frm_NewUsuario pc = new frm_NewUsuario();
            pc.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(frm_Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearUsuarioActionPerformed

    private void CrearMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearMateriaActionPerformed
        try {
            frm_NewMateria pc = new frm_NewMateria();
            pc.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(frm_Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearMateriaActionPerformed

    private void CrearTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTemaActionPerformed
        try {
            frm_NewTema pc = new frm_NewTema();
            pc.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(frm_Consultar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearTemaActionPerformed

    private void CrearPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPreguntaActionPerformed
        try {
            frm_NewPregunta pc = new frm_NewPregunta();
            pc.setVisible(true);
            dispose();
        } catch (IOException | SQLException ex) {
            Logger.getLogger(frm_Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearPreguntaActionPerformed

    private void CrearExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearExamenActionPerformed
        frm_NewExamen pc = new frm_NewExamen();
        pc.setVisible(true);
        dispose();
    }//GEN-LAST:event_CrearExamenActionPerformed

    private void ConsultarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarExamenActionPerformed
        frm_Consultar pc = new frm_Consultar();
        pc.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultarExamenActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsultarExamen;
    private javax.swing.JMenuItem CrearExamen;
    private javax.swing.JMenuItem CrearMateria;
    private javax.swing.JMenuItem CrearPregunta;
    private javax.swing.JMenuItem CrearTema;
    private javax.swing.JMenuItem CrearUsuario;
    private javax.swing.JMenu Exam;
    private javax.swing.JMenu Parametri;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
