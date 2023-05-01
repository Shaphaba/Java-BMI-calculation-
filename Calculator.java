import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculator extends JFrame {
    Calculator() {

        Container conn = getContentPane();
        conn.setLayout(null);

        JLabel label = new JLabel("BMI CALCULATOR");
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label.setBounds(50, 20, 300, 30);
        add(label);

        JLabel age = new JLabel("Age");
        age.setFont(new Font("Times New Roman", Font.BOLD, 18));
        age.setBounds(50, 70, 100, 30);
        add(age);

        JTextField agefield = new JTextField();
        agefield.setBounds(150, 70, 200, 30);
        add(agefield);


        JLabel height = new JLabel("Height");
        height.setFont(new Font("Times New Roman", Font.BOLD, 18));
        height.setBounds(50, 140, 100, 30);
        add(height);

        JTextField hField = new JTextField();
        hField.setBounds(150, 140, 200, 30);
        add(hField);

        JLabel weight = new JLabel("Weight");
        weight.setFont(new Font("Times New Roman", Font.BOLD, 18));
        weight.setBounds(50, 210, 100, 30);
        add(weight);

        JTextField wfield = new JTextField();
        wfield.setBounds(150, 210, 200, 30);
        add(wfield);

        JButton b = new JButton("Submit");
        b.setBounds(90, 260, 200, 30);
        add(b);

        JButton c = new JButton("Tips");
        c.setBounds(480, 320, 100, 30);
        add(c);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Tipspage();
                setVisible(false);
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 100, 182, 100));
        panel.setLocation(360, 50);
        panel.setSize(200, 70);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.black));
        add(panel);
        panel.setVisible(false);

        JLabel bmi = new JLabel();
        bmi.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bmi.setBounds(20, 20, 200, 30);
        panel.add(bmi);

        ImageIcon Yuo = new ImageIcon(getClass().getResource("Cal.jpg"));
        JLabel ime = new JLabel(Yuo);
        ime.setBounds(0,0,600,400);
        add(ime);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double h = Double.parseDouble(hField.getText());
                double w = Double.parseDouble(wfield.getText());
                System.out.println(h);
                double b = w / (h * h);
                if(b<18){
                    bmi.setText(b+"");
                    bmi.setText(" Underweight\n");
                    panel.setVisible(true);
                } else if (b>24) {
                    bmi.setText(b+"");
                    bmi.setText(" Obese\n");
                    panel.setVisible(true);
                }
                else{
                    bmi.setText(b+"");
                    bmi.setText("Normal\n");
                    panel.setVisible(true);
                }
            }
        });
        setTitle("Calculator");
        setLayout(null);
        setLocation(300, 150);
        setSize(600, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}