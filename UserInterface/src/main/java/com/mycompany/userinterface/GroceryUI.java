/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.userinterface;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Gian
 */
public class GroceryUI extends javax.swing.JFrame {
    
    ArrayList<String> cartProducts = new ArrayList<>();
    ArrayList<Double> cartPrices = new ArrayList<>();
    ArrayList<Double> cartQuantity = new ArrayList<>();
    ArrayList<String> products = new ArrayList<>(Arrays.asList("", "", "", "", ""));
    ArrayList<Double> prices = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0));
        
    /**
     * Creates new form GroceryUI
     */
    public GroceryUI() {
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

        lblGrocery = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        btnList = new javax.swing.JButton();
        lblCategoryName = new javax.swing.JLabel();
        btnMeat = new javax.swing.JButton();
        btnSeafood = new javax.swing.JButton();
        btnFruit = new javax.swing.JButton();
        btnVegetable = new javax.swing.JButton();
        btnDairy = new javax.swing.JButton();
        btnMisc = new javax.swing.JButton();
        lblProduct = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblProductName1 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        lblProductName3 = new javax.swing.JLabel();
        lblProductName4 = new javax.swing.JLabel();
        lblProductName5 = new javax.swing.JLabel();
        lblProductPrice1 = new javax.swing.JLabel();
        lblProductPrice2 = new javax.swing.JLabel();
        lblProductPrice3 = new javax.swing.JLabel();
        lblProductPrice4 = new javax.swing.JLabel();
        lblProductPrice5 = new javax.swing.JLabel();
        fldProductQuantity1 = new javax.swing.JTextField();
        fldProductQuantity2 = new javax.swing.JTextField();
        fldProductQuantity3 = new javax.swing.JTextField();
        fldProductQuantity4 = new javax.swing.JTextField();
        fldProductQuantity5 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 600));

        lblGrocery.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGrocery.setText("GroceryMarket");

        lblCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategory.setText("Categories");

        btnList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnList.setText("Shopping List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        lblCategoryName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoryName.setText("category name here");

        btnMeat.setText("Meat");
        btnMeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeatActionPerformed(evt);
            }
        });

        btnSeafood.setText("Seafood");
        btnSeafood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeafoodActionPerformed(evt);
            }
        });

        btnFruit.setText("Fruit");
        btnFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFruitActionPerformed(evt);
            }
        });

        btnVegetable.setText("Vegetables");
        btnVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVegetableActionPerformed(evt);
            }
        });

        btnDairy.setText("Dairy");
        btnDairy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDairyActionPerformed(evt);
            }
        });

        btnMisc.setText("Misc.");
        btnMisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiscActionPerformed(evt);
            }
        });

        lblProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProduct.setText("Product");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrice.setText("Price");

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAmount.setText("Amount:");

        lblProductName1.setText("Product1");

        lblProductName2.setText("Product2");

        lblProductName3.setText("Product3");

        lblProductName4.setText("Product4");

        lblProductName5.setText("Product5");

        lblProductPrice1.setText("P 600.00");

        lblProductPrice2.setText("P 600.00");

        lblProductPrice3.setText("P 600.00");

        lblProductPrice4.setText("P 600.00");

        lblProductPrice5.setText("P 600.00");

        fldProductQuantity1.setText("0");

        fldProductQuantity2.setText("0");

        fldProductQuantity3.setText("0");

        fldProductQuantity4.setText("0");

        fldProductQuantity5.setText("0");

        btnAdd.setText("Add to Cart");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGrocery)
                        .addGap(65, 65, 65)
                        .addComponent(btnList))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCategoryName)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMeat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDairy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblProduct)
                                        .addComponent(lblProductName1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(lblProductName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProductName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProductName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProductName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblProductPrice1)
                                        .addComponent(lblProductPrice2)
                                        .addComponent(lblProductPrice3)
                                        .addComponent(lblProductPrice4)
                                        .addComponent(lblProductPrice5)
                                        .addComponent(lblPrice))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAmount)
                                .addComponent(fldProductQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldProductQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldProductQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldProductQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldProductQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMisc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrocery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblCategory)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMeat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDairy, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMisc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lblCategoryName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(lblPrice)
                    .addComponent(lblAmount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName1)
                    .addComponent(lblProductPrice1)
                    .addComponent(fldProductQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName2)
                    .addComponent(lblProductPrice2)
                    .addComponent(fldProductQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName3)
                    .addComponent(lblProductPrice3)
                    .addComponent(fldProductQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName4)
                    .addComponent(lblProductPrice4)
                    .addComponent(fldProductQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName5)
                    .addComponent(lblProductPrice5)
                    .addComponent(fldProductQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        lblCategory.setVisible(false);
        btnMeat.setVisible(false);
    }//GEN-LAST:event_btnListActionPerformed

    private void btnVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegetableActionPerformed
        categoryDisplay("Vegetables");
    }//GEN-LAST:event_btnVegetableActionPerformed

    private void btnSeafoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeafoodActionPerformed
        categoryDisplay("Seafood");
    }//GEN-LAST:event_btnSeafoodActionPerformed

    private void btnFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFruitActionPerformed
        categoryDisplay("Fruit");
    }//GEN-LAST:event_btnFruitActionPerformed

    private void btnDairyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDairyActionPerformed
        categoryDisplay("Dairy");
    }//GEN-LAST:event_btnDairyActionPerformed

    private void btnMiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiscActionPerformed
        categoryDisplay("Miscellaneous");
    }//GEN-LAST:event_btnMiscActionPerformed

    private void btnMeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeatActionPerformed
        categoryDisplay("Meat");
    }//GEN-LAST:event_btnMeatActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        double total = 0;
        double quantity1 = Double.parseDouble(fldProductQuantity1.getText());
        double quantity2 = Double.parseDouble(fldProductQuantity2.getText());
        double quantity3 = Double.parseDouble(fldProductQuantity3.getText());
        double quantity4 = Double.parseDouble(fldProductQuantity4.getText());
        double quantity5 = Double.parseDouble(fldProductQuantity5.getText());
        double quantities[] = {quantity1, quantity2, quantity3, quantity4, quantity5};
        
        for (int i = 0; i < quantities.length; i++){
            if (quantities[i] != 0){
                cartProducts.add(products.get(i));
                cartPrices.add(prices.get(i));
                cartQuantity.add(quantities[i]);
            }
        }
        
        for (int i = 0; i < cartProducts.size(); i ++) {
            double product = cartQuantity.get(i) * cartPrices.get(i);
            total += product;
            btnAdd.setText("P " + total);
        }
        
        fldProductQuantity1.setText("0");
        fldProductQuantity2.setText("0");
        fldProductQuantity3.setText("0");
        fldProductQuantity4.setText("0");
        fldProductQuantity5.setText("0");
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void categoryDisplay(String category){
        
        switch (category) {
            case "Meat":
                String[] meatProducts = {"Beef 1kg", "Pork 1kg", "Chicken 1kg", "Lamb 1kg", "Duck 1kg"};
                double[] meatPrices = {599.00, 169.00, 137.00, 1049.00, 168.00};
                
                for (int i = 0; i < meatProducts.length; i++){
                    products.set(i, meatProducts[i]);
                    prices.set(i, meatPrices[i]);
                }
                break;
                
            case "Seafood":
                String[] seafoodProducts = {"Crab 1kg", "Shrimp 1kg", "Fish 1kg", "Lobster 1kg", "Squid 1kg"};
                double[] seafoodPrices = {841.17, 295.33, 142.20, 217.63, 163.58};
                
                for (int i = 0; i < seafoodProducts.length; i++){
                    products.set(i, seafoodProducts[i]);
                    prices.set(i, seafoodPrices[i]);
                }
                break;
                
            case "Fruit":
                String[] fruitProducts = {"Mango 1kg", "Apple 1kg", "Banana 1kg", "Orange 1kg", "Grapes 1kg"};
                double[] fruitPrices = {158.60, 156.00, 70.00, 231.00, 465.00};
                
                for (int i = 0; i < fruitProducts.length; i++){
                    products.set(i, fruitProducts[i]);
                    prices.set(i, fruitPrices[i]);
                }
                break;
                
            case "Vegetables":
                String[] vegetableProducts = {"Cabbage 1kg", "Onion 1kg", "Garlic 1kg", "Lettuce 1kg", "Carrot 1kg"};
                double[] vegetablePrices = {25.00, 750.00, 210.00, 48.72, 76.53};
                
                for (int i = 0; i < vegetableProducts.length; i++){
                    products.set(i, vegetableProducts[i]);
                    prices.set(i, vegetablePrices[i]);
                }
                break;
                                
            case "Dairy":
                String[] dairyProducts = {"Cheese", "Milk", "Yogurt", "Ice Cream", "Butter"};
                double[] dairyPrices = {143.84, 149.99, 119.95, 344.00, 214.04};
                
                for (int i = 0; i < dairyProducts.length; i++){
                    products.set(i, dairyProducts[i]);
                    prices.set(i, dairyPrices[i]);
                }
                break;

            case "Miscellaneous":
                String[] miscellaneousProducts = {"Egg 1dz", "Hotdog", "Tocino", "Nuggets", "Tapa"};
                double[] miscellaneousPrices = {82.80, 153.00, 164.65, 129.00, 190.00};
                
                for (int i = 0; i < miscellaneousProducts.length; i++){
                    products.set(i, miscellaneousProducts[i]);
                    prices.set(i, miscellaneousPrices[i]);
                }
                break;
        }
        
        lblCategoryName.setText(category);
        lblProductName1.setText(products.get(0));
        lblProductName2.setText(products.get(1));
        lblProductName3.setText(products.get(2));
        lblProductName4.setText(products.get(3));
        lblProductName5.setText(products.get(4));
        lblProductPrice1.setText("P " + prices.get(0));
        lblProductPrice2.setText("P " + prices.get(1));
        lblProductPrice3.setText("P " + prices.get(2));
        lblProductPrice4.setText("P " + prices.get(3));
        lblProductPrice5.setText("P " + prices.get(4));
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
            java.util.logging.Logger.getLogger(GroceryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroceryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroceryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroceryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroceryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDairy;
    private javax.swing.JButton btnFruit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnMeat;
    private javax.swing.JButton btnMisc;
    private javax.swing.JButton btnSeafood;
    private javax.swing.JButton btnVegetable;
    private javax.swing.JTextField fldProductQuantity1;
    private javax.swing.JTextField fldProductQuantity2;
    private javax.swing.JTextField fldProductQuantity3;
    private javax.swing.JTextField fldProductQuantity4;
    private javax.swing.JTextField fldProductQuantity5;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCategoryName;
    private javax.swing.JLabel lblGrocery;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblProductName3;
    private javax.swing.JLabel lblProductName4;
    private javax.swing.JLabel lblProductName5;
    private javax.swing.JLabel lblProductPrice1;
    private javax.swing.JLabel lblProductPrice2;
    private javax.swing.JLabel lblProductPrice3;
    private javax.swing.JLabel lblProductPrice4;
    private javax.swing.JLabel lblProductPrice5;
    // End of variables declaration//GEN-END:variables
}
