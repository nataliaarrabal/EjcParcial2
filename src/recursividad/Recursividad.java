package recursividad;

public class Recursividad {
	
	public static void cuentaRegresiva(int n) {
		//caso base
		
		if(n<=0) {
			System.out.println("Fin de la cuenta");	
			
		return;
		}
		
		//metodo recursivo
		
		cuentaRegresiva(n-1);
		
		//codigo
		
		System.out.println(n);
		
	}

public static int factorial(int n) {
	//caso base
	
	if(n==0|| n==1) { // el factorial de 0 y 1 es 1, por lo que lo defino
		return 1;
	}
	
	//metodo recursivo
	
	return n* factorial(n-1);
	
	// codigo extra 
}


public static int fibonacci(int n) {
	// caso base
	
	if(n==0) {
		return 0;}
	else if (n==1){
			return 1;
		
	}
	return fibonacci(n-1)+fibonacci(n-2);
}

public static String invertirCadena(String cadena) {
	
	//caso base
	
	if (cadena.isEmpty()|| cadena ==null) {
		
		return cadena;
}
	
	//codigo
	
	char primerCaracter=cadena.charAt(0); // coge el primer caracter del string y lo guarda y lo añade al final
	String subcadena=cadena.substring(1);
	
	//metodo recursivo
	
	return invertirCadena(subcadena)+primerCaracter;

}
public  int sumarArray(int[]arr) {
	
	//caso base
	
	if(arr==null) {
		return 0;
		
	}
	return sumarArrayAux(arr,0);
		
	
	
}
public  int sumarArrayAux(int[]arr,int i) {
	
	//caso base
	
	if(i>=arr.length) {// significa que ya hemos recorrido todos los elementos
		return 0;
		
	}
		
	//met recursivo
	
	return arr[i]+sumarArrayAux(arr,i+1);
	
}

public static void main (String args[]) {
	
	int []a1= {1,2,3,4,5,5,7,8,9};
	Recursividad r1= new Recursividad();
	
	System.out.println(r1.sumarArrayAux(a1, 0));
	
}
}
