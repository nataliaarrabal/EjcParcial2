package recursividad;

public class MCD {
	
	public static int mcd(int a, int b) {
		
		//caso base
		
		a=Math.abs(a);
		b=Math.abs(b);	
		
		if(b==0){
			return a;
		}
	// paso recursivo
		
		return mcd(a, a%b); // buscamos el minimo comun divisor
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
