package ec.edu.ups.poo.clases;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;

    public Familiar() {}

    public Familiar(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaNacimiento, String parentesco, String tipoDeSangre) {
        // Super : sirve para acceder a la clase padre.
        // Exactamente lo mismo (this) pero para acceder a la clase padre.
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    // La flecha con el espiral es un metodo sobrescrito
    // sobrescribiendo un metodo de la clase padre
    // SOBRESCRITURA DE METODOS.
    public double calcularEdad() {
        // publix static final int YEAR = 1;
        // YEAR : constantes se escribe todo en mayusculas
        // final : es la manera de definir constantes
        Calendar hoy = Calendar.getInstance(); // devuelve la fecha actual
        int anioActual = hoy.get(Calendar.YEAR);
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        return (anioActual - anioNacimiento);
    }
    @Override
    public String toString() {
        return super.toString() +
                "Familiar : "  + parentesco +
                "Tipo de sangre: " + tipoDeSangre +
                "Edad :" + calcularEdad() ;
    }

}