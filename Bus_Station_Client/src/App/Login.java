package App;

import java.awt.*;
import java.awt.Color;
import javax.swing.plaf.ColorUIResource;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    public Connect query = new Connect();
    
    public enum Placeholder {
        USERNAME("Потребителско име"),
        PASSWORD("Парола");

        public final String value;

        private Placeholder(String placeholder) {
            this.value = placeholder;
        }
    }
    
    public Login() {
        initComponents();
        centerScreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        background_panel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        createNowField = new javax.swing.JLabel();
        infoTextField = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        entryButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Българска автогара");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);

        background_panel.setBackground(new java.awt.Color(255, 255, 255));
        background_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                background_panelMousePressed(evt);
            }
        });

        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.setText("Потребителско име");
        usernameField.setToolTipText("");
        usernameField.setBorder(null);
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameField.setHighlighter(null);
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameFieldMousePressed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });

        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Парола");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        createNowField.setForeground(new java.awt.Color(51, 153, 255));
        createNowField.setText("Създай сега");
        createNowField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNowField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createNowFieldMousePressed(evt);
            }
        });

        infoTextField.setForeground(new java.awt.Color(204, 204, 204));
        infoTextField.setText("Все още нямаш акаунт?");

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

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(minimizeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        entryButton.setBackground(new java.awt.Color(255, 255, 255));
        entryButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entryButton.setForeground(new java.awt.Color(86, 153, 188));
        entryButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entryButton.setText("Вход");
        entryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 153, 188)));
        entryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entryButton.setOpaque(true);
        entryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entryButtonMousePressed(evt);
            }
        });
        jPanel2.add(entryButton);
        entryButton.setBounds(10, 10, 221, 40);

        jLabel2.setBackground(new java.awt.Color(86, 153, 188));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 153, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Вход");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 153, 188)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 20, 221, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/user-solid-240.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(background_panel);
        background_panel.setLayout(background_panelLayout);
        background_panelLayout.setHorizontalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameField)
                    .addComponent(passwordField)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(infoTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createNowField))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addGap(113, 113, 113))
        );
        background_panelLayout.setVerticalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panelLayout.createSequentialGroup()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNowField)
                    .addComponent(infoTextField))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMousePressed
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_menuBarMousePressed

    private void closeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMousePressed
        this.dispose();
    }//GEN-LAST:event_closeButtonMousePressed

    private void createNowFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNowFieldMousePressed
        query.close();
        new CreateAccount().show();
        this.dispose();
    }//GEN-LAST:event_createNowFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        PlaceholderUtility.removePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_passwordFieldMousePressed

    private void usernameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMousePressed
        PlaceholderUtility.removePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_usernameFieldMousePressed

    private void minimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMousePressed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMousePressed

    private void entryButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entryButtonMousePressed
        createLogin();
    }//GEN-LAST:event_entryButtonMousePressed

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_usernameFieldFocusLost

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        PlaceholderUtility.removePlaceholder(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_passwordFieldFocusLost

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        PlaceholderUtility.removePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void background_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_background_panelMousePressed
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_background_panelMousePressed

    private void createLogin() throws HeadlessException {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        if (query.login(new String[] {username, password})) {
            JOptionPane.showMessageDialog(this, "Успешно влизане!");
            UserInfo.setUsername(username);
            
            ArrayList<Customer> customerList = query.selectUserInfo(username);
            
            if (!customerList.isEmpty()) {
                Customer customer = customerList.get(0);
                int accountId = customer.getCustomerId();
                String firstName = customer.getFirstName();
                String lastName = customer.getLastName();
                String email = customer.getEmail();
                
                UserInfo.setUserId(accountId);
                UserInfo.setFirstName(firstName);
                UserInfo.setLastName(lastName);
                UserInfo.setEmail(email);
                UserInfo.setPassword(password);
            }
            
            this.dispose();
            query.close();
            new Home().show();
            
        } else {
            JOptionPane.showMessageDialog(this, "Грешно име или парола!");
        }
    }

     private void removePlaceholder(JTextField textField, String USERNAME)
    {
        if(textField.getText().equals(USERNAME))
        {
            textField.setText("");
        }
    }
    
    private void restorePlaceholder(JTextField textField,String USERNAME)
    {
        if(textField.getText().trim().length() == 0)
        {
            textField.setText(String.valueOf(USERNAME));
        }
    }
    
    private void removePlaceholder(JPasswordField passwordField,String PASSWORD)
    {
        System.out.println(passwordField.getPassword());
        System.out.println(PASSWORD);
        System.out.println(String.valueOf(passwordField.getPassword()).equals(PASSWORD));
        if(String.valueOf(passwordField.getPassword()).equals(PASSWORD))
        {
            
            passwordField.setText("");
        }
    }
    
    private void restorePlaceholder(JPasswordField passwordField,String PASSWORD)
    {
        if(passwordField.getPassword().length == 0)
        {
            passwordField.setText(String.valueOf(PASSWORD));
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_panel;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel createNowField;
    private javax.swing.JLabel entryButton;
    private javax.swing.JLabel infoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void centerScreen() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int centerX = (int)(screenSize.getWidth() - getWidth()) / 2;
        int centerY = (int)(screenSize.getHeight() - getHeight()) / 2;

        setLocation(centerX, centerY);
    }
}
