package com.company.wrapper;

/**
 * Создать 2 переменной типа Long присвоить обеим значения 120
 * Вывести на экран результат сравнения этих переменных по оператору ==.
 * Заменить значения переменных на 1200, перепроверить сравнение.
 */

public class Task5 {

    public static void main(String[] args) {

        Long l1 = 120l;
        Long l2 = 120l;

        System.out.println(l1 == l2);

        l1 = 1200l;
        l2 = 1200l;

        System.out.println(l1 == l2);
    }
}