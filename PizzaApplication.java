import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.FlowLayout.*;

public class PizzaApplication extends JFrame {
    private double total_price = 0.00;
    private boolean topping_selected = false;

    public PizzaApplication() {
        //Basic functions/set up for main application
        setTitle("BigY Pizza Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        //No need to set the size because at the end we will pack all the GUI elements.

        //The following code handles the text labels, boxes, buttons and checks
        JLabel header_label = new JLabel("Welcome to BigY's Pizza Application");
        header_label.setForeground(new Color(0xFF1786C9, true));
        header_label.setFont(new Font("Verdana", Font.BOLD, 28));
        add(header_label);

        JLabel sizeLabel = new JLabel("Choose the Size Of Your Pizza:");
        sizeLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        sizeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(sizeLabel);

        JComboBox<String> pizza_size_box = new JComboBox<>(new String[]{"Small", "Medium", "Large", "Extra Large"});
        pizza_size_box.setAlignmentX(Component.LEFT_ALIGNMENT);
        pizza_size_box.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(pizza_size_box);

        JLabel toppings_text_label = new JLabel("Choose your Desired Toppings:");
        toppings_text_label.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(toppings_text_label);

        JCheckBox cheese = new JCheckBox("Cheese");
        add(cheese);

        JCheckBox mushrooms = new JCheckBox("Mushrooms");
        add(mushrooms);

        JCheckBox pepperoni = new JCheckBox("Pepperoni");
        add(pepperoni);

        JCheckBox chicken = new JCheckBox("Chicken");
        add(chicken);

        JCheckBox onions = new JCheckBox("Onions");
        add(onions);

        JButton calculate = new JButton("Calculate Price");
        add(calculate);

        JButton restart_button = new JButton("Restart");
        add(restart_button);

        JButton order_button = new JButton("Order");
        add(order_button);

        JTextArea result = new JTextArea();
        result.setEditable(false);
        result.setText("$0.00");
        result.setFont(new Font("Verdana", Font.BOLD, 12));
        result.setAlignmentX(Component.LEFT_ALIGNMENT);

        add(result);

        //Text that isn't added until the order button is clicked to thank them for their order
        JLabel final_text = new JLabel("Thank you for ordering with Big Y! Your Pizza Will Be Ready Shortly.");
        final_text.setFont(new Font("Verdana", Font.BOLD, 15));

        //Perfectly sizes the GUI elements
        pack();

        //Function for calculating the price based on select options
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total_price = 0.00;
                topping_selected = false;

                String pizza_size = (String) pizza_size_box.getSelectedItem();
                switch (pizza_size) {
                    case "Small":
                        total_price += 5.00;
                        break;
                    case "Medium":
                        total_price += 8.00;
                        break;
                    case "Large":
                        total_price += 10.00;
                    case "Extra Large":
                        total_price += 11.00;
                        break;
                    case null:
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + pizza_size);
                }

                if (pepperoni.isSelected()) {
                    total_price += 2.00;
                    topping_selected = true;
                }
                if (mushrooms.isSelected()) {
                    total_price += 1.50;
                    topping_selected = true;
                }
                if (onions.isSelected()) {
                    total_price += 1.00;
                    topping_selected = true;
                }
                if(cheese.isSelected()){
                    total_price += 2.50;
                    topping_selected = true;
                }
                if(chicken.isSelected()){
                    total_price += 3.00;
                    topping_selected = true;
                }

                result.setText("Your Total is: $" + total_price);
            }

        });

        //Order function, similar to calculating price however, for creative aspect to thank them for ordering
        order_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total_price = 0.00;
                topping_selected = false;

                String pizza_size = (String) pizza_size_box.getSelectedItem();
                switch (pizza_size) {
                    case "Small":
                        total_price += 5.00;
                        break;
                    case "Medium":
                        total_price += 8.00;
                        break;
                    case "Large":
                        total_price += 10.00;
                    case "Extra Large":
                        total_price += 11.00;
                        break;
                    case null:
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + pizza_size);
                }


                if (pepperoni.isSelected()) {
                    total_price += 2.00;
                    topping_selected = true;
                }

                if (mushrooms.isSelected()) {
                    total_price += 1.50;
                    topping_selected = true;
                }
                if (onions.isSelected()) {
                    total_price += 1.00;
                    topping_selected = true;
                }
                if(cheese.isSelected()){
                    total_price += 2.50;
                    topping_selected = true;
                }
                if(chicken.isSelected()){
                    total_price += 3.00;
                    topping_selected = true;
                }

                if(!topping_selected){
                    result.setText("Please Add A Topping Before Ordering");
                    pack();
                }

                if (topping_selected){
                    result.setText("Your Total is: $" + total_price);
                    add(final_text);
                    pack();
                }

            }
        });

        //Resets the program for re-use
        restart_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizza_size_box.setSelectedIndex(0);
                pepperoni.setSelected(false);
                mushrooms.setSelected(false);
                onions.setSelected(false);
                cheese.setSelected(false);
                chicken.setSelected(false);
                result.setText("$0.00");
                remove(final_text);
                total_price = 0.00;
            }
        });
    }

    //Creates application on startup
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                 new PizzaApplication().setVisible(true);
            }
        });
    }
}
