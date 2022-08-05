package com.company;
import java.util.Scanner;
interface adding{
    int add(int a , int b);
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        adding add1 = (a,b) -> (a+b) ;
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(add1.add(a,b));
    }
}
