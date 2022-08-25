package vista;

import controlador.servicios.MirasolServices;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author K.G
 */
public class FrmInicio extends javax.swing.JFrame {

    private MirasolServices ser = new MirasolServices();

    public FrmInicio() {
        initComponents();
        CargarCampos();
    }

    private void CargarCampos() {
        txt_sumaVentasTotales.setText(String.valueOf(ser.getConstMari().getEmpresaMarisol().getSumasTotales()));
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tablaAgencias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_meses1 = new javax.swing.JComboBox<>();
        btn_ingresarEditar = new javax.swing.JButton();
        txt_venta1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_venta2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_venta3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_venta4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_venta5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_sumaVentasTotales = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbx_meses2 = new javax.swing.JComboBox<>();
        btn_promedio = new javax.swing.JButton();
        txt_promedio = new javax.swing.JTextField();
        btn_mayoresVentasMes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txt_mes1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_mes2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_mes3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_mes4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_mes5 = new javax.swing.JTextField();
        btn_ventasMenoresMes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_titulo.setBackground(new java.awt.Color(51, 0, 51));
        txt_titulo.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setText("MIRASOL");
        txt_titulo.setToolTipText("");
        txt_titulo.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("RESUMEN DE VENTAS  DE LAS AGENCIAS"));
        jPanel3.setLayout(null);

