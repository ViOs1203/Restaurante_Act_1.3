// Piña Becerra Victor Osvaldo 
package back_end;


public final class Cocinero extends Persona{
    private String zonaCocina;
    private String rango;

    public Cocinero() {
    }

    public Cocinero( String rfc, String nombres, String apellidos, String telefono, String direccion, String rutaImagen, String zonaCocina, String rango) {
        super(rfc, nombres, apellidos, telefono, direccion, rutaImagen);
        this.zonaCocina = zonaCocina;
        this.rango = rango;
    }

    public String getZonaCocina() {
        return zonaCocina;
    }

    public void setZonaCocina(String zonaCocina) {
        this.zonaCocina = zonaCocina;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nZona en cocina: " + zonaCocina + "\nRango: " + rango;
    }
    
    
            
}
