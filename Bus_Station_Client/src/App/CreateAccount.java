package App;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    public Connect query = new Connect();

    public enum Placeholder {
        USERNAME("Потребителско име"),
        PASSWORD("Парола"),
        FIRST_NAME("Име"),
        LAST_NAME("Фамилия"),
        EMAIL("Email");

        public final String value;

        private Placeholder(String placeholder) {
            this.value = placeholder;
        }
    }
    
    public CreateAccount() {
        initComponents();
        centerScreen();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        regestryButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

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
            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(minimizeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.setText("Потребителско име");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 153, 188));
        jLabel1.setText("Започни сега...");

        firstNameField.setForeground(new java.awt.Color(153, 153, 153));
        firstNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstNameField.setText("Име");
        firstNameField.setBorder(null);
        firstNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstNameField.setHighlighter(null);
        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });
        firstNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstNameFieldMousePressed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyPressed(evt);
            }
        });

        lastNameField.setForeground(new java.awt.Color(153, 153, 153));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastNameField.setText("Фамилия");
        lastNameField.setBorder(null);
        lastNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lastNameField.setHighlighter(null);
        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusLost(evt);
            }
        });
        lastNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lastNameFieldMousePressed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyPressed(evt);
            }
        });

        emailField.setForeground(new java.awt.Color(153, 153, 153));
        emailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailField.setText("Email");
        emailField.setBorder(null);
        emailField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailField.setHighlighter(null);
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        emailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailFieldMousePressed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailFieldKeyPressed(evt);
            }
        });

        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Парола");
        passwordField.setToolTipText("");
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

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        regestryButton.setBackground(new java.awt.Color(255, 255, 255));
        regestryButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        regestryButton.setForeground(new java.awt.Color(86, 153, 188));
        regestryButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regestryButton.setText("Регистрация");
        regestryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 153, 188)));
        regestryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regestryButton.setOpaque(true);
        regestryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regestryButtonMousePressed(evt);
            }
        });
        jPanel2.add(regestryButton);
        regestryButton.setBounds(0, 10, 221, 40);

        jLabel2.setBackground(new java.awt.Color(86, 153, 188));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 153, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Вход");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 153, 188)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 221, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(firstNameField)
                    .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailField)
                    .addComponent(passwordField)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regestryButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regestryButtonMousePressed
        if (IsDataIncorrect()) {
            JOptionPane.showMessageDialog(this, "Моля, попълнете всички полета!");
        } else {
            createLogin();
        }
    }//GEN-LAST:event_regestryButtonMousePressed

    private boolean IsDataIncorrect() {
        return (usernameField.getText().equals("Потребителско име")
                || usernameField.getText().trim().isEmpty())
                && (new String(passwordField.getPassword()).equals("Парола")
                || new String(passwordField.getPassword()).trim().isEmpty())
                && (firstNameField.getText().equals("Име")
                || firstNameField.getText().trim().isEmpty())
                && (lastNameField.getText().equals("Фамилия")
                || lastNameField.getText().trim().isEmpty())
                && (emailField.getText().equals("Email")
                || emailField.getText().trim().isEmpty());
    }

    private void createLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String email = emailField.getText().trim();
        
        if (query.insertNewAccount(new String[] { username, password, firstName, lastName, email })) {
            JOptionPane.showMessageDialog(this, "Успешна регистрация!");
            new Login().show();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Този потребител/имейл вече съществува.");
        }
    }

    private void usernameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMousePressed
        PlaceholderUtility.removePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_usernameFieldMousePressed

    private void menuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMousePressed
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_menuBarMousePressed

    private void minimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMousePressed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMousePressed

    private void closeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMousePressed
        this.dispose();
    }//GEN-LAST:event_closeButtonMousePressed

    private void firstNameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameFieldMousePressed
        PlaceholderUtility.removePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_firstNameFieldMousePressed

    private void lastNameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameFieldMousePressed
        PlaceholderUtility.removePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_lastNameFieldMousePressed

    private void emailFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMousePressed
        PlaceholderUtility.removePlaceholder(emailField, Placeholder.EMAIL.value);
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
    }//GEN-LAST:event_emailFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        PlaceholderUtility.removePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_passwordFieldMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_jPanel1MousePressed

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        PlaceholderUtility.removePlaceholder(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        PlaceholderUtility.restorePlaceholder(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_usernameFieldFocusLost

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(usernameField, Placeholder.USERNAME.value);
    }//GEN-LAST:event_usernameFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        PlaceholderUtility.restorePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_passwordFieldFocusLost

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        PlaceholderUtility.removePlaceholder(passwordField, Placeholder.PASSWORD.value);
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(firstNameField, Placeholder.FIRST_NAME.value);
    }//GEN-LAST:event_firstNameFieldFocusGained

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
        PlaceholderUtility.restorePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
    }//GEN-LAST:event_firstNameFieldFocusLost

    private void lastNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyPressed
       PlaceholderUtility.removePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
    }//GEN-LAST:event_lastNameFieldKeyPressed

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(lastNameField, Placeholder.LAST_NAME.value);
    }//GEN-LAST:event_lastNameFieldFocusGained

    private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusLost
        PlaceholderUtility.restorePlaceholder(lastNameField, Placeholder.LAST_NAME.value);
    }//GEN-LAST:event_lastNameFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        PlaceholderUtility.moveCaretPositionToFront(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        PlaceholderUtility.restorePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_emailFieldFocusLost

    private void emailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyPressed
        PlaceholderUtility.removePlaceholder(emailField, Placeholder.EMAIL.value);
    }//GEN-LAST:event_emailFieldKeyPressed

    private void firstNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyPressed
        PlaceholderUtility.removePlaceholder(firstNameField, Placeholder.FIRST_NAME.value);
    }//GEN-LAST:event_firstNameFieldKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
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
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel regestryButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
