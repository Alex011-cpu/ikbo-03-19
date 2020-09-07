package ru.mirea.praktika;
/*Толстов Александр Сергеевич  ИКБО-03-19 лабораторная №3 вариант №2*/
public class Doberman extends dog{
    public Doberman(int n,String name,String color){
        super(n,name,color);
    }
    public String toString(){
        return "Доберман:\n"+"Имя:"+ getName()+" Возраст:"+getAge()+" Цвет:"+getColor();
    }
}
