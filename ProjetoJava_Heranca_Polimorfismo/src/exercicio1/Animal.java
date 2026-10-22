package exercicio1;

public abstract class Animal {
    private String nome;

    public Animal(String n) {
        nome = n;
    }

    public String getName() {
        return nome;
    }

    public abstract void talk();
}
