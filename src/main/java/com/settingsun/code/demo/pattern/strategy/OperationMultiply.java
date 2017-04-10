package com.settingsun.code.demo.pattern.strategy;

/**
 * Created by settingsun1225 on 17/4/10.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}