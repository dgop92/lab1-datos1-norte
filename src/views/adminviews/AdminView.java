
package views.adminviews;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;


public class AdminView extends javax.swing.JFrame {

    private CardLayout card_layout;
    
    
    public AdminView() {
        initComponents();
        
        startCardLayout();
        centreWindow();
    }
    
    private void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y - 25);
    }
    
    private void startCardLayout(){
    
        PendingAppoimentView pendingAppoimentView = new PendingAppoimentView();
        AppoimentView appoimentView = new AppoimentView();
        ProductView productView = new ProductView();
        ProviderView providerView = new ProviderView();
        VetsView vetsView = new VetsView();
        AppoTypeView appoTypeView = new AppoTypeView();
        
        card_layout = (CardLayout) (card_content_layout.getLayout());
        card_content_layout.add(pendingAppoimentView, "pendingAppoimentView");
        card_content_layout.add(appoimentView, "appoimentView");
        card_content_layout.add(productView, "productView");
        card_content_layout.add(providerView, "providerView");
        card_content_layout.add(vetsView, "vetsView");
        card_content_layout.add(appoTypeView, "appoTypeView");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        header_title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pending_appo_button = new javax.swing.JButton();
        appo_button = new javax.swing.JButton();
        product_button = new javax.swing.JButton();
        provider_button = new javax.swing.JButton();
        vet_button = new javax.swing.JButton();
        appotype_button = new javax.swing.JButton();
        sale_button = new javax.swing.JButton();
        card_content_layout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 249, 249));

        header.setBackground(new java.awt.Color(45, 106, 79));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setAlignmentY(0.0F);
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 30));

        header_title.setBackground(new java.awt.Color(55, 71, 79));
        header_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setText("Administrador");
        header.add(header_title);

        jPanel4.setBackground(new java.awt.Color(247, 249, 249));

        jPanel2.setBackground(new java.awt.Color(247, 249, 249));
        jPanel2.setLayout(new java.awt.GridLayout(7, 1, 5, 10));

        pending_appo_button.setBackground(new java.awt.Color(64, 145, 108));
        pending_appo_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pending_appo_button.setForeground(new java.awt.Color(255, 255, 255));
        pending_appo_button.setText("CitasPendientes");
        pending_appo_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        pending_appo_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pending_appo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending_appo_buttononClientLogin(evt);
            }
        });
        jPanel2.add(pending_appo_button);

        appo_button.setBackground(new java.awt.Color(64, 145, 108));
        appo_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        appo_button.setForeground(new java.awt.Color(255, 255, 255));
        appo_button.setText("Citas");
        appo_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        appo_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appo_buttononClientLogin(evt);
            }
        });
        jPanel2.add(appo_button);

        product_button.setBackground(new java.awt.Color(64, 145, 108));
        product_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_button.setForeground(new java.awt.Color(255, 255, 255));
        product_button.setText("Productos");
        product_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        product_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_buttononClientLogin(evt);
            }
        });
        jPanel2.add(product_button);

        provider_button.setBackground(new java.awt.Color(64, 145, 108));
        provider_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        provider_button.setForeground(new java.awt.Color(255, 255, 255));
        provider_button.setText("Provedores");
        provider_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        provider_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provider_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_buttononClientLogin(evt);
            }
        });
        jPanel2.add(provider_button);

        vet_button.setBackground(new java.awt.Color(64, 145, 108));
        vet_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        vet_button.setForeground(new java.awt.Color(255, 255, 255));
        vet_button.setText("Veterinarios");
        vet_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        vet_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vet_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vet_buttononClientLogin(evt);
            }
        });
        jPanel2.add(vet_button);

        appotype_button.setBackground(new java.awt.Color(64, 145, 108));
        appotype_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        appotype_button.setForeground(new java.awt.Color(255, 255, 255));
        appotype_button.setText("Tipos de citas");
        appotype_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        appotype_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appotype_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appotype_buttononClientLogin(evt);
            }
        });
        jPanel2.add(appotype_button);

        sale_button.setBackground(new java.awt.Color(64, 145, 108));
        sale_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sale_button.setForeground(new java.awt.Color(255, 255, 255));
        sale_button.setText("Ventas");
        sale_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        sale_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sale_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sale_buttononClientLogin(evt);
            }
        });
        jPanel2.add(sale_button);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        card_content_layout.setBackground(new java.awt.Color(247, 249, 249));
        card_content_layout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_content_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_content_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pending_appo_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending_appo_buttononClientLogin
        card_layout.show(card_content_layout, "pendingAppoimentView");
    }//GEN-LAST:event_pending_appo_buttononClientLogin

    private void product_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_buttononClientLogin
        card_layout.show(card_content_layout, "productView");
    }//GEN-LAST:event_product_buttononClientLogin

    private void provider_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_buttononClientLogin
        card_layout.show(card_content_layout, "providerView");
    }//GEN-LAST:event_provider_buttononClientLogin

    private void vet_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vet_buttononClientLogin
        card_layout.show(card_content_layout, "vetsView");
    }//GEN-LAST:event_vet_buttononClientLogin

    private void appotype_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appotype_buttononClientLogin
        card_layout.show(card_content_layout, "appoTypeView");
    }//GEN-LAST:event_appotype_buttononClientLogin

    private void sale_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sale_buttononClientLogin
        // TODO add your handling code here:
    }//GEN-LAST:event_sale_buttononClientLogin

    private void appo_buttononClientLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appo_buttononClientLogin
        card_layout.show(card_content_layout, "appoimentView");
    }//GEN-LAST:event_appo_buttononClientLogin

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appo_button;
    private javax.swing.JButton appotype_button;
    private javax.swing.JPanel card_content_layout;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton pending_appo_button;
    private javax.swing.JButton product_button;
    private javax.swing.JButton provider_button;
    private javax.swing.JButton sale_button;
    private javax.swing.JButton vet_button;
    // End of variables declaration//GEN-END:variables
}