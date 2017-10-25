package com.lottoW.Frames;

import com.lottoW.Generators.ButtonGenerator;
import com.lottoW.Generators.LabelGenerator;
import com.lottoW.Comparators.NumberComparator;
import com.lottoW.Generators.NumberGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class LottoRun extends Component implements ActionListener {
    private JFrame lottoFrame;
    private JLabel labelYourNumbers;
    private JLabel labelText;
    private JLabel labelchoosenNumber;
    private Set<Integer> choosenNumber = new HashSet<>();
    private JButton generateNumbersButton;
    private JButton resetNumbersButton;

    public LottoRun(JFrame lottoFrame) {
        this.lottoFrame = lottoFrame;
    }


    public void runLotto() {
        ButtonGenerator buttonGenerator = new ButtonGenerator();
        List<JButton> buttonList = buttonGenerator.getButtonList();
        for (JButton button : buttonList) {
            button.addActionListener(this);
            lottoFrame.add(button);
        }

        LabelGenerator labelGenerator = new LabelGenerator();
        labelText = labelGenerator.createLabel("Choose six numbers", 100, 0);
        lottoFrame.add(labelText);
        labelYourNumbers = labelGenerator.createLabel("Your choosen numbers:", 380, 80);
        lottoFrame.add(labelYourNumbers);
        labelchoosenNumber = labelGenerator.createLabel("", 380, 100);
        lottoFrame.add(labelchoosenNumber);

        generateNumbersButton = new JButton("Draw numbers");
        generateNumbersButton.setBounds(380, 270, 150, 40);
        lottoFrame.add(generateNumbersButton);
        generateNumbersButton.addActionListener(this);
        resetNumbersButton = new JButton("Reset numbers");
        resetNumbersButton.setBounds(380, 40, 150, 40);
        resetNumbersButton.addActionListener(this);
        lottoFrame.add(resetNumbersButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        try {
            if (e.getSource() == resetNumbersButton) {
                choosenNumber.clear();
                labelchoosenNumber.setText("");
            }
            if (e.getSource() == generateNumbersButton) {

                    NumberGenerator numberGenerator = new NumberGenerator();
                    List<Integer> generatedNumber = numberGenerator.generateDrawNumbers();
                    NumberComparator numberComparator = new NumberComparator();
                    long result = numberComparator.compareNumbers(generatedNumber, choosenNumber);

                try {
                    JOptionPane.showMessageDialog(lottoFrame, "Draw numbers are:  " + generatedNumber + "\n" +
                            "You catch " + result + " from 6 \n" +
                            numberComparator.howManyWon(result));
                } catch (IllegalComponentStateException ei) {

                }
            }
            if (choosenNumber.size() < 6) {
                JButton jbutton = (JButton) e.getSource();
                Integer clickInt = Integer.valueOf(jbutton.getText());
                choosenNumber.add(clickInt);
                labelchoosenNumber.setText(String.valueOf(choosenNumber));
            }
        } catch (NumberFormatException ex) {

        }
    }
}
