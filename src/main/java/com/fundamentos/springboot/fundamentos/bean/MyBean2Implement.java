package com.fundamentos.springboot.fundamentos.bean;

public class MyBean2Implement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde un bean 2 propio");
    }
}
