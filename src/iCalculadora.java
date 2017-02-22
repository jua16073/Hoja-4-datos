
/**
 * @author Rodrigo Juarez Jui 16073
 * @author Michelle Bloomfield Fong 16803
 *
 */


public interface iCalculadora {

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double suma(double a, double b);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double resta(double a, double b);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double multiplicacion(double a, double b);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double division(double a, double b);
	
	/**
	 * @param n
	 * @return
	 */
	public double operar (String n);
	
}