package ru.mirea.praktika;
/*Толстов Александр Сергеевич  ИКБО-03-19 лабораторная №3 вариант №2*/
public class Poodle extends dog {
    public Poodle(int n,String name,String color){
        super(n,name,color);
    }
    public String toString(){
        return "Пудель:\n"+"Имя:"+ getName()+" Возраст:"+getAge()+" Цвет:"+getColor();
    }
}
