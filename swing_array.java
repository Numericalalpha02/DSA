import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_array extends JFrame {
    private JTextField arrayInputField;
    private JTextField elementField;
    private JTextArea resultArea;
    private JButton insertButton;

    private int[] arr = new int[100];
    private int size = 0;

    public swing_array() {
        setTitle("Sorted Array Insert");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter sorted array (comma-separated):"));
        arrayInputField = new JTextField(30);
        add(arrayInputField);

        add(new JLabel("Element to insert:"));
        elementField = new JTextField(10);
        add(elementField);

        insertButton = new JButton("Insert Element");
        add(insertButton);

        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertElement();
            }
        });
    }

    private void insertElement() {
        try {
            // Parse array input
            String[] inputStrings = arrayInputField.getText().split(",");
            size = inputStrings.length;

            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(inputStrings[i].trim());
            }

            int key = Integer.parseInt(elementField.getText().trim());

            // Sorted insert logic
            if (size >= arr.length) {
                resultArea.setText("Array is full. Cannot insert.");
                return;
            }

            int i;
            for (i = size - 1; (i >= 0 && arr[i] > key); i--) {
                arr[i + 1] = arr[i];
            }
            arr[i + 1] = key;
            size++;

            // Display updated array
            StringBuilder result = new StringBuilder("Array after insertion:\n");
            for (int j = 0; j < size; j++) {
                result.append(arr[j]).append(" ");
            }
            resultArea.setText(result.toString());

        } catch (Exception ex) {
            resultArea.setText("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new swing_array().setVisible(true);
        });
    }
}
