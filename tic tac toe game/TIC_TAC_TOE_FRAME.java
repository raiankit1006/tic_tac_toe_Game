
import java.awt.Color;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class TIC_TAC_TOE_FRAME extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE_FRAME
     */
    private String turn = "x";
    private int xcount = 0;
    private int ocount = 0;
    private int count = 0;
     private int ans = 0;
    
    public TIC_TAC_TOE_FRAME() {
        initComponents();
    }

    public void choosePlayer()
    {
        if(turn.equalsIgnoreCase("x"))
        {
            turn="0";
        }
        else
        {
            turn = "x";
        }
    }
    
    public void set()
    {
        playerx.setText(String.valueOf(xcount));
        playero.setText(String.valueOf(ocount));
    }
    
    public  void chooseWinner()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        String b7 = txtbtn7.getText();
        String b8= txtbtn8.getText();
        String b9= txtbtn9.getText();
        
        if("x".equals(b1) && "x".equals(b2) && "x".equals(b3))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
        }
        
        else if("x".equals(b4) && "x".equals(b5) && "x".equals(b6))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
        }
        
          else if("x".equals(b7) && "x".equals(b8) && "x".equals(b9))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
        }
        
          else if("x".equals(b1) && "x".equals(b4) && "x".equals(b7))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
        }
        
          else if("x".equals(b2) && "x".equals(b5) && "x".equals(b8))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
        }
        
          else if("x".equals(b3) && "x".equals(b6) && "x".equals(b9))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
        }
        
          else if("x".equals(b3) && "x".equals(b5) && "x".equals(b7))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
        }
        
          else if("x".equals(b1) && "x".equals(b5) && "x".equals(b9))
        {
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            ans++;
            set();
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
        }
        
          else if("0".equals(b1) && "0".equals(b2) && "0".equals(b3))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
        }
        
        else if("0".equals(b4) && "0".equals(b5) && "0".equals(b6))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
        }
        
          else if("0".equals(b7) && "0".equals(b8) && "0".equals(b9))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
        }
        
          else if("0".equals(b1) && "0".equals(b4) && "0".equals(b7))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
        }
        
          else if("0".equals(b2) && "0".equals(b5) && "0".equals(b8))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
        }
        
          else if("0".equals(b3) && "0".equals(b6) && "0".equals(b9))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
        }
        
          else if("0".equals(b3) && "0".equals(b5) && "0".equals(b7))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
        }
        
          else if("0".equals(b1) && "0".equals(b5) && "0".equals(b9))
        {
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            ans++;
            set();
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
        }
        
        if(count==9 && ans==0)
        {
           JOptionPane.showMessageDialog(this, "There is no Winner", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
        }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC_TAC_TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn1.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn2.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn3.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn4.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn5.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn6.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn7.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn8.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtn9.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(102, 255, 102));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 51));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("PlayerX  :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("PlayerO :");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        playerx.setForeground(new java.awt.Color(0, 51, 255));
        playerx.setText("xxxxxx");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        playero.setForeground(new java.awt.Color(0, 51, 255));
        playero.setText("xxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
          // TODO add your handling code here:
          txtbtn1.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn1.setForeground(Color.red);
          }
          else
          {
              txtbtn1.setForeground(Color.blue); 
          }
          count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
         txtbtn6.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn6.setForeground(Color.red);
          }
          else
          {
              txtbtn6.setForeground(Color.blue); 
          }
          count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
         txtbtn9.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn9.setForeground(Color.red);
          }
          else
          {
              txtbtn9.setForeground(Color.blue); 
          }
          count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(white);
        txtbtn2.setBackground(white);
        txtbtn3.setBackground(white);
        
        txtbtn4.setBackground(white);
        txtbtn5.setBackground(white);
        txtbtn6.setBackground(white);
        
        txtbtn7.setBackground(white);
        txtbtn8.setBackground(white);
        txtbtn9.setBackground(white);
        turn = "x";
        count=0;
        ans=0;
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame  = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
         txtbtn2.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn2.setForeground(Color.red);
          }
          else
          {
              txtbtn2.setForeground(Color.blue); 
          }
          count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn3.setForeground(Color.red);
          }
          else
          {
              txtbtn3.setForeground(Color.blue); 
          }
           count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
         txtbtn4.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn4.setForeground(Color.red);
          }
          else
          {
              txtbtn4.setForeground(Color.blue); 
          }
           count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
         txtbtn5.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn5.setForeground(Color.red);
          }
          else
          {
              txtbtn5.setForeground(Color.blue); 
          }
           count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
         txtbtn7.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn7.setForeground(Color.red);
          }
          else
          {
              txtbtn7.setForeground(Color.blue); 
          }
           count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
         txtbtn8.setText(turn);
          if(turn.equalsIgnoreCase("x"))
          {
              txtbtn8.setForeground(Color.red);
          }
          else
          {
              txtbtn8.setForeground(Color.blue); 
          }
           count++;
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtbtn8ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
