package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FoodOrderGUI");
        frame.setContentPane(new FoodOrderGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }

    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order();
            }
        });
    }
    public void order(){
        //paranoid mode here
        try {

            double total = 0;
            int discount = 0;

            if (cPizza.isSelected()) {
                total += 100;
            }
            if (cBurger.isSelected()) {
                total += 80;
            }
            if (cFries.isSelected()) {
                total += 65;
            }
            if (cSoftDrinks.isSelected()) {
                total += 55;
            }
            if (cTea.isSelected()) {
                total += 50;
            }
            if (cSundae.isSelected()) {
                total += 40;
            }

            if (rb5.isSelected()) {
                discount += 5;
            }
            if (rb10.isSelected()) {
                discount += 10;
            }
            if (rb15.isSelected()) {
                discount += 15;
            }
            total -= total * discount / 100;
            JOptionPane.showMessageDialog(null, String.format("Total price is Php %.2f", total));}
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error encountered!");
        }
    }
}
