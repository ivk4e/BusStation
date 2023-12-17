package App;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    Connect query = new Connect();
    DefaultTableModel table;
    ArrayList<TicketExtended> data = new ArrayList();
    
    public Home() {
        initComponents();
        centerScreen();
        generateLabels();
        
        loadTable();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        helloField = new javax.swing.JLabel();
        nameClientField = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        logOutIcon = new javax.swing.JLabel();
        ticketsIcon = new javax.swing.JLabel();
        profileIcon = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jMenuItem1.setText("Изтрий билет");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        helloField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        helloField.setText("Здравей,");
        jPanel1.add(helloField);
        helloField.setBounds(170, 60, 160, 48);

        nameClientField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameClientField.setText("{name}");
        jPanel1.add(nameClientField);
        nameClientField.setBounds(320, 60, 240, 48);

        mainMenu.setBackground(new java.awt.Color(86, 153, 188));

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/home-btn.png"))); // NOI18N
        homeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        profileIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profileIconMousePressed(evt);
            }
        });

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
        firstNameLabel.setText("{username}");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameLabel)
                .addGap(81, 81, 81)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(minimizeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(menuBar);
        menuBar.setBounds(0, 0, 800, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Град на тръгване", "Град на пристигане", "Дата", "Час"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 200, 590, 170);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Предстоящите ти пътувания...");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 170, 220, 20);

        jSeparator1.setForeground(new java.awt.Color(0, 84, 142));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(170, 390, 590, 10);

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

    private void ticketsIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketsIconMousePressed
        query.close();
        new Tickets().show();
        this.dispose();
    }//GEN-LAST:event_ticketsIconMousePressed

    private void profileIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileIconMousePressed
        query.close();
        new Account().show();
        this.dispose();
    }//GEN-LAST:event_profileIconMousePressed

    private void logOutIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutIconMousePressed
        query.close();
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_logOutIconMousePressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
//        Трябва да се направи
        int code = evt.getKeyCode();
        if(code == KeyEvent.VK_DELETE){
            int selection = jTable1.getSelectedRow();
            int selectedTicketId = data.get(selection).getTicketId();
            query.deleteTicketFromAccount(selectedTicketId);
            table.removeRow(selection);
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
         if (SwingUtilities.isRightMouseButton(evt)) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY()); //poqvqva se tam kudeto e natisnat desen buton
            int index = jTable1.rowAtPoint(evt.getPoint());
            jTable1.setRowSelectionInterval(index, index); 
            
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
            int selection = jTable1.getSelectedRow();
            int selectedTicketId = data.get(selection).getTicketId();
            query.deleteTicketFromAccount(selectedTicketId);
            table.removeRow(selection);
    }//GEN-LAST:event_jMenuItem1MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    private void generateLabels() {
        firstNameLabel.setText(UserInfo.getUsername());
        nameClientField.setText(UserInfo.getFirstName());
    }
    
    private void centerScreen() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    int centerX = (int)(screenSize.getWidth() - getWidth()) / 2;
    int centerY = (int)(screenSize.getHeight() - getHeight()) / 2;

    setLocation(centerX, centerY);
    }
    
    private void loadTable() {
        table = (DefaultTableModel)jTable1.getModel();
        
        table.setRowCount(0);
        data = query.selectAllCoursesForAccount();
        
        for (int i = 0; i < data.size(); i++) {
            table.addRow(data.get(i).toArray());
        }
        
        if (rootPaneCheckingEnabled) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel helloField;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel nameClientField;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel ticketsIcon;
    // End of variables declaration//GEN-END:variables
}
