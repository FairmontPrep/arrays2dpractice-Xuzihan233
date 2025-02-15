public class Array
{

	public static void main(String[] args) {
		
		System.out.println("getRowMajorSquare");
		int [][] arr = getRowMajorSquare(3);
		
		printDouble(arr);
		
		System.out.println("getRowMajorRectangle");
		printDouble( getRowMajorRectangle(3,4) );
		
		System.out.println("getColumnMajorSquare");
		printDouble(getColumnMajorSquare(3));
		
		System.out.println("getColumnMajorRectangle");
		printDouble(getColumnMajorRectangle(3,4));
		
		
	}
	
	public static int[][] getRowMajorSquare(int x){
		
		int [][] arr = new int [x][x]; // 3 * 3
		
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[0].length; j++){
				arr[i][j] =  j + 1 + i * 3;
			}
		}

		return arr;
	}
	
	public static int[][] getColumnMajorSquare(int x){
		// 1 4 7
		// 2 5 8
		// 3 6 9
		int [][] arr = new int [x][x];
		
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[0].length; j++){
				arr[i][j] =  i + j * 3 + 1;
			}
		}
		
		return arr;
	}
	
	
	public static int[][] getRowMajorRectangle(int row, int column){
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		// row : arr.length
		// column: arr[0].length
		
		int [][] arr = new int [row][column]; // 3 * 4
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = i * 4 + j + 1;
			}
		}
		
		return arr;
	}
	
	public static int[][] getColumnMajorRectangle(int row, int column){
		
		int [][] arr = new int [row][column]; // 3 * 4
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = j * 3 + i + 1;
			}
		}
		
		return arr;
	}
	
	
	public static void printDouble(int matrix [][]){
		for (int [] row : matrix) {
			for (int elem : row) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}


}