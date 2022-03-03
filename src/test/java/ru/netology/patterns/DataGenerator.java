package ru.netology.patterns;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {}

    private static Faker faker = new Faker(new Locale("ru"));

    public static String generateCity(String local) {
        String[] cities = new String[] {"Томск", "Краснодар", "Москва", "Казань", "Новосибирск", "Екатеринбург"};
        int town = (int) Math.floor(Math.random()*cities.length);
        return cities[town];
    }

    public static String generateDate(int data) {
        return LocalDate.now().plusDays(data).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateName(String name) {
        return faker.name().fullName();
    }

    public static String generatePhone(String phone) {
        return faker.phoneNumber().phoneNumber();
    }
}
