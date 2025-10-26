package Complejidad;

public class ejcProp {
	
	
	
	public static int binSearch(double[]list, double item) {
		int bottom=0;
		int top=list.length-1;
		int middle;
		boolean found=false;
		int location=-1;
		
		while(bottom<=top && !found) {  //0<= 8-1
			middle=(bottom+top)/2;// 7/2-> coge el entero// iteraacion 1=3;
			
			if(list[middle]==item) {
				found =true;
				location=middle;
			}else if (list[middle]<item) {
				bottom=middle+1;
			}else {
				top=middle-1;
			}
		}return location;
	}

	public static void main(String[] args) {
		double []arr= {1.0,3.0,7.0,8.0,11.0,16.0,21.0,25.0};
		
		System.out.println(binSearch(arr,7.0));
		// TODO Auto-generated method stub

	}

}
