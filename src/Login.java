import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel usernameLabel, passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, registerButton;

    public Login() {
        // Set frame properties
        setTitle("Club Management Login");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton);

        // Add action listeners to the buttons
        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // TODO: Validate login credentials and grant access to the application
        } else if (e.getSource() == registerButton) {
            // TODO: Open registration page for new users
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}
