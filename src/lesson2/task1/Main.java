package lesson2.task1;

public class Main {
    public static void main(String[] args){

        Circle c1 = new Circle();
        System.out.println("Параметры с1:");
        System.out.println("радиус: " + c1.getRadius());
        System.out.println("цвет: " + c1.getColor());
        System.out.println("площадь: " + c1.getArea());
        System.out.println(" ");
        Circle c2 = new Circle(4, "black");
        System.out.println("Параметры с2:");
        System.out.println("радиус: " + c2.getRadius());
        System.out.println("цвет: " + c2.getColor());
        System.out.println("площадь: " + c2.getArea());

//       System.out.println(c2.toString());
//        System.out.println(c2);
// штука выше работать не хочет
    }
}
