package com.iceteaviet.moneyasword.core.support;

import com.google.common.math.IntMath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Chunk number into parts base on split factor.
 *
 * Eg: given 97 132 465 will produce [97, 132, 465] with split factor 1000.
 */
public class NumberChunking {
    private static final Integer CHUNK_SIZE = 3; //Support chunk to 1000
    private static final Integer SPLIT_FACTOR = IntMath.pow(10, CHUNK_SIZE);

    public List<Integer> chunk(Long value) {
        Deque<Integer> result = new ArrayDeque<>();

        while (value > 0) {
            result.addFirst((int) (value % SPLIT_FACTOR));
            value /= SPLIT_FACTOR;
        }

        return new ArrayList<>(result);
    }

    public List<Integer> chunk(Integer value) {
        Deque<Integer> result = new ArrayDeque<>();

        while (value > 0) {
            result.addFirst(value % SPLIT_FACTOR);
            value /= SPLIT_FACTOR;
        }

        return new ArrayList<>(result);
    }
}
