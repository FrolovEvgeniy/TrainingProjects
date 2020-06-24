public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1);
        str1 = "World";
        StringBuilder str2 = new StringBuilder(str1);
        System.out.println(str2.reverse());
    }
}
