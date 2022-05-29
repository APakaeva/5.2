public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long expected = 30; // ожидаемый результат
        long actual = service.calculate(amount, registered); //вызов метода
        boolean passed = expected == actual; //сравнение

        System.out.println(passed);
    }
}

