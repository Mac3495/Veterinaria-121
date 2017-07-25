/**
 * Created by Marcelo on 24/07/2017.
 */
public class Animal {

    public String nombre, genero;

    public Animal (){
        this.nombre = "";
        this.genero = "";
    }

    public Animal(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
