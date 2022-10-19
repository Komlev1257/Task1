package tasks;
// Программа находит ASCII символа
public class Task6 {
    public static void main(String[] args) {
        char letter = args[0].charAt(0);
        System.out.println(ctoa(letter));
    }
    // Функция переводит букву в ASCII код
    public static int ctoa(char letter) {
        return ((int) letter);
    }
}
