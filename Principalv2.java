import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principalv2 {

    private QuadroHoteis quadroHoteis = new QuadroHoteis();
    private List<Hotel> hoteis = new ArrayList<Hotel>();
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Principalv2 p = new Principalv2();
        
        boolean opDesejada = true;
        do {
            int op = p.imprimirMenu(s);
            if(op == 99){
                opDesejada = p.opcaoEscolhida(op, s);
                opDesejada = false;
            } else {
                opDesejada = p.opcaoEscolhida(op, s);
            }
        } while (opDesejada);

        s.close();

    }

    public int imprimirMenu(Scanner s){
        System.out.println("**********************");
        System.out.println("1 - Cadastrar Hotel");
        System.out.println("2 - Cadastrar Quarto");
        System.out.println("3 - Cadastrar Hóspede");
        System.out.println("4 - Listar Hoteis");
        System.out.println("99 - Sair Sistema!");
        System.out.println("**********************");
        System.out.print("Digite uma opção: ");
        int opcao = s.nextInt();
        return opcao;
    }

    public boolean opcaoEscolhida(int opcao, Scanner s){
        boolean opcaoCorreta = true;
        switch(opcao){
            case 1:
                cadastrarQuadroHoteis(s);
                break;
            case 2:
                System.out.println("Cadastrar Quarto");
                break;
            case 3:
                System.out.println("Cadastrar Hóspede");
                break;
            case 4:
                listarHoteis();
                break;
            case 99:
                System.out.println("Volte sempre!!");
                break;
            default:
                System.out.println("Opção escolhida é inválida!");
                opcaoCorreta = false;
        }

        return opcaoCorreta;

    }

    public void listarHoteis(){

        if(!quadroHoteis.getListaHoteis().isEmpty()){
            for(Hotel h : quadroHoteis.getListaHoteis()){
    
                h.informacao();
    
            }
        } else {
            System.out.println("Não foram encontrados hoteis!");
        }

    }

    public void cadastrarHotel(Scanner s){
        System.out.println("Cadastrar Hotel");

        s.nextLine();

        System.out.print("Digite o nome do Hotel: ");
        String nomeHotel = s.nextLine();

        System.out.println("Digite o endereço do Hotel: ");
        String enderecoHotel = s.nextLine();

        EstrelasEnum e = EstrelasEnum.ESTRELA4;
        e.listar();

        System.out.println("Digite o código da estrela do Hotel: ");
        int codEstrela = s.nextInt();

        EstrelasEnum estrelaHotel = e.retornaEstrelaEnum(codEstrela);

        if(estrelaHotel != null){
            Hotel h = new Hotel();
            h.setNome(nomeHotel);
            h.setEndereco(enderecoHotel);
            h.setQtdEstrelas(estrelaHotel);

            hoteis.add(h);

            quadroHoteis.setListaHoteis(hoteis);
        } else {
            System.out.println("O código da estrela informada não existe!");
        }
    }

    public void cadastrarAlbergue(){
        Albergue a = new Albergue();
        a.setNome("Tupiniquim");
        a.setQtdEstrelas(EstrelasEnum.ESTRELA1);
        a.setNomeBar("Bar do Albergue");
        a.setEndereco("Rua dos Albergues, 70");

        hoteis.add(a);
        quadroHoteis.setListaHoteis(hoteis);
    }

    public void cadastrarQuadroHoteis(Scanner s){

        System.out.println("Tipos de Hotelaria");
        System.out.println("1 - Hotel");
        System.out.println("2 - Albergue");
        System.out.println("Digite o código: ");
        int cod = s.nextInt();

        switch (cod) {
            case 1:
                cadastrarHotel(s);
                break;
            case 2:
                cadastrarAlbergue();
                break;
            default:
                System.out.println("Código de hotelária errado!!");
        }
    }

}
