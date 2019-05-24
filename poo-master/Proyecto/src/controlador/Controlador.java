package controlador;

import interfaz.PanelA;
import interfaz.PanelB;
import mundo.MundoA;

public class Controlador {
	
	private MundoA mia;
	private PanelB pnlB;
	
	public Controlador() {
		mia = new MundoA();
	}
	
	public void aceptar () {
		mia.aceptar();
		String State= mia.estadoSwitch()+"";
		pnlB.setState(State);
	}
	
	public void cancelar () {
		mia.cancelar();
		String State= mia.estadoSwitch()+"";
		pnlB.setState(State);
	}
	
	public void estadoSwitch() {
		mia.estadoSwitch();
	}

	public void setSwitch(boolean switch1) {
		mia.setSwitch(switch1);
	}
	
	public void conectar (PanelB pnlB) {
		this.pnlB = pnlB;
	}

}
