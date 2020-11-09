package ru.mirea.praktika.praktika16.number2;

public class Order<E> {
    OrderLinked<E> list=new OrderLinked<>();
    public void add(E obj){
     list.addBack(obj);
    }
    public void remove(int i){
            list.delEl(list.getEl(i));
    }
    public void showOrders(){
        list.printList();
    }

}
