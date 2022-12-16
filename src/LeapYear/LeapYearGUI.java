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

    //check if tfleapyear is leap year or not
public LeapYearGUI() {
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText().strip());
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not Leap a Year");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not Leap a Year");
            }
        });
    }



}


