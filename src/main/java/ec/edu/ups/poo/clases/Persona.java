package ec.edu.ups.poo.clases;
// Paquetes : Ayudan a organizar de una mejor manera
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona() {

    }
    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    public void setCedula(String cedula){
        //->this-< es una keyword - y hace referencia a la clase Persona.
        this.cedula = cedula;
    }
    public String getCedula(){
        // Si quiero puedo poner this.
        return cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }

    @Override // Metodo sobre escrito de la clase padre
    public String toString() {
        return "Cedula: " + cedula +
                ", Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Direccion: " + direccion;
    }

}
// Seguir aumentando
// arreglo de Familiares
// Para imprimir el familiar en la clase familiar (super.toString)
// crear en la clase familiar un metodo que se llame "calcularEdad"
// desde la fecha actual cuantos años tiene esa persona de acuerdo con la fecha de nacimiento
// simpledateforman
// arreglo de Personas
