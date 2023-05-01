import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BMICalculator extends JFrame  {
    BMICalculator() {
        ImageIcon img = new ImageIcon(getClass().getResource("Ss.jpg"));
        JLabel im = new JLabel(img);
        im.setBounds(0,0,1200,600);
        add(im);

        JLabel title  = new JLabel("BMI Calculator");
        title.setBounds(500,100,300,30);
        title.setFont(new Font("Times New Roman",Font.BOLD,30));
        im.add(title);

        JButton button = new JButton("GO");
        button.setBounds(500,475,200,50);
        button.setFont(new Font("Times New Roman",Font.BOLD,30));
        button.setBackground(Color.pink);
        im.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Register();

            }
        });
        setTitle("Welcome Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1200, 666);
        setVisible(true);

    }
    public static void main(String[] args){
        new BMICalculator();
    }
}