package com.company;

public class Main {

    public static void main(String[] args) {
	Librarian librarian = new Librarian("Jon");
        librarian.overdueNotification(librarian);
        BookSupplier supplier = new BookSupplier();
        supplier.returnBook();

        Administrator administrator = new Administrator("Amir");
        administrator.overdueNotification(administrator);

        Reader reader = new Reader("Steve");
        reader.findBook();
    }
}
