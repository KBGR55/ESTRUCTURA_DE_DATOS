package vista;

import controlador.ControladorArreglos;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * @author K.G
 */
public class Frm_opcion2 extends javax.swing.JFrame {
    ControladorArreglos cA=new ControladorArreglos();
    
    /**
     * Creates new form Frm_opcion2
     */
    public Frm_opcion2() {
        initComponents();
        this.setLocationRelativeTo(Frm_opcion2.this);
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
        jLabel2.setText("*_*_*_* Arreglos  *_*_*_*");
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
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
                .addComponent(jButton2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frm_InicioPrograma op = new Frm_InicioPrograma();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cargarTabla() {
        cA.medirMemoria();
        tdl_datos.updateUI();
        DefaultTableModel tablaDefa = new DefaultTableModel();
        tablaDefa.addColumn("Tipo de Dato");
        tablaDefa.addColumn("Bits de los datos vacios");
        tablaDefa.addColumn("Bits de los datos llenos");
        tablaDefa.addColumn("Valores de los datos"); 
        tdl_datos.setModel(tablaDefa);
        String[] datos = new String[4];
        cA.medirDatosLLenos();
        for (int i = 0; i < cA.getM().length; i++) {
            datos[0] = String.valueOf(cA.getM()[i].getMedir().getTipoDato());
            datos[1] = String.valueOf(cA.getM()[i].getMedir().getVacio());
            datos[2] = String.valueOf(cA.getM()[i].getMedir().getLleno());
            datos[3] = valores(i);
            tablaDefa.addRow(datos);
        }
        tdl_datos.setModel(tablaDefa);
        //No pueda editarse la tabla
        tdl_datos.setEnabled(false);
    }
    
    public String valores(int l){
        String sr="";
            switch (l) {
            case 0:
                for (int i = 0; i < 5; i++) {
                    sr+=" | "+cA.getDatos().getArregloString()[i];
                }
               break;    
            case 1:
                for (int i = 0; i < 5; i++) {
                    sr+=" | "+cA.getDatos().getArregloLong()[i];
                }
               break; 
            case 2:
                for (int i = 0; i < 5; i++) {
                    sr+=" | "+cA.getDatos().getArregloDouble()[i];
                }
               break; 
            case 3:
                for (int i = 0; i < 5; i++) {
                    sr+=" | "+cA.getDatos().getArregloFloat()[i];
                }
               break; 
            case 4:
                for (int i = 0; i < 5; i++) {
                    sr+=" | "+cA.getDatos().getArregloInt()[i];
                }
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_opcion2().setVisible(true);
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
