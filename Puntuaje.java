public class Puntuaje {

	private int puntosPrimerEquipo;
	private int puntosSegundoEquipo;
	private String ganador;

	public int getPuntosPrimerEquipo() {
		return this.puntosPrimerEquipo;
	}

	/**
	 * 
	 * @param puntosPrimerEquipo
	 */
	public void setPuntosPrimerEquipo(int puntosPrimerEquipo) {
		this.puntosPrimerEquipo = puntosPrimerEquipo;
	}

	public int getPuntosSegundoEquipo() {
		return this.puntosSegundoEquipo;
	}

	/**
	 * 
	 * @param puntosSegundoEquipo
	 */
	public void setPuntosSegundoEquipo(int puntosSegundoEquipo) {
		this.puntosSegundoEquipo = puntosSegundoEquipo;
	}

	public String getGanador() {
		return this.ganador;
	}

	/**
	 * 
	 * @param ganador
	 */
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

}