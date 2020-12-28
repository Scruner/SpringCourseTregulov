package ru.vdv.tregulov.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
        System.out.println("_______________________________________________________");
    }

    public void getMagazin() {
        System.out.println("Мы берём журнал из UniLibrary");
        System.out.println("_______________________________________________________");
    }

    public void returnMagazin() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("_______________________________________________________");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Java Code";
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("_______________________________________________________");
    }

    public void addMagazin() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("_______________________________________________________");
    }

}
