/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts_adzibilal;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

/**
 *
 * @author LENOVO
 */
public class MainApp extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;
    public MP3Player player = new MP3Player();

    
    // Array berisi data produk
    private String[][] products = {
        {"C001", "Espresso", "5000"},
        {"C002", "Cappuccino", "7000"},
        {"C003", "Latte", "8000"},
        {"C004", "Mocha", "9000"},
        {"C005", "Americano", "6000"},
        {"C006", "Macchiato", "7500"},
        {"C007", "Flat White", "8500"},
        {"C008", "Caramel Macchiato", "10000"},
        {"C009", "Vanilla Latte", "9500"},
        {"C010", "Hazelnut Latte", "10500"},
        {"C011", "Iced Coffee", "6500"},
        {"C012", "Cold Brew", "8000"},
        {"C013", "Matcha Latte", "9000"},
        {"C014", "Fruity Tea", "7000"},
        {"C015", "Milk Tea", "8000"},
    };
    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        
        // Initialize tableModel
        tableModel = new DefaultTableModel();
        // Set column names for the table
        tableModel.setColumnIdentifiers(new String[]{"Code", "Product Name", "Qty", "Price", "Subtotal"});
        // Set the table model
        tableShop.setModel(tableModel);
        
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (String[] product : products) {
            comboBoxModel.addElement(product[1]); // Access product name at index 1
        }
        jComboBoxName.setModel(comboBoxModel);
        AutoCompleteDecorator.decorate(jComboBoxName, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
        
        spinnerQty.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent e) {
                updateSubtotal(); // Call updateSubtotal() when qty changes
            }
        });
        player.setRepeat(true);
        player.addToPlayList(new File("C:\\Users\\LENOVO\\Downloads\\juicy.mp3"));
        player.addToPlayList(new File("C:\\Users\\LENOVO\\Downloads\\tiara.mp3"));        
        player.addToPlayList(new File("C:\\Users\\LENOVO\\Downloads\\rizwan.mp3"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShop = new javax.swing.JTable();
        txtCode = new javax.swing.JTextField();
        spinnerQty = new javax.swing.JSpinner();
        txtPrice = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        jComboBoxName = new javax.swing.JComboBox<>();
        historyBtn = new javax.swing.JButton();
        labelMusic = new javax.swing.JLabel();
        prevBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Adzi\\KULIAH\\PBO2\\logo-black.png")); // NOI18N
        jLabel2.setToolTipText("");

        tableShop.setModel(new javax.swing.table.DefaultTableModel(
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
        tableShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableShopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableShop);

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(255, 255, 255));
        txtCode.setToolTipText("");
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        txtSubTotal.setEditable(false);
        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        addBtn.setText("ADD / UPDATE");
        addBtn.setToolTipText("");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("REMOVE");
        removeBtn.setEnabled(false);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Code");

        jLabel3.setText("Product Name");

        jLabel4.setText("QTY");

        jLabel5.setText("Price");

        jLabel6.setText("Sub Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel7.setText("TOTAL");

        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });
        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaymentKeyReleased(evt);
            }
        });

        jLabel8.setText("PAYMENT");

        txtChange.setEditable(false);
        txtChange.setBackground(new java.awt.Color(255, 255, 255));
        txtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeActionPerformed(evt);
            }
        });

        jLabel9.setText("CHANGE");

        payBtn.setText("PAY");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        jComboBoxName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNameActionPerformed(evt);
            }
        });

        historyBtn.setText("HISTORY TRANSACTION");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        labelMusic.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMusic.setText("MUSIC PLAYER");

        prevBtn.setText("PREV");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        playBtn.setText("PLAY");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("NEXT");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        pauseBtn.setText("PAUSE");
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(567, 567, 567)
                                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(labelMusic))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtChange, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(payBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(historyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(prevBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pauseBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextBtn)))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(8, 8, 8)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(8, 8, 8)
                            .addComponent(jComboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(8, 8, 8)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(8, 8, 8)
                            .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(8, 8, 8)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(labelMusic)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        addItemToTable();
    }//GEN-LAST:event_addBtnActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed

    }//GEN-LAST:event_txtPaymentActionPerformed

    private void txtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // TODO add your handling code here:
        calculateChange();
    }//GEN-LAST:event_payBtnActionPerformed

    private void jComboBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNameActionPerformed
        // TODO add your handling code here:
        String selectedProductName = (String) jComboBoxName.getSelectedItem();
        // Find the selected product in the products array
        for (String[] product : products) {
            if (product[1].equals(selectedProductName)) {
                txtCode.setText(product[0]);
                txtPrice.setText(product[2]);
                spinnerQty.setValue(1);
                txtSubTotal.setText(product[2]);
                break; // Exit the loop once a match is found
            }
        }
    }//GEN-LAST:event_jComboBoxNameActionPerformed

    private void tableShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableShopMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableShop.getSelectedRow();
        if (selectedRow != -1) {
            // Enable removeBtn if a row is selected
            removeBtn.setEnabled(true);
        } else {
            // Disable removeBtn if no row is selected
            removeBtn.setEnabled(false);
        }
    }//GEN-LAST:event_tableShopMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        removeItemFromTable();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void txtPaymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyPressed
        
    }//GEN-LAST:event_txtPaymentKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void txtPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentKeyReleased

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        // TODO add your handling code here:
        History history = new History();
        history.setVisible(true);
    }//GEN-LAST:event_historyBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        // TODO add your handling code here:
        player.play();
    }//GEN-LAST:event_playBtnActionPerformed

    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBtnActionPerformed
        // TODO add your handling code here:
        player.pause();
    }//GEN-LAST:event_pauseBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        player.skipForward();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here:
        player.skipBackward();
    }//GEN-LAST:event_prevBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }
    
    private void updateSubtotal() {
        int qty = (int) spinnerQty.getValue();
        String priceStr = txtPrice.getText();
        if (!priceStr.isEmpty()) {
            int price = Integer.parseInt(priceStr);
            int subtotal = qty * price;
            txtSubTotal.setText(String.valueOf(subtotal));
        }
    }
    
    private void addItemToTable() {
        String code = txtCode.getText();
        String productName = (String) jComboBoxName.getSelectedItem();
        int qty = (int) spinnerQty.getValue();
        String priceStr = txtPrice.getText();

        if (!priceStr.isEmpty()) {
            int price = Integer.parseInt(priceStr);
            int subtotal = qty * price;

            // Check if code already exists in the table
            boolean found = false;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String existingCode = (String) tableModel.getValueAt(i, 0);
                if (existingCode.equals(code)) {
                    // Update existing row quantity and subtotal
                    int existingQty = (int) tableModel.getValueAt(i, 2);
                    int updatedQty = existingQty + qty;
                    int updatedSubtotal = updatedQty * price;
                    tableModel.setValueAt(updatedQty, i, 2);
                    tableModel.setValueAt(updatedSubtotal, i, 4);
                    found = true;
                    break;
                }
            }

            if (!found) {
                // Add new row to the table
                Object[] rowData = new Object[]{code, productName, qty, price, subtotal};
                tableModel.addRow(rowData);
            }

            // Update total amount
            calculateTotal();

            // Clear input fields
            txtCode.setText("");
            jComboBoxName.setSelectedItem(null);
            spinnerQty.setValue(1);
            txtPrice.setText("");
            txtSubTotal.setText("");
        } else {
            // Handle empty price
            JOptionPane.showMessageDialog(null, "Pilih Produk terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calculateTotal() {
        int total = 0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            int subtotal = (int) tableModel.getValueAt(i, 4);
            total += subtotal;
        }
        txtTotal.setText(String.valueOf(total));
    }

    private void removeItemFromTable() {
        // Get the selected row index
        int selectedRow = tableShop.getSelectedRow();
        if (selectedRow != -1) {
            // Confirmation popup
            int confirmation = JOptionPane.showConfirmDialog(null, "Kamu yakin akan menghapus item ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                // Remove the selected row from the table model
                tableModel.removeRow(selectedRow);

                // Update total amount
                calculateTotal();

                // Disable removeBtn if no rows are selected
                if (tableModel.getRowCount() == 0) {
                    removeBtn.setEnabled(false);
                }
            }
        } else {
            // Display message if no row is selected
            JOptionPane.showMessageDialog(null, "Please select a row to remove.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calculateChange() {
        // Ambil nilai total dan pembayaran
        String totalText = txtTotal.getText();
        String paymentText = txtPayment.getText();

        // Periksa apakah nilai total dan pembayaran tidak kosong
        if (!totalText.isEmpty() && !paymentText.isEmpty()) {
            try {
                int total = Integer.parseInt(totalText);
                int payment = Integer.parseInt(paymentText);

                // Periksa apakah pembayaran mencukupi
                if(payment >= total) {
                    // Hitung kembalian
                    int change = payment - total;

                    // Set nilai txtChange
                    txtChange.setText(String.valueOf(change));
                    createReceiptPDF();
                } else {
                    JOptionPane.showMessageDialog(null, "Pembayaran tidak mencukupi.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                // Tampilkan pesan kesalahan jika nilai total atau pembayaran tidak valid
                JOptionPane.showMessageDialog(null, "Pastikan nilai total dan pembayaran berupa angka yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Tampilkan pesan kesalahan jika nilai total atau pembayaran kosong
            JOptionPane.showMessageDialog(null, "Pastikan nilai total dan pembayaran telah diisi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void createReceiptPDF() {
        try {
            // Create a new PDF document
            PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            document.addPage(page);

            // Create a new content stream for drawing
            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Set font and font size
            contentStream.setFont(PDType1Font.HELVETICA, 12);

           // Write receipt content
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 700);
            contentStream.showText("===== RECEIPT TRANSACTION =====");
            contentStream.moveTextPositionByAmount(0, -12);
            contentStream.showText("======= A LOT OF COFFEE =======");
            contentStream.moveTextPositionByAmount(0, -12); // Move to next line
            contentStream.newLine();
            contentStream.showText("===============================");
            contentStream.moveTextPositionByAmount(0, -20); // Move to next line
            contentStream.newLine();
            // Iterate through table model to add items to receipt
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String code = (String) tableModel.getValueAt(i, 0);
                String productName = (String) tableModel.getValueAt(i, 1);
                int qty = (int) tableModel.getValueAt(i, 2);
                int subtotal = (int) tableModel.getValueAt(i, 4);

                contentStream.showText(String.format("%-10s %-20s %-10d %-10d ", code, productName, qty, subtotal));
                contentStream.moveTextPositionByAmount(0, -12); // Move to next line
                contentStream.newLine();
            }
            contentStream.moveTextPositionByAmount(0, -8); // Move to next line

            // Show total, payment, and change
            contentStream.showText("===============================");
            contentStream.moveTextPositionByAmount(0, -20); // Move to next line
            contentStream.newLine();
            contentStream.showText(String.format("TOTAL: %s", txtTotal.getText()));
            contentStream.moveTextPositionByAmount(0, -15); // Move to next line
            contentStream.showText(String.format("PAYMENT: %s", txtPayment.getText()));
            contentStream.moveTextPositionByAmount(0, -15); // Move to next line
            contentStream.showText(String.format("CHANGE: %s", txtChange.getText()));
            contentStream.moveTextPositionByAmount(0, -20); // Move to next line
            contentStream.showText("===============================");
            contentStream.moveTextPositionByAmount(0, -20); // Move to next line
            contentStream.showText(String.format("TUGAS UTS ADZI BILAL - 22552011164"));
            contentStream.moveTextPositionByAmount(0, -12); // Move to next line
            contentStream.endText();

            // Close the content stream
            contentStream.close();

            // Generate file name with current date and time
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
            String fileName = "transaksi-" + sdf.format(new Date()) + ".pdf";

            // Save the document with the generated file name
            String outputPath = "D:" + File.separator + "Adzi" + File.separator + "KULIAH" + File.separator + "PBO2" + File.separator + "struk" + File.separator + fileName;
            document.save(outputPath);


            // Close the document
            document.close();

            JOptionPane.showMessageDialog(null, "Receipt saved as " + fileName, "Receipt", JOptionPane.INFORMATION_MESSAGE);
            clearForm();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while creating receipt", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtChange.setText("");
        txtPayment.setText("");
        txtTotal.setText("");
        DefaultTableModel model = (DefaultTableModel) tableShop.getModel();
        model.setRowCount(0);  
    }



   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JComboBox<String> jComboBoxName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMusic;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTable tableShop;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
