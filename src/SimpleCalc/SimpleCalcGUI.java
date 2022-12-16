package SimpleCalc;

import javax.swing.*;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setContentPane(new SimpleCalcGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setVisible(true);
    }

    public SimpleCalcGUI() {
        btnCompute.addActionListener(e -> {
            displayResult();
        });
    }
    public void displayResult() {
        try {
        int num1 = Integer.parseInt(tfNumber1.getText().strip());
        int num2 = Integer.parseInt(tfNumber2.getText().strip());
        int result = 0;
        String operation = Objects.requireNonNull(cbOperations.getSelectedItem()).toString();

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        lblResult.setText(String.valueOf(result));}
        catch (Exception e) {
            lblResult.setText("Error!");
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        }
    }

}
