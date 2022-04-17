package com.lab4;

import java.time.LocalDate;

public class Main {

/*  Производитель                               Определить игровые ноутбуки без сенсорного экрана
    Объем видеопамяти                           и напечатать
    Объем оперативной памяти
    Наличие сенсорного экрана
    Стоимость*/

    static void task1() {
        System.out.println("Фирма   Объем видеопамяти   Объем ОЗУ   Сенсорный экран   Цена");

        Laptops first = new Laptops();
        first.setInfo("Asus", 4, 8, true, 18500);
        first.getInfo();

        Laptops second = new Laptops();
        second.setInfo("Lenovo", 2, 4, false, 12000);
        second.getInfo();

        Laptops third = new Laptops();
        third.setInfo("Razer", 6, 16, true, 30000);
        third.getInfo();

        Laptops fourth = new Laptops();
        fourth.setInfo("Apple", 1, 4, true, 20000);
        fourth.getInfo();

        Laptops fifth = new Laptops();
        fifth.setInfo("Acer", 1, 2, false, 10000);
        fifth.getInfo();
        System.out.println("\n");
    }



    /*  Марка автомобиля            Вывести сведения о машинах, прошедших техосмотр менее
    Производитель               года назад.
    Тип
    Год выпуска
    Дата прохождения техосмотра
    Дата регистрации */

    static void task2() {

        Car audi = new Car();
        audi.setCarInfo("Q7", "Audi", "Crossover", LocalDate.parse("2011-11-11"));
        audi.setDateOfInspection(LocalDate.parse("2021-04-17"));
        audi.setDateOfRegistration(LocalDate.parse("2012-01-05"));
        audi.getCarInfo();

        Car mercedes = new Car();
        mercedes.setCarInfo("C238", "Mercedes-Benz", "Coupe", LocalDate.parse("2018-05-19"));
        mercedes.setDateOfInspection(LocalDate.parse("2020-07-01"));
        mercedes.setDateOfRegistration(LocalDate.parse("2020-10-20"));
        mercedes.getCarInfo();

        Car toyota = new Car();
        toyota.setCarInfo("Camry", "Toyota", "Sedan", LocalDate.parse("2012-01-30"));
        toyota.setDateOfInspection(LocalDate.parse("2021-10-27"));
        toyota.setDateOfRegistration(LocalDate.parse("2014-05-14"));
        toyota.getCarInfo();

        Car renault = new Car();
        renault.setCarInfo("Kangoo", "Renault", "Minivan", LocalDate.parse("2015-06-07"));
        renault.setDateOfInspection(LocalDate.parse("2019-01-10"));
        renault.setDateOfRegistration(LocalDate.parse("2015-10-24"));
        renault.getCarInfo();

    }


    public static void main(String[] args) {
        task1();
        task2();
    }
}
