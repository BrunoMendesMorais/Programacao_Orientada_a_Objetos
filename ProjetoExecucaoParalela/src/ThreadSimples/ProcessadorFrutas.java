package ThreadSimples;

public class ProcessadorFrutas implements Runnable{
	public String nomeFruta;
	public int valor;
	
	
	public ProcessadorFrutas(String nomeFruta) {
		this.nomeFruta=nomeFruta;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Processando.."+nomeFruta+""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Linha de Prudução "+nomeFruta+ "interrompido");
			}
		}
		System.out.println("Fim do processamento de"+nomeFruta);
	}
}
