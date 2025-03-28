package ec.edu.ups.poo.principal;

import java.util.GregorianCalendar;
import java.util.Scanner;
// forma 1
import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
// forma 2
// import.ec.edu.ups.poo.clases.* -> es mas complicado porque importa toda la clase
// EVITARLO
public class Principal {
    public static void main(String[] args) {
        Familiar familiar = new Familiar();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Cuantas personas quieres ingresar : ");
        int numeroDePersonas = sc1.nextInt();
        // Arreglos
        Persona[] personas = new Persona[numeroDePersonas];

        System.out.println("Cuantos familiares quieres ingresar : ");
        int numeroDeFamiliares = sc1.nextInt();
        // Arreglos
        Familiar[] familiares = new Familiar[numeroDeFamiliares];


        for (int i = 0; i < numeroDePersonas; i++) {
            // Instanciar adentro del bucle siempre
            System.out.println("--- PERSONAS ---");
            System.out.println("Ingrese el numero de cedula: ");
            String cedula = sc1.next();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc1.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc1.next();
            sc1.nextLine();
            System.out.println("Ingrese la direccion: ");
            String direccion = sc1.nextLine();
            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }
        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("--- FAMILIARES ---");
            System.out.println("Ingrese el numero de cedula: ");
            String cedula = sc1.next();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc1.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc1.next();
            System.out.println("Ingrese la direccion: ");
            sc1.nextLine();
            String direccion = sc1.nextLine();
            System.out.println("Ingrese el parentesco: ");
            String parentesco = sc1.next();
            System.out.println("Ingrese el tipo de sangre: ");
            String tipoDeSangre = sc1.next();
            System.out.println("Ingrese el año de su Nacimiento: ");
            int aDeSuNacimiento = sc1.nextInt();
            System.out.println("Ingrese el mes de su nacimiento: ");
            int mDeSuNacimiento = sc1.nextInt();
            System.out.println("Ingrese el dia de su nacimiento: ");
            int dDeSuNacimiento = sc1.nextInt();
            GregorianCalendar fechaNacimiento = new GregorianCalendar(aDeSuNacimiento, mDeSuNacimiento, dDeSuNacimiento);
            familiares[i] = new Familiar(cedula,nombre,apellido,direccion,fechaNacimiento,parentesco,tipoDeSangre);


        }
        // Personas
        for (int d = 0; d < numeroDePersonas; d++) {
            System.out.println("--- PERSONAS ---");
            System.out.println("Cédula : " + personas[d].getCedula());
            System.out.println("Nombre : " + personas[d].getNombre());
            System.out.println("Apellido :" + personas[d].getApellido());
            System.out.println("Dirección :" + personas[d].getDireccion());
        }
        // Familiares
        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("--- FAMILIARES ---");
            System.out.println("Cédula : " + familiares[i].getCedula());
            System.out.println("Nombre : " + familiares[i].getNombre());
            System.out.println("Apellido :" + familiares[i].getApellido());
            System.out.println("Dirección :" + familiares[i].getDireccion());
            System.out.println("Parentesco : " + familiares[i].getParentesco());
            System.out.println("Tipo de sangre : " + familiares[i].getTipoDeSangre());
            System.out.println("Edad:" + familiares[i].calcularEdad());

        }
    }
}
