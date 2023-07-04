package Assignment8.task2;

import Assignment8.task2.Converter;
import Assignment8.task2.Currency;

/*
Create a class Converter that has the following attributes: rsd and currency. Currency is an enum, while rsd is an int.
Currency can be one of the following: EUR, USD, AUD, CAD, RUB i GBP.
Via constructor enter values for rsd and currency, there are also setters, but no getters.
Create a method that serves as a currency converter that converts into the one entered into the constructor or setter.
So, rsd is converted into that currency. In the method use if else or switch for comparison.
Test it out in main by creating an object type Converter and try it out for all currencies.
 */
public class Task2 {
    public static void main(String[] args) {

        Converter converter = new Converter(10000, Currency.RUB);
        Converter converter1 = new Converter(10000, Currency.GBP);

        System.out.println(converter.convert(converter));
        System.out.println(converter1.convert(converter1));



    }
}
