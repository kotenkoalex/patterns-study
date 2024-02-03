package com.kotenko.factory.factory_method;
public class Shop {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}