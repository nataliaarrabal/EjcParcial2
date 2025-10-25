package recursividad;

public class EjcGemini2 {
	
	
	public static String invString(String str) {
		// caso base
		
		
		// String vacío o que la cadena sea de un caracter
		
		
		if(str==null ||str.isEmpty()) {
			return str; // aqui devuelve tanto 0 si es nula como el valor de la cadena de un elemnto
		}
		
		
		//llama al metodo auxiliar recursivo "contructor"
		
		return invStringH(str,0);
	}
	
	public static String invStringH(String str, int n) {
		
		//caso base
		if(n==str.length()) {
			return "";
			
		}
			
			//paso recursivo
			
			String invertedRest= invStringH(str,n+1);
			
			
		
		return invertedRest+str.charAt(n);
	
		
		
	
	}



	public static void main(String[] args) {
		String cadena = "Recursivo";
       
        
        EjcGemini2 var2= new EjcGemini2();
        
        System.out.println(var2.invStringH(cadena,5));
	
		

	}

	}

