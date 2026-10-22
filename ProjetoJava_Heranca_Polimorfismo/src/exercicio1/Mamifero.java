package exercicio1;

public abstract class Mamifero extends Animal {
    public Mamifero(String n) {
        super(n);
    }

    @Override
    public abstract void talk();
}
