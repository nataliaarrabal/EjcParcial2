package recursividad;

public class MCD {
	
	public static int mcd(int a, int b) {
		
		//caso base
		
		a=Math.abs(a);
		b=Math.abs(b);	
		
		if(b==0){
			return 0;
		}
	// paso recursivo
		
	return mcd(a, a%b); // buscamos el minimo comun divisor
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(mcd(48,18));
		// TODO Auto-generated method stub

	}

}
