package Model;

public class Administrator extends Person {

    private String clave;

    public Administrator(String clave, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
