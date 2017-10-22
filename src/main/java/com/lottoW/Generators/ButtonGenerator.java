package com.lottoW.Generators;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ButtonGenerator {
    private List<JButton> buttonList = new ArrayList<>();

    public ButtonGenerator() {
        for (int i=1; i<=49; i++) {
            buttonList.add(createButton(String.valueOf(i),i*20, i*25));
        }
    }

    public JButton createButton(String button, int x, int y) {
        JButton jButton = new JButton(button);
        jButton.setBounds(x, y, 50, 30);
        return jButton;
    }

    public List<JButton> getButtonList() {
        return buttonList;
    }
}
