package exercicio1;

public class Vaca extends Mamifero {
    public Vaca(String n) {
        super(n);
    }

    @Override
    public void talk() {
        System.out.println("Muuu! Muuu!");
    }
}
