package com.lottoW.Generators;

import javax.swing.*;

public class LabelGenerator {

    public JLabel createLabel(String labelName, int x, int y) {
        JLabel label = new JLabel(labelName);
        label.setBounds(x, y, 200, 40);
        return label;
    }

}
