public class Sample2 {
	
	public static void main(String[] args) {
		int [][]arr = new int[4][4];
		int i;
		for(int j=0; j < arr.length; j++) {
			for(int k=0; k < arr[j].length; k++){
				i = (int)Math.round(Math.random()*9+1);
				arr[j][k] = i;
				System.out.print( arr[j][k]+" ");
			}
			System.out.println();
		}
	}
}

