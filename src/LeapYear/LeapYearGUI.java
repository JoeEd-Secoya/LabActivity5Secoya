package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setContentPane(new LeapYearGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setVisible(true);
    }

}


