import java.util.ArrayList;
import java.util.List;

public class Artigo extends Regulamento {
    private List<Regulamento> conteudos;

    public Artigo(String titulo){
        super(titulo);
        this.conteudos = new ArrayList<Regulamento>();
    }

    public List<Regulamento> getConteudos() {
        return conteudos;
    }

    public void adddConteudos(Regulamento conteudo) {
        this.conteudos.add(conteudo);
    }

    @Override
    public String getRegulamento() {
        String saida = "";
        saida = "Artigo: " + this.getTitulo() + "\n";
        for (Regulamento conteudo : conteudos) {
            saida += conteudo.getRegulamento();
        }
        return saida;
    }
}
