import javax.swing.*;
import java.awt.*;

public class Account extends JMenuItem {
    // add hover and click listeners add connection with jdbc
    // dy joption nqs je loged inn in ose jo
    // boolean value if you are logen in or not, plus jdbc
    private boolean logged = false;

    public Account(){
        super("Account");
        initializeElements();
    }

    public void initializeElements() {
        JTextField username = new JTextField(16);
        JTextField password = new JPasswordField(16);
        JButton logBtn = new JButton("Log In");
        JButton regBtn = new JButton("Register");
        Object[] message = {
                "Username:", username,
                "Password:", password,
                //logBtn, regBtn
        };



        addActionListener(
                e -> {
                    int option = Integer.parseInt(JOptionPane.showInputDialog(null, message));
                    if (option == JOptionPane.OK_OPTION) {
                        if (username.getText().equals("h") && password.getText().equals("h")) {
                            System.out.println("Login successful"); //joption pane message
                        } else {
                            System.out.println("login failed");
                        }
                    } else {
                        System.out.println("Login canceled");
                    }


                });
    }
}
