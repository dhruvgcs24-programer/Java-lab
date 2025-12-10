
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Create components
        JLabel label1 = new JLabel("Num1:");
        JTextField textNum1 = new JTextField();

        JLabel label2 = new JLabel("Num2:");
        JTextField textNum2 = new JTextField();

        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false);

        JButton btnDivide = new JButton("Divide");

        // Button action
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textNum1.getText());
                    int num2 = Integer.parseInt(textNum2.getText());

                    int result = num1 / num2;  // may throw ArithmeticException

                    textResult.setText(Integer.toString(result));

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                        frame,
                        "Please enter valid integers!",
                        "Number Format Error",
                        JOptionPane.ERROR_MESSAGE
                    );

                } catch (ArithmeticException ae) {
                    JOptionPane.showMessageDialog(
                        frame,
                        "Division by zero is not allowed!",
                        "Arithmetic Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(textNum1);
        frame.add(label2);
        frame.add(textNum2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(btnDivide);

        // display
        frame.setVisible(true);
    }
}


