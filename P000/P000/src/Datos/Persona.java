

package Datos;

/**
 *
 * @author Jhonatan
 */
public class Persona {
    private int documento;
    private String nombre;
    private String direcction;
    protected int telefono;
    
    public Persona()
    {
    this.direcction="Vacia";
    this.documento=11;
    this.nombre="No hay";
    this.telefono=1;
    }
    public Persona(int documento)
    {
    this.documento=documento;
    this.direcction="";
    this.nombre="";
    this.telefono=302;
    
    
   }
    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirecction() {
        return direcction;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
    
    public void IngresarPersona(int doc, String nombre){
        
        int contador;
        documento=doc;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecction(String direcction) {
        this.direcction = direcction;
    }

    
    
    
}
