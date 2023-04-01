public class Main {
    public static void main(String[] args) {

        int accl = 200;
        int addam = 2290;
        int limbon = 1000;
        int bonus = 0;

        if (addam >= limbon) {
            bonus = addam / 100;
        }

        System.out.println("Бонусные рубли " + bonus);

        System.out.println("Итоговый счет " + (accl = accl + addam + bonus));


    }
}