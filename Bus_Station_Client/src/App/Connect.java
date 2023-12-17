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
                System.out.println("Това потребителско име или парола вече съществуват");
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

                System.out.println("Успешно влизане. Добре дошъл, " + firstName + " " + lastName + "!");
                return true;
            } else {
                System.out.println("Неправилно потребителско име или парола");
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
    
    public ArrayList<Customer> selectUserInfo(String username) {
        String sql = "SELECT AccountId, FirstName, LastName, Email FROM Accounts WHERE Username = ?";
        
        ArrayList<Customer> names = new ArrayList();
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            while (rs.next()){
                int accountId = rs.getInt("AccountId");
                String firstName = rs.getString("Firstname");
                String lastName = rs.getString("Lastname");
                String email = rs.getString("Email");
                names.add(new Customer(accountId, firstName, lastName, email));
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
    
    public ArrayList<Course> selectAllCourses()
    {
        ArrayList<Course> data = new ArrayList();
        String sql = "Select * from Courses ORDER by [Date], Hour";
        
        try {
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            rs = pstmt.executeQuery();
            
            while (rs.next()){
                int courseId = rs.getInt("CourseId");
                String cityFrom = rs.getString("CityFrom");
                String cityTo = rs.getString("CityTo");
                String date = rs.getString("Date");
                String hour = rs.getString("Hour");
                data.add(new Course(courseId, cityFrom, cityTo, date, hour));
            }
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return data;
    }
    
    
    
    public ArrayList<Course> selectAllCourses(ArrayList<String> columns, ArrayList<String> values) {
        
        ArrayList<Course> data = new ArrayList();
        //System.out.println(columns.size());    
        int columnsLength = columns.size();
        String filters = "";
        for (int i=0; i < columnsLength; i++) 
        {
            filters += columns.get(i) + " = ? AND ";
        }
        filters = filters.substring(0, filters.length()-4);
        String sql = "SELECT * FROM Courses WHERE " + filters + "ORDER by [Date], Hour";
            
        try {
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (int i=0; i < columns.size(); i++) 
            {
                pstmt.setString(i+1, values.get(i));
            }
            
            
            rs = pstmt.executeQuery();
            
            while (rs.next()){
                int courseId = rs.getInt("CourseId");
                String cityFrom = rs.getString("CityFrom");
                String cityTo = rs.getString("CityTo");
                String date = rs.getString("Date");
                String hour = rs.getString("Hour");
                data.add(new Course(courseId, cityFrom, cityTo, date, hour));
            }
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return data;
    }
    
    public boolean insertIntoTickets(int accountId, int courseId)
    {
        String sql = "INSERT INTO Tickets (AccountId, CourseId) VALUES (?,?)";
        try
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, accountId);
            pstmt.setInt(2, courseId);
            int result = pstmt.executeUpdate();
            System.out.println(result + " Rows inserted");
            return true;

        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public ArrayList<TicketExtendet> selectAllCoursesForAccount()
    {
        ArrayList<TicketExtendet> data = new ArrayList();
        String sql = "SELECT T.TicketId, C.CityFrom, C.CityTo, C.Date, C.Hour "
                + "FROM Courses AS C JOIN Tickets AS T "
                + "ON C.CourseId = T.CourseId "
                + "WHERE T.AccountId = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserInfo.getUserId());
            rs = pstmt.executeQuery();
            
            while (rs.next()){
                int ticketId = rs.getInt("TicketId");
                String cityFrom = rs.getString("CityFrom");
                String cityTo = rs.getString("CityTo");
                String date = rs.getString("Date");
                String hour = rs.getString("Hour");
                data.add(new TicketExtendet(ticketId, cityFrom, cityTo, date, hour));
            }
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return data;
    }
    
    public void deleteTicketFromAccount(int ticketId) {
         String sql = "DELETE FROM Tickets " +
                        "WHERE TicketId = ?";
         System.out.println(sql);
         
         try {
             PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setInt(1, ticketId);
             int result = stmt.executeUpdate();
             
             System.out.println(result + " Rows deleted");
             //stmt.setString(1, value);
             
         } catch(SQLException e) {
             System.out.println(e.getMessage());
         }
    }
}
