package JanelasMDI;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class JanelaMDI extends JInternalFrame{

	public JanelaMDI(String titulo) {
		super(titulo,true,true,true,true);
		setSize(200,200);
		setLayout(new BorderLayout());
		
		add(new JLabel("Documento Interno",JLabel.CENTER),BorderLayout.CENTER);
	}
}
