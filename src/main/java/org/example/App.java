package org.example;


import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        //Через массив (коллекция)
        Transport[] transports = new Transport[3];
        transports[0] = new Transport("Самолет",1000,800,150);
        transports[1] =new Transport("Корабль",5000,200,100);
        transports[2] =new Transport("Грузовик",500,90,40);

        int cargo = 1500;
        int distance = 1450;

        for(Transport tr:transports) {
            tr.calc(distance,cargo);
        }

        //Отдельные объекты
        Transport airplane =new Transport("Самолет",1000,800,150);
        Transport ship =new Transport("Корабль",5000,200,100);
        Transport truck =new Transport("Грузовик",500,90,40);

        airplane.calc(987.5,500);
        ship.calc(1000,10000);
        truck.calc(60,100);

        //Cat shilka = new Cat("Шилка",5,3,false);
        //Cat unknownCat = new Cat();
        //Cat chernish = new Cat("Черныш",4);
        //Cat unknownCat2 = new Cat();

        //System.out.println(shilka.name);  //Обращаться напрямую к св-ву объекта плохо, нужно через геттеры
        //System.out.println(unknownCat.name);
        //System.out.println(unknownCat2.name);

        //System.out.println(shilka.getName());
        //System.out.println(unknownCat.getName());


        //System.out.println(Recursive.numberFibbonachi(30));

        //Tasks.simpleNumbers(1,100); //Для вызова статического метода не нужно создавать объект, он не зависит от свойств(состояния) объекта
        //Tasks cntTicket = new Tasks();
        //cntTicket.first=0;
        //cntTicket.last=999999;
        //int a =cntTicket.countHappyTicket(cntTicket.first,cntTicket.last); //Для нестатического метода обязательно нужен созданные объект и метод зависит от его сосотояния
        //System.out.println(a);

        //int [] arr={3,5,6,23,77,2,44,567,32,11};
        //System.out.println(MathOperArr.min(arr));
        //System.out.println(MathOperArr.max(arr));
        //System.out.println(MathOperArr.agr(arr));
        //System.out.println(MathOperArr.countEvenNumbers(arr));
        //tableEq();
        //days();

    }

    //Пример оператора  switch case
    public static void days() {
        for (int i =1;i<11;i++) {
            String s;
            switch (i) {
                case 1:
                    s=" день";
                    break;
                case 2:
                case 3:
                case 4:
                    s=" дня";
                    break;
                default:
                    s=" дней";
                    break;
            }
            System.out.println(i+s);
        }

    }


    //Числа Фиббоначи
    public static void numbersFibonachi () {

        int ms[] = new int[20];
        ms[0] = 1;
        ms[1] = 1;

        // Цикл for
        for (int i = 2; i < 20; i++) {
            ms[i] = ms[i - 1] + ms[i - 2];
            System.out.println(ms[i]);
        }

        //Цикл while
        int i = 2;
        while (i < 20) {
            ms[i] = ms[i - 1] + ms[i - 2];
            System.out.println(ms[i]);
            i++;

        }

        //Цикл do while
        System.out.println(ms[0]);
        System.out.println(ms[1]);
        i = 2;
        do {
            ms[i] = ms[i - 1] + ms[i - 2];
            System.out.println(ms[i]);
            i++;
        } while (i < 20);
    }

    //Вложенные массивы - таблица умножения от 10 до 20
    public static void tableEq() {
        int a, b, result = 0;
        int x[] = new int[11];

        //While
        System.out.println("While");
        System.out.print("   ");
        for (a=10;a<21;a++) {
            System.out.print(a+"  ");
        }

        a=10;
        while (a < 21) {
            System.out.println("");
            System.out.print(a+" ");

            b=10;
            while (b < 21) {


                x[b-10] = a*b;
                System.out.print(x[b-10]+" ") ;
                b++;


            }
            a++;
        }
        //System.out.println(Arrays.toString(x));
        //For
        System.out.println("");
        System.out.println("For");
        System.out.print("   ");
        for (a=10;a<21;a++) {
            System.out.print(a+"  ");
        }
        for (a = 10; a < 21; a++) {
            System.out.println("");
            System.out.print(a + " ");

            for (b = 10; b < 21; b++) {


                x[b - 10] = a * b;
                System.out.print(x[b - 10] + " ");



            }
        }

    }

    //От Антона - аналог nvl

    public static Integer arrayGet(int[] a, int i) {
        if (a == null || i < 0 || i > a.length)
            return null;

        return a[i];
    }

    //<T> T - любой тип
    public static <T> T coalesce(T a, T b) {
        return a == null ? b : a;

    }
}
