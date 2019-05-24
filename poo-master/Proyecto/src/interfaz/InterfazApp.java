package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazApp extends JFrame{
	
	PanelA pnlA;
	PanelB pnlB;
	Controlador ctrl;

	public InterfazApp(Controlador ctrl) {
		this.ctrl = new Controlador();
		pnlA = new PanelA(ctrl);
		pnlB = new PanelB();
		ctrl.conectar(pnlB);
		
		setSize(630,280);
		setTitle("Interfaz");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		pnlA.setBounds(10, 10, 300, 230);
		
		pnlB.setBounds(315, 10, 300, 230);
		add(pnlA);
		add(pnlB);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		InterfazApp frmMain = new InterfazApp(new Controlador());
		frmMain.setVisible(true);
	}

}
