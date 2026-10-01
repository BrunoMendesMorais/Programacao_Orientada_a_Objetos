package Basico;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SwingBasico {

	public static void main(String[] args) {
		JFrame janela =new JFrame("Minha Primeira Janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(640,480);
		
		JPanel painel = new JPanel();
		painel.setBackground(Color.GREEN);
		
		JLabel rotulo =new JLabel("Ola mundo:", SwingConstants.CENTER);
		JButton b1=new JButton("Botão 1");
		JButton b2=new JButton("Botão 2");
		
		painel.add(rotulo);
		painel.add(b1);
		painel.add(b2);
		
		janela.add(painel);
		janela.setVisible(true);
		
		b1.addActionListener(e->{
			System.out.println("boa");
		});
		b2.addActionListener(e->{
			String nome =JOptionPane.showInputDialog(null,"Qual é seu nome?","Cadastro",JOptionPane.QUESTION_MESSAGE);
			int resposta = JOptionPane.showConfirmDialog(null,"Deseja mostar o nome?","Pergunta",JOptionPane.YES_NO_OPTION);
			
			if(resposta==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null,"nome "+nome, "Dados do Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}

}
