package org.itstep.task02;

public class Main {
    public static void main(String[] args) {

    }
    public static void getPositiveLessHundredNumber(int num) throws Exception{
        if (num < 0){
            throw new Exept("<0");
        }
        if (num > 100){
            throw new Exception(">100");
        }
    }
}