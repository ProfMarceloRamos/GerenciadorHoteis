import java.util.ArrayList;
import java.util.List;

public class QuadroHoteis {

    private List<Hotel> listaHoteis;

    public List<Hotel> getListaHoteis() {
        if(listaHoteis == null){
            listaHoteis = new ArrayList<Hotel>();
        }
        return listaHoteis;
    }

    public void setListaHoteis(List<Hotel> listaHoteis) {
        this.listaHoteis = listaHoteis;
    }
    
}
