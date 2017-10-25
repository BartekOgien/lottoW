package com.lottoW.Comparators;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public final class NumberComparator {

    private static final int STREAM_BEGIN = 0;
    private static final int STREAM_END = 6;
    private static final int[] CASH = {0, 0, 24, 175, 4200, 2000000 };

    public long compareNumbers(List<Integer> yourNumbers, Set<Integer> generatedNumbers) {
        return IntStream.range(STREAM_BEGIN, STREAM_END)
                .filter(n -> generatedNumbers.contains(yourNumbers.get(n)))
                .count();
    }

    public String howManyWon(long count) {

        return "You won " + CASH[(int)count] + " zl!!!!!";
    }
}
