package lesson2.task1;

/**
 * -- задание на введение в классы и экземпляры --
 *
 * Класс Circle моделирует круг с радиусом и цветом.
 * Circle не имеет метода main(). Следовательно, он не может быть запущен напрямую.
 * Необходимо написать тестовую программу, называемую TestCircle(в другом исходном файле TestCircle.java),
 * которая использует Circle класс, следующим образом:
 * 1.) Создать экземпляр класса Circle c1.
 *     Создавая экземпляр c1, использовать конструктор "default" который установит значения радиус и цвет по умолчанию.
 * 2.) Использовав имеющиеся публичные методы у c1, выести в консоль цвет и площадь круга
 * 3.) Объявить экземпляр класса Circle c2.
 *     Создавая экземпляр c2, использовать второй конструктор с заданным радиусом и цветом по умолчанию.
 * 4.) Использовав имеющиеся публичные методы у c2, выести в консоль цвет и площадь круга
 *
 * Запустите тестовую программу TestCircle и изучите результаты.
 *
 * 5.) Измените класс Circle так чтобы включить третий конструктор для построения экземпляра класса с2
 * с двумя аргументами - double для radius и String для color.
 * 6.) Добавьте getter для переменной color для получения значения color экземпляра
 * 7.) Для того чтобы изменять значения color и radius давайте добавим публичные setter методы.
 * Для разрешения конфликта между аргументом экземпляра и аргументом методе используйте ключевое слово "this".
 * 8.) Напишите метод toString() который бы возвращал краткое описание экземпляра класса.
 * Попробуйте вызвать метод toString() экземпляра класса c1 в консоль явно: System.out.println(c1.toString());
 * и не явно: System.out.println(c1); Попробуйте объяснить почему оба варианта работают.
 */
public class Circle {
    // переменные, недоступные извне этого класса
    private double radius;
    private String color;

    // Конструктор по умолчанию без аргумента.
    // Он устанавливает радиус и цвет в значение по умолчанию.
    public Circle() {
        radius = 1.0D;
        color = "red";
    }

    // Второй конструктор с заданным радиусом, но цвет по умолчанию
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // третий конструктор, хочу перекрашивать круги
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    // метод для получения радиуса
    public double getRadius() {
        return radius;
    }

    //метод получения цвета
    public String getColor(){
        return color;
    }

    // метод вычисления площади круга
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