        tbl_tablaAgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MES", "AGENCIA 1", "AGENCIA 2", "AGENCIA 3", "AGENCIA 4", "AGENCIA 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_tablaAgencias.setSelectionBackground(new java.awt.Color(153, 0, 153));
        jScrollPane1.setViewportView(tbl_tablaAgencias);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 32, 740, 240);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESAR VENTAS MENSUALES"));
        jPanel1.setLayout(null);

        jLabel1.setText("Registar Ventas del mes:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(11, 18, 140, 24);

        cbx_meses1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        jPanel1.add(cbx_meses1);
        cbx_meses1.setBounds(160, 20, 260, 22);

        btn_ingresarEditar.setBackground(new java.awt.Color(255, 255, 255));
        btn_ingresarEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ingresarEditar.setForeground(new java.awt.Color(51, 0, 51));
        btn_ingresarEditar.setText("INGRESAR");
        btn_ingresarEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingresarEditar);
        btn_ingresarEditar.setBounds(430, 20, 150, 22);
        jPanel1.add(txt_venta1);
        txt_venta1.setBounds(80, 50, 70, 30);

        jLabel2.setText("Agencia 1 :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 70, 30);

        jLabel3.setText("Agencia 2 :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 50, 70, 30);
        jPanel1.add(txt_venta2);
        txt_venta2.setBounds(230, 50, 70, 30);

        jLabel4.setText("Agencia 3 :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 50, 70, 30);
        jPanel1.add(txt_venta3);
        txt_venta3.setBounds(380, 50, 70, 30);

        jLabel5.setText("Agencia 4 :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 50, 70, 30);
        jPanel1.add(txt_venta4);
        txt_venta4.setBounds(530, 50, 70, 30);

        jLabel6.setText("Agencia 5 :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(610, 50, 70, 30);
        jPanel1.add(txt_venta5);
        txt_venta5.setBounds(680, 50, 70, 30);

        jLabel7.setText("Suma de todas las ventas :");

        txt_sumaVentasTotales.setEditable(false);
        txt_sumaVentasTotales.setBackground(new java.awt.Color(0, 0, 0));
        txt_sumaVentasTotales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_sumaVentasTotales.setForeground(new java.awt.Color(255, 255, 255));
        txt_sumaVentasTotales.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("MENSUAL VENTAS"));
        jPanel2.setLayout(null);

        jLabel8.setText("Mes:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(11, 18, 40, 24);

        cbx_meses2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        jPanel2.add(cbx_meses2);
        cbx_meses2.setBounds(60, 20, 110, 22);

        btn_promedio.setBackground(new java.awt.Color(255, 255, 255));
        btn_promedio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_promedio.setForeground(new java.awt.Color(51, 0, 51));
        btn_promedio.setText("CALCULAR PROMEDIO");
        btn_promedio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promedioActionPerformed(evt);
            }
        });
        jPanel2.add(btn_promedio);
        btn_promedio.setBounds(180, 20, 180, 22);

        txt_promedio.setEditable(false);
        txt_promedio.setBackground(new java.awt.Color(0, 0, 0));
        txt_promedio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_promedio.setForeground(new java.awt.Color(255, 255, 255));
        txt_promedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txt_promedio);
        txt_promedio.setBounds(550, 20, 200, 22);

        btn_mayoresVentasMes.setBackground(new java.awt.Color(255, 255, 255));
        btn_mayoresVentasMes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_mayoresVentasMes.setForeground(new java.awt.Color(51, 0, 51));
        btn_mayoresVentasMes.setText("MAYORES VENTAS");
        btn_mayoresVentasMes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mayoresVentasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayoresVentasMesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mayoresVentasMes);
        btn_mayoresVentasMes.setBounds(370, 20, 160, 22);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("MENOR VENTA EN EL MES "));
        jPanel6.setLayout(null);

        txt_mes1.setEditable(false);
        jPanel6.add(txt_mes1);
        txt_mes1.setBounds(80, 30, 150, 22);

        jLabel22.setText("Agencia 1 :");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(10, 30, 70, 20);

        jLabel23.setText("Agencia 2 :");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(260, 30, 70, 20);

        txt_mes2.setEditable(false);
        jPanel6.add(txt_mes2);
        txt_mes2.setBounds(340, 30, 150, 22);

        jLabel24.setText("Agencia 3 :");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(530, 30, 70, 20);

        txt_mes3.setEditable(false);
        jPanel6.add(txt_mes3);
        txt_mes3.setBounds(600, 30, 140, 20);

        jLabel25.setText("Agencia 4 :");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(10, 60, 70, 20);

        txt_mes4.setEditable(false);
        jPanel6.add(txt_mes4);
        txt_mes4.setBounds(80, 60, 150, 20);

        jLabel26.setText("Agencia 5 :");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(260, 60, 70, 20);

        txt_mes5.setEditable(false);
        jPanel6.add(txt_mes5);
        txt_mes5.setBounds(340, 60, 150, 22);

        btn_ventasMenoresMes.setBackground(new java.awt.Color(255, 255, 255));
        btn_ventasMenoresMes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ventasMenoresMes.setForeground(new java.awt.Color(51, 0, 51));
        btn_ventasMenoresMes.setText("BUSCAR MES");
        btn_ventasMenoresMes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ventasMenoresMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasMenoresMesActionPerformed(evt);
            }
        });
        jPanel6.add(btn_ventasMenoresMes);
        btn_ventasMenoresMes.setBounds(530, 60, 210, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sumaVentasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_sumaVentasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarEditarActionPerformed
        String datos[] = {txt_venta1.getText(), txt_venta2.getText(), txt_venta3.getText(), txt_venta4.getText(), txt_venta5.getText()};
        if (txt_venta1.getText().trim().isEmpty() || txt_venta2.getText().trim().isEmpty() || txt_venta3.getText().trim().isEmpty() || txt_venta4.getText().trim().isEmpty() || txt_venta5.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (ser.ingresar(posiciones(cbx_meses1.getSelectedItem().toString()), datos)) {
                JOptionPane.showMessageDialog(null, "Se ha guardadao correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
                CargarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Ingresar correctamente el valor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ingresarEditarActionPerformed

    private void btn_promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promedioActionPerformed
        if (ser.promedio(posiciones(cbx_meses2.getSelectedItem().toString()), txt_promedio) == false) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_promedioActionPerformed

    private void btn_mayoresVentasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayoresVentasMesActionPerformed
        if (ser.mayorAgencia(posiciones(cbx_meses2.getSelectedItem().toString()), txt_promedio) == false) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_mayoresVentasMesActionPerformed

    private void btn_ventasMenoresMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasMenoresMesActionPerformed
        if (ser.menorVentaMesAgencia(txt_mes1, txt_mes2, txt_mes3, txt_mes4, txt_mes5) == false) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ventasMenoresMesActionPerformed

    public int[] posiciones(String cbx) {
        int[] v = new int[2];
        v[0] = 0;
        v[1] = 0;
        switch (cbx) {
            case "ENERO":
                v[0] = 0;
                v[1] = 0;
                break;
            case "FEBRERO":
                v[0] = 0;
                v[1] = 1;
                break;
            case "MARZO":
                v[0] = 0;
                v[1] = 2;
                break;
            case "ABRIL":
                v[0] = 0;
                v[1] = 3;
                break;
            case "MAYO":
                v[0] = 1;
                v[1] = 0;
                break;
            case "JUNIO":
                v[0] = 1;
                v[1] = 1;
                break;
            case "JULIO":
                v[0] = 1;
                v[1] = 2;
                break;
            case "AGOSTO":
                v[0] = 1;
                v[1] = 3;
                break;
            case "SEPTIEMBRE":
                v[0] = 2;
                v[1] = 0;
                break;
            case "OCTUBRE":
                v[0] = 2;
                v[1] = 1;
                break;
            case "NOVIEMBRE":
                v[0] = 2;
                v[1] = 2;
                break;
            case "DICIEMBRE":
                v[0] = 2;
                v[1] = 3;
                break;
            default:
                return null;
        }
        return v;
    }

    private void cargarTabla() {
        tbl_tablaAgencias.updateUI();
        DefaultTableModel tablaDefa = new DefaultTableModel();
        int cont;
        tablaDefa.addColumn("MES");
        for (int i = 1; i < 6; i++) {
            tablaDefa.addColumn("AGENCIA " + i);
        }
        tbl_tablaAgencias.setModel(tablaDefa);
        String[] datos = new String[6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                cont = 0;
                datos[0] = String.valueOf(ser.getConstMari().getEmpresaMarisol().getMeses()[i][j]);
                for (int k = 0; k < 5; k++) {
                    cont++;
                    datos[cont] = String.valueOf(ser.getConstMari().getEmpresaMarisol().getAgencias()[k].getVentasMensuales()[i][j]);
                }
                tablaDefa.addRow(datos);
            }
        }
        cont = 0;
        datos[cont] = String.valueOf("TOTALES");
        for (int i = 0; i < 5; i++) {
            cont++;
            datos[cont] = String.valueOf(ser.getConstMari().getEmpresaMarisol().getAgencias()[i].getSumaVentasMensual());
        }
        tablaDefa.addRow(datos);
        tbl_tablaAgencias.setModel(tablaDefa);
        //No pueda editarse la tabla
        tbl_tablaAgencias.setEnabled(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresarEditar;
    private javax.swing.JButton btn_mayoresVentasMes;
    private javax.swing.JButton btn_promedio;
    private javax.swing.JButton btn_ventasMenoresMes;
    private javax.swing.JComboBox<String> cbx_meses1;
    private javax.swing.JComboBox<String> cbx_meses2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tablaAgencias;
    private javax.swing.JTextField txt_mes1;
    private javax.swing.JTextField txt_mes2;
    private javax.swing.JTextField txt_mes3;
    private javax.swing.JTextField txt_mes4;
    private javax.swing.JTextField txt_mes5;
    private javax.swing.JTextField txt_promedio;
    private javax.swing.JTextField txt_sumaVentasTotales;
    private javax.swing.JLabel txt_titulo;
    private javax.swing.JTextField txt_venta1;
    private javax.swing.JTextField txt_venta2;
    private javax.swing.JTextField txt_venta3;
    private javax.swing.JTextField txt_venta4;
    private javax.swing.JTextField txt_venta5;
    // End of variables declaration//GEN-END:variables
}
