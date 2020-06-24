package task1;

public class TestKlientOfBank {
    public static void main(String[] args) {
        KlientOfBank klientOfBank = new KlientOfBank();
        KlientOfBank klientOfBank2 = new KlientOfBank();

        klientOfBank.setId_klient(123456);
        klientOfBank.setLastName("Фролов");
        klientOfBank.setFirstName("Евгений");
        klientOfBank.setNumberChet(654321);
        klientOfBank.setNumberCard(987654321);

        System.out.println(klientOfBank);
        System.out.println(klientOfBank2);
    }
}
