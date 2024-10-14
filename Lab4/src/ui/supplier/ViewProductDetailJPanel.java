/*
 * CreateProductJPanel.java
 *
 */
package ui.supplier;

import model.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Feature;
import model.Supplier;

/**
 *
 * @author taswa
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel workArea;
    Product product;
    Supplier supplier;

    public ViewProductDetailJPanel(JPanel workArea, Product product, Supplier supplier) {
        initComponents();
        this.workArea = workArea;
        this.product = product;
        this.supplier = supplier;

        txtName.setText(this.product.getName());
        txtId.setText(String.valueOf(this.product.getId()));
        txtPrice.setText(String.valueOf(this.product.getPrice()));

//        if (product.getLogoImage() != null) {
//            imgLogo.setIcon(product.getLogoImage());
//        } else {
//            imgLogo.setText("No Logo");
//        }

//        populateExistingFeaturesTable();
        refreshTable();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeatures = new javax.swing.JTable();
        btnAddFeature = new javax.swing.JButton();
        btnRemoveFeature = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExistingFeatures = new javax.swing.JTable();
        btnAddExistingFeature = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setText("View Product Details");

        lblName.setText("Product Name:");

        txtName.setEditable(false);

        lblPrice.setText("Price:");

        txtPrice.setEditable(false);

        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        lblId.setText("ID:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Feature Name", "Value"
            }
        ));
        tblFeatures.setEnabled(false);
        jScrollPane1.setViewportView(tblFeatures);

        btnAddFeature.setText("Add Feature");
        btnAddFeature.setEnabled(false);
        btnAddFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFeatureActionPerformed(evt);
            }
        });

        btnRemoveFeature.setText("Remove Feature");
        btnRemoveFeature.setEnabled(false);
        btnRemoveFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFeatureActionPerformed(evt);
            }
        });

        tblExistingFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Feature Name", "Value", "Product Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblExistingFeatures);

        btnAddExistingFeature.setText("Add");
        btnAddExistingFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExistingFeatureActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select from existing features");

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddExistingFeature, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton1)
                        .addGap(38, 38, 38)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFeature)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveFeature)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate)
                        .addGap(26, 26, 26)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblId)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtId, txtName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(backButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddFeature)
                        .addComponent(btnRemoveFeature)
                        .addComponent(btnUpdate)))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddExistingFeature)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtId, txtName, txtPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFeatureActionPerformed
        // TODO add your handling code here:
        saveFeatures();

        int selectedRow = tblFeatures.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a feature!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        product.getFeatures().remove(selectedRow);
        refreshTable();

    }//GEN-LAST:event_btnRemoveFeatureActionPerformed

    private void btnAddFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFeatureActionPerformed
        // TODO add your handling code here:
 Feature newFeature = product.addFeature();
        newFeature.setName("New Feature");
        newFeature.setValue("Type Value here");

        saveFeatures();
        refreshTable();

        //        Feature newFeature = product.addNewFeature();
        //        newFeature.setName("New Feature");
        //       newFeature.setValue("Type Value here");
        //
        //       saveFeatures();
        //        refreshTable();
    }//GEN-LAST:event_btnAddFeatureActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

          if (txtName.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all the details!!");

        } else {
            String name = txtName.getText();

            String stringPrice = txtPrice.getText();

            if (Product.isValidName(name) && Product.isValidNumber(stringPrice)) {

                try {
                    product.setName(txtName.getText());
                    int productPrice = Integer.parseInt(stringPrice);
                    product.setPrice(productPrice);
                    JOptionPane.showMessageDialog(this, "Product Details Successfully updated!");
                    saveFeatures();

                    txtName.setEditable(false);
                    txtPrice.setEditable(false);
                    btnSave.setEnabled(false);
                    tblFeatures.setEnabled(false);
                    btnAddFeature.setEnabled(false);
                    btnRemoveFeature.setEnabled(false);
                    refreshTable();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid product price, enter again and save!!");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid values!!");
            }

        }

    }//GEN-LAST:event_btnSaveActionPerformed
private void saveFeatures() {
        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Feature currentFeature = product.getFeatures().get(i);
            currentFeature.setName(tblFeatures.getValueAt(i, 0).toString());
            currentFeature.setValue(tblFeatures.getValueAt(i, 1).toString());
        }
    }

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
          txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
        tblFeatures.setEnabled(true);
        btnAddFeature.setEnabled(true);
        btnRemoveFeature.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddExistingFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExistingFeatureActionPerformed
        // TODO add your handling code here:
        //        int selectedRow = tblExistingFeatures.getSelectedRow();
        //        if (selectedRow < 0) {
            //            JOptionPane.showMessageDialog(this, "Please select a feature!!", "Warning", JOptionPane.WARNING_MESSAGE);
            //        }
        //        Feature selectedFeature = (Feature) tblExistingFeatures.getValueAt(selectedRow, 0);
        //        Feature newFeature = product.addFeature();
        //        newFeature.setName(selectedFeature.getName());
        //        //newFeature.setValue(selectedFeature.getValue());
        //
        //        saveFeatures();
        //        refreshTable();

        int selectedRow = tblExistingFeatures.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a feature!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Return without further processing
        }

        // Get the selected feature
        Feature selectedFeature = (Feature) tblExistingFeatures.getValueAt(selectedRow, 0);
        if (selectedFeature == null) {
          
            JOptionPane.showMessageDialog(this, "The selected feature is empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    
        Feature newFeature = product.addFeature();
        newFeature.setName(selectedFeature.getName());
        //newFeature.setValue(selectedFeature.getValue());

        
        saveFeatures();
        refreshTable();
    }//GEN-LAST:event_btnAddExistingFeatureActionPerformed

    private void backAction() {
 ManageProductCatalogJPanel manageProductCatalogJPanel = null ;
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        // TODO: Change this to the Instance of the Component
        // Component component = componentArray[componentArray.length - 2];
        for (Component c : componentArray) {
            if (c instanceof ManageProductCatalogJPanel ) {
                manageProductCatalogJPanel = (ManageProductCatalogJPanel) c;
                manageProductCatalogJPanel.refreshTable();
                break;
            }
        }
        if(manageProductCatalogJPanel != null){
           //ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea); 
        }
        
    }
    
  

    public void refreshTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        model.setRowCount(0);

        for (Feature f : product.getFeatures()) {
            Object row[] = new Object[2];
            row[0] = f;
            row[1] = f.getValue() == null ? "Empty" : f.getValue().toString();
            model.addRow(row);
        }

        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton btnAddExistingFeature;
    private javax.swing.JButton btnAddFeature;
    private javax.swing.JButton btnRemoveFeature;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblExistingFeatures;
    private javax.swing.JTable tblFeatures;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

     private void populateExistingFeaturesTable() {
        DefaultTableModel model = (DefaultTableModel) tblExistingFeatures.getModel();
        model.setRowCount(0);

        for (Product p : supplier.getProductCatalog().getProductCatalog()) {
            for (Feature f : p.getFeatures()) {
                Object row[] = new Object[3];
                row[0] = f;
                row[1] = f.getValue();
                row[2] = p;

                model.addRow(row);
            }
        }
    }








}
