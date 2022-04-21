package com.company.wrapper;

/**
 * Создать класс WrapperTest, с main методом
 * Для каждого типа данных создать по 4 переменные и проинициализировать разными вариантами:
 * Из примитива, используя автоупаковку
 * С помощью метода valueOf
 * С помощью new
 * Распарсить значение из строки
 */

public class WrapperTest {

    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = Integer.valueOf(127);
        Integer i3 = new Integer(127);
        Integer i4 = Integer.parseInt("127");

        System.out.println(i1 + ", " + i2 + ", " + i3 + ", " + i4 );
    }
}