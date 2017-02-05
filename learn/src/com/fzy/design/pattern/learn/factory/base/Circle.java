package com.fzy.design.pattern.learn.factory.base;

/**
 * Created by fuzeyi on 2017/2/5.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
