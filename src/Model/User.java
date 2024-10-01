package Model;

public class User extends Person {

    private String correo;
    private String username;

    public User(String correo, String username, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.correo = correo;
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
