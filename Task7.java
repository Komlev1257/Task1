package tasks;
// Программа вычисляет сумму всех чисел до введенного и его самого
public class Task7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(addUpTo(a));
    }
    // Функция вычисляет факторил числа
    public static int addUpTo(int a) {
        int summ = 0;
        for (int i = 1; i <= a; i++) {
            summ += i;
        }
        return summ;
    }
}
