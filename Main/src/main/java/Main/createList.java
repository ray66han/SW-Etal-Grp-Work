package Main;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.Database.DatabaseFunctions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author calla
 */
public class createList extends javax.swing.JFrame {

    /**
     * Creates new form createWeeklyTaskList
     */
    public createList() {
        initComponents();
        SwingUtilities.invokeLater(() -> jScrollPane4.getVerticalScrollBar().setValue(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        notDoneAlertBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPullList = new javax.swing.JButton();
        lblCreateList = new javax.swing.JLabel();
        spList = new javax.swing.JScrollPane();
        choresList = new javax.swing.JTable();
        btnAddTask = new javax.swing.JButton();
        btnPushList = new javax.swing.JButton();
        btnAddNames = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        notDoneAlertBtn.setText("Alert!");
        notDoneAlertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notDoneAlertBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Create Chores List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Task");

        jButton4.setText("Achivement");

        jLabel1.setText("View Task");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPullList.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnPullList.setText("Pull/Refresh List");
        btnPullList.setMaximumSize(new java.awt.Dimension(80, 22));
        btnPullList.setMinimumSize(new java.awt.Dimension(80, 22));
        btnPullList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPullListActionPerformed(evt);
            }
        });

        lblCreateList.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        lblCreateList.setText("Weekly Task List");

        choresList.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        choresList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Task No.", "Name/Desc", "User 1 est", "User 2 est", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spList.setViewportView(choresList);

        btnAddTask.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnAddTask.setText("Add Chores");
        btnAddTask.setMaximumSize(new java.awt.Dimension(80, 22));
        btnAddTask.setMinimumSize(new java.awt.Dimension(80, 22));
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });

        btnPushList.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnPushList.setText("Push List");
        btnPushList.setMaximumSize(new java.awt.Dimension(80, 22));
        btnPushList.setMinimumSize(new java.awt.Dimension(80, 22));
        btnPushList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushListActionPerformed(evt);
            }
        });

        btnAddNames.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnAddNames.setText("Add Names");
        btnAddNames.setMaximumSize(new java.awt.Dimension(80, 22));
        btnAddNames.setMinimumSize(new java.awt.Dimension(80, 22));
        btnAddNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNamesActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 122, 106));
        jButton5.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 122, 106));
        jButton6.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Create Chores List");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 122, 106));
        jButton7.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("View Task");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 122, 106));
        jButton8.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Achivement");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 122, 106));
        jLabel2.setText("Create Chores");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), null));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(131, 197, 190));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("1. View this week's list of chores here.\n2. Receive alerts for incomplete chores upon opening the app.\n3. Mark chores as done or not done by clicking the checkbox.\n4. Access last week's chore list.\n5. Use the refresh button to see any changes made.\n6. The table displays the chore ID, details, user, and status.");
        jScrollPane4.setViewportView(jTextArea2);

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel3.setText("Instructions:");

        btnDelete.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnDelete.setText("Delete Chore");
        btnDelete.setMaximumSize(new java.awt.Dimension(80, 22));
        btnDelete.setMinimumSize(new java.awt.Dimension(80, 22));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton5)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7)
                            .addGap(18, 18, 18)
                            .addComponent(jButton8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(197, 197, 197)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPushList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddNames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPullList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(spList, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateList)
                .addGap(334, 334, 334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCreateList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spList, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPullList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPushList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //REDUNDANT-Can't remove
    }//GEN-LAST:event_jButton1ActionPerformed

    private void notDoneAlertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notDoneAlertBtnActionPerformed
        //REDUNDANT-Can't remove
        
    }//GEN-LAST:event_notDoneAlertBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //REDUNDANT-Can't remove
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPullListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPullListActionPerformed
        DatabaseFunctions Database = new DatabaseFunctions();   //this calls the databsse functions
        
        ArrayList<Chore> list = Database.GET_FULL_CHORE_LIST();     //queries database for chores list
        
        DefaultTableModel choresTable = (DefaultTableModel)     //sets a table model so i can edit the table
        choresList.getModel();
        choresTable.setRowCount(0);     //resets the table to empty
        for (Chore c:list) {       //loops through chores list, adding each one to the jtable
            choresTable.addRow(new Object[]{c.getId(), c.getName()});
        }
        
        
        //for (Chore c:list){
            //System.out.println(c.getId());
            //System.out.println(c.getName());
            
        //}
    }//GEN-LAST:event_btnPullListActionPerformed

    public void insertChore(String d){
    System.out.println(d);      //this would the be pushed to the db using the CREATE_CHORE function provide by the database dev
    }                           //but that code isn't inline with the brief, and thus doesn't work
    
    
    public void insertNames(String n1, String n2) throws SQLException{
        DatabaseFunctions Database = new DatabaseFunctions();
        
        Database.CREATE_USER(n1);
        System.out.println("added "+n1+" to the database");
        
        Database.CREATE_USER(n1);
        System.out.println("added "+n2+" to the database");
    }
    
    
    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
        addTask x = new addTask(this, true);
        x.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void btnAddNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNamesActionPerformed
        enterNames x = new enterNames(this, true);
        x.setVisible(true);
    }//GEN-LAST:event_btnAddNamesActionPerformed

    private void btnPushListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPushListActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        homePage home = new homePage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        createList makeList = new createList();
        makeList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ViewChores viewChoresList = new ViewChores();
        viewChoresList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        achievements gamification = new achievements();
        gamification.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(createList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNames;
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPullList;
    private javax.swing.JButton btnPushList;
    private javax.swing.JTable choresList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblCreateList;
    private javax.swing.JButton notDoneAlertBtn;
    private javax.swing.JScrollPane spList;
    // End of variables declaration//GEN-END:variables
}
