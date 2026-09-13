// Piña Becerra Victor Osvaldo
package back_end;


public final class Cliente extends Persona {
    private String metodoPago;
    private String mesa;

    public Cliente() {
    }

    public Cliente( String rfc, String nombres, String apellidos, String telefono, String direccion, String rutaImagen, String metodoPago, String mesa) {
        super(rfc, nombres, apellidos, telefono, direccion, rutaImagen);
        this.metodoPago = metodoPago;
        this.mesa = mesa;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nMetodo de pago: " + metodoPago + "\nMesa: " + mesa;
    }
    
    
    
}
