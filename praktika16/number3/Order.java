package ru.mirea.praktika.praktika16.number3;

public class Order<T> {
    private Order2Linked data;

    public Order() {
        this.data = new Order2Linked();
    }

    public void add(Item item) {
        data.addLast(item);
    }

}
