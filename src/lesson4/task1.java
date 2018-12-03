package lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }
}