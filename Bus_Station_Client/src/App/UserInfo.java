package App;

public final class UserInfo {
    private static String username;
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String password;
    
    public static String getUsername() {
        return username;
    }    
    
    public static void setUsername(String value) {
        username = value;
    }
    
    public static String getFirstName(){
        return firstName;
    }
    
    public static void setFirstName(String value) {
        firstName = value;
    }
    
    public static String getLastName(){
        return lastName;
    }
    
    public static void setLastName(String value) {
        lastName = value;
    }
    
    public static String getEmail(){
        return email;
    }
    
    public static void setEmail(String value) {
        email = value;
    }
   
    public static String getPassword() {
        return password;
    }
    
    public static void setPassword(String value) {
        password = value;
    }
}
