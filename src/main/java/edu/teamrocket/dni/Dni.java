public class Dni {

    private final String dni;
    private boolean numero_sano = false;
    private boolean dni_sano = false;
    private boolean letra_sana = false;
    private final byte LONGITUD_DNI = 9;

    public Dni(String dni) {
        this.dni = dni;
    }

    public boolean isNumero_sano() {
        return numero_sano;
    }

    public boolean isDni_sano() {
        return dni_sano;
    }

    public boolean isLetra_sana() {
        return letra_sana;
    }

    public void setNumero_sano(boolean numero_sano) {
        this.numero_sano = numero_sano;
    }

    public void setDni_sano(boolean dni_sano) {
        this.dni_sano = dni_sano;
    }

    public void setLetra_sana(boolean letra_sana) {
        this.letra_sana = letra_sana;
    }

}

