package vistas;

import datos.RegistroEncomiendas;
import static datos.RegistroEncomiendas.listarTodas;
import java.util.ArrayList;
import modelos.Encomienda;
/**
 *
 * @author mselfene
 */
public class Listar extends javax.swing.JFrame {

    private static Listar instancia;
    
    public static Listar getInstancia(){
        
        if (instancia == null) {
            instancia = new Listar();
        }
        
        return instancia;
        
    }
    
    public Listar() {
        initComponents();
        
        listarTodas();
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_listado_encomiendas = new javax.swing.JLabel();
        lbl_id_encomiendas = new javax.swing.JLabel();
        btn_generar_listado = new javax.swing.JButton();
        txt_id_encomiendas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mostrar = new javax.swing.JTable();
        btn_mostrar_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_listado_encomiendas.setText("Listado de Encomiendas");

        lbl_id_encomiendas.setText("id :");

        btn_generar_listado.setText("Genarar listado");
        btn_generar_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_listadoActionPerformed(evt);
            }
        });

        txt_id_encomiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_encomiendasActionPerformed(evt);
            }
        });

        tbl_mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_mostrar);

        btn_mostrar_todo.setText("Mostrar Todo");
        btn_mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_todoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_id_encomiendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id_encomiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_generar_listado)
                        .addGap(41, 41, 41)
                        .addComponent(btn_mostrar_todo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lbl_listado_encomiendas)))
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl_listado_encomiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id_encomiendas)
                    .addComponent(btn_generar_listado)
                    .addComponent(txt_id_encomiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostrar_todo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_encomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_encomiendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_encomiendasActionPerformed

    private void btn_generar_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_listadoActionPerformed
        // TODO add your handling code here:
        mostrarPorId(Integer.parseInt(txt_id_encomiendas.getText()));
    }//GEN-LAST:event_btn_generar_listadoActionPerformed

    private void btn_mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_todoActionPerformed
        // TODO add your handling code here:
        listarTodas();
    }//GEN-LAST:event_btn_mostrar_todoActionPerformed
   
    
    private void listarTodas(){
        
        String matriz[][] = new String[RegistroEncomiendas.listarTodas().size()][7];
        
            for (int i = 0; i < RegistroEncomiendas.listarTodas().size(); i++) {

                matriz[i][0] = RegistroEncomiendas.listarTodas().get(i).getId() + "";
                matriz[i][1] = RegistroEncomiendas.listarTodas().get(i).getDestinatario();
                matriz[i][2] = RegistroEncomiendas.listarTodas().get(i).getDireccion();
                matriz[i][3] = RegistroEncomiendas.listarTodas().get(i).getTipoEncomienda() + "";
                //matriz[i][4] = RegistroEncomiendas.listarTodas().get(i).isEntregaDomicilio() + "";
                //boolean ckeck = true;
                if(RegistroEncomiendas.listarTodas().get(i).isEntregaDomicilio() == true){
                  matriz[i][4] = "Si";  
                } else {
                  matriz[i][4] = "No";  
                }
                matriz[i][5] = RegistroEncomiendas.listarTodas().get(i).getTamanoEncomienda() + "";
                matriz[i][6] = RegistroEncomiendas.listarTodas().get(i).getRemitente(); 

            }
        
            tbl_mostrar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                
                    new String[]{
                        "ID", "DESTINATARIO", "DIRECCION", "TIPO ENCOMIENDA", "TIPO ENTREGA", "TAMAÑO ENCOMIENDA", "REMITENTE"
                    }          
            )
        );
        
    }

    
    private void mostrarPorId(int id){
        ArrayList<Encomienda> Lista = RegistroEncomiendas.listarId(id);
        String matriz[][] = new String[Lista.size()][7];
        
            for (int i = 0; i < Lista.size(); i++) {

                matriz[i][0] = Lista.get(i).getId() + "";
                matriz[i][1] = Lista.get(i).getDestinatario();
                matriz[i][2] = Lista.get(i).getDireccion();
                matriz[i][3] = Lista.get(i).getTipoEncomienda() + "";
                matriz[i][4] = Lista.get(i).isEntregaDomicilio() + "";
                matriz[i][5] = Lista.get(i).getTamanoEncomienda() + "";
                matriz[i][6] = Lista.get(i).getRemitente();

            }
        
            tbl_mostrar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
        
                    new String[]{
                        "ID", "DESTINATARIO", "DIRECCION", "TIPO ENCOMIENDA", "TIPO ENTREGA", "TAMAÑO ENCOMIENDA", "REMITENTE"
                    }            
            )
        );
        
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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar_listado;
    private javax.swing.JButton btn_mostrar_todo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id_encomiendas;
    private javax.swing.JLabel lbl_listado_encomiendas;
    private javax.swing.JTable tbl_mostrar;
    private javax.swing.JTextField txt_id_encomiendas;
    // End of variables declaration//GEN-END:variables
}
