package com.example.hello.part3.designPattern.adapter;

public class AirConditioner implements Electronic220v {

    @Override
    public void connect() {
        System.out.println("에어컨 220v on");
    }
}
