package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			moverDerecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			moverIzquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			moverArriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			moverAbajo();
		}
	}

	/**
	 * Abajo
	 */
	public void moverAbajo() {
		j.setY(j.getY() + 1);
	}

	/**
	 * Arriba
	 */
	public void moverArriba() {
		j.setY(j.getY() - 1);
	}

	/**
	 * Izquierda
	 */
	public void moverIzquierda() {
		j.setX(j.getX() - 1);
	}

	/**
	 * Derecha
	 */
	public void moverDerecha() {
		j.setX(j.getX() + 1);
	}
}
