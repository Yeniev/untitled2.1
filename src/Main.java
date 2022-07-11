public class Main {
    public static void main(String[] args) {
        // задание первое
        int cat = 9;
        byte fox = 6;
        short dog = 7;
        long car = 400l;
        double appleWeight = 5.5;
        float iceWeight = 1.5f;
         boolean catIsAdult = cat>2;
         char bar = 35;


         // задание второе
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров -" + weightAllBoxers);
        System.out.println("Разница в весе - " + weightDifference);

        //  задание третье
        int bananas = 5*80; //400gr
        int milk = 2*105; // 210gr
        int iceCream = 2*100; //200gr
        int eggs = 4*70; //280gr
        int weightAll = bananas + milk + iceCream + eggs;
        int weightAllKg = weightAll / 1000;
        System.out.println("вес в гр " + weightAll);
        System.out.println( "вес в Кг " + weightAllKg);


        //задание четвёртое
        int a = 7;
        int b = 250;
        int c = 500;
        int d = a * 1000;
        int e = d / b;
        int f = d / c;
        System.out.println(e);
        System.out.println(f);

        //задание пятое
        // зарплаты до повышения
        double ma = 67_760; // masha
        double de = 83_690; // denis
        double kr = 76_230; // kris

        // узнаем годовую зарплату до повышения
        System.out.println(67_760*12); // зарплата годовая у Маши = 81_31_20
        System.out.println(83_690*12); //зарплата годовая у Дениса = 10_04_280
        System.out.println(76_230*12); //зарплата годовая у Кристины = 91_47_60

        // увеличиваем на 10%
        System.out.println(81_31_20*10.0/100); // увеличили Маше на 81_312 рублей в год
        System.out.println(10_04_280*10.0/100); //увеличили Денису на 10_04_28 рублей в год
        System.out.println(91_47_60*10.0/100); //увеличили Кристине на 91_476 рублей в год

        //после повышения зарплаты
        System.out.println(81_31_20+81_312); //зарплата годовая у Маши 89_44_32
        System.out.println(10_04_280+10_04_28); //зарплата годовая у Маши 11_04_708
        System.out.println(91_47_60+91_476); //зарплата годовая у Маши 10_06_236

        //разница до и после повышения
        System.out.println ("Mаша теперь получает 89_44_32 рублей. Годовой доход вырос на 81_312 рублей");
        System.out.println("Денис теперь получает 11_04_708 рублей. Годовой доход вырос на 10_04_28 рублей");
        System.out.println("Кристина теперь получает 10_06_236 рублей. Годовой доход вырос на 91_476 рублей");












    }
}