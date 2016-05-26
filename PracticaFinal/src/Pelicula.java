
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author philippe
 */
public class Pelicula extends javax.swing.JFrame {
static Connection coneccion;
static Statement instruccion;
String pass= "sistema";
    /**
     * Creates new form Pelicula
     */
    public Pelicula() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
      //  getContentPane().setBackground(Color.cyan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        FicarPeli = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(147, 222, 223));
        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pelicules");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codic Pelicula", "Titol", "Director", "Genere", "Data Alta", "Argument"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        FicarPeli.setText("Nova Pelicula");
        FicarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FicarPeliActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jButton3.setText("Enrere");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(FicarPeli)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(FicarPeli)
                    .addComponent(jButton2)
                    .addComponent(Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Metode per a llistar Consultar practica anterior
    
    public void consultar(String tb) throws SQLException, ClassNotFoundException {
        String columnas, sql;
        try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "root", pass);
            
            Statement st = con.createStatement();
            columnas = "desc";
            sql = "Select * from "+tb;
            ResultSet rstb = st.executeQuery(sql);
            ResultSet rscol = st.executeQuery(columnas);
            
            while(rscol.next()){
                System.out.println(rscol.getString(1));
            }
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
            v1 obj = new v1();
            obj.setVisible(true);
            dispose();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           DefaultTableModel modelo = new DefaultTableModel();
       
         modelo.addColumn("Codic Pelicula");
         modelo.addColumn("Titol");
         modelo.addColumn("Director");
         modelo.addColumn("Genere");
         modelo.addColumn("Data Alta");
         modelo.addColumn("Argument");
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub?zeroDateTimeBehavior=convertToNull", "root", pass);
            instruccion = coneccion.createStatement();// consultar a la base de datos
           
        ResultSet resultado=instruccion.executeQuery("select * FROM pelicula ORDER BY Codigo_Pelicula;");
         
        while(resultado.next()){
         
                Object[] datos = new Object[6];
                for (int i = 0; i < 6; i++) {
                    datos[i] = resultado.getObject(i+1); 
            
                      }
                modelo.addRow(datos);
              }
        
        jTable1.setModel(modelo);
        }
    catch(SQLException exeptionsql){
                 JOptionPane.showMessageDialog(null,exeptionsql.getMessage(),
                         "error al borrar les dades",JOptionPane.ERROR_MESSAGE);
                 
             }
     catch( ClassNotFoundException clasenoencontrada){
         JOptionPane.showMessageDialog(null,clasenoencontrada.getMessage(),
                "no s'ha trobat el controlador",JOptionPane.ERROR_MESSAGE);
         System.exit(1);

     }
       finally {
            try {
                coneccion.close();
                instruccion.close();
               
            }

           
            catch ( SQLException sqlException ) {
                JOptionPane.showMessageDialog( null,
                    sqlException.getMessage(), " no s'ha tancat corectament",
                    JOptionPane.ERROR_MESSAGE );

                System.exit( 1 );
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FicarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FicarPeliActionPerformed
        // TODO add your handling code here:
        crear_peli obj=new crear_peli();
                obj.setVisible(true);
                
    }//GEN-LAST:event_FicarPeliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         borrar_peli obj=new borrar_peli();
                obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
         modificar_peli obj=new modificar_peli();
                obj.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        v2 obj=new v2();
                obj.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FicarPeli;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
