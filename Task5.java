package tasks;
// Программа определяет, какую операцию нужно произвести с числами a и b, чтобы получилось N
public class Task5 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        System.out.println(operation(N, a, b));
    }
    // Функция проверяет все операции над числами
    public static String operation(int N, int a, int b) {
        if (a + b == N) {
            return "added";
        } else if (a - b == N) {
            return "subtracted";
        } else if (a * b == N) {
            return "multiplied";
        } else if (a / b == N) {
            return "divided";
        } else {
            return "none";
        }
    }
}