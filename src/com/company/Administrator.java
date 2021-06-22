package com.company;

public class Administrator extends User implements iAdministrator{
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Администратор нашел книгу");
    }

    @Override
    public void overdueNotification(User reader) {
        System.out.println("Администратор уведомил пользователя - " + getName());
    }

}
