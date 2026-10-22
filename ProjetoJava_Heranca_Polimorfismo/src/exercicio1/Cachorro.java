package exercicio1;

public class Cachorro extends Mamifero {
    public Cachorro(String n) {
        super(n);
    }

    @Override
    public void talk() {
        System.out.println("Au! Au!");
    }
}
