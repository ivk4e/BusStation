package App;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tickets extends javax.swing.JFrame {

    Connect query = new Connect();
    DefaultTableModel table;
    ArrayList<Course> data = new ArrayList();

    public Tickets() {
        initComponents();
        centerScreen();
        
        jLabel2.setVisible(false);
        table = (DefaultTableModel)jTable1.getModel();

        generateLabels();
        generateItemsInComboboxes();
        loadCources();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cityFrom = new javax.swing.JComboBox<>();
        cityTo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        hours = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        filterButton = new javax.swing.JLabel();
        buyTicketButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        helloField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        helloField.setText("Билети");
        jPanel1.add(helloField);
        helloField.setBounds(170, 60, 116, 48);

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
        ticketsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 340, 590, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Избери град на пристигане:");

        cityTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cityTo.setSelectedIndex(-1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Избери град на тръгване:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Избери час на тръгване:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Дата на тръгване:");

        date.setDateFormatString("yyyy-MM-dd");

        filterButton.setBackground(new java.awt.Color(255, 255, 255));
        filterButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filterButton.setForeground(new java.awt.Color(86, 153, 188));
        filterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterButton.setText("Филтрирай");
        filterButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 153, 188)));
        filterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterButton.setOpaque(true);
        filterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                filterButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cityFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hours, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(262, 262, 262))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cityTo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(170, 120, 590, 250);

        buyTicketButton.setBackground(new java.awt.Color(86, 153, 188));
        buyTicketButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buyTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        buyTicketButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buyTicketButton.setText("Купи билет");
        buyTicketButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyTicketButton.setOpaque(true);
        buyTicketButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buyTicketButtonMousePressed(evt);
            }
        });
        jPanel1.add(buyTicketButton);
        buyTicketButton.setBounds(170, 570, 160, 30);

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("*Маркирай ред и след това натисни бутона за купуване");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 570, 330, 16);

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

    private void homeIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMousePressed
        query.close();
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_homeIconMousePressed

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

    private void filterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMousePressed
        String cityFromFilter = String.valueOf(cityFrom.getSelectedItem());
        String cityToFilter = String.valueOf(cityTo.getSelectedItem());
        String hourFilter = String.valueOf(hours.getSelectedItem());
        
        String dateFilter = dateFilter();
        System.out.println(dateFilter);
        
        ArrayList<String> columns = new ArrayList();
        ArrayList<String> values = new ArrayList();
   
        if(cityFromFilter.equals("") && cityToFilter.equals("") && hourFilter.equals("") && dateFilter.equals(""))
        {
            loadCources();
            return;
        }
        if(!cityFromFilter.equals(""))
        {
            columns.add("CityFrom");
            values.add(cityFromFilter);
        }
        if(!cityToFilter.equals(""))
        {
            columns.add("CityTo");
            values.add(cityToFilter);
        }
        if(!dateFilter.equals(""))
        {
            columns.add("Date");
            values.add(dateFilter);
        }
        if(!hourFilter.equals(""))
        {
            columns.add("Hour");
            values.add(hourFilter);
        }
        System.out.println(columns.size());
        loadCources(columns, values);
    }//GEN-LAST:event_filterButtonMousePressed

    

    private void buyTicketButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketButtonMousePressed
        if (jTable1.getSelectedRow() != -1) {
            int rowNumber = jTable1.getSelectedRow();
            int courseId = data.get(rowNumber).getCourseId();
            int userId = UserInfo.getUserId();
            if (query.insertIntoTickets(userId, courseId)) {
                JOptionPane.showMessageDialog(this, "Успешно закупен билет!");
            } else {
                JOptionPane.showMessageDialog(this, "Неуспешно закупен билет! Опитайте пак по-късно!");
            }
        } else {
            jLabel2.setVisible(true);
        }
        
        

    }//GEN-LAST:event_buyTicketButtonMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });
    }

    private void generateLabels() {
        firstNameLabel.setText(UserInfo.getUsername());
    }
    
    private void centerScreen() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    int centerX = (int)(screenSize.getWidth() - getWidth()) / 2;
    int centerY = (int)(screenSize.getHeight() - getHeight()) / 2;

    setLocation(centerX, centerY);
    }


    private void loadCources()
    {
        table.setRowCount(0);
        data = query.selectAllCourses();
        
        for (int i = 0; i < data.size(); i++) {
            table.addRow(data.get(i).toArray());
        }
    }
    
    private void loadCources(ArrayList<String> columns, ArrayList<String> values)
    {
        table.setRowCount(0);

        data = query.selectAllCourses(columns, values);

        for (int i = 0; i < data.size(); i++) {
            table.addRow(data.get(i).toArray());
        }
    }
    
    private void generateItemsInComboboxes() {
        cityTo.removeAllItems();
        cityFrom.removeAllItems();
        
        cityFrom.addItem("");
        cityFrom.addItem("Варна");
        cityFrom.addItem("София");
        cityFrom.setSelectedIndex(0);
        
        cityTo.addItem("");
        cityTo.addItem("Русе");
        cityTo.addItem("Варна");
        cityTo.setSelectedIndex(0);
        
        hours.addItem("");
        hours.addItem("07:30");
        hours.addItem("10:00");
        hours.addItem("15:00");
        hours.addItem("17:00");
        hours.setSelectedIndex(0);
    }
    
    private String dateFilter() {
        Date selectedDate = date.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateFilter = (selectedDate != null) ? dateFormat.format(selectedDate) : "";
        return dateFilter;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel buyTicketButton;
    private javax.swing.JComboBox<String> cityFrom;
    private javax.swing.JComboBox<String> cityTo;
    private javax.swing.JLabel closeButton;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel filterButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel helloField;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JComboBox<String> hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel ticketsIcon;
    // End of variables declaration//GEN-END:variables
}
