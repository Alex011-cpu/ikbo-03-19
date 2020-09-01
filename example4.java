package ru.mirea.lab1;
/*Толстов Александр Сергеевич №4*/
public class example4 {
    public static void main(String[] args){
        int array[]=new int[5];
        for(int i=0;i< array.length;i++){
            array[i]=(int) (Math.random()*10);
            System.out.print(array[i]+" ");
        }
        for(int j=1;j< array.length;j++)
            for(int i=0;i< array.length-j;i++)
                if(array[i]>array[i+1])
                {
                    int x=array[i];
                    array[i]=array[i+1];
                    array[i+1]=x;
                }
        System.out.println();
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
