package org.example;


import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args )  {
        EventStekRefact stek = new EventStekRefact(new ArrayList<Integer>());
        int n=1;
        for (int i=0;i<3;i++) {
            for (int j=0;j<2;j++) {
                stek.addElem(n);
                n++;
            }
            stek.process();
        }

        System.out.println(stek.toString());

        int[] arr = {1,2,3,4,5,6};
        int n2=0;
        EventQueueRefact queue = new EventQueueRefact(new ArrayList<Integer>());
        for (int i=0;i<arr.length/2;i++) {
            for (int j=0;j<2;j++) {
                queue.addElem(arr[n2]);
                n2++;
            }
            queue.process();
        }
        System.out.println(queue.toString());

        //Мой неидеальный вариант)
        /*EventStek stek = new EventStek(new ArrayList<Integer>());

        stek.addElem(1);
        stek.addElem(2);
        stek.obrabotchik();
        stek.addElem(3);
        stek.addElem(4);
        stek.obrabotchik();
        stek.addElem(5);
        stek.addElem(6);
        stek.obrabotchik();
        System.out.println(stek.toString());

        EventQueue queue = new EventQueue(new ArrayList<Integer>());
        queue.addElem(1);
        queue.addElem(2);
        queue.obrabotchik();
        queue.addElem(3);
        queue.addElem(4);
        queue.obrabotchik();
        queue.addElem(5);
        queue.addElem(6);
        queue.obrabotchik();
        System.out.println(queue.toString());



        /*Account acc = new Account(1);
        System.out.println(acc.getId());
        System.out.println(acc.getId() instanceof String);
        acc.setId("bb");
        System.out.println(acc.getId());
        System.out.println(acc.getId() instanceof String);


        Account<Integer> acc_s = new Account<Integer>(1);
        //acc_s.setId("bb"); //уже нельзя, тк поставили что тип интеджер


        System.out.println(acc_s.getId());

        //Обработка исключений

        /*Box box = null;

        try {
            box = new Box(-7,-4,5);
        }
        catch (ExceptionHeight e) {
            System.out.println("Размеры коробки скорректированы");
            box = new Box (Math.abs(e.height), Math.abs(e.wight), Math.abs(e.depth));
        }
        System.out.println(box.toString());
*/

        /*try {
            int n=1/0;

        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
         finally {
            System.out.println("finally");
            Cat cat = null;
            try {
                cat.getName();
            }
            catch (NullPointerException e) {
                System.out.println("NullPointerException");
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Exception");
                //System.out.println(e.getMessage());
            }
        }

        try {

            int[] a=new int[3];
            a[4]=6;


        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());

        }




        /*OracleConnector oracle = new OracleConnector();
        System.out.println(oracle.create(new String[]{"aa", "bb"}));



        Dog dog = new Dog("Taksa","male");
        dog.behavior();
        dog.say("Gav-gav");
        Chiken chiken = new Chiken("Simple", "female");
        chiken.behavior();
        chiken.say("Ko-ko-ko");


        Plane plane1=new Plane("boeng",1000,800,150);
        Ship ship1 = new Ship("linkor", 5000, 200,100);
        Truck truck1= new Truck("Kia",500,90,40,3);
        Transport transport = new Transport("ship",5000,200,400);

        Transport transport1 = new Plane("ss",40,40,40,40); //Объект типа транспорт, несмотря на то что создаем через конструктор самолета
        //transport1.getMaxHeight(); так нельзя, потому что в классе транспорт нет такого метода, и напрямую transport1.maxHeight не работает
        Plane transport2= (Plane) transport1; //Создаем новый объект через каст транспорта1 в класс Plane
        transport2.getMaxHeight();


        plane1.fly();
        System.out.println(plane1.getMaxHeight());
        System.out.println(plane1.getModel());
        plane1.calc(900,70);
        ship1.swim();
        ship1.calc(500,800);
        truck1.drive();
        transport.calc(600,70);

        System.out.println(plane1 instanceof Transport);
        System.out.println(plane1 instanceof Plane);
        //System.out.println(plane1 instanceof Ship); так ошибка сразу на уровне компиляции
        System.out.println(Ship.compareObjects(plane1)); //но можно специально прописать в нужном классе проверку на передаваемый объект

        System.out.println(ship1 instanceof Transport);
        System.out.println(ship1 instanceof Ship);
        System.out.println(transport instanceof Transport);
        System.out.println(transport instanceof Ship);

        /*

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


        Cat shilka = new Cat("Шилка",5,3,false);
        Cat unknownCat = new Cat();
        Cat chernish = new Cat("Черныш",4);
        Cat unknownCat2 = new Cat();

        System.out.println(shilka.name);  //Обращаться напрямую к св-ву объекта плохо, нужно через геттеры
        System.out.println(unknownCat.name);
        System.out.println(unknownCat2.name);

        System.out.println(shilka.getName());
        System.out.println(unknownCat.getName());


        System.out.println(Recursive.numberFibbonachi(30));

        Tasks.simpleNumbers(1,100); //Для вызова статического метода не нужно создавать объект, он не зависит от свойств(состояния) объекта
        Tasks cntTicket = new Tasks();
        cntTicket.first=0;
        cntTicket.last=999999;
        int a =cntTicket.countHappyTicket(cntTicket.first,cntTicket.last); //Для нестатического метода обязательно нужен созданные объект и метод зависит от его сосотояния
        System.out.println(a);

        int [] arr={3,5,6,23,77,2,44,567,32,11};
        System.out.println(MathOperArr.min(arr));
        System.out.println(MathOperArr.max(arr));
        System.out.println(MathOperArr.agr(arr));
        System.out.println(MathOperArr.countEvenNumbers(arr));
        tableEq();
        days();



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
    */
    }
}
