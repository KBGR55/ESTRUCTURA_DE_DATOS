package vista;

import controlador.ciudades.CiudadGrafoController;
import controlador.tda.lista.ListaEnlazada;
import javax.swing.JOptionPane;
import vista.modelo.ModeloTablaCiudad;

/**
 *
 * @author K.G
 */
public class Frm_GrafoCiudades extends javax.swing.JFrame {

    private ModeloTablaCiudad mtc = new ModeloTablaCiudad();
    private CiudadGrafoController cgc;

    public Frm_GrafoCiudades() {
        initComponents();
        btn_modificar.setEnabled(false);
        cgc = new CiudadGrafoController();
        cargarTabla();
        cargarComboVertice();
        jPanel_B.setVisible(false);
    }
    
    private void limpiar() {
        txt_latitud.setText("");
        txt_longitud.setText("");
        txt_nombres.setText("");
        txt_nHabitantes.setValue(0);
        btn_modificar.setEnabled(false);
        cgc.vaciarCiudad();
        cargarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_longitud = new javax.swing.JTextField();
        txt_latitud = new javax.swing.JTextField();
        txt_nHabitantes = new javax.swing.JSpinner();
        btn_agregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbx_destino = new javax.swing.JComboBox<>();
        btn_vincular = new javax.swing.JButton();
        cbx_origen = new javax.swing.JComboBox<>();
        btn_camino = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        btn_mostrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel_B = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_BPA = new javax.swing.JButton();
        cbx_inicio = new javax.swing.JComboBox<>();
        DFS = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciudades");
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aqregar Ciudad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombres :");

        btn_modificar.setBackground(new java.awt.Color(255, 255, 255));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Latitud :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Longitud :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numero de habitantes:");

        txt_nHabitantes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 2));

        btn_agregar.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_longitud))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nHabitantes)
                    .addComponent(txt_latitud))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_agregar))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VERTICES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Origen:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Destino");

        cbx_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));

        btn_vincular.setBackground(new java.awt.Color(255, 255, 255));
        btn_vincular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_vincular.setForeground(new java.awt.Color(0, 0, 0));
        btn_vincular.setText("Vincular");
        btn_vincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vincularActionPerformed(evt);
            }
        });

        cbx_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));

        btn_camino.setBackground(new java.awt.Color(255, 255, 255));
        btn_camino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_camino.setForeground(new java.awt.Color(0, 0, 0));
        btn_camino.setText("Camino");
        btn_camino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_caminoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn_vincular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_camino, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbx_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vincular)
                    .addComponent(btn_camino))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tabla);

        btn_mostrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_mostrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_mostrar.setText("MOSTRAR");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_mostrar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mostrar))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAMINO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_B.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_B.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busquedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Inicio :");

        btn_BPA.setBackground(new java.awt.Color(255, 255, 255));
        btn_BPA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_BPA.setForeground(new java.awt.Color(0, 0, 0));
        btn_BPA.setText("BPA");
        btn_BPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BPAActionPerformed(evt);
            }
        });

        cbx_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));

        DFS.setBackground(new java.awt.Color(255, 255, 255));
        DFS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DFS.setForeground(new java.awt.Color(0, 0, 0));
        DFS.setText("DFS");
        DFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFSActionPerformed(evt);
            }
        });

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane3.setViewportView(txt_area);

        javax.swing.GroupLayout jPanel_BLayout = new javax.swing.GroupLayout(jPanel_B);
        jPanel_B.setLayout(jPanel_BLayout);
        jPanel_BLayout.setHorizontalGroup(
            jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_BPA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DFS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_BLayout.setVerticalGroup(
            jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BPA)
                    .addComponent(DFS))
                .addGap(20, 20, 20))
            .addGroup(jPanel_BLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_B, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aumentarGarfo() {
        if (txt_nombres.getText().trim().length() == 0 || txt_longitud.getText().trim().length() == 0 || txt_latitud.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Integer pos = cgc.getGend().numVertices()+1;
                System.out.println(pos);
                cgc.getCiudad().setNombre(txt_nombres.getText());
                cgc.getCiudad().setId(pos);
                cgc.getCiudad().setnHabitantes(Integer.valueOf(txt_nHabitantes.getValue().toString()));
                cgc.getCiudad().getUbicacion().setLatitud(Double.parseDouble(txt_latitud.getText()));
                cgc.getCiudad().getUbicacion().setLongitud(Double.parseDouble(txt_longitud.getText()));
                if (cgc.aumentarCiudad()) {
                    cargarComboVertice();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE!!", "OK", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
       
    private void adyacencias() {
        Integer origen = (cbx_origen.getSelectedIndex() + 1);
        Integer destino = (cbx_destino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "ESCOJA CIUDADES DIFERENTES", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Double distancia = cgc.calcularDistancia(cgc.getGend().obtenerEtiqueta(origen), cgc.getGend().obtenerEtiqueta(destino));
                cgc.getGend().insertarAristaE(cgc.getGend().obtenerEtiqueta(origen), cgc.getGend().obtenerEtiqueta(destino), distancia);
                System.out.println("----------------");
                System.out.println(cgc.getGend().toString());
                System.out.println("----------------");
                cargarTabla();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puede insertar", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
        }
       
    }

    private void btn_vincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vincularActionPerformed
        adyacencias();
        jPanel_B.setVisible(true);
    }//GEN-LAST:event_btn_vincularActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        modificar();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        Frm_GrafoVistaCiudades frm = new Frm_GrafoVistaCiudades(cgc.getGend());
        frm.setSize(400, 400);
        frm.setVisible(true);
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_caminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_caminoActionPerformed
        camino();
    }//GEN-LAST:event_btn_caminoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        aumentarGarfo();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tbl_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tablaMouseClicked
         if (evt.getClickCount() == 2) {
            cargarVista();
        }
    }//GEN-LAST:event_tbl_tablaMouseClicked

    private void btn_BPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BPAActionPerformed
       BPA();
    }//GEN-LAST:event_btn_BPAActionPerformed

    private void DFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFSActionPerformed
        DFS();
    }//GEN-LAST:event_DFSActionPerformed

    public void cargarVista() {
        Integer fila = -1;
        fila = tbl_tabla.getSelectedRow();
        if (fila >= 0) {
            try {
                cgc.setCiudad(cgc.getGend().obtenerEtiqueta(fila + 1));
                txt_nombres.setText(cgc.getCiudad().getNombre());
                txt_nHabitantes.setValue(cgc.getCiudad().getnHabitantes());
                txt_longitud.setText(String.valueOf(cgc.getCiudad().getUbicacion().getLongitud()));
                txt_latitud.setText(String.valueOf(cgc.getCiudad().getUbicacion().getLatitud()));
                btn_modificar.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ESCOGA UNA FILA DE LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void camino() {
        Integer origen = (cbx_origen.getSelectedIndex() + 1);
        Integer destino = (cbx_destino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "ESCOJA CIUDADES DIFERENTES", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ListaEnlazada<Integer> lista = cgc.getGend().algoritmo_Floyd(origen, destino);
                String[] aux = new String[lista.getSize()];
                for (int i = 0; i < lista.getSize(); i++) {
                    aux[i] = cgc.getGend().obtenerEtiqueta(lista.obtenerDato(i)).getNombre();
                }
                jList1.setListData(aux);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
    
    private void cargarTabla() {
        tbl_tabla.updateUI();
        mtc.setGrafo(cgc.getGend());
        mtc.fireTableStructureChanged();
        mtc.fireTableDataChanged();
        tbl_tabla.setModel(mtc);
        tbl_tabla.updateUI();
        System.out.println(cgc.getGend().toString());
    }

    private void modificar() {
        if (txt_nombres.getText().trim().length() == 0 || txt_longitud.getText().trim().length() == 0 || txt_latitud.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Integer pos = cgc.getGend().obtenerCodigo(cgc.getCiudad());
                cgc.getCiudad().setNombre(txt_nombres.getText());
                cgc.getCiudad().setnHabitantes(Integer.valueOf(txt_nHabitantes.getValue().toString()));
                cgc.getCiudad().getUbicacion().setLatitud(Double.parseDouble(txt_latitud.getText()));
                cgc.getCiudad().getUbicacion().setLongitud(Double.parseDouble(txt_longitud.getText()));
                if (cgc.getGend().modificar(cgc.getGend().obtenerEtiqueta(pos), cgc.getCiudad())) {
                    cargarComboVertice();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "SE HA MODIFICADO CORRECTAMENTE!!", "OK", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void cargarComboVertice() {
        cbx_origen.removeAllItems();
        cbx_destino.removeAllItems();
        cbx_inicio.removeAllItems();
        try {
            for (int i = 1; i <= cgc.getGend().numVertices(); i++) {
                cbx_origen.addItem(cgc.getGend().obtenerEtiqueta(i).getNombre());
                cbx_destino.addItem(cgc.getGend().obtenerEtiqueta(i).getNombre());
                cbx_inicio.addItem(cgc.getGend().obtenerEtiqueta(i).getNombre());
            }
        } catch (Exception e) {
            System.out.println("ERROR EN CARGAR COMBO");
        }
    }
    
    private void BPA() {
        Integer origen = (cbx_inicio.getSelectedIndex() + 1);
        try {
            txt_area.setText(cgc.getGend().toStringBPA(origen));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void DFS() {
        //Integer origen = (cbx_inicio.getSelectedIndex() + 1);
        try {
            txt_area.setText(cgc.getGend().toStringDFS());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Frm_GrafoCiudades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DFS;
    private javax.swing.JButton btn_BPA;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_camino;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_vincular;
    private javax.swing.JComboBox<String> cbx_destino;
    private javax.swing.JComboBox<String> cbx_inicio;
    private javax.swing.JComboBox<String> cbx_origen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_B;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_tabla;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_latitud;
    private javax.swing.JTextField txt_longitud;
    private javax.swing.JSpinner txt_nHabitantes;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
