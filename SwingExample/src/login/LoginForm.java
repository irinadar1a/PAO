package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginForm {

    private static JFrame loginFrame;
    private static JLabel usernameLabel, message;
    private static JTextField usernameInput;
    private static JLabel passwordLabel;
    private static JPasswordField passwordInput;
    private static JButton loginButton;

    public static void main(String[] args){
        loginFrame = new JFrame("Login window");
        loginFrame.setSize(300, 200);

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(10, 20, 100, 40);
        loginFrame.add(usernameLabel);
        usernameInput = new JTextField();
        usernameInput.setBounds(100, 20, 100, 30);
        loginFrame.add(usernameInput);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 60, 100, 40);
        loginFrame.add(passwordLabel);
        passwordInput = new JPasswordField();
        passwordInput.setBounds(100, 60, 100, 30);
        loginFrame.add(passwordInput);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 110, 100, 40);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameInput.getText().equals("irina")& Arrays.equals(passwordInput.getPassword(), "pass".toCharArray())){
                    message.setText("Hello Irina!");
                } else{
                    message.setText("wrong credentials");
                }
            }
        });
        loginFrame.add(loginButton);

        message = new JLabel();
        message.setBounds(130, 110, 150, 40);
        loginFrame.add(message);

        //close operation
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //to view the frame
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
    }



}
