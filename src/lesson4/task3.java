package lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 5, 2};
        List<Integer> list = Arrays.asList(array);
        shuffle(list);
        System.out.println(list);

    }

    private static void shuffle(List<Integer> list) {
        Collections.shuffle(list);
    }
}