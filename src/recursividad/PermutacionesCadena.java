package recursividad;

public class PermutacionesCadena {
	
	
	public static void permute(String str) {
		
		permuteHelper("",str);
		
	}
	
	public static void permuteHelper(String prefix, String remaining) {
		
		//caso base: si no quedan caracteres por permutar
		
		
		if(remaining.length()==0) {
			System.out.println(prefix);
			return;
		}
		
		//paso recursivo: fijar un caracter permutar y asi con todos-- habra que hacer for
		
		for (int i=0; i<remaining.length();i++) {
			String newPrefix=prefix+remaining.charAt(i); //crea nuevo prefijp= al lanetrio mas el nuevo
			
			String newRemaining=remaining.substring(0, i)+remaining.substring(i+1);
			
			permuteHelper(newPrefix,newRemaining);
		}
	}
	

	public static void main(String[] args) {
		
		
		permute("abc");
		// TODO Auto-generated method stub

	}

}
