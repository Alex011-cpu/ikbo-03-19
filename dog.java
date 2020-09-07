package ru.mirea.praktika;
/*Толстов Александр Сергеевич Практика ИКБО-03-19*/
public class dog {
   private int age;
   private String name;
   public dog(){
       age=1;
       name="Sharik";
   }
   public dog(int n){
       age=n;
       name="Sharik";
   }
   public dog(int n,String s){
       age=n;
       name=s;
   }
   public String toString(){
       return "Name="+name+" Age="+age;
   }
}

