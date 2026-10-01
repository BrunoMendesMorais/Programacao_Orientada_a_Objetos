package Layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EstudoLayout {

	public static void main(String[] args) {
	JFrame frame=new JFrame("Estudo de Layout");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(640,480);
	
//	configura o layout
	frame.setLayout(new BorderLayout());
	
//	BorderLayout CENTER NORTH SOUTH EAST WEST
	JPanel painelCentral =new JPanel();
	painelCentral.setBackground(Color.GRAY);
	JPanel painelNorte =new JPanel();
	painelNorte.setBackground(Color.BLUE);
	JPanel painelSul =new JPanel();
	painelSul.setBackground(Color.RED);
	JPanel painelLeste =new JPanel();
	painelLeste.setBackground(Color.GREEN);
	JPanel painelOeste =new JPanel();
	painelOeste.setBackground(Color.ORANGE);
	
	painelOeste.setPreferredSize(new Dimension(90,0));
	painelLeste.setPreferredSize(new Dimension(90,0));
	painelSul.setPreferredSize(new Dimension(0,50));
	
	painelCentral.setLayout(new GridLayout(2,2));
	JPanel L1C1=new JPanel();
	L1C1.setBackground(Color.WHITE);
	JPanel L1C2=new JPanel();
	L1C2.setBackground(Color.LIGHT_GRAY);
	JPanel L2C1=new JPanel();
	L2C1.setBackground(Color.GRAY);
	JPanel L2C2=new JPanel();
	L2C2.setBackground(Color.DARK_GRAY);
	
	painelCentral.add(L1C1);
	painelCentral.add(L1C2);
	painelCentral.add(L2C1);
//	painelCentral.add(L2C2);
	
	painelOeste.setLayout(new GridLayout(5,1));
	JButton b1=new JButton("b1");
	JButton b2=new JButton("b2");
	JButton b3=new JButton("b3");
	JButton b4=new JButton("b4");
	JButton b5=new JButton("b5");
	
	JPanel conteudoJSP=new JPanel();
	conteudoJSP.setLayout(new GridLayout(200,1));
	for(int i=0;i<200;i++) {
		JButton botaoaux=new JButton("Botao "+i);
		botaoaux.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "Botão Clicado");
		});
		conteudoJSP.add(botaoaux);
	}
	JScrollPane scrollpane =new JScrollPane(conteudoJSP);
	scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
	painelCentral.add(scrollpane);
	
	painelOeste.add(b1);
	painelOeste.add(b2);
	painelOeste.add(b3);
	painelOeste.add(b4);
	painelOeste.add(b5);
	
	frame.add(painelCentral,BorderLayout.CENTER);
	frame.add(painelNorte,BorderLayout.NORTH);
	frame.add(painelSul,BorderLayout.SOUTH);
	frame.add(painelLeste,BorderLayout.EAST);
	frame.add(painelOeste,BorderLayout.WEST);
	
	frame.setLocationRelativeTo(null);
	
	frame.setVisible(true);
	}

}
