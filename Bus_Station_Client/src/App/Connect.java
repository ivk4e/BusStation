package App;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

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
    
    public void close(){
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

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<Customer> selectNames(String username) {
        String sql = "SELECT FirstName, LastName, Email FROM Accounts WHERE Username = ?";
        
        ArrayList<Customer> names = new ArrayList();
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            
            while (rs.next()){
                String firstName = rs.getString("Firstname");
                String lastName = rs.getString("Lastname");
                String email = rs.getString("Email");
                names.add(new Customer(firstName, lastName, email));
            }
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return names;
    }
    
    public boolean updateFirstAndLastName(String newFirstName, String newLastName) {
        String sql = "UPDATE Accounts SET FirstName = ?, LastName = ? WHERE Username = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println();
            pstmt.setString(1, newFirstName);
            pstmt.setString(2, newLastName);
            pstmt.setString(3, UserInfo.getUsername());
            
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Обновихме данните!");
                return true;
            } else {
                System.out.println("Не успяхме да обновим данните!");
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean updateUsername(String newUsername) {
        String sql = "UPDATE Accounts SET Username = ? WHERE Username = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println();
            pstmt.setString(1, newUsername);
            pstmt.setString(2, UserInfo.getUsername());
            
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Обновихме данните!");
                return true;
            } else {
                System.out.println("Не успяхме да обновим данните!");
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean updatePassword(String newPassword) {
        String sql = "UPDATE Accounts SET Password = ? WHERE Username = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println();
            pstmt.setString(1, newPassword);
            pstmt.setString(2, UserInfo.getUsername());
            
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Обновихме данните!");
                return true;
            } else {
                System.out.println("Не успяхме да обновим данните!");
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean updateEmail(String newEmail) {
        String sql = "UPDATE Accounts SET Email = ? WHERE Username = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println();
            pstmt.setString(1, newEmail);
            pstmt.setString(2, UserInfo.getUsername());
            
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Обновихме данните!");
                return true;
            } else {
                System.out.println("Не успяхме да обновим данните!");
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
