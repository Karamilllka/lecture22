public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int topUpBalance = 1500;
        int newBalance;
        int bonus = topUpBalance / 100;
        if (topUpBalance < 1000) { newBalance = balance + topUpBalance;}
                else { newBalance = balance + topUpBalance + bonus;}
            System.out.println("Зачиленно: " + topUpBalance + "руб.");
            System.out.println("Баланс: " + newBalance + "руб.");
    }
}
