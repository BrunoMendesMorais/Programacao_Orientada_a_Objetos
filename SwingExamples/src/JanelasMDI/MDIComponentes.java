package JanelasMDI;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MDIComponentes  extends JInternalFrame{
	
	public MDIComponentes(String titulo) {
		super(titulo,true,true,true,true);
		setSize(200,200);
		setLayout(new BorderLayout());
		
		JPanel painel =new JPanel();
		MouseAdapter ma=new MouseAdapter() {
			public void MouseMoved(MouseEvent event) {
				System.out.println("X:"+event.getX()+"Y"+event.getY());
			}
			public void mouseEntered(MouseEvent event) {
				System.out.println("Mouse Clicado");
			}
		};
		
		painel.addMouseListener(ma);
		painel.addMouseMotionListener(ma);
		
		add(painel,BorderLayout.CENTER);
	}
}
