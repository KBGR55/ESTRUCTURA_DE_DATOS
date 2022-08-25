package vista;

import controlador.ControladorObjetosListListaEnlazada;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author K.G
 */
public class Frm_opcion3 extends javax.swing.JFrame {

    ControladorObjetosListListaEnlazada cobjet = new ControladorObjetosListListaEnlazada();

    /**
     * Creates new form Frm_opcion3
     */
    public Frm_opcion3() {
        initComponents();
        this.setLocationRelativeTo(Frm_opcion3.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/vista/imagenes/logo.png")).getImage());
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*_*_*_* ListaEnlazada y java.util.List  *_*_*_*");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGRESAR AL MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tdl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tdl_datos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1179, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frm_InicioPrograma op = new Frm_InicioPrograma();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cargarTabla() {
        cobjet.medirMemoria();
        tdl_datos.updateUI();
        DefaultTableModel tablaDefa = new DefaultTableModel();
        tablaDefa.addColumn("Tipo de Dato");
        tablaDefa.addColumn("Bits de los datos vacios");
        tablaDefa.addColumn("Bits de los datos llenos");
        tablaDefa.addColumn("Valores de los datos");
        tdl_datos.setModel(tablaDefa);
        String[] datos = new String[4];
        cobjet.medirDatosLLenos();
        for (int i = 0; i < cobjet.getM().length; i++) {
            datos[0] = String.valueOf(cobjet.getM()[i].getMedir().getTipoDato());
            datos[1] = String.valueOf(cobjet.getM()[i].getMedir().getVacio());
            datos[2] = String.valueOf(cobjet.getM()[i].getMedir().getLleno());
            datos[3] = valores(i);
            tablaDefa.addRow(datos);
        }
        tdl_datos.setModel(tablaDefa);
        //No pueda editarse la tabla
        tdl_datos.setEnabled(false);
    }

    public String valores(int l) {
        String sr = "";
        switch (l) {
            case 0:
                for (int i = 0; i < 25; i++) {
                    sr += " | " + cobjet.getObj().getLita().get(i);
                }
                break;
            case 1:
                sr += " | " + cobjet.getObj().getListaEnlazada().getCabecera().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato();
                sr += " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato();
                sr += " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato();
                sr += " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato();
                sr += " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato();
                sr += " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato() + " | " + cobjet.getObj().getListaEnlazada().getCabecera().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato();
                break;
            default:
                throw new AssertionError();
        }
        return sr;
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
            java.util.logging.Logger.getLogger(Frm_opcion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_opcion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_opcion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_opcion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_opcion3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tdl_datos;
    // End of variables declaration//GEN-END:variables
}
