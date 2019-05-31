
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelFormato extends JPanel implements ActionListener{
	
	Controlador ctrl;
	JRadioButton rd12, rd24;
	ButtonGroup group;
	
	PanelFormato(Controlador ctrl){
		this.ctrl = ctrl;
		//Creacion RadioButtons
		rd12 = new JRadioButton("12 horas",true);
		rd24 = new JRadioButton("24 horas");
		
		//Colocacion de RadioButtons
		rd12.setBounds(20, 15, 75, 30);  //posicion x, posicion y, Largo, Ancho
		rd24.setBounds(120, 15, 75, 30);
		
		//Listen
		rd12.addActionListener(this);
		rd24.addActionListener(this);
		
		// Configuracion Grupo Botones
		group = new ButtonGroup();
		group.add(rd12);
		group.add(rd24);
		
		//Configuracion basica
		setSize(215,50);																		   // tamaño del panel
	    setLayout(null);																		   // El panel es libre
	    setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Formato")));   // Colocar los bordes
		
	    
	    //Agregar Botones
	    add(rd12);
	    add(rd24);
	    
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase(rd12.getText())) {
			ctrl.rd12();
		}else {
			if(e.getActionCommand().equalsIgnoreCase(rd24.getText())) {
				ctrl.rd24();
			}
		}
		
	}
	
}
