package lesson1.task10;

public class Main {

public static void main(String args[]){
    System.out.println(format("9136758070"));
}

public static String format(String phone){
    return "+7" + "(" + phone.substring(0, 3) + ")" + phone.substring(3,6) + "-" + phone.substring(6,8)+  "-" + phone.substring(8,10);
}
}
