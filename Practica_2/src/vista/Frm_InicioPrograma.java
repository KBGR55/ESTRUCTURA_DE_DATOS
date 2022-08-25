package vista;

import javax.swing.ImageIcon;

/**
 * @author K.G
 */
public class Frm_InicioPrograma extends javax.swing.JFrame {

    public Frm_InicioPrograma() {
        initComponents();
        this.setLocationRelativeTo(Frm_InicioPrograma.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/vista/imagenes/logo.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_opcion1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_opcion2 = new javax.swing.JButton();
        btn_opcion3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consumo de memoria");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");
        jPanel1.setEnabled(false);
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*_*_*_*  Consumo de memoria en Java *_*_*_*");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 490, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        btn_opcion1.setBackground(new java.awt.Color(255, 255, 255));
        btn_opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/saltar.png"))); // NOI18N
        btn_opcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opcion1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_opcion1);
        btn_opcion1.setBounds(30, 30, 40, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear un objeto de la clase ListaEnlazada y java.util.List ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 130, 360, 30);

        btn_opcion2.setBackground(new java.awt.Color(255, 255, 255));
        btn_opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/saltar.png"))); // NOI18N
        btn_opcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opcion2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_opcion2);
        btn_opcion2.setBounds(30, 80, 40, 30);

        btn_opcion3.setBackground(new java.awt.Color(255, 255, 255));
        btn_opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/saltar.png"))); // NOI18N
        btn_opcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opcion3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_opcion3);
        btn_opcion3.setBounds(30, 130, 40, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipos de datos primitivos");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 30, 270, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Crear 5 arreglos ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 80, 280, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 490, 190);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 250));

        setSize(new java.awt.Dimension(543, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_opcion1ActionPerformed
        Frm_opcion1 op = new Frm_opcion1();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_opcion1ActionPerformed

    private void btn_opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_opcion2ActionPerformed
        Frm_opcion2 op = new Frm_opcion2();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_opcion2ActionPerformed

    private void btn_opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_opcion3ActionPerformed
        Frm_opcion3 op = new Frm_opcion3();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_opcion3ActionPerformed

 
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_InicioPrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_opcion1;
    private javax.swing.JButton btn_opcion2;
    private javax.swing.JButton btn_opcion3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
