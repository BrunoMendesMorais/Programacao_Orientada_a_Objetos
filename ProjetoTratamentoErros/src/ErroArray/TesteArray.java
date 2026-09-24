package ErroArray;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] frutas = {"maça", "mamao","Banana"};
		try {
			System.out.println("Frutas:"+frutas[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Erro: "+e);
		}
		finally {
			System.out.println("Após o erro");
		}
		
		String nome=null;
		
		System.out.println(nome);
		
		try {
			if(nome.equals("Joao")) {
				System.out.println(nome);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Nome null :" +e);
		}
		finally {
			if(nome.equals("Joao")) {
				System.out.println("Bem vindo!");
			}
		}
		
		String[] nomes= {"Jose","Joao","Joaquim"};
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("arquivo.txt"));
			
			for(String n:nomes) {
				writer.write(n);
				writer.newLine();
			}
		}
		catch(Exception e) {
			System.out.println("Erro: "+ e);
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("Erro fechado arquivo: "+e);
			}
			}
		
	}

}
