package tasks;
// Программа площадь треугольника по значению основания и высоты, введенных в качестве аргументов командной строки
public class Task2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        System.out.println((int) triArea(a,h));
    }
    // Функция вычисляет площадь треугольника по формуле 1/2 * основание * высоту
    public static double triArea(int a, int h) {
        return (0.5 * a * h);
    }
}
