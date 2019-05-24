package mundo;

public class MundoA {
	
	private boolean Switch;
	
	public MundoA() {
		Switch = false;
	}
	
	public void aceptar () {
		setSwitch(true);
	}
	
	public void cancelar () {
		setSwitch(false);
	}

	public boolean estadoSwitch() {
		return Switch;
	}

	public void setSwitch(boolean switch1) {
		Switch = switch1;
	}
}
