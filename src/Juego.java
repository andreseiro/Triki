import java.util.Scanner;

public class Juego {
	String a, b, c, d, e, f, g, h, i;
	
	public void realizarJugada(String jugador) {
		Scanner teclado = new Scanner(System.in);
		int posicion;
		boolean jugadaValida;
		
		System.out.println("Seleccione la posición");
		posicion = teclado.nextInt();
		jugadaValida = validarJugada(posicion);
		
		if(jugadaValida == true) {
			switch(posicion) {
			case 1: a = jugador; break;
			case 2: b = jugador; break;
			case 3: c = jugador; break; 
			case 4: d = jugador; break;
			case 5: e = jugador; break;
			case 6: f = jugador; break;
			case 7: g = jugador; break;
			case 8: h = jugador; break;
			case 9: i = jugador; break;
			}
		}
	}
	
	public boolean validarJugada(int posicion) {
		if(posicion >= 1 && posicion <= 9) {
			switch(posicion){
			case 1:
				if(a.isEmpty())
					return true;
				break;
			case 2:
				if(b.isEmpty())
					return true;
				break;
			case 3:
				if(c.isEmpty())
					return true;
				break;
			case 4:
				if(d.isEmpty())
					return true;
				break;
			case 5:
				if(e.isEmpty())
					return true;
				break;
			case 6:
				if(f.isEmpty())
					return true;
				break;
			case 7:
				if(g.isEmpty())
					return true;
				break;
			case 8:
				if(h.isEmpty())
					return true;
				break;
			case 9:
				if(i.isEmpty())
					return true;
				break;
			}
			
			return false;
		}
		return false;
	}
	
	public void mostrarTablero() {
		System.out.println("TRIKI");
		System.out.println("-------------");
		System.out.println("| " + a + " | " + b + " | " + c + " | ");
		System.out.println("-------------");
		System.out.println("| " + d + " | " + e + " | " + f + " | ");
		System.out.println("-------------");
		System.out.println("| " + g + " | " + h + " | " + i + " | ");
		System.out.println("-------------\n");		
	}
	
	public  void mostrarAyuda() {
		System.out.println("TRIKI");
		System.out.println("Juego de triqui, para realizar la jugada seleccione el numero,");
		System.out.println("-------------");
		System.out.println("| 1 | 2 | 3 | ");
		System.out.println("-------------");
		System.out.println("| 4 | 5 | 6 | ");
		System.out.println("-------------");
		System.out.println("| 7 | 8 | 9 | ");
		System.out.println("-------------\n");		
	}

	public Juego() {
		a = b = c = d = e = f = g = h = i = "";
	}
}
