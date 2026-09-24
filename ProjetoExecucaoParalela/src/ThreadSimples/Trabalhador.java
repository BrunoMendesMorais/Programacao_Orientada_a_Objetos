package ThreadSimples;

public class Trabalhador extends Thread{
	String nome;
	int valor;
	
	public void setDados(String nome, int valor) {
		this.valor = valor;
		this.nome = nome;
	}
	
	public synchronized int getValor() {
		return valor;
	}
	
	public synchronized void incrementa() {
		valor ++;
	}
	
	@Override
	public void run() {
		while(valor<10) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(""+nome+"->valor->:"+valor);
			valor++;
			}
	}
}
