import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main implements ChangeListener {
    JSlider s = new JSlider(JSlider.HORIZONTAL, 5 ,100, 50);
    Font f = new Font("calibri", Font.ITALIC, s.getValue());
    JLabel label = new JLabel();

    public Main() {
        JFrame frame = new JFrame("Надпись");
        frame.setSize(800,200);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        s.setMajorTickSpacing(10);
        s.setPaintTrack(true);
        s.setPaintLabels(true);
        s.addChangeListener(this);

        label.setFont(f);
        label.setHorizontalAlignment(JLabel.CENTER);

        label.setText("Первая надпись");
        frame.setLayout(new BorderLayout());
        frame.add(label, "Center");
        frame.add(s, "South");

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        f = new Font("calibri", Font.ITALIC, s.getValue());
        label.setFont(f);
        label.setText("Первая надпись");
    }
}
