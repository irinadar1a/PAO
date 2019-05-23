package convertor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FahrenheitConverter {
    private static JFrame converterFrame;
    private static JTextField celsiusDegrees;
    private static JLabel celsiusLabel;
    private static JButton convertButton;
    private static JLabel fahrenheitConversionValue;

    public static void main(String[] args){
        converterFrame = new JFrame("Fahrenheit Converter");
        converterFrame.setSize(400, 300);

        convertButton = new JButton("convert to Fahrenheit");
        convertButton.setBounds(100, 100, 200, 40);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = celsiusDegrees.getText();
                double celsius = Double.parseDouble(text);
                double fahrenheit = celsius * 1.8 + 32;
                fahrenheitConversionValue.setText(fahrenheit + " Fahrenheit");
            }
        });
        converterFrame.add(convertButton);

        celsiusLabel = new JLabel("Insert Celsius degrees");
        celsiusLabel.setBounds(50, 50, 150, 40);
        converterFrame.add(celsiusLabel);

        celsiusDegrees = new JTextField();
        celsiusDegrees.setBounds(220, 50, 80, 40);
        converterFrame.add(celsiusDegrees);

        fahrenheitConversionValue = new JLabel("Conversion");
        fahrenheitConversionValue.setBounds(150, 150, 200, 40);
        converterFrame.add(fahrenheitConversionValue);

        //close operation
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //to view the frame
        converterFrame.setLayout(null);
        converterFrame.setVisible(true);
    }

}
