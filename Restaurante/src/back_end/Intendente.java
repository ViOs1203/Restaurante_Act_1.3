// Piña Becerra Victor Osvaldo
package back_end;


public final class Intendente extends Persona {
    private String zonaLimpieza;
    private String herramienta;

    public Intendente() {
    }

    public Intendente( String rfc, String nombres, String apellidos, String telefono, String direccion, String rutaImagen, String zonaLimpieza, String herramienta) {
        super(rfc, nombres, apellidos, telefono, direccion, rutaImagen);
        this.zonaLimpieza = zonaLimpieza;
        this.herramienta = herramienta;
    }

    public String getZonaLimpieza() {
        return zonaLimpieza;
    }

    public void setZonaLimpieza(String zonaLimpieza) {
        this.zonaLimpieza = zonaLimpieza;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    @Override
    public String toString() {
        return super.toString() + "\nZona: " + zonaLimpieza + "\nHerramienta que usa: " + herramienta;
    }
}
