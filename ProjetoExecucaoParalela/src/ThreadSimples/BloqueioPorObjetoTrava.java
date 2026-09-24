package ThreadSimples;

public class BloqueioPorObjetoTrava extends Thread {
	public double saldo=1000.0;
	private final Object trava =new Object();
	
	@Override
	public void run() {
		synchronized(trava) {
			if(saldo>=10) {
				saldo=saldo*10;
			}
		}
	}
}
