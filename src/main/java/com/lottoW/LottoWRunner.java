package com.lottoW;


import com.lottoW.Frames.Frame;
import com.lottoW.Frames.LottoRun;

public class LottoWRunner {


    public static void main(String[] args) {

        Frame frame = new Frame();
        LottoRun lottoRun = new LottoRun(frame.getLottoFrame());
        lottoRun.runLotto();
    }
}
