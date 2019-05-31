
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import controlador.Controlador;

public class PanelAjustes extends JPanel implements ActionListener{
 
	JButton horas,minutos,segundos;
	Controlador ctrl;
	
	PanelAjustes(Controlador ctrl) 
	{
		
    this.ctrl = ctrl;		
	//Creacion de los botones
	horas = new JButton("H");
	minutos = new JButton("M");
	segundos = new JButton("S");
	
	//Posicionamiento de los botones
	horas.setBounds(10,25,50,20);
	minutos.setBounds(80,25,50,20);
	segundos.setBounds(150,25,50,20);
	
	//Botones en modo escucha
	horas.addActionListener(this);
	minutos.addActionListener(this);
	segundos.addActionListener(this);
	
	//Configuracion basica del JPanel
    setSize(215,40);																		   // tamaño del panel
    setLayout(null);																		   // El panel es libre
    setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Ajustes")));   // Colocar los bordes
    
	//Agregacion de los botones
    add(horas);
    add(minutos);
    add(segundos);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(horas.getText())){
			ctrl.h();
		}else {
			if(e.getActionCommand().equals(minutos.getText())) {
				ctrl.m();
				
			}else {
				if(e.getActionCommand().equals(segundos.getText())){
					ctrl.s();
				}
			}
		}
		
	}
	
	
}
