
public class Calculadora {

	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int Resta(int a, int b) {
		return a-b;
	}
	
	public static int Multiplica(int a, int b) {
		return a*b;
	}
	
	public static int Divide(int a, int b) {
		if(b!=0) {
			return a/b;
		}else {
			return -1;
		}
	}
	

}
