package com.example.hello.part3.designPattern.decorator;

public class A5 extends AudiDecorator{

    public A5(ICar audi, String modelName) {
        super(audi, modelName, 5000);
    }
}