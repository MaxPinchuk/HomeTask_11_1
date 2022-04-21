package com.company.wrapper;

/**
 * Проверить значения NaN и Infinity.
 * Создать 2 переменные типа Double, одной из них присвоить значение 0.0.
 * Создать переменную типа Double nanValue и присвоить ей значение,
 * деления ненулевой переменной на нулевую.
 * Создать переменную infinityValue и присвоить ей значение,
 * деления нулевой переменной саму на себя.
 * Вывести nanValue и infinityValue на экран.
 * Добавить по 2 блока if для каждого числа в которых проверяется результат выполнения
 * методов isNaN и isInfinity.
 * Если число NaN вывести текст «Переменная {{имя переменной}} = NaN»
 * Если число Infinity вывести текст «Переменная {{имя переменной}} = Infinity»
 */

public class NaN_Infinity {


//    private static void checkNaNValue(Double value, String name) {
//        if (value.isNaN()) {
//            System.out.println("Переменная " + name + ": " + value + " = NaN");
//        }
//    }
//
//    public static void checkInfinityValue(String[] args) {
//
//    }


    public static void main(String[] args) {
        Double k1 = 0.0;
        Double k2 = 127.55;
        Double nanValue = k1 / k1;
        Double infValue = k2 / k1;
        System.out.println(nanValue + " , " + infValue);

        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }
        if (infValue.isNaN()) {
            System.out.println("Переменная infValue = NaN");
        }

        //checkNaNValue(nanValue, "nanValue");
        //checkNaNValue(infValue, "infValue");

        if (infValue.isInfinite()) {
            System.out.println("Переменная infValue = Infinity");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = Infinity");
        }
    }
}