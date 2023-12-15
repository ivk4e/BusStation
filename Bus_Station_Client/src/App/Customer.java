package App;

public class Customer {
    private int customerId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    
    public Customer() {
        
    }
    
    public Customer(int customerId, String userName, String password, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public Customer(String userName, String password, String firstName, String lastName, String email) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
//    Properties
    public int getCustomerId() {
        return customerId;
    }
    
    public String getUsername() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
}
