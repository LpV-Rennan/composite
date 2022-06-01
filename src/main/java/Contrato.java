public class Contrato {
    private Regulamento regulamento;

    public void setRegulamento(Regulamento regulamento) {
        this.regulamento = regulamento;
    }

    public String getRegulamento() {
        if (this.regulamento == null) {
            throw new NullPointerException("Contrato sem regulamento");
        }
        return this.regulamento.getRegulamento();
    }
}
