package com.lottoW.Frames;

import javax.swing.*;

public class Frame {

    private JFrame lottoFrame;

    public Frame() {
        lottoFrame = new JFrame("Lotto");
        lottoFrame.setSize(600, 540);
        lottoFrame.setLayout(null);
        lottoFrame.setVisible(true);
    }

    public JFrame getLottoFrame() {
        return lottoFrame;
    }
}
