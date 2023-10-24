/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelideal.Vistas;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Dimension;
import java.util.Collections;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Karim
 */
public class MenuView extends javax.swing.JFrame {

    static MenuView test;

    /**
     * Creates new form Test
     */
    public MenuView() {
        initComponents();
        //setSize(1280, 720);
    }

    private void centrarInternalFrame(JInternalFrame form) {

        Dimension desktopSize = jDesktopPane1.getSize();
        int x = (desktopSize.width - form.getWidth()) / 2;
        int y = (desktopSize.height - form.getHeight()) / 2;
        form.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuHabitacion = new javax.swing.JMenuItem();
        menuTipoHabitacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuReserva = new javax.swing.JMenuItem();
        NuevaReserva = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        jMenu1.setText("Huesped");

        menuHuesped.setText("Formulario Huesped");
        menuHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(menuHuesped);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Habitacion");

        menuHabitacion.setText("Formulario Habitacion");
        menuHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHabitacionActionPerformed(evt);
            }
        });
        jMenu2.add(menuHabitacion);

        menuTipoHabitacion.setText("Formulario Tipo de Habitacion");
        menuTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTipoHabitacionActionPerformed(evt);
            }
        });
        jMenu2.add(menuTipoHabitacion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reserva");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        menuReserva.setText("Manejo de Reservas");
        menuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservaActionPerformed(evt);
            }
        });
        jMenu3.add(menuReserva);

        NuevaReserva.setText("Nueva Reservación");
        NuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaReservaActionPerformed(evt);
            }
        });
        jMenu3.add(NuevaReserva);

        jMenuBar1.add(jMenu3);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void menuHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHuespedActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioHuespedView frmHuesped = new FormularioHuespedView();
        centrarInternalFrame(frmHuesped);
        frmHuesped.setVisible(true);
        jDesktopPane1.add(frmHuesped);
        jDesktopPane1.moveToFront(frmHuesped);
    }//GEN-LAST:event_menuHuespedActionPerformed

    private void menuHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHabitacionActionPerformed

    }//GEN-LAST:event_menuHabitacionActionPerformed

    private void menuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        GestionReservas gestionReservas=new GestionReservas();
        centrarInternalFrame(gestionReservas);
        gestionReservas.setVisible(true);
        jDesktopPane1.add(gestionReservas);
        jDesktopPane1.moveToFront(gestionReservas);
    }//GEN-LAST:event_menuReservaActionPerformed

    private void menuTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTipoHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTipoHabitacionActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void NuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaReservaActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioReservaView frmReseva = new FormularioReservaView();
        centrarInternalFrame(frmReseva);
        frmReseva.setVisible(true);
        jDesktopPane1.add(frmReseva);
        jDesktopPane1.moveToFront(frmReseva);
    }//GEN-LAST:event_NuevaReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatRobotoFont.install();
//        FlatMacDarkLaf.setup();
//        FlatLightLaf.setup();
//#BF5AF2 #f00 #00C #6FF #33ffff #6ccff
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#6ccff" ) );
        FlatDarculaLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem NuevaReserva;
    private static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuHabitacion;
    private javax.swing.JMenuItem menuHuesped;
    private javax.swing.JMenuItem menuReserva;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem menuTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    public static JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    } 
}
