package ThreadSimples;

public class ProcessadorFrutaMain {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		Runnable tarefaMorango =new ProcessadorFrutas("Morango");
		Runnable tarefaUva =new ProcessadorFrutas("Uva");
		
		Thread thread1=new Thread(tarefaMorango);
		Thread thread2=new Thread(tarefaUva);
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e) {
			System.out.println("O  preparo foi interrompido");
		}
		
		System.out.println("Fim do Programa Principal");
	}
}
