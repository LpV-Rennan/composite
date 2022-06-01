public abstract class Regulamento {
    private String titulo;

    public Regulamento(String descricao){
        this.titulo = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String getRegulamento();
}
