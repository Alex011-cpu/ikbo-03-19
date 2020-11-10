package ru.mirea.praktika.praktika16.number4;

public interface Order {
    boolean addItem(Item item);
    void delete(String name);
    int deleteAll(String name);
    int getCountOfOrders();
    Item[] getArray();
    int getSumOfPrice();
    int getItemCount(String name);
    Object[] getArrayOfItemsName();
    Object[] sortedOrderByCost();
}
