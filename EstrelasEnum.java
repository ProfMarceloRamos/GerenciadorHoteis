public enum EstrelasEnum {
    
    ESTRELA1("*"),
    ESTRELA2("**"),
    ESTRELA3("***"),
    ESTRELA4("****");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    EstrelasEnum(String desc){
        descricao = desc;
    }

}
