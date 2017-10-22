package com.lottoW.Generators;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ButtonGenerator {
    private List<JButton> buttonList = new ArrayList<>();

    public ButtonGenerator() {
        int temp = 0;
        int temp1 = 50;
        for (int i=1; i<=49; i++) {
            switch(i) {
                case 7: temp = 30;
                    temp1 = temp1 + 300;
                     break;
                case 13: temp = 60;
                    temp1 = temp1 + 300;
                    break;
                case 19: temp = 90;
                    temp1 = temp1 + 300;
                    break;
                case 25: temp = 120;
                    temp1 = temp1 + 300;
                    break;
                case 31: temp = 150;
                    temp1 = temp1 + 300;
                    break;
                case 37: temp = 180;
                    temp1 = temp1 + 300;
                    break;
                case 43: temp = 210;
                    temp1 = temp1 + 300;
                    break;
                case 49: temp = 240;
                    temp1 = temp1 + 300;
                    break;
            }
            buttonList.add(createButton(String.valueOf(i),20 + i*50-temp1, 30 + temp));
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
