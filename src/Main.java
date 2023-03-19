public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18){
            System.out.println("Если возраст человека равен "+age+ " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " +age+ ", он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("задача 2");
        int temp = 14;
        if (temp<=5){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int seed = 60;
        if (seed<=60){
            System.out.println("Если скорость "+seed+" , то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость "+seed+" , то придется заплатить штраф");
        }
    }

    public static void task2 () {
        System.out.println("Задача 4");
        int age = 19;
        boolean twoToSix = age >= 2 && age<=6;
        boolean sevenToEighteen = age >= 7 && age<=18;
        boolean eighteenToTwentyFour = age >= 18 && age<=24;
        boolean twentyFour = age>24;
        if (twoToSix){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        }
        else {
            if (sevenToEighteen) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в в школу.");
            }
            else {
                if (eighteenToTwentyFour){
                    System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет.");
                }
                else {
                    if (twentyFour) {
                        System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу.");
                    }
                }
            }
        }
        System.out.println("задача 5");
        int vozrast = 16;
        boolean five = vozrast<5;
        boolean fiveToFourteen = vozrast>=5&&vozrast<14;
        if (five){
            System.out.println("Если возраст ребенка равен "+vozrast+ " то ему нельзя кататься на аттракционе");
        }
        else {
            if (fiveToFourteen){
                System.out.println("Если возраст ребенка равен "+vozrast+ " то ему можно кататься на аттракционе в сопровождении взрослого");
            }
            else {
                System.out.println("Если возраст ребенка равен "+vozrast+ " то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
        System.out.println("задача 6");
        int passenger = 144;
        int allPassengers = 102;
        int seatPassengers = 60;
        boolean standPassengers = passenger>seatPassengers&&passenger<allPassengers;
        if (passenger<=seatPassengers){
            System.out.println("есть сидячие места");
        }
        else {
            if (standPassengers){
                System.out.println("есть стоячие места");
            }
            else {
                System.out.println("мест в вагоне нет");
            }
        }
        System.out.println("задача 7");
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        boolean firt = one>two&&one>three;
        boolean second = two>one&&two>three;
        boolean third = three>one&&three>two;
        if (firt){
                System.out.println("Большее число "+one);
            }
        else {
            if (second){
                System.out.println("Большее число " +two);
            }
            else {
                if (third){
                    System.out.println("большее число "+three);
                }
            }
        }



    }
}