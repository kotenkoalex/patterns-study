package com.kotenko.factory.factory_method;

public class Pizza {

    public String type = "Ordinary pizza";

    public void prepare() {
        System.out.println(type + " prepared");
    }

    public void bake() {
        System.out.println(type + " baked");
    }

    public void cut() {
        System.out.println(type + " cut");
    }

    public void box() {
        System.out.println(type + " boxed");
    }
}
