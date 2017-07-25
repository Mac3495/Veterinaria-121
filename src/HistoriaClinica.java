/**
 * Created by Marcelo on 24/07/2017.
 */
public class HistoriaClinica {

    public String alergias, tipoSangre;

    public HistoriaClinica(){
        this.alergias = "";
        this.tipoSangre = "";
    }

    public HistoriaClinica(String alergias, String tipoSangre){
        this.alergias = alergias;
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String mostrar(){
        return("Alergias: "+ alergias+" Tipo de sangre: "+tipoSangre);
    }
}
