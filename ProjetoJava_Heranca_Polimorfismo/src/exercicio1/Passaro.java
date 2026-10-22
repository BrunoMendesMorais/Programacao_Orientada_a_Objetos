package exercicio1;

public abstract class Passaro extends Animal {
    public Passaro(String n) {
        super(n);
    }

    @Override
    public void talk() {
        System.out.println("Piu piu");
    }
}
