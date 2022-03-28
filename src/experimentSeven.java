import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class experimentSeven {

    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);
        JFrame frame = new JFrame("Tanay 1955991593");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);

        JButton button = new JButton("Display Image");
        frame.add(button);

        class Listener extends JPanel implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                var icon = new ImageIcon("D:\\Codes\\Advance Java File\\src\\java-logo.png");
                JLabel label = new JLabel(icon);
                frame.add(label);
                frame.pack();
                frame.setSize(600, 400);
                System.out.println("Image Added");
            }
        }

        button.addActionListener(new Listener());
    }
}
