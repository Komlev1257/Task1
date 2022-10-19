package tasks;
// Программа прибавляет a к себе b раз и проверяет делимость полученного числа на c
public class Task10 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(abcmath(a, b, c));
    }
    // Функция производит описанные действия и проверяет на делимость
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return a % c == 0;
    }
}

