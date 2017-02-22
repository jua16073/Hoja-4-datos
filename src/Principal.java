import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
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
		Calculadora calc= new Calculadora(hola);
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
