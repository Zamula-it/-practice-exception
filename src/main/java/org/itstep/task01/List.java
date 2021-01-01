package org.itstep.task01;

import org.itstep.task01.exeption.EmptyException;
import org.itstep.task01.exeption.FullListException;

import java.util.Arrays;

import java.util.Arrays;

public class List {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }

    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item) throws FullListException {
        if (cur == size){
            throw new FullListException("Попытка добавить элемент в заполненный массив");
        }
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyException {
        if (cur < 1){
            throw new EmptyException("Попытка удалить элемент из пустого массива");
        }
        obj[--cur] = null;
    }

    @Override
    public String toString() {
        return "List{" +
                "obj=" + Arrays.toString(obj) +
                ", size=" + size +
                ", cur=" + cur +
                '}';
    }
}