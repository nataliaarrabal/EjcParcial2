package recursividad;

public class EjcGemini {
	
	public static int sumArray(int[]arr, int n) {
	
	//caso base; parar bucle
		
		//n es el indice por donde empieza a sumar
	
	//suma de array vacio y/o de array con un elemento
	
	if (n>= arr.length||n<0) {
		return 0;
	}
	
	
	//paso recursivo
	
	//sumas el valor de la posicion n a lo que es el valor de la suma del valor anterior
	
	return arr[n]+sumArray(arr,n+1);
	}
	
	public static int sumArray(int[] arr) {
		return sumArray(arr,0);
	}
	
	

	

	public static void main(String[] args) {
		
		int arr[]= {2,4,4,5};
		
		EjcGemini var1= new EjcGemini();
		
		System.out.println(var1.sumArray(arr)); //salida:14  suma de todos los valores
		
		System.out.println(var1.sumArray(arr,3)); // salida: 5 suma de los dos primero valores del array
	
		System.out.println(var1.sumArray(arr,2)); 
		System.out.println(var1.sumArray(arr,1)); 
		System.out.println(var1.sumArray(arr,0)); 
	}
	
}


