package exercicio7;

public class Consultoria implements ICMS {
    double valor;

    public Consultoria(double valor) {
        this.valor = valor;
    }

    @Override
    public double meuICMS() {
        return 0.1 * valor;
    }
}
