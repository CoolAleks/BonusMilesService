public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        long miles = service.calculate(price);
        System.out.println(miles);
    }
}


//    Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
//
//        Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
//
//        Что вам нужно: создать базовое приложение, рассчитывающее количество начисленных мили за купленный билет.
