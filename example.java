package ru.mirea.lab1;
/*Толстов Александр Сергеевич №1*/
public class example {
    public static void main(String[] args){
        int sum=0;
        int sum1=0;
        int sum2=0;
        int[] nums={1,2,3,4,5};
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
        int i=0;
        while(i< nums.length){
            sum1=sum1+nums[i];
            i++;
        }
        System.out.println(sum1);
        int b=0;
        do{
            sum2=sum2+nums[b];
            b++;
        }while(b< nums.length);
        System.out.println(sum2);
    }
}
