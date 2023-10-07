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
public class veganos extends javax.swing.JFrame {
       ArrayList almacenarAlimento = new ArrayList();

    /**
     * Creates new form veganos
     */
    public veganos() {
        initComponents();
        
        // CENTRANDO VENTANA
      this.setLocationRelativeTo(null);
      // AJUSTE DEL TAMAÑO (ANCHO) DE LAS COLUMNAS 
      TableColumn columna;
      columna=jTable2.getColumnModel().getColumn(0);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
         
      columna=jTable2.getColumnModel().getColumn(1);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable2.getColumnModel().getColumn(2);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable2.getColumnModel().getColumn(3);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable2.getColumnModel().getColumn(4);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
      
      columna=jTable2.getColumnModel().getColumn(5);
      columna.setPreferredWidth(120);
      columna.setMaxWidth(120);
      columna.setMinWidth(120);
     
//      EVITANDO QUE EL USUARIO PUEDA MOVER EL ORDEN DE LAS COLUMNAS
        jTable2.getTableHeader().setReorderingAllowed(false);
//        JTableHeader Theader = jTable1.getTableHeader();
//        Theader.setBackground(Color.red);
        
        //DANDO COLOR AL ENCABEZADO (FUENTE Y COLOR DE LETRA)
        jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD ,14));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(Color.red);
        jTable2.getTableHeader().setForeground(new Color(239,184,16));
        jTable2.setRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_total2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Calabaza", "45", "Soja", "338", "Aguacate", "160"},
                {"Arepa", "219", "Avellana", "625", "Aceitunas", "115"},
                {"Remolacha", "43", "Linaza", "534", "Linaza", "534"},
                {"Arroz Integral", "350", "Almendra", "499", "Aceite de Oliva", "900"},
                {"Harina de Maiz", "349", "Maní", "452", "Aceite de Semillas", "900"},
                {"Harina de Trigo", "341", "Castaña", "349", "Anacardos", "100"},
                {"Yuca", "148", "Nuez", "670", "Linaza", "534"},
                {"Ciruela Pasa", "177", "Piñon", "568", "Chía", "486"},
                {"Arracacha", "95", "Semillas de Sésamo", "563", "Semillas de Cañamo", "553"},
                {"Fideos", "369", "Centeno", "350", "Semillas de Calabaza", "446"},
                {"Acelgas", "30", "Maiz", "363", "Aceite de nuez", "884"},
                {"Cereza", "65", "Seitan", "121", "Espinacas Rehogadas", "51"},
                {"Ciruela", "51", "Tofu", "76", "Patatas fritas", "327"},
                {"Durazno", "49", "Frijoles", "347", "Brotes de Soja", "58"},
                {"Fresa", "35", "Tempeh", "193", "Tofu", "89"},
                {"Guayaba", "44", "Seitan", "370", "Avena", "389"},
                {"Kiwi", "46", "Jackfruit", "100", "Semillas de Sésamo", "563"},
                {"Mandarina", "44", "Garbanzos", "364", "Garbanzo", "338"},
                {"Mango", "61", "Lentejas", "116", "Judias Blancas ", "113"},
                {"Manzana", "55", "Crema de Maní", "588", "Lentejas Guisadas", "120"},
                {"Maracuyá", "66", "Humus", "166", "Almendra", "499"},
                {"Melón", "25", "Guavas", "68", "Soja", "306"},
                {"Papa", "164", "Quinoa", "399", "Semillas de lino", "524"},
                {"Naranja", "48", "Champiñones", "22", "Maní", "452"},
                {"Papaya", "35", "Guisante", "81", "Semillas de Girasol", "446"},
                {"Pera", "54", "Alubia", "349", "Coco Fresco", "296"},
                {"Piña", "53", "Espirulina Desecada", "290", "Avellana", "625"},
                {"Sandía", "18", "Germen de Trigo", "366", "Harina Integral de Trigo", "321"},
                {"Uva", "68", "Alga nori desecada", "35", "Piñon", "568"},
                {"Uva Pasa", "69", "Harina de Soja", "434", "Harina de Maiz", "363"},
                {"Fideos de Harina Integral", "359", "Semola", "360", "Pistacho", "600"},
                {"Ñoquis", "246", "Leche de Almendras", "40", "Ñoquis", "246"},
                {"Avena", "389", "Espelta", "338", "Semillas de Amapola", "525"},
                {"Bulgur", "342", "Chía", "486", "Nuez", "670"},
                {"Sorgo", "339", "Crema de almendras", "614", "Pipas de Girasol", "560"}
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
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setFocusable(false);
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("ALIMENTOS VEGANOS");

        jLabel2.setText("Calorías por 100 gramos");

        jButton1.setText("Seleccionar Alimento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_total2.setEditable(false);
        txt_total2.setBackground(new java.awt.Color(204, 255, 153));

        jMenu1.setText("Menú");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem1.setText("Volver al Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItem2.setText("Volver al Menú");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
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
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addGap(73, 73, 73)
                .addComponent(jButton3)
                .addGap(58, 58, 58)
                .addComponent(txt_total2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_total2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaseleccionada = jTable2.getSelectedRow();
            int columnaSeleccionada = jTable2.getSelectedColumn();
            String carbos = jTable2.getValueAt(filaseleccionada, columnaSeleccionada).toString();
           
            int carbohidratos = Integer.parseInt(carbos);
            almacenarAlimento.add(carbohidratos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int limpiar=0;
         for (int i = 0; i <almacenarAlimento.size(); i++) {
            int b = (int) almacenarAlimento.get(i);
            limpiar= (b+limpiar)*0;
            String botonLimpiar = String.valueOf(limpiar);
            txt_total2.setText(botonLimpiar);
         almacenarAlimento.clear();
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int suma1=0;
        for (int i = 0; i <almacenarAlimento.size(); i++) {
            int a = (int) almacenarAlimento.get(i);
            suma1 = a+suma1;
            String suma2 = String.valueOf(suma1);
            txt_total2.setText(suma2);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Menu b = new Menu();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(veganos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(veganos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(veganos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(veganos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new veganos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_total2;
    // End of variables declaration//GEN-END:variables
}