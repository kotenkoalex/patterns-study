package com.kotenko.factory.factory_method;
public class NYPizzaStore extends  PizzaStore{
    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> new Pizza();
        };
    }
}
