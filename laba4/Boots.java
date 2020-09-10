package ru.mirea.praktika.laba4;

public class Boots implements Priceable {
    private int price;

    public Boots(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String toString(){
        return "цена обуви: "+getPrice();
    }
}