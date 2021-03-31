package org.example;

public class Recursive {

    public static long fibonazzi(long n){
        return (n==1 || n==2) ?1 :fibonazzi(n-2)+fibonazzi(n-1);
    }

    public static long numberFibbonachi(long n) {
        return (n<=2)? 1: numberFibbonachi(n-1)+numberFibbonachi(n-2);
    }
}

