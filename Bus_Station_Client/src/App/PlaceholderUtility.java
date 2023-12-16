package App;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public final class PlaceholderUtility {
    
    public static void removePlaceholder(JTextField textField, String USERNAME)
    {
        if(textField.getText().equals(USERNAME))
        {
            textField.setText("");
        }
    }
        
    public static void removePlaceholder(JPasswordField passwordField,String PASSWORD)
    {
        if(String.valueOf(passwordField.getPassword()).equals(PASSWORD))
        {
            
            passwordField.setText("");
        }
    }
    
    public static void restorePlaceholder(JTextField textField,String USERNAME)
    {
        if(textField.getText().trim().length() == 0)
        {
            textField.setText(String.valueOf(USERNAME));
        }
    }
    
    public static void restorePlaceholder(JPasswordField passwordField,String PASSWORD)
    {
        if(passwordField.getPassword().length == 0)
        {
            passwordField.setText(String.valueOf(PASSWORD));
        }
    }
    
    public static void moveCaretPositionToFront(JTextField textField,String USERNAME)
    {
        if(textField.getText().equals(USERNAME))
        {
            textField.setCaretPosition(0);
        }
    }
    
    public static void moveCaretPositionToFront(JPasswordField passwordField,String PASSWORD)
    {
        if(String.valueOf(passwordField.getPassword()).equals(PASSWORD))
        {
            passwordField.setCaretPosition(0);
        }
    }
}