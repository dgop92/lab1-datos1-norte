package views.adminviews;

import controllers.BaseController;
import controllers.SimpleController;
import inevaup.dialogs.InfoDialog;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import pseudofiles.PseudoFile;

public class SaleView extends javax.swing.JPanel {
    
    private final BaseController controller;
    
    public SaleView() {
        initComponents();
        
        PseudoFile pseudoFile = new PseudoFile(
            new File("data/ventas.csv"), 
            new String[]{"tipoCita", "cedClient"}
        );

        controller = new SimpleController(
            (DefaultTableModel) appo_table.getModel(), 
            pseudoFile
        );
  
        setListeners();
        
    }
    
    private void setListeners(){
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent evt) {
                 updateTable();
            }
        });
    }
    
    private void updateTable(){
        try {
            controller.updateTable();
        } catch (IOException e) {
            fileExceptionDialog();
        }
    }
    
    private void fileExceptionDialog(){
        InfoDialog dialog = new InfoDialog(null, "Error", 
            "Un error inesperado acaba de ocurrir", InfoDialog.TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card_content_layout = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appo_table = new javax.swing.JTable();

        card_content_layout.setBackground(new java.awt.Color(247, 249, 249));

        appo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tipoCita", "cedClient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appo_table);

        javax.swing.GroupLayout card_content_layoutLayout = new javax.swing.GroupLayout(card_content_layout);
        card_content_layout.setLayout(card_content_layoutLayout);
        card_content_layoutLayout.setHorizontalGroup(
            card_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_content_layoutLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        card_content_layoutLayout.setVerticalGroup(
            card_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_content_layoutLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appo_table;
    private javax.swing.JPanel card_content_layout;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
