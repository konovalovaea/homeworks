package lesson1.task14;

public class Main{
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        // получается только так, при попытке отдельным методом менять ругается на все подряд :с
        System.out.println("a = " + b); // вернёт 2
        System.out.println("b = " + a); // вернёт 1
    }


}
