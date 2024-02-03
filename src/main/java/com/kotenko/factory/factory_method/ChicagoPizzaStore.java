package com.kotenko.factory.factory_method;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> new Pizza();
        };
    }
}
