package hotelideal.Vistas;

import hotelideal.AccesoADatos.Conexion;
import static hotelideal.AccesoADatos.Conexion.getConnection;
import hotelideal.AccesoADatos.HabitacionData;
import hotelideal.AccesoADatos.TipoHabitacionData;
import hotelideal.Entidades.Habitacion;
import hotelideal.Entidades.TipoHabitacion;
import java.awt.Component;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Marcos
 */
public class FormularioHabitacionView extends javax.swing.JInternalFrame {

    private HabitacionData hdata;
    private Habitacion habitacion;

    private TipoHabitacionData thd;
    private List<TipoHabitacion> listaHabitaciones;

    private boolean isNew;

    public FormularioHabitacionView() throws SQLException {
        initComponents();

        hdata = new HabitacionData();
        thd = new TipoHabitacionData();

        listaHabitaciones = thd.buscarTodos();
                
        setFrameIcon(new ImageIcon(getClass().getResource("/icon/logo1.png")));

        cargaTipo();
        
        //nuevo, editar, eliminar, guardar, cancelar, buscar
        estadosBotones(true, false, false, false, false, true);
        limpiarCampos();
        //habitacion, piso, numero, descripcion, estado, tipo
        estadoCampos(true, false, false, false, false, false);

        isNew = false;

        jbSalir.addActionListener(
                (e) -> {
                    dispose();
                }
        );
    }

    public void estadosBotones(boolean bNuevo, boolean bEditar, boolean bEliminar, boolean bGuardar, boolean bCancelar, boolean bBuscar) {
        jbBuscar.setEnabled(bNuevo);
        jbNuevo.setEnabled(bNuevo);
        jbEditar.setEnabled(bEditar);
        jbGuardar.setEnabled(bGuardar);
        jbCancelar.setEnabled(bCancelar);
        jbEliminar.setEnabled(bEliminar);
    }

    public void estadoCampos(boolean habitacion, boolean piso, boolean numero, boolean descripcion, boolean estado, boolean combo) {
        jtCodHabitacion.setEnabled(habitacion);
        jtPiso.setEnabled(piso);
        jtNumero.setEnabled(numero);
        jtDescripcion.setEnabled(descripcion);
        jcEstado.setEnabled(estado);
        jComboTipo.setEnabled(combo);
    }

    public void limpiarCampos() {
        jtCodHabitacion.setHorizontalAlignment(SwingConstants.RIGHT);
        jtPiso.setText(" ");
        jtNumero.setText(" ");
        jtDescripcion.setText(" ");
        jcEstado.setSelected(false);
    }

    public boolean validarCod_Hab(String codigo) {
        return codigo.trim().matches("^[1-9]\\d{0,5}$");
    }

    public boolean validarPiso(String piso) {
        return piso.trim().matches("^[0-9]\\d{0,5}$");
    }

    public boolean validarNumero(String numero) {
        return numero.trim().matches("^[1-9]\\d{0,6}$");
    }

    public boolean validarDescripcion(String descripcion) {
        return descripcion.trim().matches("^([A-ZÁÉÍÓÚÜÑ]([.]|[a-záéíóüñ]+))([ ][A-ZÁÉÍÓÚÜÑ1-9]([.]|[a-záéíóüñ1-9]*)){0,5}");
    }

