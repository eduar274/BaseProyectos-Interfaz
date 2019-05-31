
package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import controlador.Controlador;

public class PanelHora extends JPanel{
	JLabel horas,minutos,segundos;
    JLabel horas1,minutos1,segundos1,periodo;
    
    
    PanelHora(){
        
    	// Creacion de los titulos del panel horas
        horas = new JLabel("Hora"); 
        minutos = new JLabel("Minutos");
        segundos = new JLabel("Segundos");
        
        // Cambiaran dependiendo de la hora en la que este
        horas1 = new JLabel("12");
        minutos1 = new JLabel("00");
        segundos1 = new JLabel("00");
        periodo = new JLabel("AM");
        
        // Posicionamiento de los JLabels
        horas.setBounds(10, 20, 32, 30);
        minutos.setBounds(50, 20, 50, 30);
        segundos.setBounds(110, 20, 60, 30);
        horas1.setBounds(18, 45, 32, 30);
        minutos1.setBounds(67, 45, 50, 30);
        segundos1.setBounds(133, 45, 60, 30);
        periodo.setBounds(180,45,20,30);
        
        //Configuracion basica del JPanel
        setSize(215,90);																		// tamaño del panel
        setLayout(null);																		// El panel es libre
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Hora")));   // Colocar los bordes
        
        //Agregacion de los Jlabels
        add(horas);
        add(minutos);
        add(segundos);
        add(horas1);
        add(minutos1);
        add(segundos1);
        add(periodo);
        
    }
    
    public void setHoras1(String hor) {
		horas1.setText(hor+"");
	}
    public void setMinutos1(String min) {
		minutos1.setText(min+"");
	}
    public void setSegundos(String seg) {
		segundos1.setText(seg+"");
	}
    public void setPeriodo(String per) {
    	periodo.setText(per+"");
    }
    
    
}
