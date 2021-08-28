package com.company;

import com.company.hw1.task1.Person;
import com.company.hw1.task1.PersonBuilder;
import com.company.hw1.task2.LightWeightCar;
import com.company.hw1.task2.Lorry;
import com.company.hw1.task3.Figure;
import com.company.hw1.task3.Rectangle;
import com.company.hw1.task3.Square;
import com.company.hw1.task3.Triangle;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
// hw1
        // task 1.1
        Person person1 = new PersonBuilder()
                .setFirstName("Semen")
                .setLastName("Petrov")
                .setMiddleName("Sidorovich")
                .setCountry("Russia")
                .setAddress("Address")
                .setPhone("+7-906-600-00-00")
                .setAge(29)
                .setGender("Male")
                .build();

        // task 1.2
        Lorry lorry = new Lorry();
        lorry.start();
        lorry.open();
        lorry.move();
        lorry.stop();
        LightWeightCar lightWeightCar = new LightWeightCar();
        lightWeightCar.start();
        lightWeightCar.open();
        lightWeightCar.move();

        // task 1.3
        List<Figure> figures = Arrays.asList(new Square(9), new Rectangle(5, 4), new Triangle(5, 6, 7));
        figures.forEach(figure -> {
            System.out.println(figure.getPerimeter());
            System.out.println(figure.getSquare());
        });
    }
}
