package task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Иванов", "ivan@nikuda.com");
        System.out.println(author1);

        author1.setEmail("ivan@nikuda.com");
        System.out.println(author1);
        System.out.println("имя: "+ author1.getName());
        System.out.println("email: "+ author1.getEmail());
    }
}
