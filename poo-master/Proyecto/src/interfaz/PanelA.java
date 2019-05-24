
package interfaz;

import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelA extends JPanel implements ActionListener{
	
	Controlador ctrl;
	
	JLabel a;
	JButton aceptar;
	JButton cancelar;
	JCheckBox chk1, chk2;
	JTextField txt;
	JRadioButton rdB1, rdB2;
	ButtonGroup group;


	public PanelA(Controlador ctrl){
		
		this.ctrl = ctrl;
		
		a = new JLabel("");
		aceptar = new JButton("Aceptar");
		cancelar = new JButton("Cancelar");
		chk1 = new JCheckBox("Check 1", false);
		chk2 = new JCheckBox("Check 2", false);
		txt = new JTextField();
		rdB1 = new JRadioButton("1");
		rdB2 = new JRadioButton("2");
		
		group = new ButtonGroup();
		
		setSize(500,500);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Switch")));
		a.setBounds(10, 10, 100, 30);
		a.setFont(new Font(null, Font.ITALIC, 12));
		
		rdB1.setBounds(10, 190, 50 ,30);
		rdB2.setBounds(65, 190, 50 ,30);
		
		chk1.setBounds(10, 120, 80, 30);
		chk2.setBounds(90, 120, 80, 30);
		
		txt.setBounds(10, 155 , 280, 30);
		
		aceptar.setBounds(10,40, 280, 30);
		aceptar.addActionListener(this);
		
		cancelar.setBounds(10,85, 280, 30);
		cancelar.addActionListener(this);
		
		group.add(rdB1);
		group.add(rdB2);
		
		add(aceptar);
		add(cancelar);
		add(chk1);
		add(chk2);
		add(txt);
		add(rdB1);
		add(rdB2);
	}
	
	public void estadoSwitch() {
		ctrl.estadoSwitch();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase(aceptar.getText())) {
			ctrl.aceptar();
			
		}else {
			if(e.getActionCommand().equalsIgnoreCase(cancelar.getText())) {
				ctrl.cancelar();
			}
		}
	}
}
