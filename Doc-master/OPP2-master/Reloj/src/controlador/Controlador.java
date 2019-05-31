
package controlador;

import mundo.Reloj;
import vista.PanelAjustes;
import vista.PanelFormato;
import vista.PanelHora;

public class Controlador {
    
	private PanelHora pnlHor;
	private PanelAjustes pnlAjus;
	private PanelFormato pnlFor;
	private Reloj reloj;
	
	public Controlador(){
		reloj = new Reloj();
	}
	
	public void conectar (PanelHora pnlHor) {
		this.pnlHor = pnlHor;
	}
	

	public void h() {
		if(reloj.getFormato()) {
			reloj.sumarHora();
			pnlHor.setHoras1(Integer.toString(reloj.getHora()));
			pnlHor.setMinutos1(Integer.toString(reloj.getMin()));
			pnlHor.setSegundos(Integer.toString(reloj.getSeg()));
			pnlHor.setPeriodo(reloj.getPeriodo());
		}else {
			if(!reloj.getFormato()) {
				System.out.println("No hace nada");
			}
		}
		
	}
		//en reloj seria crear un metodo que guarde las horas, min,seg dependiendo el formato (si es 12h formato==true) (si es 24h formato==false),(crear traductor posible)
	public void m() {
		if(reloj.getFormato()) {
			reloj.sumarMin();
			pnlHor.setHoras1(Integer.toString(reloj.getHora()));
			pnlHor.setMinutos1(Integer.toString(reloj.getMin()));
			pnlHor.setSegundos(Integer.toString(reloj.getSeg()));
			pnlHor.setPeriodo(reloj.getPeriodo());
		}else {
			if(!reloj.getFormato()) {
				System.out.println("No hace nada");
			}
		}
		
	}
	
	public void s() {
		if(reloj.getFormato()) {
			reloj.sumarSeg();
			pnlHor.setHoras1(Integer.toString(reloj.getHora()));
			pnlHor.setMinutos1(Integer.toString(reloj.getMin()));
			pnlHor.setSegundos(Integer.toString(reloj.getSeg()));
			pnlHor.setPeriodo(reloj.getPeriodo());
		}else {
			if(!reloj.getFormato()) {
				System.out.println("No hace nada");
			}
		}
		
	}
	
	public void rd12() {
		System.out.println("En rd12");
		reloj.setFormato(true);
	}
	public void rd24() {
		System.out.println("En rd24");
		reloj.setFormato(false);
	}
}
