package com.example.hwl2;

import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        start();
    }
    public static void start()  {
        Scanner in = new Scanner(System.in);
        System.out.print("\nЧисло от 1 до 5 ");
        int num = in.nextInt();
        int znachenie = 1;
        int znachenie2 =15;
        String s= "qwerty";
        int year = 2000;
        if(num==1){System.out.println(checkDiapazon(znachenie,znachenie2));
        start();}
        else if (num==2) {checkZnak(znachenie);}
        else if (num==3) {System.out.println(checkDizZnak(znachenie));
            start();}
        else if (num==4) {printLine(s,5);}
        else if (num==5) {System.out.println(checkYear(year));
            start();}
        else {System.out.println("Ошибочка");
            start();}
    }
    public static boolean checkDiapazon(int z, int a)
    {
        if((z+a)>=10&&(z+a)<=20){
            return true;
        }
        else {return false;}
    }
    public static void checkZnak(int z){
        if(z>=0){
            System.out.println(z+" положительное");
            start();
        }
        else {System.out.println(z+" отрицательное");
            start();}
    }
    public static boolean checkDizZnak(int z)
    {
        if(z>=0){
            return false;
        }
        else {return true;}
    }
    public static void printLine(String s, int c){
        for (int i=0; i<c; i++)
        {
            System.out.println((i+1)+" "+s);
        }
        start();
    }
    public static boolean checkYear(int z)
    {
        if((z%4)==0) {
            if ((z % 100) == 0 && (z % 400) != 0) {
                return false;
            }
            else {return true;}
        }
        else {return false;}
    }

}