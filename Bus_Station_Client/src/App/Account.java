package App;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Account extends javax.swing.JFrame {

    public Account() {
        initComponents();
        centerScreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        helloField = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        logOutIcon = new javax.swing.JLabel();
        ticketsIcon = new javax.swing.JLabel();
        profileIcon = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        namesLabel = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        accountName = new javax.swing.JLabel();
        editAccountName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        changePass = new javax.swing.JLabel();
        changePassButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        changeEmailButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        helloField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        helloField.setText("Акаунт");
        jPanel1.add(helloField);
        helloField.setBounds(170, 60, 112, 48);

        mainMenu.setBackground(new java.awt.Color(86, 153, 188));

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/home-btn.png"))); // NOI18N
        homeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeIconMousePressed(evt);
            }
        });

        logOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/logout-btn.png"))); // NOI18N
        logOutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutIconMousePressed(evt);
            }
        });

        ticketsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/ticket-btn.png"))); // NOI18N
        ticketsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ticketsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ticketsIconMousePressed(evt);
            }
        });

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/user-btn.png"))); // NOI18N
        profileIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ticketsIcon)
                            .addComponent(profileIcon)
                            .addComponent(homeIcon)))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(logOutIcon)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(homeIcon)
                .addGap(57, 57, 57)
                .addComponent(ticketsIcon)
                .addGap(72, 72, 72)
                .addComponent(profileIcon)
                .addGap(93, 93, 93)
                .addComponent(logOutIcon)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jPanel1.add(mainMenu);
        mainMenu.setBounds(0, 40, 130, 720);

        menuBar.setBackground(new java.awt.Color(0, 84, 142));
        menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBarMousePressed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/x-regular-24.png"))); // NOI18N
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setPreferredSize(new java.awt.Dimension(25, 25));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeButtonMousePressed(evt);
            }
        });

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/tire.png"))); // NOI18N
        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeButtonMousePressed(evt);
            }
        });

        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("{firstName}");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("{lastName}");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/bus.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/user (1).png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ИнтерСити Транс");

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(minimizeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(menuBar);
        menuBar.setBounds(0, 0, 800, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Име:");

        namesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namesLabel.setText("{firstName} {lastName}");

        edit.setBackground(new java.awt.Color(86, 153, 188));
        edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("Редактирай");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namesLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(namesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 170, 260, 140);

        accountName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        accountName.setText("{potrIme}");

        editAccountName.setBackground(new java.awt.Color(86, 153, 188));
        editAccountName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editAccountName.setForeground(new java.awt.Color(255, 255, 255));
        editAccountName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editAccountName.setText("Редактирай");
        editAccountName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editAccountName.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Потребител:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(editAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountName)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(accountName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(180, 350, 260, 140);

        changePass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changePass.setText("Смени паролата:");

        changePassButton.setBackground(new java.awt.Color(86, 153, 188));
        changePassButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changePassButton.setForeground(new java.awt.Color(255, 255, 255));
        changePassButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassButton.setText("Редактирай");
        changePassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePassButton.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(changePass)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(changePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(490, 170, 260, 140);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Email:");

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setText("{email}");

        changeEmailButton.setBackground(new java.awt.Color(86, 153, 188));
        changeEmailButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeEmailButton.setForeground(new java.awt.Color(255, 255, 255));
        changeEmailButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeEmailButton.setText("Редактирай");
        changeEmailButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeEmailButton.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(changeEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(490, 350, 260, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMousePressed
        this.dispose();
    }//GEN-LAST:event_closeButtonMousePressed

    private void minimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMousePressed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMousePressed

    private void menuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMousePressed

    }//GEN-LAST:event_menuBarMousePressed

    private void homeIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMousePressed
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_homeIconMousePressed

    private void ticketsIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketsIconMousePressed
        new Tickets().show();
        this.dispose();
    }//GEN-LAST:event_ticketsIconMousePressed

    private void logOutIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutIconMousePressed
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_logOutIconMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    private void centerScreen() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    int centerX = (int)(screenSize.getWidth() - getWidth()) / 2;
    int centerY = (int)(screenSize.getHeight() - getHeight()) / 2;

    setLocation(centerX, centerY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountName;
    private javax.swing.JLabel changeEmailButton;
    private javax.swing.JLabel changePass;
    private javax.swing.JLabel changePassButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel editAccountName;
    private javax.swing.JLabel email;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel helloField;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel namesLabel;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel ticketsIcon;
    // End of variables declaration//GEN-END:variables
}