public class Jugador extends Persona {

	private String nacionalidad;
	public int numeroDeSaques;
	public boolean faltas;

	public void salta() {
		// TODO - implement Jugador.salta
		throw new UnsupportedOperationException();
	}

	public void golpea() {
		// TODO - implement Jugador.golpea
		throw new UnsupportedOperationException();
	}

	public void anota() {
		// TODO - implement Jugador.anota
		throw new UnsupportedOperationException();
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getNumeroDeSaques() {
		return this.numeroDeSaques;
	}

	/**
	 * 
	 * @param numeroDeSaques
	 */
	public void setNumeroDeSaques(int numeroDeSaques) {
		this.numeroDeSaques = numeroDeSaques;
	}

	public boolean getFaltas() {
		return this.faltas;
	}

	/**
	 * 
	 * @param faltas
	 */
	public void setFaltas(boolean faltas) {
		this.faltas = faltas;
	}

}