
package main;

public class Emociones {
    
    private String Nombre;
    private int Edad;
    private String EstadoAnimo;
    private String Profesion;
   // private String PacienteNuevo;

  public Emociones(String Nombre, int Edad, String EstadoAnimo, String Profesion){
  
  this.Nombre = Nombre;
  this.Edad = Edad;
  this.EstadoAnimo = EstadoAnimo;
  this.Profesion = Profesion;
  
  } 

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getEstadoAnimo() {
        return EstadoAnimo;
    }

    public String getProfesion() {
        return Profesion;
    }

  
    @Override
    public String toString() {
        return Nombre+" con "+Edad+" años, se siente "+EstadoAnimo+" y su ocupación es ser "+Profesion+"\n";
    } 
    
    
}
