import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.util.Scanner;
/**
 * @author Rodrigo Juarez Jui 16073
 * @author Michelle Bloomfield Fong 16803
 *
 */
public class Principal {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Principal x = new Principal();
		String hola= x.lectura();
		Scanner teclado= new Scanner(System.in);
		//System.out.println("Desea que los datos se guarden en un vector (1) o ArrayList(2), listaSimple(3), lista doble(4)"
				//+ "lista circular(5)");
		//int resp= teclado.nextInt();
		Calculadora calc= new Calculadora(hola, 5);
		System.out.println(calc.operar(hola));
		
		
	}
	//Metodo para leer los archivos .txt
	String lectura() throws IOException{
		
		
		String a = null; 
		
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		
		while(reader.ready()){
			a = reader.readLine();
			return a;
		}
		return a;
	}
}
