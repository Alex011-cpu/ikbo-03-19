package ru.mirea.lab1;
/*Толстов Александр Сергеевич №5*/
import java.util.Scanner;
public class example5 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         if(n>=0){
             System.out.print(fact(n));}
    }
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    };
}