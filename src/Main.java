public class Main {
    public static void main(String[] args) {

        int accAmount = 200;
        int addAmount = 2290;
        int limitBonus = 1000;
        int bonus = 0;

        if (addAmount >= limitBonus) {
            bonus = addAmount / 100;
        }

        System.out.println("Бонусные рубли " + bonus);

        System.out.println("Итоговый счет " + (accAmount = accAmount + addAmount + bonus));


    }
}