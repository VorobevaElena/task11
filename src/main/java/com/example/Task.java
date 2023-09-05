package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число");
           String a=scan.nextLine();
           System.out.println("Введите второе число");
            scan = new Scanner(System.in);
            int b=scan.nextInt();
            Integer b1=b;
            if ( b1.compareTo(Integer.parseInt(a))==1){System.out.println("Большее второе число - " + b);}
            else if (b1.compareTo(Integer.parseInt(a))==0){System.out.println("Числа равня");}
            else {System.out.println("Первое число больше - " + a);}
        }
}
