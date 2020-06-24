package task2;

public class TestBook {
    public static void main(String[] args) {
        System.out.println("Создаем объект класса Author, чтобы создать объект класса Book:");
        Author author = new Author("Иван Иванов", "ivanov@kuda.com");
        System.out.println(author);
        System.out.println("***************************************************************");

        System.out.println("Проверка конструктора и метода toString() для класса Book:");
        Book dummyBook = new Book("Java для чайников", author,200,99);
        System.out.println(dummyBook);
        System.out.println("***************************************************************");

        System.out.println("Проверка геттеров, сеттеров и метода toString():");
        dummyBook.setPrice(300.75);
        dummyBook.setQty(88);
        System.out.println(dummyBook);
        System.out.println("Название: "+ dummyBook.getName());
        System.out.println("Цена: "+ dummyBook.getPrice());
        System.out.println("Количество: "+ dummyBook.getQty());
        System.out.println("Автор: "+ dummyBook.getAuthor());
        System.out.println("Имя автора: "+ dummyBook.getAuthor().getName());
        System.out.println("Email автора: "+ dummyBook.getAuthor().getEmail());
        System.out.println("***************************************************************");

        System.out.println("Создаем анонимный объект класса Author для создания объекта класса Book:");
        Book moreDummyBook = new Book("Java для опытных", new Author("Петр Петров", "petrov@nikuda.com"),19.99,8);
        System.out.println(moreDummyBook);
    }
}
