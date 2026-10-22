package exercicio8;

import exercicio7.Carro;

import exercicio7.Consultoria;
import exercicio7.ICMS;

public class Main {
    public static void main(String[] args) {
        ICMS[] compra = new ICMS[2];
        compra[0] = new Consultoria(5.6);
        compra[1] = new Carro(5.6);

        System.out.printf(java.util.Locale.forLanguageTag("pt-BR"),
                "ICMS da consultoria: %.2f%n", compra[0].meuICMS());
        
        System.out.printf(java.util.Locale.forLanguageTag("pt-BR"),
                "ICMS do carro: %.2f%n", compra[1].meuICMS());
    }
}
