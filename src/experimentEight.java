import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class experimentEight extends JFrame implements ActionListener {
    static JMenuBar mb;
    static JMenu x, x1;
    static JMenuItem m1, m2, m3, s1, s2;
    static JFrame f;
    static JLabel l;

    public static void main(String[] args) {
        experimentEight m = new experimentEight();
        f = new JFrame("Experiment Eight");
        l = new JLabel("Tanay 1955991593");
        mb = new JMenuBar();

        x = new JMenu("Menu");
        x1 = new JMenu("submenu");

        m1 = new JMenuItem("MenuItem1");
        m2 = new JMenuItem("MenuItem2");
        m3 = new JMenuItem("MenuItem3");
        s1 = new JMenuItem("SubMenuItem1");
        s2 = new JMenuItem("SubMenuItem2");

        m1.addActionListener(m);
        m2.addActionListener(m);
        m3.addActionListener(m);
        s1.addActionListener(m);
        s2.addActionListener(m);

        x.add(m1);
        x.add(m2);
        x.add(m3);
        x1.add(s1);
        x1.add(s2);

        x.add(x1);

        mb.add(x);

        f.setJMenuBar(mb);

        f.add(l);

        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        l.setText(s + " selected");
    }
}
