import java.io.*;
/*Класс вычисления площади треугольника*/
public class Lab1 extends Point3d {
    /*Ввод данных и вычисление площади треугольника*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение координаты x1");
        double x1 = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение координаты y1");
        double y1 = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение координаты z1");
        double z1 = Double.parseDouble(reader.readLine());

        System.out.println("Введите значение координаты x2");
        double x2 = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение координаты y2");
        double y2 = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение координаты z2");
        double z2 = Double.parseDouble(reader.readLine());

        System.out.println("Введите значение координаты x3");
        double x3 = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение координаты y3");
        double y3 = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение координаты z3");
        double z3 = Double.parseDouble(reader.readLine());

        Point3d pointA = new Point3d(x1, y1, z1);
        Point3d pointB = new Point3d(x2, y2, z2);
        Point3d pointC = new Point3d(x3, y3, z3);

        if (pointEquals(pointA, pointB) || pointEquals(pointA, pointC) || pointEquals(pointB, pointC)) {
            System.out.println("Две из заданных точек имеют одинаковые координаты, площадь не будет вычислена");
        }
        else {
            System.out.println("Площадь заданного треугольника S = " + computeArea(pointA, pointB, pointC));
        }
    }

    /*Вычисление площади треугольника по заданным точкам*/
    public static double computeArea(Point3d pointA, Point3d pointB, Point3d pointC) {
        double a = pointA.distanceTo(pointB);
        double b = pointB.distanceTo(pointC);
        double c = pointA.distanceTo(pointC);
        double p = (a + b + c) / 2;
        double h = 2/a * Math.sqrt(p*(p - a) * (p - b) * (p - c));
        double s = 0.5 * a * h;
        return s;
    }
}
