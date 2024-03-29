/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakerysystem;

import static bakerysystem.Menu.bttconfirmorder;
import static bakerysystem.Menu.cake1;
import static bakerysystem.Menu.cupcake;
import java.util.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maced
 */
public class ConfirmOrder extends javax.swing.JFrame {
private List<String> OrderHistory = new ArrayList<>();
    /**
     * Creates new form ConfirmOrder
     */
    public ConfirmOrder() {
        initComponents();
        setResizable(false);
        btthistory.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confirm_order = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txttotalamount = new javax.swing.JTextField();
        bttbuy = new javax.swing.JButton();
        bttcancel = new javax.swing.JButton();
        btthistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 237, 236));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 237, 236));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(176, 25, 17));
        jLabel1.setText("Please confirm your order");

        confirm_order.setEditable(false);
        confirm_order.setBackground(new java.awt.Color(252, 229, 227));
        confirm_order.setColumns(20);
        confirm_order.setRows(5);
        jScrollPane1.setViewportView(confirm_order);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(176, 25, 17));
        jLabel2.setText("Total Amount:");

        txttotalamount.setEditable(false);
        txttotalamount.setBackground(new java.awt.Color(255, 204, 204));
        txttotalamount.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        txttotalamount.setText("P0.0");

        bttbuy.setBackground(new java.awt.Color(255, 204, 204));
        bttbuy.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttbuy.setText("Buy");
        bttbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttbuyActionPerformed(evt);
            }
        });

        bttcancel.setBackground(new java.awt.Color(255, 204, 204));
        bttcancel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttcancel.setText("Cancel");
        bttcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttcancelActionPerformed(evt);
            }
        });

        btthistory.setBackground(new java.awt.Color(255, 204, 204));
        btthistory.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btthistory.setText("Order History");
        btthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttotalamount))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btthistory, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttotalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btthistory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttcancelActionPerformed
       Menu m = new Menu();
       dispose();
       m.bttconfirmorder.setEnabled(true);
    }//GEN-LAST:event_bttcancelActionPerformed

    private void bttbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttbuyActionPerformed
        Object PMethods[] = {"Cash On Delivery", "Credit Card", "Debit Card", "Gcash"};
        Object SelectPM = JOptionPane.showInputDialog(null, "Choose your preferred payment method: ", "Payment Method", JOptionPane.QUESTION_MESSAGE, null, PMethods, PMethods[0]);
        if(SelectPM != null){
        JOptionPane.showMessageDialog(null, "Transaction Success!\nYou have paid "+txttotalamount.getText()+"!"); 
         storeOrderHistory(SelectPM.toString());
         txttotalamount.setText("P"+0.0);
         confirm_order.setText("");
         bttbuy.setEnabled(false);
         btthistory.setEnabled(true);
        }
    }//GEN-LAST:event_bttbuyActionPerformed

    private void btthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthistoryActionPerformed
        showOrderHistory();
    }//GEN-LAST:event_btthistoryActionPerformed

    private void storeOrderHistory(String payment){
        StringBuilder details = new StringBuilder("");
        for(String order:confirm_order.getText().split("\n"))
            if(!order.trim().isEmpty()){
            details.append(order).append("\n");
            }
        
        details.append("\nTotal Amount: ").append(txttotalamount.getText());
        details.append("\nPayment Method: ").append(payment);

        OrderHistory.add(details.toString());
    }
    
    private void showOrderHistory(){
        StringBuilder history = new StringBuilder("");
        for(String OrderHistory:OrderHistory){
        history.append(OrderHistory).append("\n");
        }
        JOptionPane.showMessageDialog(null, history.toString(), "Order History", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttbuy;
    public javax.swing.JButton bttcancel;
    private javax.swing.JButton btthistory;
    public static javax.swing.JTextArea confirm_order;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txttotalamount;
    // End of variables declaration//GEN-END:variables
}
