/**
* Conversor de pesetas a euros.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Saludos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, introduzca una hora del d�a (0 - 23): ");
		int hora = sc.nextInt();
		if ((hora >= 6) && (hora <= 12)) {
		System.out.println("Buenos d�as");
		}
		if ((hora >= 13) && (hora <= 20)) {
		System.out.println("Buenas tardes");
		}
		if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
		System.out.println("Buenas noches");
		}
		if ((hora >= 24) || (hora < 0)) {
		System.out.println("La hora introducida no es correcta.");
		}
		}
		


	}


