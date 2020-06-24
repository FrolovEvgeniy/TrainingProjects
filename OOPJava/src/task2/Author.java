package task2;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name +", "+ email;
    }
}
