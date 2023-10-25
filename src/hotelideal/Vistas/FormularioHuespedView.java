package hotelideal.Vistas;

import hotelideal.AccesoADatos.HuespedData;
import hotelideal.Entidades.Huesped;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class FormularioHuespedView extends javax.swing.JInternalFrame {

    private HuespedData hp;
    private Huesped hue;
    private boolean reserva = false;
    private int estado;
    private FormularioReservaView fReserva;

    public FormularioHuespedView() {

        initComponents();
        try {
            hp = new HuespedData();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //hue = new Huesped();
        setFrameIcon(new ImageIcon(getClass().getResource("/icon/logo1.png")));

        estado = 0;

        limpiarDatosHuesped();

        addSelectAllOnFocusToTextFields(this);

        pasarFoco(txtDNI);

    }

    private void limpiarDatosHuesped() {

        limpiarCampos();
        estadosCampos(true, false, false, false, false, false, false);
        estadosBotones(true, false, false, false, true);

    }

    private void restaurarDatosHuesped() {

        estadosBotones(true, true, false, true, false);
        estadosCampos(false, false, false, false, false, false, false);
        txtId.setText("" + hue.getId_huesped());
        txtDNI.setText(hue.getDni());
        txtApellido.setText(hue.getApellido());
        txtNombre.setText(hue.getNombre());
        txtDomicilio.setText(hue.getDomicilio());
        txtCelular.setText(hue.getCelular());
        txtCorreo.setText(hue.getCorreo());
        chkActivo.setSelected(hue.isEstado());

    }

    private void estadosBotones(boolean btnNuevo, boolean btnEditar, boolean btnGuardar, boolean btnCancelar, boolean btnBuscar) {

        cmdNuevo.setEnabled(btnNuevo);
        cmdEditar.setEnabled(btnEditar);
        cmdGuardar.setEnabled(btnGuardar);
        cmdCancelar.setEnabled(btnCancelar);
        cmdBuscar.setEnabled(btnBuscar);

    }

    private void estadosCampos(boolean tfDni, boolean tfApellido, boolean tfNombre, boolean tfDomicilio, boolean tfCelular, boolean tfCorreo, boolean ckActivo) {

        txtDNI.setEnabled(tfDni);
        txtApellido.setEnabled(tfApellido);
        txtNombre.setEnabled(tfNombre);
        txtDomicilio.setEnabled(tfDomicilio);
        txtCelular.setEnabled(tfCelular);
        txtCorreo.setEnabled(tfCorreo);
        chkActivo.setEnabled(ckActivo);

    }

    private void limpiarCampos() {

        txtDNI.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDNI.setText("0");
        txtApellido.setText("");
        txtNombre.setText("");
        txtDomicilio.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        chkActivo.setSelected(true);

    }

    private boolean validarDNI(String dni) {
        return dni.matches("^[1-9]\\d{0,8}$");
    }

    private boolean validarNomApe(String nomApe) {
        return nomApe.matches("^([A-ZÁÉÍÓÚÜÑ]([.]|[a-záéíóüñ]+))([ ][A-ZÁÉÍÓÚÜÑ]([.]|[a-záéíóüñ]+)){0,5}");
    }

    private boolean validarDomicilio(String domicilio) {
        return domicilio.matches("^[a-zA-Z0-9.\\s]*$");
    }

    private boolean validarCelular(String celular) {
        return celular.matches("^[+]?[0-9]{10}$");
    }

    private boolean validarCorreo(String correo) {
        return correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static void addSelectAllOnFocusToTextFields(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.addFocusListener(new FocusAdapter() {

                    @Override
                    public void focusGained(FocusEvent e) {
                        textField.selectAll();
                    }
                });
            } else if (component instanceof Container) {
                // Si es un contenedor, busca campos de texto dentro del contenedor
                addSelectAllOnFocusToTextFields((Container) component);
            }
        }
    }

    private void pasarFoco(Component com) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                com.requestFocusInWindow();

            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        lblNom1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        lblNom3 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        cmdBuscar = new javax.swing.JButton();
        lblApe = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblNom = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        cmdNuevo = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        lblNom2 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        lblNom4 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblNom5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        txtId.setText("jTextField1");

        lblNom1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom1.setText("NOMBRE");

        lblNom3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom3.setText("NOMBRE");

        setTitle("HUESPED");
        setToolTipText("");

        lblDni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDni.setText("DNI");

        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search_16.png"))); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.setSelected(true);
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        lblApe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblApe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApe.setText("APELLIDO");

        lblNom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom.setText("NOMBRE");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstado.setText("ESTADO");

        chkActivo.setText("ACTIVO");

        cmdNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New_16.png"))); // NOI18N
        cmdNuevo.setText("Nuevo");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        cmdEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit_File_16.png"))); // NOI18N
        cmdEditar.setText("Editar");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit_16.png"))); // NOI18N
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save_File_16.png"))); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel_File_16.png"))); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        lblNom2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom2.setText("DOMICILIO");

        lblNom4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom4.setText("CELULAR");

        lblNom5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom5.setText("CORREO");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FORMULARIO DE HUESPED");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(cmdGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNom5)
                                    .addComponent(lblNom4)
                                    .addComponent(lblNom2))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(txtDomicilio)
                                    .addComponent(txtCorreo)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkActivo))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblApe)
                                            .addComponent(lblDni)
                                            .addComponent(lblNom))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                            .addComponent(txtApellido))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApe)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom2)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom4)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSalir)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGuardar)
                    .addComponent(cmdCancelar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed

        estado = 1;

        limpiarCampos();
        estadosCampos(true, true, true, true, true, true, true);
        estadosBotones(false, false, true, true, false);
        pasarFoco(txtDNI);

    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed

        estado = 2;

        estadosCampos(true, true, true, true, true, true, true);
        estadosBotones(false, false, true, true, false);
        pasarFoco(txtDNI);

    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed

        if (validarDNI("" + txtDNI.getText())) {

            hue = hp.buscarPorDNI("" + txtDNI.getText());

            if (hue != null) {

                restaurarDatosHuesped();
                pasarFoco(cmdEditar);
            } else {
                txtDNI.setText("0");
                JOptionPane.showConfirmDialog(this, "El DNI del Huesped ingresado no existe en la BD", "DNI Inexistente", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                pasarFoco(txtDNI);
            }
            estado = 0;
        } else {
            JOptionPane.showConfirmDialog(this, "Ingrese un DNI Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtDNI);
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed

        if (estado == 1) {

            limpiarDatosHuesped();
            pasarFoco(txtDNI);

        } else if (estado == 2) {

            restaurarDatosHuesped();
            pasarFoco(cmdEditar);

        } else {

            limpiarDatosHuesped();
            pasarFoco(txtDNI);

        }

        estado = 0;

        if (reserva) {
            fReserva.setHuesped(null);
        }
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        if (!validarDNI(txtDNI.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese un DNI Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtDNI);
            return;
        }

        if (!validarNomApe(txtApellido.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese un Apellido Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtApellido);
            return;
        }

        if (!validarNomApe(txtNombre.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese un Nombre Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtNombre);
            return;
        }

        if (!validarDomicilio(txtDomicilio.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese un Domicilio Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtDomicilio);
            return;
        }

        if (!validarCelular(txtCelular.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese un Celular Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtCelular);
            return;
        }

        if (!validarCorreo(txtCorreo.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese un Correo Correcto", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(txtCorreo);
            return;
        }

        if (estado == 1) {
            hue = new Huesped("" + txtNombre.getText(), "" + txtApellido.getText(), "" + txtDomicilio.getText(), "" + txtCorreo.getText(), "" + txtCelular.getText(), "" + txtDNI.getText(), chkActivo.isSelected());
        } else if (estado == 2) {
            hue = new Huesped("" + txtNombre.getText(), "" + txtApellido.getText(), "" + txtDomicilio.getText(), "" + txtCorreo.getText(), "" + txtCelular.getText(), "" + txtDNI.getText(), Integer.parseInt(txtId.getText()), chkActivo.isSelected());
        }

        // limpiarDatosHuesped();
        hue = hp.guardar(hue);

        if (hue != null) {
            if (estado == 1) {
                JOptionPane.showConfirmDialog(this, "El Huesped fue agregado correctamente", "Huesped Creado", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else if (estado == 2) {
                JOptionPane.showConfirmDialog(this, "El Huesped fue modificado correctamente", "Huesped Modificado", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            restaurarDatosHuesped();
            if (reserva) {
                fReserva.setHuesped(null);
                Object[] botones = {"Aceptar", "Cancelar"};
                int op = javax.swing.JOptionPane.showOptionDialog(this, "Desea utilizar los datos del nuevo cliente:\n" + hue, "", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION, null, botones, botones[0]);
                if (op == 0) {
                    fReserva.setHuesped(hue);
                    dispose();
                }
            }
        }

        estado = 0;
        pasarFoco(txtDNI);

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        if (reserva && hue != null) {
            Object[] botones = {"Aceptar", "Cancelar"};
            int op = javax.swing.JOptionPane.showOptionDialog(this, "Desea utilizar los datos del cliente:\n" + hue, "", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION, null, botones, botones[0]);
            if (op == 0) {
                fReserva.setHuesped(hue);
                dispose();
            }
        } else if (reserva && hue == null) {
            Object[] botones = {"Salir", "Cancelar"};
            int op = javax.swing.JOptionPane.showOptionDialog(this, "Desea salir sin datos de un cliente?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION, null, botones, botones[0]);
            if (op == 0) {
                fReserva.setHuesped(hue);
                dispose();
            } else {
                dispose();
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_cmdSalirActionPerformed

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public void setfReserva(FormularioReservaView fReserva) {
        this.fReserva = fReserva;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNom1;
    private javax.swing.JLabel lblNom2;
    private javax.swing.JLabel lblNom3;
    private javax.swing.JLabel lblNom4;
    private javax.swing.JLabel lblNom5;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre3;
    // End of variables declaration//GEN-END:variables

}
