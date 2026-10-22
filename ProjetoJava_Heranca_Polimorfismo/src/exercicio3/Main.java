package exercicio3;

public class Main {
    public static void main(String[] args) {
        Transporte[] tran = new Transporte[3];
        tran[0] = new Navio();
        tran[1] = new Aviao();
        tran[2] = new Onibus();

        System.out.println(" exemplo aplicação polimorfismo .");
        System.out.println("nomes dos alunos:  xxxxx.");

        for (int i = 0; i < tran.length; i++) {
            tran[i].exibeDados();
        }
    }
}
