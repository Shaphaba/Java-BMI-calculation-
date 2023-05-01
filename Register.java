import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Register extends JFrame {
    JLabel message;
    JLabel nameLabel, genderLabel;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    JLabel mailIdLabel, mobileNoLabel;
    JTextField mailIdField, mobileNoField;

    JLabel lifestyleLabel;
    JComboBox<String> lifestyleList;

    JButton registerButton;
    Container cont;
    JLabel container;

    public Register() {
        cont = getContentPane();
        cont.setLayout(null);

        ImageIcon imm = new ImageIcon(getClass().getResource("back.jpg"));
        container = new JLabel(imm);
        container.setBounds(0,0,500,515);
        cont.add(container);

        message = new JLabel("Enter your Details");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        message.setForeground(Color.WHITE);

        nameLabel = new JLabel("Name");
        nameLabel.setForeground(Color.WHITE);
        nameField = new JTextField();
        nameField.setBackground(Color.GRAY);

        genderLabel = new JLabel("Gender");
        genderLabel.setForeground(Color.WHITE);
        genderMale = new JRadioButton("Male");
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);


        mailIdLabel = new JLabel("Mail Id");
        mailIdLabel.setForeground(Color.WHITE);
        mailIdLabel.setForeground(Color.WHITE);
        mailIdField = new JTextField();
        mailIdField.setBackground(Color.GRAY);

        mobileNoLabel = new JLabel("Mobile No");
        mobileNoLabel.setForeground(Color.WHITE);
        mobileNoField = new JTextField();
        mobileNoField.setBackground(Color.GRAY);

        lifestyleLabel = new JLabel("Lifestyle");
        lifestyleLabel.setForeground(Color.WHITE);
        lifestyleList = new JComboBox<String>();
        lifestyleList.setForeground(Color.GRAY);
        lifestyleList.addItem("Labourer");
        lifestyleList.addItem("Student");
        lifestyleList.addItem("Employee");

        registerButton = new JButton("Register");
        registerButton.setBackground(Color.GRAY);
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Calculator();
                setVisible(false);
            }
        });


        setBounds();
        addComponents();


        setTitle("Registration Box");
        setVisible(true);
        setBounds(500, 100, 500, 515);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }

    public void setBounds() {
        message.setBounds(150, 10, 600, 30);

        nameLabel.setBounds(70, 60, 100, 30);
        nameField.setBounds(150, 60, 200, 30);

        genderLabel.setBounds(70, 120, 100, 30);
        genderMale.setBounds(150, 120, 100, 30);
        genderFemale.setBounds(150, 145, 100, 30);

        mailIdLabel.setBounds(70, 183, 100, 30);
        mailIdField.setBounds(150, 183, 200, 30);

        mobileNoLabel.setBounds(70, 240, 100, 30);
        mobileNoField.setBounds(150, 240, 200, 30);

        lifestyleLabel.setBounds(70, 300, 100, 30);
        lifestyleList.setBounds(150, 300, 200, 30);

        registerButton.setBounds(150, 360, 200, 30);

    }

    public void addComponents() {
        container.add(message);
        container.add(nameLabel);
        container.add(nameField);

        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);

        container.add(mailIdLabel);
        container.add(mailIdField);

        container.add(mobileNoLabel);
        container.add(mobileNoField);

        container.add(lifestyleLabel);
        container.add(lifestyleList);

        container.add(registerButton);
    }
    public static void main(String[] args) {
        new Register();
    }
}
