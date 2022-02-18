import Forms.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Creating the GARITS system
public class GARITS {
    final public JFrame mainWindow = new JFrame();

    // Methods to return forms

    // LoginAccount
    public LoginAccount loginAccount() {
        // Set up window for login
        LoginAccount l = new LoginAccount();
        mainWindow.setContentPane(l.getMainPanel());
        mainWindow.setSize(500,500);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);

        // Login button
        l.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // New admin page
                AdminPage adminPage = adminPage(l);
            }
        });
        return l;
    }

    // AdminPage
    public AdminPage adminPage(LoginAccount l) {
        // Set up window
        AdminPage a = new AdminPage();
        mainWindow.setContentPane(a.getMainPanel());
        mainWindow.setSize(500,500);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);

        // Logout button
        a.getLogoutButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // New login account page
                LoginAccount loginAccount = loginAccount();
            }
        });
        return a;
    }

    public GARITS() {
        // GARITS Title
        mainWindow.setTitle("GARITS");

        // Create instance of login account form
        LoginAccount loginAccount = loginAccount();
    }

    // Running the GARITS system
    public static void main (String[] args){
        new GARITS();
    }
}
