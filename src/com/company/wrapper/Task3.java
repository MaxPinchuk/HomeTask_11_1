package com.company.wrapper;

/**
 * Создать переменную типа Double присвоить ей значение с дробнойчастью.
 * Создать переменный примитивных типов (byte, short, int, float, long )
 * Преобразовать и присвоить значение Double каждому из примитивных типов
 * используя специальные методы или автораспаковку.
 */

public class Task3 {

    public static void main(String[] args) {
        Double d = 256.99;

        byte b = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        float f = d.floatValue();
        long l = d.longValue();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(l);
    }
}