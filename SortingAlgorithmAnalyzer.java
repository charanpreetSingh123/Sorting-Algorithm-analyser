import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmAnalyzer extends JFrame {

    private JComboBox<Integer> sizeDropdown;
    private JTextPane outputArea;
    private int[] originalArray;

    public SortingAlgorithmAnalyzer() {
        setTitle("Sorting Algorithm Performance Analyzer");
        setSize(650, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(12, 12));

        // Set overall background color
        getContentPane().setBackground(new Color(30, 30, 40));

        initUI();
    }

    private void initUI() {
        // Top Panel (North) with dark background
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(45, 45, 60));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 12));

        JLabel label = new JLabel("Select Array Size:");
        label.setForeground(new Color(220, 220, 220));
        label.setFont(new Font("Segoe UI", Font.BOLD, 16));
        topPanel.add(label);

        Integer[] sizes = {10, 20, 50, 100};
        sizeDropdown = new JComboBox<>(sizes);
        sizeDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        sizeDropdown.setBackground(new Color(60, 60, 80));
        sizeDropdown.setForeground(Color.WHITE);
        topPanel.add(sizeDropdown);

        JButton generateButton = new JButton("Generate Array");
        styleButton(generateButton);
        generateButton.addActionListener(e -> generateArray());
        topPanel.add(generateButton);

        add(topPanel, BorderLayout.NORTH);

        // Center Panel: JTextPane for rich text output
        outputArea = new JTextPane();
        outputArea.setEditable(false);
        outputArea.setBackground(new Color(25, 25, 35));
        outputArea.setForeground(Color.WHITE);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        outputArea.setBorder(new LineBorder(new Color(80, 80, 110), 2));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        // Bottom Panel (Grid layout)
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(45, 45, 60));
        bottomPanel.setLayout(new GridLayout(2, 2, 15, 15));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JButton bubbleButton = new JButton("Bubble Sort");
        styleButton(bubbleButton);
        bubbleButton.addActionListener(e -> sortAndDisplay("Bubble"));
        bottomPanel.add(bubbleButton);

        JButton insertionButton = new JButton("Insertion Sort");
        styleButton(insertionButton);
        insertionButton.addActionListener(e -> sortAndDisplay("Insertion"));
        bottomPanel.add(insertionButton);

        JButton selectionButton = new JButton("Selection Sort");
        styleButton(selectionButton);
        selectionButton.addActionListener(e -> sortAndDisplay("Selection"));
        bottomPanel.add(selectionButton);

        JButton javaSortButton = new JButton("Java Arrays.sort()");
        styleButton(javaSortButton);
        javaSortButton.addActionListener(e -> sortAndDisplay("Java"));
        bottomPanel.add(javaSortButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void styleButton(JButton btn) {
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setBackground(new Color(70, 130, 180));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(new Color(30, 60, 90), 2));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Hover effect
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(new Color(100, 160, 210));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(new Color(70, 130, 180));
            }
        });
    }

    private void generateArray() {
        int size = (int) sizeDropdown.getSelectedItem();
        originalArray = generateRandomArray(size);
        outputArea.setText("");
        appendToPane(outputArea, "Generated Array (Size: " + size + ")\n", new Color(100, 255, 150), true);
        appendToPane(outputArea, Arrays.toString(originalArray) + "\n\n", Color.WHITE, false);
    }

    private void sortAndDisplay(String method) {
        if (originalArray == null) {
            outputArea.setText("");
            appendToPane(outputArea, "Please generate an array first.\n", Color.RED, true);
            return;
        }

        int[] arr = Arrays.copyOf(originalArray, originalArray.length);
        long start = System.nanoTime();

        switch (method) {
            case "Bubble" -> bubbleSort(arr);
            case "Insertion" -> insertionSort(arr);
            case "Selection" -> selectionSort(arr);
            case "Java" -> Arrays.sort(arr);
        }

        long end = System.nanoTime();
        long duration = end - start;

        appendToPane(outputArea, method + " Sort Time: " + duration + " ns\n", new Color(135, 206, 250), true);
        appendToPane(outputArea, "Sorted Array:\n", new Color(255, 215, 0), true);
        appendToPane(outputArea, Arrays.toString(arr) + "\n\n", Color.WHITE, false);
    }

    // Utility to append colored text to JTextPane
    private void appendToPane(JTextPane tp, String msg, Color c, boolean bold) {
        StyledDocument doc = tp.getStyledDocument();

        Style style = tp.addStyle("ColorStyle", null);
        StyleConstants.setForeground(style, c);
        StyleConstants.setBold(style, bold);
        try {
            doc.insertString(doc.getLength(), msg, style);
            tp.setCaretPosition(doc.getLength());
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    // Sorting Algorithms
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SortingAlgorithmAnalyzer gui = new SortingAlgorithmAnalyzer();
            gui.setVisible(true);
        });
    }
}