package tasks;
// Программа вычисляет сумму кубов чисел массива
public class Task9 {
    public static void main(String[] args) {
        // Ввод массива a
        int[] a = {1,5,9};
        System.out.println(sumOfCubes(a));
    }
    // Функция суммирует кубы чисел по очереди из массива
    public static int sumOfCubes(int[] a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += Math.pow(a[i], 3);
        }
        return (summ);
    }
}

