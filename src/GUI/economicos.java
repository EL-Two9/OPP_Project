/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.TableColumn;

/**
 *
 * @author kedar
 */
public class economicos extends javax.swing.JFrame {
        ArrayList almacenarAlimento2 = new ArrayList();
    /**
     * Creates new form economicos
     */
    public economicos() {
        initComponents();
        
      this.setLocationRelativeTo(null);
      // AJUSTE DEL TAMAÑO (ANCHO) DE LAS COLUMNAS 
      TableColumn columna;
      columna=jTable3.getColumnModel().getColumn(0);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
         
      columna=jTable3.getColumnModel().getColumn(1);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable3.getColumnModel().getColumn(2);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable3.getColumnModel().getColumn(3);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable3.getColumnModel().getColumn(4);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable3.getColumnModel().getColumn(5);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
     
//      EVITANDO QUE EL USUARIO PUEDA MOVER EL ORDEN DE LAS COLUMNAS
        jTable3.getTableHeader().setReorderingAllowed(false);
//        JTableHeader Theader = jTable1.getTableHeader();
//        Theader.setBackground(Color.red);
        
        //DANDO COLOR AL ENCABEZADO (FUENTE Y COLOR DE LETRA)
        jTable3.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD ,14));
        jTable3.getTableHeader().setOpaque(false);
        jTable3.getTableHeader().setBackground(Color.red);
        jTable3.getTableHeader().setForeground(new Color(239,184,16));
        jTable3.setRowHeight(25);
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
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_total3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Calorías por 100 gramos");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pan Blanco", "260", "Atún en aceite", "288", "Maní", "452"},
                {"Arepa", "219", "Atún en agua", "127", "Chía", "490"},
                {"Arroz blanco", "366", "Sardinas en Lata", "191", "Linaza Molida", "600"},
                {"Acelga", "30", "Frijoles Negros", "316", "Aceite de Coco", "862"},
                {"Harina de Maiz", "349", "Requeson", "96", "Aceite de Girasol", "884"},
                {"Betabel", "43", "Leche de Vaca", "102", "Aceitunas", "180"},
                {"Yuca", "148", "Mantequilla de Maní", "588", "Atún fresco", "158"},
                {"Calabacita", "45", "Habas de Soja Congeladas", "127", "Avena", "367"},
                {"Col", "25", "Muslos de pollo", "130", "Espinacas", "30"},
                {"Coliflor", "25", "Lentejas", "325", "Germen de Trigo", "366"},
                {"nopal", "16", "Garbanzos", "364", "Habas", "65"},
                {"Cereza", "65", "Avena", "367", "Frijoles", "151"},
                {"Lentejas", "51", "Huevo ", "155", "Leche Entera", "60"},
                {"Durazno", "49", "Tofu", "76", "Lentejas", "325"},
                {"Fresa", "35", "Semillas de Calabaza", "446", "Sardinas en Lata", "191"},
                {"Guayaba", "44", "Chía", "486", "Garbanzos", "364"},
                {"Kiwi", "46", "Cottage", "100", "Queso Fresco", "307"},
                {"Mandarina", "44", "Yogur Griego", "100", "Huevos", "155"},
                {"Mango", "61", "Salmón en lata", "144", "Mozzarella", "245"},
                {"Pepino", "22", "Quinoa", "399", "Ajonjolí", "575"},
                {"Maracuyá", "66", "Boniato", "86", "Semillas de Girasol", "570"},
                {"Melón", "25", "Brócoli", "35", "Queso Crema", "342"},
                {"Mora", "47", "Soja texturizada", "364", "Semillas de Calabaza", "541"},
                {"Naranja", "48", "Alubias Negras", "355", "Crema de Maní", "588"},
                {"Papaya", "35", "Edamames", "81", "Huevo de Codorniz", "179"},
                {"Pera", "54", "Pechuga de Pollo", "165", "Yema de Huevo", "341"},
                {"Piña", "53", "Lentejas", "116", "Semillas de lino", "534"},
                {"Sandía", "18", "Frijoles de Soya", "149", "Yogurt Griego", "100"},
                {"Uva", "68", "Espinaca", "22", "Semillas de Sesamo", "573"},
                {"Zanahoria", "69", "Guisantes Verdes", "81", "Caballa", "262"},
                {"Rabano", "16", "Pollo ", "239", "Atún en Aceite", "288"},
                {"Tomate", "18", "Falda de Cordero", "267", "Aguacate", "200"},
                {"Avena", "389", "Chuletas de cerdo ", "231", "Soja", "306"},
                {"Pasta", "131", "seitan", "370", "Edamame", "130"},
                {"Garbanzos", "364", "Caballa", "262", "Tofu", "89"}
            },
            new String [] {
                "Carbohidratos", "Calorias", "Proteinas ", "Calorias", "Grasas", "Calorias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setFocusable(false);
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable3);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("ALIMENTOS ECONÓMICOS");

        jButton1.setText("Seleccionar Alimento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_total3.setBackground(new java.awt.Color(153, 204, 255));

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menú");

        jMenuItem1.setText("Volver al Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Volver al Menú");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Regresar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButton1)
                .addGap(59, 59, 59)
                .addComponent(jButton4)
                .addGap(71, 71, 71)
                .addComponent(jButton3)
                .addGap(51, 51, 51)
                .addComponent(txt_total3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_total3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Menu b = new Menu();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            int filaseleccionada = jTable3.getSelectedRow();
            int columnaSeleccionada = jTable3.getSelectedColumn();
            String carbos = jTable3.getValueAt(filaseleccionada, columnaSeleccionada).toString();
           
            int carbohidratos = Integer.parseInt(carbos);
            almacenarAlimento2.add(carbohidratos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int suma1=0;
        for (int i = 0; i < almacenarAlimento2.size(); i++) {
            int a = (int) almacenarAlimento2.get(i);
            suma1 = a+suma1;
            String suma2 = String.valueOf(suma1);
            txt_total3.setText(suma2);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int limpiar=0;
         for (int i = 0; i <almacenarAlimento2.size(); i++) {
            int b = (int) almacenarAlimento2.get(i);
            limpiar= (b+limpiar)*0;
            String botonLimpiar = String.valueOf(limpiar);
            txt_total3.setText(botonLimpiar);
         almacenarAlimento2.clear();
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    MenuTablas newframe = new MenuTablas();
    
    newframe.setVisible(true);
    
    this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(economicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(economicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(economicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(economicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new economicos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txt_total3;
    // End of variables declaration//GEN-END:variables
}
