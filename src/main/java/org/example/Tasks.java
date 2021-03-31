package org.example;

public class Tasks {

    int first;
    int last;


    //Вывести простые числа
    public static void  simpleNumbers (int a, int b) {

        for (int i =a;i<=b;i++) {
            boolean isSimple =true;

            for (int j=2;j<=i/2;j++) {
                if (i%j==0) {
                    isSimple =false;
                    break;
                }
            }
            if (isSimple) {System.out.println(i);};
        }
    }


    //Найти кол-во счатсливых билетов в рулоне от 000 000 до 999 999
    public int countHappyTicket(int first,int last) {
        int cntHappyTicket=0;
        int currentNumber;
        int[] arr=new int[6];

        for (int i=first;i<=last;i++) {
            currentNumber=i;
            for (int j=5;j>=0;j--){
                arr[j]=currentNumber%10; // последняя цифра у текущего
                currentNumber /=10; //делим на 10 для дальнейшей обработки
            }
            if(arr[0]+arr[1]+arr[2]==arr[3]+arr[4]+arr[5])    {
                cntHappyTicket++;
            }
        }
        return cntHappyTicket;

    }
}
