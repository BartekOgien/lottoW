package com.lottoW.Generators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public static final int MAX_RANDOM_NUMBER = 49;
    public static final int NUMBER_OF_BALLS = 6;

    public List<Integer> generateNumbersList() {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < MAX_RANDOM_NUMBER; i++) {
            randomNumbers.add(i + 1);
        }
        return randomNumbers;
    }

    public List<Integer> generateDrawNumbers() {
        List<Integer> numbersList = generateNumbersList();
        List<Integer> drawNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<NUMBER_OF_BALLS; i++) {
            int tempRandom = random.nextInt(MAX_RANDOM_NUMBER - i);
            drawNumbers.add(numbersList.get(tempRandom));
            numbersList.remove(tempRandom);
        }
        Collections.sort(drawNumbers);
        return drawNumbers;
    }
}
