import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Juego j = new Juego();
		
		j.mostrarAyuda();
		j.realizarJugada("X");
		j.mostrarTablero();
		
	}
}