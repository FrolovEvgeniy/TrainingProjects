package task1;

public class KlientOfBank {
    private int id_klient;
    private String lastName;
    private String firstName;
    private int numberChet;
    private int numberCard;

    public KlientOfBank(){
        this.id_klient = 0;
        this.lastName = "Нет фамилии";
        this.firstName = "Нет имени";
        this.numberCard = 0;
        this.numberChet = 0;
    }

    public int getId_klient() {
        return id_klient;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public int getNumberChet() {
        return numberChet;
    }

    public void setId_klient(int id_klient) {
        this.id_klient = id_klient;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public void setNumberChet(int numberChet) {
        this.numberChet = numberChet;
    }

    public String toString() {
        return "Клиент банка c id_клиента: " + id_klient +
                "\nФамлия: " + lastName +
                "\nИмя: " + firstName +
                "\nНомер счета: " + numberChet +
                "\nНомер карты: " + numberCard;
    }
}
