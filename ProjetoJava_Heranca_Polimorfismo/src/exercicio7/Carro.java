package exercicio7;

public class Carro implements ICMS {
    String fabricante, modelo;
    int ano, vel_max, peso;
    float preco;
    int num_rodas = 4;
    int num_portas;

    public Carro(double preco) {
        this.preco = (float) preco;
    }

    public Carro() {
    }

    @Override
    public double meuICMS() {
        return 0.17 * preco;
    }
}
