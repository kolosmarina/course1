package edu.lesson7.homework7;

public class ShapeDemo {

    public static void main(String[] args) {
        System.out.println("Треугольник");
        Point firstPoint1 = new Point(0, 3);
        Point secondPoint1 = new Point(0, 0);
        Point thirdPoint1 = new Point(4, 0);
        Triangle triangle = new Triangle(firstPoint1, secondPoint1, thirdPoint1);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        System.out.println("Квадрат");
        Point firstPoint2 = new Point(0, 0);
        Point secondPoint2 = new Point(0, 6);
        Point thirdPoint2 = new Point(6, 6);
        Point forthPoint2 = new Point(6, 0);
        Square square = new Square(firstPoint2, secondPoint2, thirdPoint2, forthPoint2);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());

        System.out.println("Ромб");
        Point firstPoint3 = new Point(0, 4);
        Point secondPoint3 = new Point(3, 8);
        Point thirdPoint3 = new Point(6, 4);
        Point forthPoint3 = new Point(3, 0);
        Rhombus rhombus = new Rhombus(firstPoint3, secondPoint3, thirdPoint3, forthPoint3);
        System.out.println(rhombus.calculateArea());
        System.out.println(rhombus.calculatePerimeter());

        System.out.println("Прямоугольник");
        Point firstPoint4 = new Point(0, 0);
        Point secondPoint4 = new Point(0, 18);
        Point thirdPoint4 = new Point(2, 18);
        Point forthPoint4 = new Point(2, 0);
        Rectangle rectangle = new Rectangle(firstPoint4, secondPoint4, thirdPoint4, forthPoint4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Окружность");
        Circle circle = new Circle(4);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

        System.out.println("Эллипс");
        Ellipse ellipse = new Ellipse(7, 13);
        System.out.println(ellipse.calculatePerimeter());
        System.out.println(ellipse.calculateArea());

        System.out.println("Линия");
        Point firstPoint5 = new Point(-1, -1);
        Point secondPoint5 = new Point(-1, 5);
        Line line = new Line(firstPoint5, secondPoint5);
        System.out.println(line.calculateLength());

        System.out.println("Ломанная");
        Point firstPoint6 = new Point(-1, -1);
        Point secondPoint6 = new Point(-1, 2);
        Point thirdPoint6 = new Point(3, 2);
        Point forthPoint6 = new Point(3, -5);
        Point fifthPoint6 = new Point(0, -5);
        Multiline multiline = new Multiline(firstPoint6, secondPoint6, thirdPoint6, forthPoint6, fifthPoint6);
        System.out.println(multiline.calculateLength());
        System.out.println();

        System.out.println(rectangle.compareByAreaTo(square));
        System.out.println(circle.compareByAreaTo(ellipse));
        System.out.println();

        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isRectangle(square));
        System.out.println(ShapeUtils.isTriangle(triangle));
    }
}
