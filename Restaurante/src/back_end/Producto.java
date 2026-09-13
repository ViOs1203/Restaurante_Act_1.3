// Piña Becerra Victor Osvaldo
package back_end;

import java.util.Objects;


public abstract class Producto {
    
    private String idProducto;
    private String nombreProducto;
    private double precio;
    private String rutaImagen;

    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, double precio, String rutaImagen) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
  
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idProducto);
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.idProducto, other.idProducto);
    }

    

    @Override
    public String toString() {
        return "ID del Producto" + idProducto + "\nNombre del producto: " + nombreProducto + "\nPrecio: " + precio + "\nImagen: " + rutaImagen;
    }
    
    
    
    
    
}
