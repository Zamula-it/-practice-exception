package org.itstep.task01;


import org.itstep.task01.exeption.EmptyException;
import org.itstep.task01.exeption.FullListException;

public class Main {
    public static void main(String[] args) {
        List list = new List(3);

        try {
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
        } catch (FullListException e) {
            e.printStackTrace();
        }

        System.out.println(list.toString());

        try {
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
        } catch (EmptyException   e) {
            e.printStackTrace();
        }

        System.out.println(list.toString());
    }
}