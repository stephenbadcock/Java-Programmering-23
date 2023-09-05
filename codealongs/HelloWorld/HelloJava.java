import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java!");
        frame.setSize(500, 500);
        JLabel label = new JLabel("Hej allihop!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
