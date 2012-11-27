/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aal.forms;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.aal.entities.Estudiante;
import org.aal.entities.Semestre;
import org.aal.forms.NuevoEstudiante;
import org.aal.forms.NuevoSemestre;
import org.aal.service.EstudianteService;
import org.aal.service.SemestreService;

/**
 *
 * @author Bomlu
 */
public class Formulario extends javax.swing.JFrame {

    /** Creates new form Formulario */
    public Formulario() {
        initComponents();
        updateCombo();
    }
   
    private void updateCombo() {
        // Instanciar el campo para SemestreService
     //   jTable1.removeAll();
        ss = new SemestreService();
        // Obtengo toda la lista de objetos de tipo Semestre presentes en la base
        semestreList = ss.getAll();
        //Remuevo todos los items presentes en el comboBox
        cmbSemestre.removeAllItems();
        // Aniado todos los elementos de la lista al combo box
        Iterator it = semestreList.iterator();
        while (it.hasNext()) {
            Semestre semestre = (Semestre) it.next();
            cmbSemestre.addItem(semestre);
        }
        //Hago que el comboBox no realice una selección automática
        //jComboBox1.setSelectedItem(null);
        //jComboBox1.setSelectedIndex(2);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContenedorPadre = new javax.swing.JPanel();
        jpCOntenedor1 = new javax.swing.JPanel();
        lblOpcionSemestre = new javax.swing.JLabel();
        cmbSemestre = new javax.swing.JComboBox();
        btnMenosSemestres = new javax.swing.JButton();
        btbMasSemestres = new javax.swing.JButton();
        jpContenedor2 = new javax.swing.JPanel();
        btnMasEstudiantes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlConsultas = new javax.swing.JList();
        btnMenosEstudiantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TABLA MAESTRO-DETALLE");

        jpContenedorPadre.setBackground(new java.awt.Color(255, 255, 255));

        jpCOntenedor1.setBackground(new java.awt.Color(255, 255, 255));
        jpCOntenedor1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true), "SEMESTRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abduction", 0, 14))); // NOI18N

        lblOpcionSemestre.setFont(new java.awt.Font("Thundergod II", 0, 14)); // NOI18N
        lblOpcionSemestre.setText("Escoja una Opcion:");

        cmbSemestre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSemestreItemStateChanged(evt);
            }
        });

        btnMenosSemestres.setFont(new java.awt.Font("Thundergod II", 1, 14)); // NOI18N
        btnMenosSemestres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5.jpg"))); // NOI18N
        btnMenosSemestres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosSemestresActionPerformed(evt);
            }
        });

        btbMasSemestres.setFont(new java.awt.Font("Thundergod II", 0, 14)); // NOI18N
        btbMasSemestres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.jpg"))); // NOI18N
        btbMasSemestres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbMasSemestresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCOntenedor1Layout = new javax.swing.GroupLayout(jpCOntenedor1);
        jpCOntenedor1.setLayout(jpCOntenedor1Layout);
        jpCOntenedor1Layout.setHorizontalGroup(
            jpCOntenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCOntenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcionSemestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnMenosSemestres, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btbMasSemestres, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCOntenedor1Layout.setVerticalGroup(
            jpCOntenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCOntenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCOntenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCOntenedor1Layout.createSequentialGroup()
                        .addComponent(btnMenosSemestres)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCOntenedor1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpCOntenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCOntenedor1Layout.createSequentialGroup()
                                .addGroup(jpCOntenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOpcionSemestre)
                                    .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCOntenedor1Layout.createSequentialGroup()
                                .addComponent(btbMasSemestres)
                                .addGap(28, 28, 28))))))
        );

        jpContenedor2.setBackground(new java.awt.Color(255, 255, 255));
        jpContenedor2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true), "OPERACIONES DETALLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abduction", 0, 14))); // NOI18N

        btnMasEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.jpg"))); // NOI18N
        btnMasEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasEstudiantesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jlConsultas);

        btnMenosEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.jpg"))); // NOI18N
        btnMenosEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContenedor2Layout = new javax.swing.GroupLayout(jpContenedor2);
        jpContenedor2.setLayout(jpContenedor2Layout);
        jpContenedor2Layout.setHorizontalGroup(
            jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnMenosEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnMasEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jpContenedor2Layout.setVerticalGroup(
            jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedor2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenosEstudiantes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasEstudiantes))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpContenedorPadreLayout = new javax.swing.GroupLayout(jpContenedorPadre);
        jpContenedorPadre.setLayout(jpContenedorPadreLayout);
        jpContenedorPadreLayout.setHorizontalGroup(
            jpContenedorPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedorPadreLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpContenedorPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpContenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCOntenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpContenedorPadreLayout.setVerticalGroup(
            jpContenedorPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedorPadreLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jpCOntenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpContenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenedorPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenedorPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cmbSemestreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSemestreItemStateChanged
// TODO add your handling code here:
  //  DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
        
    es = new EstudianteService();
//    jList1 = new JList();
  jlConsultas.removeAll();

//DefaultTableModel modelo = new DfaultTableModel();


    Semestre s = (Semestre) cmbSemestre.getSelectedItem();
 ss.show(s);
//        System.out.println(s);
   
    if (s != null) {
        estudianteList = es.getByFK(s.getIds());
//        System.out.println(estudianteList.toString());
     // while(estudianteList.next()) {
        // El primer indice en rs es el 1, no el cero, por eso se suma 1.
        
   // Se añade al modeo la fila completa.
  // modeloTabla.addRow(fila);
      jlConsultas.setListData(estudianteList.toArray());
         // jTable1.addColumn(estudianteList.add(WIDTH, null));
    }
//modeloTabla.addRow(fila);
}//GEN-LAST:event_cmbSemestreItemStateChanged

private void btbMasSemestresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbMasSemestresActionPerformed
// TODO add your handling code here:
    NuevoSemestre ns = new NuevoSemestre(this, true);
    ns.show();
    updateCombo();
    
}//GEN-LAST:event_btbMasSemestresActionPerformed

