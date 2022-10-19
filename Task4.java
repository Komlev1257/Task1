package tasks;
// Программа проверяет profitableGamble
public class Task4 {
    public static void main(String[] args) {
        Double prob = Double.parseDouble(args[0]);
        int prize = Integer.parseInt(args[1]);
        int pay = Integer.parseInt(args[2]);
        System.out.println(profitableGamble(prob, prize, pay));
    }
    // Функция проверяет истинность выражения
    public static boolean profitableGamble(Double prob, int prize, int pay) {
        return prob * prize > pay;
    }
}
