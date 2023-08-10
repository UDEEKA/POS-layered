/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layered.view;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.layered.controller.CustomerController;
import pos.layered.dto.CustomerDto;

/**
 *
 * @author user
 */
public class CustomerPanel extends javax.swing.JPanel {
    
    private CustomerController customerController;

    /**
     * Creates new form CustomerPanel
     */
    public CustomerPanel() {
        customerController = new CustomerController();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        HedderLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        custIdabel = new javax.swing.JLabel();
        custIdText = new javax.swing.JTextField();
        custTittleLabel = new javax.swing.JLabel();
        custDobText = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custDobLabel = new javax.swing.JLabel();
        custTitleText = new javax.swing.JTextField();
        custAddressabel = new javax.swing.JLabel();
        custAddressText = new javax.swing.JTextField();
        custCityLabel = new javax.swing.JLabel();
        custCityText = new javax.swing.JTextField();
        custProvinceLabel = new javax.swing.JLabel();
        custProvinceText = new javax.swing.JTextField();
        custPostalCodeLabel = new javax.swing.JLabel();
        custPostalCodeText = new javax.swing.JTextField();
        SaveCustomerButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        updateCustomerButton = new javax.swing.JButton();
        custSalaryLabel = new javax.swing.JLabel();
        custSalaryText = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        HedderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HedderLabel.setText("Manage Customer");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HedderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HedderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        custIdabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custIdabel.setText("Customer ID");

        custTittleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custTittleLabel.setText("Customer Title");

        custDobText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDobTextActionPerformed(evt);
            }
        });

        custNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custNameLabel.setText("Customer Name");

        custDobLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custDobLabel.setText("Customer DOB");

        custAddressabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custAddressabel.setText("Address");

        custCityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custCityLabel.setText("City");

        custProvinceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custProvinceLabel.setText("Province");

        custPostalCodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custPostalCodeLabel.setText("Postal Code");

        SaveCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveCustomerButton.setText("Save Customer");
        SaveCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCustomerButtonActionPerformed(evt);
            }
        });

        deleteCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteCustomerButton.setText("Delete Customer");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        updateCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateCustomerButton.setText("Update Customer");
        updateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerButtonActionPerformed(evt);
            }
        });

        custSalaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custSalaryLabel.setText("Salary");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveCustomerButton)
                .addGap(20, 20, 20))
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(custAddressabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(custIdabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(custTittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(custDobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(custDobText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(custSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addComponent(custCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(custCityText))
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(custPostalCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(custPostalCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(custProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                                .addComponent(deleteCustomerButton)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateCustomerButton)
                            .addComponent(custProvinceText))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(formPanelLayout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custIdabel)
                    .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custTittleLabel)
                    .addComponent(custNameLabel)
                    .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custSalaryLabel)
                        .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custDobLabel)
                        .addComponent(custDobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custAddressabel)
                    .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCityLabel)
                    .addComponent(custProvinceLabel)
                    .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteCustomerButton)
                            .addComponent(updateCustomerButton)
                            .addComponent(SaveCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custPostalCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custPostalCodeLabel))
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void custDobTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custDobTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custDobTextActionPerformed

    private void SaveCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCustomerButtonActionPerformed
          addCustomer();
    }//GEN-LAST:event_SaveCustomerButtonActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed
      
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void updateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerButtonActionPerformed
       
    }//GEN-LAST:event_updateCustomerButtonActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
      
    }//GEN-LAST:event_customerTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HedderLabel;
    private javax.swing.JButton SaveCustomerButton;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JLabel custAddressabel;
    private javax.swing.JLabel custCityLabel;
    private javax.swing.JTextField custCityText;
    private javax.swing.JLabel custDobLabel;
    private javax.swing.JTextField custDobText;
    private javax.swing.JTextField custIdText;
    private javax.swing.JLabel custIdabel;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextField custNameText;
    private javax.swing.JLabel custPostalCodeLabel;
    private javax.swing.JTextField custPostalCodeText;
    private javax.swing.JLabel custProvinceLabel;
    private javax.swing.JTextField custProvinceText;
    private javax.swing.JLabel custSalaryLabel;
    private javax.swing.JTextField custSalaryText;
    private javax.swing.JTextField custTitleText;
    private javax.swing.JLabel custTittleLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateCustomerButton;
    // End of variables declaration//GEN-END:variables

    private void addCustomer() {
        try {
            CustomerDto customerDto = new CustomerDto(
                    custIdText.getText(),
                    custTitleText.getText(),
                    custNameText.getText(),
                    custDobText.getText(),
                    Double.parseDouble(custSalaryText.getText()),
                    custAddressText.getText(),
                    custCityText.getText(),
                    custProvinceText.getText(),
                    custPostalCodeText.getText());
            
            String result = customerController.addCustomer(customerDto);
            JOptionPane.showMessageDialog(this, result);
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
                
    }
     private void clear() {
        custIdText.setText("");
        custTitleText.setText("");
        custNameText.setText("");
        custDobText.setText("");
        custSalaryText.setText("");
        custAddressText.setText("");
        custCityText.setText("");
        custProvinceText.setText("");
        custPostalCodeText.setText("");

    }
}
