import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
    SwingDemo() {
        // Create a JFrame container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(300, 200);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components
        JLabel jlab = new JLabel("Enter the divider and dividend:");
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);
        JButton button = new JButton("Calculate");

        JLabel err = new JLabel();  // Error label
        JLabel alab = new JLabel(); // A value label
        JLabel blab = new JLabel(); // B value label
        JLabel anslab = new JLabel(); // Answer label

        // Add components to the frame in order
        jfrm.add(jlab);
        jfrm.add(ajtf);
        jfrm.add(bjtf);
        jfrm.add(button);
        jfrm.add(err);
        jfrm.add(alab);
        jfrm.add(blab);
        jfrm.add(anslab);

        // Add action listener for the calculate button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    // Parse the integers from the text fields
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());

                    // Perform the division and display results
                    int ans = a / b;
                    err.setText(""); // Clear error message
                    alab.setText("A = " + a);
                    blab.setText("B = " + b);
                    anslab.setText("Ans = " + ans);
                } catch (NumberFormatException e) {
                    // Handle non-integer input
                    err.setText("Enter only integers!");
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    err.setText("B should be NON-zero!");
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                }
            }
        });

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Create frame on the Event Dispatching Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
