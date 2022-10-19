package tasks;
// Программа вычисляет остаток от деления чисел, введенных в качестве аргументов командной строки
public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(remainder(a,b));
    }
    // Функция вычисляет остаток от деления с помощью оператора %
    public static int remainder(int a, int b) {
        return (a % b);
    }
}