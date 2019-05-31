
package vista;

import javax.swing.JFrame;
import controlador.Controlador;


public class InterfazApp extends JFrame{
    PanelAjustes pnlAju;
    PanelFormato pnlFor;
    PanelHora pnlHor;
    Controlador ctrl;
    
    InterfazApp(Controlador ctrl){
        this.ctrl = ctrl;
        
        // Creacion de los paneles
        pnlHor = new PanelHora();
        pnlAju = new PanelAjustes(ctrl);
        pnlFor= new PanelFormato(ctrl);
        ctrl.conectar(pnlHor);
        
        //Configuracion basica de la ventana
        
        setSize(225,230); 							// tamaño de la ventana
        setTitle("Reloj"); 							// titulo de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); 	// cerrar procesos de consola
        setLayout(null); 							//
        setResizable(false); 						// no se puede modificar el tamaño de la ventana
        setLocationRelativeTo(null); 				//
        
        //Ubicacion de los paneles
        pnlHor.setBounds(2, 0, 215, 90);
        pnlAju.setBounds(2, 90, 215, 60);
        pnlFor.setBounds(2, 148,215, 50);
        
        //Agregacion de los paneles
        add(pnlHor);
        add(pnlAju);
        add(pnlFor);
        
        
        
    }
    
    public static void main(String[] arg){
        InterfazApp frmMain = new InterfazApp(new Controlador());
		frmMain.setVisible(true);
        
    }
    
    
}
