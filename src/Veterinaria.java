/**
 * Created by Marcelo on 24/07/2017.
 */
import java.util.Scanner;

public class Veterinaria {

    public static void main (String args[]){

        Scanner lee = new Scanner(System.in);
        Mascota[] veterinaria = new Mascota[100];
        int numPaciente = 0, eleccion = 0, sw;
        String nombreBuscar="";
        while(eleccion == 0){
            System.out.println("------- Veterinaria -------");
            System.out.println(" 1 Registrar nuevo paciente");
            System.out.println(" 2 Eliminar paciente");
            System.out.println(" 3 Mostrar todos los pacientes");
            System.out.println(" 4 Ordenar pacientes por nombre");
            System.out.println(" 5 Ordenar pacientes por genero");
            System.out.println(" 6 Buscar paciente");
            System.out.println(" 7 Crear historia clínica de paciente");
            System.out.println(" 8 Ver historia clínica de paciente");
            System.out.println(" 9 Crear diagnóstico de consulta de paciente");
            System.out.println(" 10 Guardar todos los datos en un archivo *.txt");
            System.out.println(" 11 Salir del programa");
            System.out.print("Seleccione una opción: ");
            eleccion = lee.nextInt();
            switch (eleccion){
                case 1:
                    Mascota a = new Mascota();
                    a.agregar();
                    veterinaria[numPaciente] = a;
                    numPaciente ++;
                    eleccion = 0;
                    break;
                case 2:
                    int c = 0;
                    Mascota[] aux = new Mascota[100];
                    System.out.print("Ingrese el nombre del paciente:");
                    nombreBuscar = lee.next();
                    for (int i=0; i<numPaciente; i++) {
                        if(!veterinaria[i].buscar(nombreBuscar)){
                            aux[i] = veterinaria[i];
                            c++;
                        }
                        else{
                            System.out.println("Paciente eleminado");
                        }
                    }
                    numPaciente = c;
                    System.out.println(numPaciente);
                    veterinaria = aux;
                    eleccion = 0;
                    break;
                case 3:
                    for(int i=0;i<numPaciente;i++){
                        veterinaria[i].mostrar();
                    }
                    eleccion = 0;
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.print("Ingrese el nombre del paciente:");
                    nombreBuscar = lee.next();
                    sw = 0;
                    for (int i=0; i<numPaciente; i++) {
                        if(veterinaria[i].buscar(nombreBuscar)){
                            veterinaria[i].mostrar();
                            sw = 0;
                            i = numPaciente;
                        }
                        else{
                            sw = 1;
                        }
                    }
                    if(sw == 1){
                        System.out.println("No se encontro al paciente");
                    }
                    eleccion = 0;
                    break;
                case 7:
                    System.out.print("Ingrese el nombre del paciente:");
                    nombreBuscar = lee.next();
                    sw = 0;
                    for (int i=0; i<numPaciente; i++) {
                        if(veterinaria[i].buscar(nombreBuscar)){
                            veterinaria[i].crearHistoriaClinica();
                            sw = 0;
                            i = numPaciente;
                        }
                        else{
                            sw = 1;
                        }
                    }
                    if(sw == 1){
                        System.out.println("No se encontro al paciente");
                    }
                    eleccion = 0;
                    break;
                case 8:
                    System.out.print("Ingrese el nombre del paciente:");
                    nombreBuscar = lee.next();
                    sw = 0;
                    for (int i=0; i<numPaciente; i++) {
                        if(veterinaria[i].buscar(nombreBuscar)){
                            veterinaria[i].mostrarHistoriaClinica();
                            sw = 0;
                            i = numPaciente;
                        }
                        else{
                            sw = 1;
                        }
                    }
                    if(sw == 1){
                        System.out.println("No se encontro al paciente");
                    }
                    eleccion = 0;
                    break;
                case 9:
                    System.out.print("Ingrese el nombre del paciente:");
                    nombreBuscar = lee.next();
                    sw = 0;
                    for (int i=0; i<numPaciente; i++) {
                        if(veterinaria[i].buscar(nombreBuscar)){
                            veterinaria[i].crearDiagnostico();
                            sw = 0;
                            i = numPaciente;
                        }
                        else{
                            sw = 1;
                        }
                    }
                    if(sw == 1){
                        System.out.println("No se encontro al paciente");
                    }
                    eleccion = 0;
                    break;
                case 10:
                    break;
                case 11:
                    eleccion = 1;
                    System.out.println("Fin del proceso");
                    break;
            }
        }
    }
}
