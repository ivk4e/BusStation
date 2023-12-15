package App;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class Connect {
    public Connection conn;
    public Statement stmt;
    public ResultSet rs;
    
    public Connect(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:appBusStation.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public void Close(){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insertNewAccount(String[] customerData) {
        String sql = "INSERT INTO Accounts(Username, Password, FirstName, LastName, Email) VALUES (?, ?, ?, ?, ?)";

        System.out.println(sql);

        try {
            String username = customerData[0];
            String email = customerData[4];
            
            if (isUsernameUnique(username) || isEmailUnique(email)) {
                PreparedStatement pstmt = conn.prepareStatement(sql);
            
                for (int i = 0; i < customerData.length; i++) {
                    pstmt.setString(i + 1, customerData[i]);
                }
                int res = pstmt.executeUpdate();
                return true;
            } else {
                System.out.println("This username/email already exists");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    
   public boolean login(String[] loginInfo) {
        String sql = "SELECT AccountId, Username, FirstName, LastName, Email FROM Accounts WHERE Username = ? AND Password = ?";

        try {
            String username = loginInfo[0];
            String password = loginInfo[1];

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                int accountId = rs.getInt("AccountId");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String email = rs.getString("Email");

                System.out.println("Login successful. Welcome, " + firstName + " " + lastName + "!");
                return true;
            } else {
                System.out.println("Incorrect username or password.");
                return false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
   
    public boolean isUsernameUnique(String username) {
        String sql = "SELECT COUNT(*) FROM Accounts WHERE Username = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    private boolean isEmailUnique(String email) {
        String sql = "SELECT COUNT(*) FROM Accounts WHERE Email = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
