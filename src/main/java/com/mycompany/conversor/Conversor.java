/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversor;

import com.mycompany.monedas.ConvertidorMonedas;
import com.mycompany.monedas.ConvertidorTemperature;
import com.mycompany.monedas.Monedas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.Icon;

/**
 *
 * @author VivianDiro
 */
public class Conversor extends javax.swing.JFrame {

    private double valor;

    //instanciamos nuestras clases
    Monedas monedas = new Monedas();
    ConvertidorMonedas convertPesos = new ConvertidorMonedas();
    ConvertidorTemperature converTemperatura = new ConvertidorTemperature();

    public Conversor() {
        initComponents();
        // para que nuestra app se muestre en el centro
        setLocationRelativeTo(null);

    }

    //obtenemos el valor de la caja de texto
    public void entrada() {
        valor = Double.parseDouble(textValor.getText());
    }

    // metodo´para limpiar campos
       public void limpiarResultado() {
        this.textValor.setText("");
        this.labelResultado.setText("");
        this.iconLabel.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        selectConversor = new javax.swing.JComboBox<>();
        selectMoneda = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        log1 = new javax.swing.JLabel();
        log2 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 2, 36)); // NOI18N
        jLabel1.setText("CONVERSOR");

        MenuPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        MenuPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel4.setText("Ingrese la cantidad");

        textValor.setFont(new java.awt.Font("Arial Narrow", 2, 24)); // NOI18N
        textValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorActionPerformed(evt);
            }
        });
        textValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textValorKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelResultado.setFont(new java.awt.Font("Arial Narrow", 2, 36)); // NOI18N

        selectConversor.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        selectConversor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción", "Conversor de Moneda", "Conversor de Temperatura" }));
        selectConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectConversorActionPerformed(evt);
            }
        });

        selectMoneda.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        selectMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción" }));
        selectMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMonedaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel3.setText("Elegir opcion a convertir:");

        iconLabel.setFont(new java.awt.Font("Arial Narrow", 2, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel2.setText("Elegir Conversor:");

        jButton2.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37))
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(log2)
                        .addGap(28, 28, 28)))
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jButton2)
                        .addGap(16, 16, 16))
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(log1)
                        .addGap(97, 97, 97))))
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(log1))))
                            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                                .addComponent(log2)
                                .addGap(31, 31, 31)
                                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // para cerrar nuestra app
        JOptionPane.showMessageDialog(null, "Esta seguro que desea salir?");
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selectMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMonedaActionPerformed
        limpiarResultado(); // limpia los campos cuando cambiamos de moneda o temperatura
    }//GEN-LAST:event_selectMonedaActionPerformed

    private void selectConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectConversorActionPerformed
        // inicia con las imagenes vacias
        log1.setIcon(null);
        log2.setIcon(null);
        // opciones del combobox
        if (evt.getSource() == selectConversor) {
            String selected = (String) selectConversor.getSelectedItem();
            selectMoneda.removeAllItems();
            
            if (selected.equals("Seleccione una Opción")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un item valido");
                this.iconLabel.setText("");
                
            }
           
            if (selected.equals("Conversor de Moneda")) {
                selectMoneda.removeAllItems();
                selectMoneda.addItem("De Pesos a Dolar");
                selectMoneda.addItem("De Pesos a Euro");
                selectMoneda.addItem("De Pesos a Libra");
                selectMoneda.addItem("De Dolar a Pesos");
                selectMoneda.addItem("De Euro a Pesos");
                selectMoneda.addItem("De Libra a Pesos");
                iconLabel.setText("$");
                log2.setIcon(new ImageIcon("images/money.png"));

            }
            if (selected.equals("Conversor de Temperatura")) {
                selectMoneda.removeAllItems();
                selectMoneda.addItem("De Celsius a Fahrenheit");
                selectMoneda.addItem("De Fahrenheit a Celsius");
                iconLabel.setText("°C");
                log1.setIcon(new ImageIcon("images/termometro.png"));

            }

        }

    }//GEN-LAST:event_selectConversorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        entrada();//    ingresamos el valor del texto

        String selected = (String) selectMoneda.getSelectedItem();
        if (selected.equals("De Pesos a Dolar")) {
            iconLabel.setText("US$");
            convertPesos.PesoaDolar(valor);
            labelResultado.setText(String.valueOf(convertPesos.getResultado()));

        }
        if (selected.equals("De Pesos a Euro")) {
            iconLabel.setText("€");
            convertPesos.PesoaEuro(valor);
            labelResultado.setText(String.valueOf(convertPesos.getResultado()));

        }
        if (selected.equals("De Pesos a Libra")) {
            iconLabel.setText("£");
            convertPesos.PesoaLibras(valor);
            labelResultado.setText(String.valueOf(convertPesos.getResultado()));
        }
        if (selected.equals("De Dolar a Pesos")) {
            iconLabel.setText("COP$");
            convertPesos.DolaraPeso(valor);
            labelResultado.setText(String.valueOf(convertPesos.getResultado()));
        }
        if (selected.equals("De Euro a Pesos")) {
            iconLabel.setText("COP$");
            convertPesos.EuroaPeso(valor);
            labelResultado.setText(String.valueOf(convertPesos.getResultado()));
        }
        if (selected.equals("De Libra a Pesos")) {
            iconLabel.setText("COP$");
            convertPesos.LibraPeso(valor);
            labelResultado.setText(String.valueOf(convertPesos.getResultado()));
        }
        if (selected.equals("De Celsius a Fahrenheit")) {
            iconLabel.setText("°F");
            converTemperatura.CelsiusFarenheit(valor);
            labelResultado.setText(String.valueOf(converTemperatura.getResultado()));
        }
        if (selected.equals("De Fahrenheit a Celsius")) {
            iconLabel.setText("°C");
            converTemperatura.FarenheitCelsius(valor);
            labelResultado.setText(String.valueOf(converTemperatura.getResultado()));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // metodo para permitir solo ingreso de numeros
    private void textValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValorKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (textValor.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_textValorKeyTyped

    private void textValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorActionPerformed

    }//GEN-LAST:event_textValorActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel log1;
    private javax.swing.JLabel log2;
    private javax.swing.JComboBox<String> selectConversor;
    private javax.swing.JComboBox<String> selectMoneda;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
