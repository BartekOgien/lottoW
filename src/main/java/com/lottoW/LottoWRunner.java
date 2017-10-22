package com.lottoW;

import com.lottoW.Generators.ButtonGenerator;

import javax.swing.*;
import java.util.List;

public class LottoWRunner {


    public static void main(String[] args) {

        Frame frame = new Frame();
        JFrame jFrame = frame.getLottoFrame();
        ButtonGenerator buttonGenerator = new ButtonGenerator();
        List<JButton> buttonList = buttonGenerator.getButtonList();
        for(JButton button: buttonList) {
            jFrame.add(button);
        }
    }


}