private void btnMenosSemestresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosSemestresActionPerformed
// TODO add your handling code here:
    int resultado = JOptionPane.showConfirmDialog(rootPane, 
            "Ud esta Seguro de eliminar este semestre: " + cmbSemestre.getSelectedItem().toString(), 
            "Confirmación de eliminación", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
    if (resultado == JOptionPane.YES_OPTION){
        ss.removeSemestre((Semestre)cmbSemestre.getSelectedItem());
        updateCombo();
    }
}//GEN-LAST:event_btnMenosSemestresActionPerformed

private void btnMasEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasEstudiantesActionPerformed
// TODO add your handling code here:
    NuevoEstudiante ne = new NuevoEstudiante(this, true, (Semestre)cmbSemestre.getSelectedItem());
    //System.out.println(jComboBox1.getSelectedItem().toString());
    ne.show();
    cmbSemestreItemStateChanged(null);
}//GEN-LAST:event_btnMasEstudiantesActionPerformed

private void btnMenosEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosEstudiantesActionPerformed
// TODO add your handling code here:
    int resultado = JOptionPane.showConfirmDialog(null,"Ud esta Seguro de eliminar este estudiante: " + jlConsultas.getSelectedValue().toString());
    if (resultado == JOptionPane.YES_OPTION){
        es.removeEstudiante((Estudiante)jlConsultas.getSelectedValue());
        cmbSemestreItemStateChanged(null);
    }
}//GEN-LAST:event_btnMenosEstudiantesActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbMasSemestres;
    private javax.swing.JButton btnMasEstudiantes;
    private javax.swing.JButton btnMenosEstudiantes;
    private javax.swing.JButton btnMenosSemestres;
    private javax.swing.JComboBox cmbSemestre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlConsultas;
    private javax.swing.JPanel jpCOntenedor1;
    private javax.swing.JPanel jpContenedor2;
    private javax.swing.JPanel jpContenedorPadre;
    private javax.swing.JLabel lblOpcionSemestre;
    // End of variables declaration//GEN-END:variables
    private List<Semestre> semestreList;
    private SemestreService ss;
    private EstudianteService es;
    private List<Estudiante> estudianteList;
    
    
}
