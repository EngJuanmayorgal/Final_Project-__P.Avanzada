package Model;

public class Administrator extends Person {

    private String password;

    public Administrator(String password, String name, String lastName) {
        super(name, lastName);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
