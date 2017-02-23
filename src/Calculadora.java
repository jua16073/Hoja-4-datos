
/**
 * @author Rodrigo Juarez Jui 16073
 * @author Michelle Bloomfield Fong 16803
 *
 */

public class Calculadora implements iCalculadora{
	
	iPila <String> miStack;
	Factory factory = new Factory();
	double a;
	double b;
	
	public Calculadora(String n, int dec){
		a=0;
		b=0;
		miStack=  factory.factory(dec);
	}
	

	/**
	 * @param a
	 * @param b
	 * @return la suma de los enteros
	 */
	@Override
	public double suma(double a, double b){
		
		double c = a+b;
		return c;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la resta de los enteros
	 */
	@Override
	public double resta(double a, double b){
		double c = a-b;
		return c;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la multiplicacion de los enteros
	 */
	public double multiplicacion(double a, double b){
		double c = a*b;
		return c;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la division de los enteros
	 */
	@Override
	public double division(double a, double b){
		double c = a/b;
		return c;
	}
	
	 @Override
	public double operar(String n){
		String datos[]= n.split(" ");
		int x=0;
		while (x< datos.length){
			miStack.push(datos[x]);
			x++;
		}
		a= Double.parseDouble(miStack.pop());
		System.out.println(a);
		while (miStack.isEmpty()==false){
			b= Double.parseDouble(miStack.pop());
			System.out.println(b);
			String op= (String) miStack.pop();
			System.out.println(op);
			switch (op){
			case "+":
				a= suma(a,b);
				break;
			case "-":
				a=resta(a,b);
				break;
			case "*":
				a=multiplicacion(a,b);
				break;
			case "/":
				a= division(a,b);
				break;
			}
		}
		return a;
	}
	
	
	
}
