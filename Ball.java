package ru.mirea.praktika;
/*Толстов Александр Сергеевич Практика ИКБО-10-19*/
public class Ball {
    private String size;
    private String type;
    public Ball(){
        size="medium";
        type="soccer ball";
    }
    public Ball(String s){
        type="soccer ball";
        size=s;
    }
    public Ball(String t,String s){
       size=s;
       type=t;
    }
    public String toString(){
        return "Syze="+size+" Type="+type;
    }
}
