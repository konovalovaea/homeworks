package lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task2 {

    public static class Main {
        public static void main(String[] args) {
            Integer[] array = new Integer[]{1, 3, 5, 2};
            List<Integer> list = Arrays.asList(array);
            sortReverse(list);
            System.out.println(list);
        }

        static void sortReverse(List<Integer> list) {
            list.sort(Collections.reverseOrder());
        }
    }
}
