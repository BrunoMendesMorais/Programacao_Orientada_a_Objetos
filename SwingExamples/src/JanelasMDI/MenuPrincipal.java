package JanelasMDI;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class MenuPrincipal extends JFrame{
	private JDesktopPane desktopPane;
	
	public MenuPrincipal(){
		setTitle("Janela Principal");
		setSize(800,600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		desktopPane=new JDesktopPane();
		add(desktopPane,BorderLayout.CENTER);
		
		JMenuBar menuBar=new JMenuBar();
		JMenu menuModulos=new JMenu("Módulos");
		JMenuItem menuItem=new JMenuItem("Abrir Janela");
		
		menuItem.addActionListener(e->{
			JanelaMDI janela =new JanelaMDI("Janelinha");
			janela.setVisible(true);
			desktopPane.add(janela);
		});
		
		JMenuItem menuItem2=new JMenuItem("Abrir janela Componentes");
		
		menuItem2.addActionListener(e->{
			MDIComponentes janela =new MDIComponentes("Janela de COmponentes");
			janela.setVisible(true);
			desktopPane.add(janela);
		});
		
		menuModulos.add(menuItem);
		menuModulos.add(menuItem2);
		menuBar.add(menuModulos);
		setJMenuBar(menuBar);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			MenuPrincipal mp=new MenuPrincipal();
			mp.setVisible(true);
		});
	}

}
