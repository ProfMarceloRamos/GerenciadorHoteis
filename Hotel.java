public class Hotel {

    private String nome;

    private String endereco;

    private EstrelasEnum qtdEstrelas;

    private Quarto quarto;

    public void informacao() {
        System.out.printf("Hotel %s no endereço %s tem %s estrelas.\n",nome, endereco, qtdEstrelas.getDescricao());
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public EstrelasEnum getQtdEstrelas() {
        return qtdEstrelas;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setNome(String nm){
        nome = nm;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setQtdEstrelas(EstrelasEnum qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hotel(EstrelasEnum estrelas){
        qtdEstrelas = estrelas;
    }

    public Hotel(String nm, EstrelasEnum estrelas){
        nome = nm;
        qtdEstrelas = estrelas;
    }

    public Hotel(){}



}