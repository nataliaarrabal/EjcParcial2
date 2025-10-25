package recursividad;

public class TorresHanoi {
	
	
	
	
	public static void towerOfHanoi (int n, String origen, String destino, String auxiliar) {
		
		
		//caso base (solo queda un disco)
		
		if(n==1) {
			System.out.println("Mover disco 1 de "+ origen + "a "+ destino);
			return;
			}
		
		//caso recursivo
		
		towerOfHanoi(n-1, origen, auxiliar, destino); // para n-1 discos se redefine el origen y el auxiliar
		
		System.out.println("Mover disco "+n+ " desde: "+origen+ " hasta: "+destino);
		
		towerOfHanoi(n-1,auxiliar,destino,origen);
		
	
	}

	public static void main(String[] args) {
		
		int numDiscos=3;
		System.out.println(numDiscos+ " discos: ");
				towerOfHanoi(numDiscos, "A (origen)", "C (destino)", "B (auxiliar)");

	}

}