    public void cargaTipo() {

        jComboTipo.removeAllItems();

        for (TipoHabitacion th : listaHabitaciones) {
            jComboTipo.addItem(th);
        }
        if (jComboTipo.getItemCount() > 0) {
            TipoHabitacion tipohab = (TipoHabitacion) jComboTipo.getSelectedItem();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtPiso = new javax.swing.JTextField();
        jtNumero = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtCodHabitacion = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jComboTipo = new javax.swing.JComboBox<>();

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New_16.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit_File_16.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit_16.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("COD_HAB");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search_16.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("PISO");

        jLabel3.setText("NUMERO");

        jLabel4.setText("DESCRPCION");

        jLabel5.setText("ESTADO");

        jcEstado.setText("Activo");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("FORMULARIO DE HABITACIONES");

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save_File_16.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel_File_16.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("TIPO");

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_File_16.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtCodHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcEstado)
                                .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtCodHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEditar)
                    .addComponent(jbEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalir))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        if (validarCod_Hab(jtCodHabitacion.getText())) {

            habitacion = hdata.buscarPorId(Integer.parseInt(jtCodHabitacion.getText()));

            if (habitacion != null) {
                restaurarDatosHabitacion();
                pasarFoco(jbEditar);
            } else {
                jtCodHabitacion.setText(" ");
                JOptionPane.showConfirmDialog(this, "la habitacion no existe", "codigo inexistente", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                pasarFoco(jtCodHabitacion);
            }

        } else {
            JOptionPane.showConfirmDialog(this, "Ingrese un codigo valido", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(jtCodHabitacion);
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        isNew = true;
        limpiarCampos();
        //nuevo, editar, eliminar, guardar, cancelar, buscar
        estadosBotones(false, false, false, true, true, false);
        //habitacion, piso, numero, descripcion, estado
        estadoCampos(false, true, true, true, true, true);

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        if (isNew) {
            limpiarCampos();
            //habitacion, piso, numero, descripcion, estado
            estadoCampos(true, false, false, false, false, false);
            //nuevo, editar, eliminar, guardar, cancelar, buscar
            estadosBotones(true, false, false, false, false, true);
            pasarFoco(jtCodHabitacion);
        } else {

            if (habitacion != null) {
                restaurarDatosHabitacion();
                pasarFoco(jbEditar);
            } else {
                limpiarCampos();
                estadosBotones(true, false, false, false, false, true);
                estadoCampos(true, false, false, false, false, false);
                pasarFoco(jbBuscar);
            }
        }

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed

        isNew = true;
        estadosBotones(false, false, true, true, true, false);
        estadoCampos(false, true, true, true, true, true);

    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (JOptionPane.showConfirmDialog(this, "desea eliminar la habitacion", "eliminar habitacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            int hab = hdata.desactivarHabitacion(Integer.parseInt(jtCodHabitacion.getText()));

            if (hab == 1) {
                JOptionPane.showConfirmDialog(this, "La Materia fue eliminada correctamente", "Materia Eliminada", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(this, "La Materia ya estaba eliminada", "Materia Inactiva", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            limpiarCampos();
            estadoCampos(true, false, false, false, false, false);
            estadosBotones(true, false, false, false, false, true);

            pasarFoco(jtCodHabitacion);
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (!isNew && !validarCod_Hab(jtCodHabitacion.getText())) {
            JOptionPane.showConfirmDialog(this, "codigo Incorrecto", "codigo invalido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(jtCodHabitacion);
            return;
        }

        if (!validarPiso(jtPiso.getText())) {
            JOptionPane.showConfirmDialog(this, "piso Incorrecto", "el piso no existe", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(jtPiso);
            return;
        }

        //tengo que buscar que el numero de habitacion ya existe o no con el metodo buscaNumHabitacion
        if (!validarNumero(jtNumero.getText()) && !hdata.buscaNumHabitacion(habitacion.getNroHabitacion())){
            JOptionPane.showConfirmDialog(this, "numero Incorrecto o ya existe una habitacion", "numero invalido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(jtPiso);
            return;
        }

        if (!validarDescripcion(jtDescripcion.getText())) {
            JOptionPane.showConfirmDialog(this, "descrpcion Incorrecta", "descripcion invalida", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            pasarFoco(jtPiso);
            return;
        }

        TipoHabitacion tipohab = (TipoHabitacion) jComboTipo.getSelectedItem();

        if (isNew) {
            habitacion = new Habitacion(
                    Integer.parseInt(jtPiso.getText().trim()),
                    Integer.parseInt(jtNumero.getText().trim()),
                    jtDescripcion.getText(),
                    jcEstado.isSelected(),
                    tipohab);
        } else {
            habitacion = new Habitacion(
                    Integer.parseInt(jtCodHabitacion.getText().trim()),
                    Integer.parseInt(jtPiso.getText().trim()),
                    Integer.parseInt(jtNumero.getText().trim()),
                    jtDescripcion.getText(),
                    jcEstado.isSelected(),
                    tipohab);
        }

        habitacion = hdata.guardar(habitacion);

        if (isNew) {
            JOptionPane.showConfirmDialog(this, "Habitacion agregada correctamente", "Habitacion Creada", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(this, "Habitacion modificada correctamente", "Habitacion Modificada", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
        limpiarCampos();
        estadoCampos(true, false, false, false, false, false);
        estadosBotones(true, false, false, false, false, true);

        pasarFoco(jtCodHabitacion);
    }//GEN-LAST:event_jbGuardarActionPerformed

    public void restaurarDatosHabitacion() {

        estadosBotones(true, true, true, false, true, false);
        estadoCampos(false, false, false, false, false, false);
        jtCodHabitacion.setText("" + habitacion.getId_habitacion());
        jtPiso.setText("" + habitacion.getPiso());
        jtNumero.setText("" + habitacion.getNroHabitacion());
        jtDescripcion.setText(habitacion.getDescripcion());
        jcEstado.setSelected(habitacion.isEstado());
        
        TipoHabitacion n = habitacion.getTipoHabitacion();
        
        int cont = jComboTipo.getItemCount();
        for (int i = 0; i<=cont; i++) {
            if(n.equals(jComboTipo.getItemAt(i))){
                jComboTipo.setSelectedIndex(i);
            }
        }
    }

    public void pasarFoco(Component com) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                com.requestFocusInWindow();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<TipoHabitacion> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JTextField jtCodHabitacion;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtPiso;
    // End of variables declaration//GEN-END:variables
}
