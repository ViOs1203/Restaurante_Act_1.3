// Piña Becerra Victor Osvaldo
package back_end;


public final class Mesero extends Persona {
    private String mesas;
    private  String turno;

    public Mesero() {
    }

    public Mesero(String rfc, String nombres, String apellidos, String telefono, String direccion, String rutaImagen, String mesas, String turno) {
        super(rfc, nombres, apellidos, telefono, direccion, rutaImagen);
        this.mesas = mesas;
        this.turno = turno;
    }

    public String getMesas() {
        return mesas;
    }

    public void setMesas(String mesas) {
        this.mesas = mesas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nMesas asignadas: " + mesas + "\nTurno: " + turno;
    }
    
    
}
