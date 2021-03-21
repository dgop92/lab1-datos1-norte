
package views.clientviews;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import forms.Form;
import forms.PseudoWriterForm;
import pseudofiles.PseudoFile;
import forms.registerforms.RegisterForm;


public class RegisterViewForm extends javax.swing.JDialog {

    
    public RegisterViewForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        centreWindow();
    }
    
    private void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y - 25);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ced_label = new javax.swing.JLabel();
        ced_field = new javax.swing.JTextField();
        pass_label = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        re_pass_label = new javax.swing.JLabel();
        re_pass_field = new javax.swing.JPasswordField();
        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        age_labe = new javax.swing.JLabel();
        age_field = new javax.swing.JTextField();
        emai_label = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        tel_label = new javax.swing.JLabel();
        tel_field = new javax.swing.JTextField();
        adress_label = new javax.swing.JLabel();
        adress_field = new javax.swing.JTextField();
        register_client_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        header.setBackground(new java.awt.Color(45, 106, 79));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setAlignmentY(0.0F);
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 15));

        header_title.setBackground(new java.awt.Color(55, 71, 79));
        header_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setText("Registrar Cliente");
        header.add(header_title);

        jPanel1.setBackground(new java.awt.Color(249, 247, 247));

        jPanel2.setBackground(new java.awt.Color(247, 249, 249));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 30));

        jPanel3.setBackground(new java.awt.Color(247, 249, 249));
        jPanel3.setLayout(new java.awt.GridLayout(8, 2, 0, 10));

        ced_label.setBackground(new java.awt.Color(247, 249, 249));
        ced_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ced_label.setForeground(new java.awt.Color(33, 33, 33));
        ced_label.setText("Cedula:");
        jPanel3.add(ced_label);

        ced_field.setBackground(new java.awt.Color(255, 255, 255));
        ced_field.setColumns(15);
        ced_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ced_field.setForeground(new java.awt.Color(33, 33, 33));
        ced_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ced_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        ced_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        ced_field.setName(""); // NOI18N
        jPanel3.add(ced_field);

        pass_label.setBackground(new java.awt.Color(247, 249, 249));
        pass_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass_label.setForeground(new java.awt.Color(33, 33, 33));
        pass_label.setText("Contraseña:");
        jPanel3.add(pass_label);

        password_field.setBackground(new java.awt.Color(255, 255, 255));
        password_field.setColumns(15);
        password_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        password_field.setForeground(new java.awt.Color(0, 0, 0));
        password_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        jPanel3.add(password_field);

        re_pass_label.setBackground(new java.awt.Color(247, 249, 249));
        re_pass_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        re_pass_label.setForeground(new java.awt.Color(33, 33, 33));
        re_pass_label.setText("Repita Contraseña:");
        jPanel3.add(re_pass_label);

        re_pass_field.setBackground(new java.awt.Color(255, 255, 255));
        re_pass_field.setColumns(15);
        re_pass_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        re_pass_field.setForeground(new java.awt.Color(0, 0, 0));
        re_pass_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        jPanel3.add(re_pass_field);

        name_label.setBackground(new java.awt.Color(247, 249, 249));
        name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(33, 33, 33));
        name_label.setText("Nombre:");
        jPanel3.add(name_label);

        name_field.setBackground(new java.awt.Color(255, 255, 255));
        name_field.setColumns(15);
        name_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name_field.setForeground(new java.awt.Color(33, 33, 33));
        name_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        name_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        name_field.setName(""); // NOI18N
        jPanel3.add(name_field);

        age_labe.setBackground(new java.awt.Color(247, 249, 249));
        age_labe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        age_labe.setForeground(new java.awt.Color(33, 33, 33));
        age_labe.setText("Edad");
        jPanel3.add(age_labe);

        age_field.setBackground(new java.awt.Color(255, 255, 255));
        age_field.setColumns(15);
        age_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age_field.setForeground(new java.awt.Color(33, 33, 33));
        age_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        age_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        age_field.setName(""); // NOI18N
        jPanel3.add(age_field);

        emai_label.setBackground(new java.awt.Color(247, 249, 249));
        emai_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emai_label.setForeground(new java.awt.Color(33, 33, 33));
        emai_label.setText("Correo:");
        jPanel3.add(emai_label);

        email_field.setBackground(new java.awt.Color(255, 255, 255));
        email_field.setColumns(15);
        email_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email_field.setForeground(new java.awt.Color(33, 33, 33));
        email_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        email_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        email_field.setName(""); // NOI18N
        jPanel3.add(email_field);

        tel_label.setBackground(new java.awt.Color(247, 249, 249));
        tel_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel_label.setForeground(new java.awt.Color(33, 33, 33));
        tel_label.setText("Telefono");
        jPanel3.add(tel_label);

        tel_field.setBackground(new java.awt.Color(255, 255, 255));
        tel_field.setColumns(15);
        tel_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tel_field.setForeground(new java.awt.Color(33, 33, 33));
        tel_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tel_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        tel_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        tel_field.setName(""); // NOI18N
        jPanel3.add(tel_field);

        adress_label.setBackground(new java.awt.Color(247, 249, 249));
        adress_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adress_label.setForeground(new java.awt.Color(33, 33, 33));
        adress_label.setText("Direccion");
        jPanel3.add(adress_label);

        adress_field.setBackground(new java.awt.Color(255, 255, 255));
        adress_field.setColumns(15);
        adress_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adress_field.setForeground(new java.awt.Color(33, 33, 33));
        adress_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        adress_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        adress_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        adress_field.setName(""); // NOI18N
        jPanel3.add(adress_field);

        jPanel2.add(jPanel3);

        register_client_button.setBackground(new java.awt.Color(64, 145, 108));
        register_client_button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        register_client_button.setForeground(new java.awt.Color(255, 255, 255));
        register_client_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-login-24.png"))); // NOI18N
        register_client_button.setText("Registrarse");
        register_client_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 25));
        register_client_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_client_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAccpetForm(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(register_client_button)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(register_client_button)
                .addGap(181, 181, 181))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onAccpetForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAccpetForm
        Form registerForm = new RegisterForm(
                ced_field.getText(), 
                name_field.getText(), 
                age_field.getText(), 
                email_field.getText(), 
                tel_field.getText(), 
                password_field.getText(), 
                re_pass_field.getText(), 
                adress_field.getText()
        );
        PseudoWriterForm pseudoWriterForm = new PseudoWriterForm(
            registerForm, 
            new PseudoFile(new File("data/clientes.csv"))
        );
        pseudoWriterForm.writeRegister();
        
    }//GEN-LAST:event_onAccpetForm

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
            java.util.logging.Logger.getLogger(RegisterViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterViewForm dialog = new RegisterViewForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress_field;
    private javax.swing.JLabel adress_label;
    private javax.swing.JTextField age_field;
    private javax.swing.JLabel age_labe;
    private javax.swing.JTextField ced_field;
    private javax.swing.JLabel ced_label;
    private javax.swing.JLabel emai_label;
    private javax.swing.JTextField email_field;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPasswordField re_pass_field;
    private javax.swing.JLabel re_pass_label;
    private javax.swing.JButton register_client_button;
    private javax.swing.JTextField tel_field;
    private javax.swing.JLabel tel_label;
    // End of variables declaration//GEN-END:variables
}
