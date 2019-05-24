package interfaz;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelB extends JPanel{
	
	private JLabel lblSwitch, lblState; 
	
	public PanelB() {
		
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Estado")));
		setLayout(null);
		
		lblState = new JLabel(".........");
		lblState.setBounds(10, 100, 200, 80);
		lblState.setFont(new Font(null, Font.PLAIN, 50));
		
		lblSwitch = new JLabel("Switch");
		lblSwitch.setBounds(10, 30, 200, 80);
		lblSwitch.setFont(new Font(null, Font.BOLD, 55));
		
		add(lblSwitch);
		add(lblState);
	}
	
	public void setState (String state) {
		state = ucFirst(state);
		lblState.setText(state);
	}
	
	public static String ucFirst(String str) {
		  if (str == null || str.isEmpty()) {
		    return str;            
		  } else {
		    return str.substring(0, 1).toUpperCase() + str.substring(1); 
		  }
		}
	
	

}
