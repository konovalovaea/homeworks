package lesson1.task9;

public class Main {
    public static void main(String[] args){
        System.out.println(format(50));
        System.out.println(format(90));
        System.out.println(format(3640));
        System.out.println(format(-2));
        System.out.println(format(0));
    }

    private static String format(int second) {
        int sec = 0;
        int min = 0;
        int hours = 0;

        if (second < 60)
            return (second + " секунд");


        if (second % 3600>0) {
            min = second/60;
            sec = second % 60;
            return (min + " минут " + sec + " секунд");
        }
        else {
            hours = second/3600;
            int k = second % 3600;
            if (k<60)
                return( hours + "час" + k + " секунд");
            else {
                min = k/60;
                sec = k % 60;
                return( hours + "час" + min + " минут" + sec + "секунд");
            }
        }
    }


}


