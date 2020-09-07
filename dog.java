package ru.mirea.praktika;
/*Толстов Александр Сергеевич  ИКБО-03-19 лабораторная №3 вариант №2*/
public abstract class dog {
   private int age;
   private String name;
   private String color;
   public  dog(){
   }
   public dog(int n,String name,String color){
       this.age=n;
       this.name=name;
       this.color=color;
   }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

