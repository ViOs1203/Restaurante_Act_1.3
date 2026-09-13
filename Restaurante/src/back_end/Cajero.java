// Piña Becerra Victor Osvaldo
package back_end;


public final class Cajero extends Persona {
    private String numeroCaja;
    private String ventaCaja;

    public Cajero() {
    }

    public Cajero( String rfc, String nombres, String apellidos, String telefono, String direccion, String rutaImagen, String numeroCaja, String ventaCaja) {
        super(rfc, nombres, apellidos, telefono, direccion, rutaImagen);
        this.numeroCaja = numeroCaja;
        this.ventaCaja = ventaCaja;
    }

    public String getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(String numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public String getVentaCaja() {
        return ventaCaja;
    }

    public void setVentaCaja(String ventaCaja) {
        this.ventaCaja = ventaCaja;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de caja: " + numeroCaja + "\nVenta de caja del dia: " + ventaCaja ;
    }
    
    
}
