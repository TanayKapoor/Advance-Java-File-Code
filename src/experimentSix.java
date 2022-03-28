import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class experimentSix {
    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);
        JFrame frame = new JFrame("Tanay 1955991593");
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        frame.setVisible(true);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton red = new JButton("RED");
        JButton blue = new JButton("BLUE");

        class Listener extends JPanel implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                Color color;
                if (event.getSource() == red) {
                    color = Color.red;
                } else {
                    color = Color.blue;
                }
                frame.getContentPane().setBackground(color);
                System.out.println(color);
            }
        }
        red.addActionListener(new Listener());
        blue.addActionListener(new Listener());

        frame.add(red);
        frame.add(blue);
    }
}