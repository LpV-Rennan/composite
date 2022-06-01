public class Paragrafo extends Regulamento {
    private String descricao;

    public Paragrafo(String titulo, String descricao){
        super(titulo);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getRegulamento() {
        return this.getTitulo() + "   " + this.descricao+"\n";
    }
}
