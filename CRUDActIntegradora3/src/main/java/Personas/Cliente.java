package Personas;

public class Cliente {
    
    private int id;
    private String nombre; 
    private String apellido; 

    public Cliente() {}

    public int getId() {
        return this.id;
    }
        
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() { 
        return this.nombre;
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public String getApellido() { 
        return this.apellido;
    }

    public void setApellido(String apellido) { 
        this.apellido = apellido;
    }
}


    

