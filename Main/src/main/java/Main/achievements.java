package Main;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingUtilities;
import org.Database.DatabaseFunctions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license.
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit 
 * this template.
 */

/**
 *
 * @author Rayhan Chowdhury Bijoy
 */

public class achievements extends javax.swing.JFrame {

    /**
     * Creates new form Achievements
     */
    public achievements() {
        initComponents();
        SwingUtilities.invokeLater(() -> 
                jScrollPane3.getVerticalScrollBar().setValue(0));
        // set jScrollPane3 ScrollBar value to 0
        
        SwingUtilities.invokeLater(() -> 
                jScrollPane4.getVerticalScrollBar().setValue(0));
        // set jScrollPane4 ScrollBar value to 0
        
        SwingUtilities.invokeLater(() -> 
                jScrollPane2.getVerticalScrollBar().setValue(0));
        // set jScrollPane2 ScrollBar value to 0
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(176, 208, 211));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Level: 02\t\t\t\nMessage: Great, keep going!\nLeague: Bronze\t\tNext-league: Silver, Gold, Dimond\nNote: For going to next level keep doing your chores!");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel2.setText("Rayhan's Level:");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(131, 197, 190));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("1. Displays user levels and leagues.\n2. Each level represents one completed task.\n3. Five levels make up one league.\n4. Leagues signify user achievements.");
        jScrollPane3.setViewportView(jTextArea2);

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel3.setText("Bijoy's Level:");

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("Note*: 1 chore = 1 level, 5 levels = 1 league (Bronze, Silve, Gold & Diamond).");

        jTextArea2.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(176, 208, 211));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Level: 05\t\t\t\nMessage: Well-done keep it up!\nLeague: Silver\nNote: For going to next level keep doing your chores!");
        jScrollPane4.setViewportView(jTextArea3);

        jLabel5.setBackground(new java.awt.Color(51, 255, 51));
        jLabel5.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel5.setText("Instructions:");

        jButton1.setBackground(new java.awt.Color(0, 122, 106));
        jButton1.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 122, 106));
        jButton2.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create Chores List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 122, 106));
        jButton3.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Task");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 122, 106));
        jButton4.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Achivement");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 122, 106));
        jLabel1.setText("Achivement!");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        homePage home = new homePage(); // get homePage.java
        home.setVisible(true); // Show the HomePage
        this.dispose(); // Dispose the achievements page
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        createList makeList = new createList(); // get createList.java
        makeList.setVisible(true); // Show the createList
        this.dispose(); // Dispose the achievements page
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ViewChores viewChoresList = new ViewChores(); // get ViewChores.java
        viewChoresList.setVisible(true); // Show the viewChoresList
        this.dispose(); // Dispose the achievements page
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        achievements gamification = new achievements(); // get achievements.java
        gamification.setVisible(true); // Show the achievements
        this.dispose(); // Dispose the achievements page
    }//GEN-LAST:event_jButton4ActionPerformed

    // randomFeedBackMessage function- which will show some amazing message
    private String randomFeedBackMessage()
    {
        // feedbackList created
        ArrayList<String> feedbackList = new ArrayList<>();
        
        feedbackList.add("Well done!");
        feedbackList.add("Great job!");
        feedbackList.add("Excellent work!");
        feedbackList.add("Keep up the good work!");
        feedbackList.add("You're doing great!");
        feedbackList.add("Fantastic!");
        feedbackList.add("Awesome!");
        feedbackList.add("Superb!");
        feedbackList.add("Bravo!");
        feedbackList.add("Impressive!");
        
        Random rand = new Random();
        int randomIndex = rand.nextInt(feedbackList.size());
        String randomFeedback = feedbackList.get(randomIndex);
        return randomFeedback;
    }
    
    // getLeague function 
    public static String getLeague(int levelsCompleted) {
        int levelRemainder = levelsCompleted / 5;
        switch (levelRemainder) {
            case 0:
                return "Bronze";
            case 1:
                return "Silver";
            case 2:
                return "Gold";
            default:
                return "Diamond";
        }
    }
    
    // setLevelAndLeague function created
    private void setLevelAndLeague()
    {
        DatabaseFunctions df = new DatabaseFunctions();
        int userOneLevel = 0;
        int userTwoLevel = 0;
        try {
            User userOne = df.GET_USER_WITH_ID(0);
            User userTwo = df.GET_USER_WITH_ID(1);
            userOneLevel = df.GET_LAST_MONTH_FINISHED_CHORE_LIST(userOne);
            userTwoLevel = df.GET_LAST_MONTH_FINISHED_CHORE_LIST(userTwo);
        } catch (Exception e) {
        }
        jTextArea3.setText("Level: " + userOneLevel + "\nMessage: " + 
                randomFeedBackMessage() + "\nLeague: " + 
                getLeague(userOneLevel));
        jTextArea1.setText("Level: " + userTwoLevel + "\nMessage: " + 
                randomFeedBackMessage() + "\nLeague: " + 
                getLeague(userTwoLevel));
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int userOneID = 0, userTwoID = 0;
        String userOneName = "", userTwoName = "";
        DatabaseFunctions df = new DatabaseFunctions();
        try {
            User userOne = df.GET_USER_WITH_ID(0);
            User userTwo = df.GET_USER_WITH_ID(1);
            userOneID = userOne.getId();
            userOneName = userOne.getName();
            userTwoID = userTwo.getId();
            userTwoName = userTwo.getName();
        } catch (Exception e) {
        }
        jLabel2.setText(userOneName + "' Level:");
        jLabel3.setText(userTwoName + "' Level:");
        setLevelAndLeague();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(achievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(achievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(achievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(achievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new achievements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
