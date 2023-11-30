import java.util.Scanner;

public class Principalv2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Principalv2 p = new Principalv2();
        
        boolean opDesejada = true;
        do {
            int op = p.imprimirMenu(s);
            if(op == 99){
                opDesejada = p.opcaoEscolhida(op);
                opDesejada = false;
            } else {
                opDesejada = p.opcaoEscolhida(op);
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

    public boolean opcaoEscolhida(int opcao){
        boolean opcaoCorreta = true;
        switch(opcao){
            case 1:
                System.out.println("Cadastrar hotel");
                break;
            case 2:
                System.out.println("Cadastrar Quarto");
                break;
            case 3:
                System.out.println("Cadastrar Hóspede");
                break;
            case 4:
                System.out.println("Listar Hoteis");
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

    public void cadastrarHotel(){
        // Hotel h = new Hotel("Hotel Mar Aberto", EstrelasEnum.ESTRELA3);
    }

    public void cadastrarAlbergue(){
        // Albergue a = new Albergue();
        // a.setNome("Tupiniquim");
        // a.setQtdEstrelas(EstrelasEnum.ESTRELA1);
        // a.setNomeBar("Bar do Albergue");
        // a.setEndereco("Rua dos Albergues, 70");
    }

    public void cadastrarQuadroHoteis(){
        // se(hotel){
        //     cadastrarHotel();
        // } else if(alberque){
        //     cadastrarAlbergue();
        // }
    }

}
