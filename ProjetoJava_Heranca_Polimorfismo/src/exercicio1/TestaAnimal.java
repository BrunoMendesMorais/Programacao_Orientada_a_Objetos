package exercicio1;

public class TestaAnimal {
    public static void main(String[] args) {
        Vaca leiteira = new Vaca("Malhada");
        System.out.println("Eu sou = " + leiteira.getName());
        System.out.println("Eu falo= ");
        leiteira.talk();

        Cachorro dalmata = new Cachorro("Pongo");
        System.out.println("Eu sou " + dalmata.getName());
        System.out.println("Eu falo = ");
        dalmata.talk();

        Passaro btv = new BemTeVi("Amarelinho");
        System.out.println("Eu sou " + btv.getName());
        System.out.println("Eu falo = ");
        btv.talk();
    }
}
