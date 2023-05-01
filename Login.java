import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JLabel l1;
    JLabel l2;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1;

    Login() {
        this.setTitle("BMI Calculation - Login");
        this.setBounds(500, 200, 350, 200);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setLayout((LayoutManager) null);
        this.l1 = new JLabel("Username:");
        this.l1.setBounds(50, 30, 100, 30);
        this.add(this.l1);
        this.tf1 = new JTextField();
        this.tf1.setBounds(150, 30, 150, 30);
        this.add(this.tf1);
        this.l2 = new JLabel("Password:");
        this.l2.setBounds(50, 70, 100, 30);
        this.add(this.l2);
        this.pf1 = new JPasswordField();
        this.pf1.setBounds(150, 70, 150, 30);
        this.add(this.pf1);
        this.b1 = new JButton("Login");
        this.b1.setBounds(120, 120, 100, 30);
        this.b1.addActionListener(this);
        this.add(this.b1);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String uname = this.tf1.getText();
        String pass = new String(this.pf1.getPassword());
        if (uname.equals("admin") && pass.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            new BMICalculator();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
            this.tf1.setText("");
            this.pf1.setText("");
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}