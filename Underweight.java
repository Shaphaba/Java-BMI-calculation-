import java.awt.*;
import javax.swing.*;

public class Underweight extends JFrame {
    Container cont;
    JLabel container;
    JLabel message1;
    JLabel message2;
    JLabel message3;
    JLabel message4;

    public Underweight() {
        cont = getContentPane();
        cont.setLayout(null);

        ImageIcon imm = new ImageIcon(getClass().getResource("back.jpg"));
        container = new JLabel(imm);
        container.setBounds(0,0,500,515);
        cont.add(container);

        message1 = new JLabel("Be in Calorie Surplus");
        message1.setFont(new Font("Courier",Font.BOLD, 30));
        message1.setForeground(Color.WHITE);

        message2 = new JLabel("Start lifting Weights");
        message2.setFont(new Font("Courier", Font.BOLD, 30));
        message2.setForeground(Color.WHITE);

        message3 = new JLabel("Eat atleast six meals a day");
        message3.setFont(new Font("Courier", Font.BOLD, 30));
        message3.setForeground(Color.WHITE);


        message4 = new JLabel("Well here are some tips");
        message4.setFont(new Font("Courier", Font.BOLD, 30));
        message4.setForeground(Color.WHITE);

        setBounds();
        addComponents();

        setTitle("Underweight");
        setVisible(true);
        setBounds(500, 100, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }

    public void setBounds() {

        message1.setBounds(50, 100, 600, 30);
        message2.setBounds(50, 150, 600, 30);
        message3.setBounds(50, 205, 600, 30);
        message4.setBounds(50, 250, 600, 30);

    }

    public void addComponents() {
        container.add(message1);
        container.add(message2);
        container.add(message3);
        container.add(message4);
    }

    public static void main(String[] args) {
        new Underweight();
    }

}