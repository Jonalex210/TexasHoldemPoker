/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdempoker;

import java.util.Arrays;

/**
 *
 * @author maste
 */
public class GamePage extends javax.swing.JFrame {

    /**
     * Creates new form GamePage
     */
    int[] readyDeck = new int[51]; 
    int[] PlayerCards = new int[2];
    int[] computerCards = new int[2]; 
    int[] comunityCards = new int[5];
    int[] PlayerCardsFinal = new int[5];
    int[] computerCardsCardsFinal = new int[5];
    
    public GamePage() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Quit the Gmae");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jButton2.setText("Help ?");
        jLayeredPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/53.png"))); // NOI18N
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 70, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 70, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/53.png"))); // NOI18N
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 70, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Computer Cards");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Player Cards");
        jLayeredPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 90, -1));

        jButton4.setText("Dealer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 3, 110, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 70, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 70, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 70, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png"))); // NOI18N
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 70, 100));

        jButton3.setText("Bit");
        jLayeredPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 30));

        jButton5.setText("Raise");
        jLayeredPane1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 30));

        jButton6.setText("Check");
        jLayeredPane1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, -1));

        jButton7.setText("Fold");
        jLayeredPane1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, -1));

        jButton8.setText("Shuffle");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));
        jLayeredPane1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, 30));
        jLayeredPane1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, 30));

        jButton9.setText("The River");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 110, -1));

        jButton10.setText("Show Down");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 110, -1));

        jButton11.setText("The Winner Is:");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 110, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 160, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 160, 30));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 160, 30));

        jButton12.setText("New Gmae");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 110, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/53.png"))); // NOI18N
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 70, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/53.png"))); // NOI18N
        jLayeredPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 70, 100));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Difficulty Level");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 110, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "EASY", "MEDIUM", "HARD" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/pagegameimage.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 910, 500));

        jLabel13.setText("jLabel13");
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Dealer de = new Dealer();
        GamePage gam = new GamePage();
        int counter = 0;
        if(counter == 0){
        int oneDestributedCard =de.distributedCards(de.shuffleArray(de.getDeck()));
        readyDeck =de.shuffleArray(de.getDeck());
        //readyDeck = de.shuffleArray(de.getDeck()); 
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[0])+".png")));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/52.png")));//donot change
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[2])+".png")));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/53.png")));//do not change
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[4])+".png")));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[5])+".png")));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[6])+".png")));
        
        PlayerCards[0] = readyDeck[0];
        PlayerCards[1] = readyDeck[2];//de.shuffleArray(de.getDeck());
        computerCards[0] = readyDeck[1];
        computerCards[1] = readyDeck[3];
        int x =0;
        for(int i=4;i<9;i++){
            comunityCards[x] = readyDeck[i];
            x++;
        }
        //int[] comunityCards = {readyDeck[4],readyDeck[5],readyDeck[6],readyDeck[7],readyDeck[8]};
        
        }

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Dealer de = new Dealer();
       jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[7])+".png")));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+String.valueOf(readyDeck[8])+".png")));
       Card  ca = new Card();
       Dealer de = new Dealer();
       
        System.out.println(Arrays.toString(PlayerCards));
        System.out.println(Arrays.toString(computerCards));
        System.out.println();
        System.out.println("comunity cards: "+Arrays.toString((comunityCards)));
        

       
       
       int playerHand = de.bestHand(PlayerCards, comunityCards);
       int computerHand = de.bestHand(computerCards, comunityCards);

        jTextField2.setText(ca.identifyHouselast(playerHand));
       jTextField5.setText(ca.identifyHouselast(computerHand));
       
       
        jTextField4.setText(de.identifyWinner(playerHand,computerHand));

         System.out.println(Arrays.toString(ca.hand(PlayerCards,comunityCards)));
        System.out.println(Arrays.toString(ca.hand(computerCards,comunityCards)));
//        
//        for(int i =0 ;i < 2;i++){
//            PlayerCardsFinal[i] = PlayerCards[i];
//            computerCardsCardsFinal[i] = computerCards[i];     
//        }
//        for(int i =2 ;i < 5;i++){
//            PlayerCardsFinal[i] = comunityCards[i];
//            computerCardsCardsFinal[i] = comunityCards[i];     
//        }
    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+computerCards[0]+".png")));//donot change
    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texasholdempoker/images/"+computerCards[1]+".png")));//donot change



        System.out.println("playerHand: "+playerHand+"  computerHand:"+computerHand);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.dispose();
        GamePage window = new GamePage();
        window.setVisible(true);

    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
