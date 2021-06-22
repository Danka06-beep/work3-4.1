package com.company;

public class Librarian extends User implements iLibrarian, iAdministrator{

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Библиотекарь нашёл книгу");
    }

    @Override
    public void overdueNotification(User reader) {
        System.out.println("Библиотекарь уведомил пользователя:" + getName());
    }

    @Override
    public void orderBook() {
        System.out.println("Библиотекарь заказал книгу");
    }
}
