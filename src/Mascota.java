/**
 * Created by Marcelo on 24/07/2017.
 */
import java.util.Scanner;
public class Mascota extends Animal{

    public String consultaMedica;
    public HistoriaClinica historiaClinica;

    public Mascota(){
        super();
        this.consultaMedica = "No tiene consultas";
        this.historiaClinica = new HistoriaClinica();
    }

    public Mascota(String nombre, String genero, String consultaMedica, HistoriaClinica historiaClinica) {
        super(nombre, genero);
        this.consultaMedica = consultaMedica;
        this.historiaClinica = historiaClinica;
    }

    public String getConsultaMedica() {
        return consultaMedica;
    }

    public void setConsultaMedica(String consultaMedica) {
        this.consultaMedica = consultaMedica;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public void agregar(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el nombre del paciente");
        setNombre(lee.nextLine());
        System.out.println("Ingrese el genero de la mascota");
        setGenero(lee.nextLine());
    }

    public boolean buscar(String nombre){
        if(this.nombre.equals(nombre)){
            return true;
        }
        else{
            return false;
        }
    }

    public void mostrar(){
        System.out.println("Paciente: "+nombre+
                            "\n Genero: "+genero+
                            "\n Historial: "+ historiaClinica.mostrar()+
                            "\n Consulta: "+ consultaMedica);
    }

    public void crearHistoriaClinica(){
        Scanner lee = new Scanner(System.in);
        String alergias, sangre;
        System.out.println("Ingrese las alergias: ");
        alergias = lee.nextLine();
        System.out.println("Ingrese el tipo de sangre: ");
        sangre = lee.nextLine();
        HistoriaClinica x = new HistoriaClinica(alergias, sangre);
        setHistoriaClinica(x);
    }

    public void mostrarHistoriaClinica(){
        System.out.println("Paciente: " + nombre + "\nHistoria Clinica: "+this.historiaClinica.mostrar());
    }

    public void crearDiagnostico(){
        Scanner lee = new Scanner(System.in);
        String diagnostico;
        System.out.println("Ingrese el diagnostico: ");
        diagnostico = lee.nextLine();
        consultaMedica = diagnostico;
    }
}
