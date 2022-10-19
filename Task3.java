package tasks;
// Программа вычисляет количество ног всех животных, введенных в качестве аргументов командной строки
public class Task3 {
    public static void main(String[] args) {
        int chickens = Integer.parseInt(args[0]);
        int cows = Integer.parseInt(args[1]);
        int pigs = Integer.parseInt(args[2]);
        System.out.println((int) animals(chickens, cows, pigs));
    }
    // Функция вычисляет количество ног путем перемножения значений
    public static double animals(int chickens, int cows, int pigs) {
        return (chickens * 2 + cows * 4 + pigs * 4);
    }
}