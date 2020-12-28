package ru.vdv.tregulov.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Alexey", book);
        uniLibrary.addMagazin();

        // uniLibrary.getMagazin();
        //uniLibrary.returnBook();
//        uniLibrary.returnMagazin();
//        uniLibrary.addBook();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
