public class Main {
    public static void main(String[] args) {
        task1_2_3p1();
        task4p1();
        task5p1();
        task6_7p1();
        task8p1();
        task1p2();
        task2p2();
        task3p2();
        task4p2();
        task5p2();
        task6p2();
        task7p2();
        task8p2();
    }

    public static void task1_2_3p1(){
        System.out.println("---task1---");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println();
        System.out.println("---task2---");
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
        System.out.println();
        System.out.println("---task3---");
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);
        System.out.println();
    }

    public static void task4p1(){
        System.out.println("---task4---");
        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();
    }

    public static void task5p1(){
        System.out.println("---task5---");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task6_7p1(){
        System.out.println("---task6---");
        var weight1boxer = 78.2;
        var weight2Boxer = 82.7;
        var allWeight = weight2Boxer + weight1boxer;
        System.out.println("Масса 2 бойцов равна " + allWeight + " кг!");
        var diffWeightMinus = weight2Boxer - weight1boxer;
        System.out.println("Разница между бойцами через вычитание равна " + diffWeightMinus + "кг!");
        System.out.println("---task7---");
        var diffWeightDel = weight2Boxer % weight1boxer;
        System.out.println("Разница между бойцами через остаток от деления равна " + diffWeightDel + "кг!");
        System.out.println();
    }

    public static void task8p1(){
        System.out.println("---task8---");
        var allTime = 640;
        var emppTime = 8;
        var emp = allTime / emppTime;
        System.out.println("Всего сотрудников в компании " + emp + " - человек");
        emp += 94;
        allTime = emppTime * emp;
        System.out.println("Если в компании работает " + emp + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");
        System.out.println();
    }

    public static void task1p2(){
        System.out.println("---task1---");
        int a = 38000;
        byte b = 100;
        short c = 200;
        long d = 156L;
        float e = 1f;
        double f = 15.12312312312312321123123;
        System.out.println("Значение переменной a с типом int  равно " + a);
        System.out.println("Значение переменной b с типом int  равно " + b);
        System.out.println("Значение переменной c с типом int  равно " + c);
        System.out.println("Значение переменной d с типом int  равно " + d);
        System.out.println("Значение переменной e с типом int  равно " + e);
        System.out.println("Значение переменной f с типом int  равно " + f);
        System.out.println();
    }

    public static void task2p2(){
        System.out.println("---task2---");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int j = 29879;
        byte f = 67;
        System.out.println();
    }

    public static void task3p2(){
        System.out.println("---task3---");
        byte pepleAP = 23;
        byte peopleAS = 27;
        byte peopleEA = 30;
        short paperAll = 480;
        short peopleAll = (short) (peopleAS + peopleEA + pepleAP);
        short paper = (short) (paperAll / peopleAll);
        System.out.println("На каждого ученика расчитано " + paper + " листов бумаги");
        System.out.println();
    }

    public static void task4p2(){
        System.out.println("---task4---");
        byte bottle = 16;
        byte min = 2;
        byte bottleInMin = (byte) (bottle / min);
        int min20 = bottleInMin * 20;
        int day = bottleInMin * 24 * 60;
        int day3 = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок.");
        System.out.println("За день машина произвела " + day + " штук бутылок.");
        System.out.println("За 3  дня машина произвела " + day3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month + " штук бутылок.");
        System.out.println();
    }

    public static void task5p2(){
        System.out.println("---task5---");
        int cansPaint = 120;
        int whiteClass = 2;
        int brownClass = 4;
        int allCans = cansPaint / (whiteClass + brownClass);
        whiteClass = whiteClass * allCans;
        brownClass = brownClass * allCans;
        System.out.println("В школе, где " + allCans + " классов, нужно " + whiteClass + " банок белой краски и " + brownClass + " банок коричневой краски.");
        System.out.println();
    };

    public static void task6p2(){
        System.out.println("---task6---");
        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int blender = banana + milk + iceCream + egg;
        System.out.println("Вес завтрака в килограммах равен " + (double)blender/1000);
        System.out.println();
    }

    public static void task7p2(){
        System.out.println("---task7---");
        int plan1 = 250;
        int plan2 = 500;
        int planAll= 7*1000;
        int day1 = planAll / plan1;
        int day2 = planAll / plan2;
        int day = (day1 + day2) / 2;
        System.out.println("Если терять в день по 250 гр, похудеть можно за " + day1 + " дней");
        System.out.println("Если терять в день по 500 гр, похудеть можно за " + day2 + " дней");
        System.out.println("В среднем можно похудеть за " + day + " дней");
        System.out.println();
    }

    public static void task8p2(){
        System.out.println("---task8---");
        int salaryMasha = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        System.out.println("Маша теперь получает " + (salaryMasha + salaryMasha * 0.1) + " рублей. Годовой доход вырос на " + (salaryMasha * 0.1) + " рублей");
        System.out.println("Денис теперь получает " + (salaryDen + salaryDen * 0.1) + " рублей. Годовой доход вырос на " + (salaryDen * 0.1) + " рублей");
        System.out.println("Кристина теперь получает " + (salaryKris + salaryKris * 0.1) + " рублей. Годовой доход вырос на " + (salaryKris * 0.1) + " рублей");
        System.out.println();
    }
}