import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class PizzaOrder extends JFrame {

    private JLabel sizeLabel, requestLabel;
    private JPanel northPanel, centerPanel, eastPanel, eastPanel2, southPanel;
    private JRadioButton smallButton, mediumButton, largeButton;
    private JButton orderButton, clearButton, doughButton;
    private ButtonGroup sizeGroup;
    private JTextArea requestArea;
    private JComboBox toppingBox;

    public PizzaOrder() { // BEGIN CONSTRUCTOR
        super("Pizza Order");
        String toppingList [] = {"Pepperoni", "Sausage", "Veggie"};
        toppingBox = new JComboBox(toppingList);
        northPanel = new JPanel();
        northPanel.add(toppingBox);
        add(northPanel, BorderLayout.NORTH);


        sizeLabel = new JLabel("Size:");
        smallButton = new JRadioButton("Small");
        mediumButton = new JRadioButton("Medium");
        largeButton = new JRadioButton("Large");
        sizeGroup = new ButtonGroup();
        sizeGroup.add(smallButton);
        sizeGroup.add(mediumButton);
        sizeGroup.add(largeButton);
        centerPanel = new JPanel();
        centerPanel.add(sizeLabel);
        centerPanel.add(smallButton);
        centerPanel.add(mediumButton);
        centerPanel.add(largeButton);
        add(centerPanel, BorderLayout.CENTER);
        
      requestLabel = new JLabel("Special Requests:");
      requestArea = new JTextArea(5, 10);
      eastPanel = new JPanel();
      eastPanel.add(requestLabel, BorderLayout.NORTH);
      eastPanel.add(requestArea, BorderLayout.CENTER);
      eastPanel2 = new JPanel();
      eastPanel2.add(eastPanel);
      add(eastPanel2, BorderLayout.EAST);

        orderButton = new JButton("Order");
        clearButton = new JButton("Clear");
        doughButton = new JButton("Stocking Pizza Dough");
        southPanel = new JPanel();
        southPanel.add(orderButton);
        southPanel.add(clearButton);
        southPanel.add(doughButton);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } //END OF CONSTRUCTOR

    public static void main(String[] args) {
        PizzaOrder app = new PizzaOrder();//EXECUTE DeliveryService
    } //END OF MAIN METHOD

} //END OF CLASS