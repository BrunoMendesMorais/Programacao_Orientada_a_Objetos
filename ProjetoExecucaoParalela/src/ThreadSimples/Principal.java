package ThreadSimples;

public class Principal {

	public static void main(String[] args) {
		Trabalhador trab1=new Trabalhador();
		Trabalhador trab2 =new Trabalhador();
		trab1.setDados("T1",0);
		trab2.setDados("T2",0);
		trab1.start();
		trab2.start();
		
		trab1.setPriority(10);
		trab2.setPriority(1);
		
		System.out.println("Fim da thread principal");
	}

}
