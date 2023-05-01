import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tipspage extends JFrame {
    JButton UnderweightButton,OverweightButton;
    Container cont;
    JLabel container;
    JLabel message1;
    JLabel message2;
    JLabel message3;
    JLabel message4;

    public Tipspage() {
        cont = getContentPane();
        cont.setLayout(null);

        ImageIcon imm = new ImageIcon(getClass().getResource("back.jpg"));
        container = new JLabel(imm);
        container.setBounds(0,0,500,515);
        cont.add(container);

        message1 = new JLabel("Are you Underweight?");
        message1.setFont(new Font("Courier", Font.BOLD, 30));
        message1.setForeground(Color.WHITE);

        message2 = new JLabel("Well here are some tips");
        message2.setFont(new Font("Courier", Font.BOLD, 30));
        message2.setForeground(Color.WHITE);

        message3 = new JLabel("Are you Overweight?");
        message3.setFont(new Font("Courier", Font.BOLD, 30));
        message3.setForeground(Color.WHITE);

        message4 = new JLabel("Well here are some tips");
        message4.setFont(new Font("Courier", Font.BOLD, 30));
        message4.setForeground(Color.WHITE);

        UnderweightButton = new JButton("Underweight");
        UnderweightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Underweight();
                setVisible(false);
            }
        });

        OverweightButton = new JButton("Overweight");
        OverweightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new OverweightTips();
                setVisible(false);
            }
        });



        setBounds();
        addComponents();

        setTitle("TipwayPortal");
        setVisible(true);
        setBounds(500, 100, 500, 515);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }

    public void setBounds() {

        message1.setBounds(60, 100, 600, 30);
        message2.setBounds(60, 140, 600, 30);
        message3.setBounds(60, 240, 600, 30);
        message4.setBounds(60, 280, 600, 30);
        UnderweightButton.setBounds(130, 190, 200, 30);
        OverweightButton.setBounds(130, 330, 200, 30);

    }

    public void addComponents() {
        container.add(message1);
        container.add(message2);
        container.add(message3);
        container.add(message4);
        container.add(UnderweightButton);
        container.add(OverweightButton);
    }

    public static void main(String[] args) {
        new Tipspage();
    }

}