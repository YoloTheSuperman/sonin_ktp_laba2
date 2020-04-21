/*Трехмерный класс точки*/
public class Point3d {
    /*Координата X*/
    private double xCoord;
    /*Координата Y*/
    private double yCoord;
    /*Координата Z*/
    private double zCoord;
    /*Конструктор инициализации*/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /*Конструктор по умолчанию*/
    public Point3d() {
        //Вызовите конструктор с двумя параметрами и определите источник
        this(0, 0,0);
    }
    /*Возвращение координаты X*/
    public double getX() {
        return xCoord;
    }
    /*Возвращение координаты Y*/
    public double getY() {
        return yCoord;
    }
    /*Возвращение координаты Z*/
    public double getZ() {
        return zCoord;
    }
    /*Установка значения координаты X*/
    public void setX(double val) {
        xCoord = val;
    }
    /*Установка значения координаты Y*/
    public void setY(double val) {
        yCoord = val;
    }
    /*Установка значения координаты Z*/
    public void setZ(double val) {
        zCoord = val;
    }

    /*Сравнение двух заданных точек*/
    public static boolean pointEquals(Point3d firstPoint, Point3d secondPoint) {
        return firstPoint.equals(secondPoint);
    }

    /*Сравнение координат двух заданных точек*/
    private boolean equals(Point3d point3d) {
        if (this.xCoord == point3d.xCoord) {
            if (this.yCoord == point3d.yCoord) {
                if (this.zCoord == point3d.zCoord) {
                    return true;
                }
            }
        }
        return false;
    }

    /*Расстояние между двумя точками*/
    public double distanceTo(Point3d  point) {
        return distance(point.getX(), point.getY(), point.getZ());
    }

    /*Расстояние от заданной точки до точки с координатами (x1, y1, z1)*/
    private double distance(double x1, double y1, double z1) {
        double a = getX() - x1;
        double b = getY() - y1;
        double c = getZ() - z1;
        return Math.sqrt(a * a + b * b + c * c);
    }
}