import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {

        Principal p = new Principal();

        QuadroHoteis qh = new QuadroHoteis();

        List<Hotel> hoteis = new ArrayList<Hotel>();
        
        Hotel h = new Hotel("Hotel Mar Aberto", EstrelasEnum.ESTRELA3);

        h.setEndereco("Rua Dos Anzois Pereira, 455");
        p.mostrarInformacao(h);

        hoteis.add(h);

        Albergue a = new Albergue();
        a.setNome("Tupiniquim");
        a.setQtdEstrelas(EstrelasEnum.ESTRELA1);
        a.setNomeBar("Bar do Albergue");
        a.setEndereco("Rua dos Albergues, 70");

        p.mostrarInformacao(a);

        hoteis.add(a);

        qh.setListaHoteis(hoteis);

        System.out.println(qh.getListaHoteis().get(0).getNome());

    }

    public void mostrarInformacao(Hotel h){
        h.informacao();
    }

}
