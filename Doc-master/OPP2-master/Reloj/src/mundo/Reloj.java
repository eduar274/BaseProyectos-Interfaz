
package mundo;


public class Reloj {

	//Atributos
	private int hora, min, seg;
	private String periodo;
	private boolean aux,formato;
	
	//Getters and Setters
	public void setFormato(boolean formato) {
		this.formato=formato;
	}
	
	public boolean getFormato() {
		return formato;
	}
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public boolean getAux() {
		return aux;
	}
	
	public void setAux(boolean aux) {
		this.aux=aux;
	}

	//Constructor
	
	public Reloj(){
		this.hora=12;
		this.min=0;
		this.seg=0;
		this.periodo="AM";
		this.aux=true;
		this.formato=true;
		
	}
	
	//Metodos Funcionales
	
	public int sumarSeg() {
		if(getSeg()==59) {
			sumarMin();
			setSeg(0);
		}else {
			setSeg(getSeg()+1);
		}
		return getSeg();
	}
	
	public int sumarMin() {
		if(getMin()==59) {
			sumarHora();
			setMin(0);
		}else {
			setMin(getMin()+1);
		}
		return getMin();
	}
	
	public int sumarHora() {
		if(getHora()==11 && getPeriodo().equals("AM") && getAux()) {
			setHora(getHora()+1);	
			setAux(false);
			setPeriodo("PM");
		}else {
			if(getHora()==11 && getPeriodo().equals("PM") && !getAux()) {
				setHora(getHora()+1);	
				setAux(true);
				setPeriodo("AM");
			}else {
				if(getHora()==12) {
					setHora(1);
				}else {
					if(getHora()!=11) {
						 setHora(getHora()+1);
					}
				  	
				}
				
			}
		}
		
		return getHora();
	}
	
	
  
    
}
