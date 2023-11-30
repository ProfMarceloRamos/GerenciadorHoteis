public class Albergue extends Hotel {
    
    private String nomeBar;

    public String getNomeBar() {
        return nomeBar;
    }

    public void setNomeBar(String nomeBar) {
        this.nomeBar = nomeBar;
    }

    public void informacao() {
        System.out.printf("O Albergue tem %s estrelas.\n",getQtdEstrelas().getDescricao());
    }

}
