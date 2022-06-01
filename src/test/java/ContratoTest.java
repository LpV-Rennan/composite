import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoTest {
    

    @Test
    void deveRetornarEmentaDisciplina() {
        Artigo artigo1 = new Artigo("Contrato de Locacao Residencial");
        Paragrafo paragrafoUnico1 = new Paragrafo("Paragrafo Unico ", "Fica acordado entre as partes a " +
                "locação do imovel tal localizado na rua tal, tendo como locador o luizinho e locatario luizinha");
        artigo1.adddConteudos(paragrafoUnico1);

        Artigo artigo2 = new Artigo("Valores e Prazos");
        Paragrafo paragrafo12 = new Paragrafo("Paragrafo 1 ", "O valor do aluguel será de R$ 600,00 (Seiscentos Reais)");
        Paragrafo paragrafo22 = new Paragrafo("Paragrafo 2 ", "O valor do aluguel poderá ser reajustado no final de cada período");
        Paragrafo paragrafo32 = new Paragrafo("Paragrafo 3 ", "O prazo do aluguel será de 1(UM) ano iniciando no dia 1/06/2022 à 31/05/2023");
        Paragrafo paragrafo42 = new Paragrafo("Paragrafo 4 ", "Pode ser rescindido com um aviso de 3 meses de qualquer uma das partes");
        artigo2.adddConteudos(paragrafo12);
        artigo2.adddConteudos(paragrafo22);
        artigo2.adddConteudos(paragrafo32);
        artigo2.adddConteudos(paragrafo42);

        artigo1.adddConteudos(artigo2);

        Contrato contrato = new Contrato();
        contrato.setRegulamento(artigo1);


        assertEquals("Artigo: Contrato de Locacao Residencial\n" +
                "Paragrafo Unico    Fica acordado entre as partes a locação do imovel tal localizado na rua tal, tendo como locador o luizinho e locatario luizinha\n" +
                "Artigo: Valores e Prazos\n" +
                "Paragrafo 1    O valor do aluguel será de R$ 600,00 (Seiscentos Reais)\n" +
                "Paragrafo 2    O valor do aluguel poderá ser reajustado no final de cada período\n" +
                "Paragrafo 3    O prazo do aluguel será de 1(UM) ano iniciando no dia 1/06/2022 à 31/05/2023\n" +
                "Paragrafo 4    Pode ser rescindido com um aviso de 3 meses de qualquer uma das partes\n", contrato.getRegulamento());
    }

    @Test
    void deveRetornarExcessao() {
        try {
            Contrato contrato = new Contrato();
            contrato.getRegulamento();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Contrato sem regulamento", e.getMessage());
        }
    }
}