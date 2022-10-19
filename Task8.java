package tasks;
// Программа вычисляет максимальное значение третьего ребра треугольника
public class Task8 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(nextEdge(a, b));
    }
    // Функция находит третью сторону по условию, что сторона треугольника должна быть меньше суммы двух других сторон
    public static int nextEdge(int a, int b) {
        return (a + b - 1);
    }
}
