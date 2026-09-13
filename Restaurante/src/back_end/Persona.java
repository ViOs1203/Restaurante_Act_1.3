// Becerra Piña Becerra Victor

package back_end;

import java.util.Objects;

public abstract class Persona {
    private String rfc;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String rutaImagen;

    public Persona() {
    }

    public Persona(String rfc, String nombres, String apellidos, String telefono, String direccion, String rutaImagen) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rutaImagen = rutaImagen;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getRutaImagen(){
        return rutaImagen;
    }
    public void setRutaImagen(String rutaImagen){
    this.rutaImagen = rutaImagen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.rfc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.rfc, other.rfc);
    }

   
    @Override
    public String toString() {
        return "Rfc: " + rfc + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\nImagen: " + rutaImagen ;
    }
    
    
}
