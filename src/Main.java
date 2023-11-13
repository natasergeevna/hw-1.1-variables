public class Main {
    public static void main(String[] args) {
        task1_2_3p1();
        task4p1();
        task5p1();
        task6_7p1();
        task8p1();
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
        var allTime = 640;
        var emppTime = 8;
        var emp = allTime / emppTime;
        System.out.println("Всего сотрудников в компании " + emp + " - человек");
        emp += 94;
        allTime = emppTime * emp;
        System.out.println("Если в компании работает " + emp + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");
    }
}