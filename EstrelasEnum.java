public enum EstrelasEnum {
    
    ESTRELA1(123, "*"),
    ESTRELA2(456, "**"),
    ESTRELA3(789, "***"),
    ESTRELA4(147, "****");

    private String descricao;

    private int codigo;

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    EstrelasEnum(String desc){
        descricao = desc;
    }

    EstrelasEnum(int cod, String desc){
        this.codigo = cod;
        descricao = desc;
    }

    public void listar(){
        System.out.println("####################");
        for (EstrelasEnum s : EstrelasEnum.values()) {
            System.out.printf("%d - %s\n",s.codigo, s.descricao);
        }
        System.out.println("####################");
    }

    public EstrelasEnum retornaEstrelaEnum(int cod){

        for (EstrelasEnum s : EstrelasEnum.values()) {
            
            if(s.getCodigo() == cod){
                return s;
            }

        }

        return null;

    }

}
