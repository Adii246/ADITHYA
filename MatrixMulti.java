import java.util.Scanner;
public class MatrixMulti {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//input the order of the matrices
		System.out.println("enter the order of the matrix1:");
		int ROW1=sc.nextInt();
		int COLUMN1=sc.nextInt();
		System.out.println("enter the order of the matrix2:");
		int ROW2=sc.nextInt();
		int COLUMN2=sc.nextInt();
		int [][]matrix1=new int [ROW1][COLUMN1];
		int [][] matrix2=new int [ROW2][COLUMN2];
		int [][]resultmatrix=new int [ROW1][COLUMN2];
		if(ROW2==COLUMN1) {
			//input the values of matrices
			System.out.println("enter the values of matrix1:");
			for(int i=0;i<ROW1;i++){
				for(int j=0;j<COLUMN1;j++) {
					matrix1[i][j]=sc.nextInt();
				}
				
			}
			System.out.println("enter the values of matrix2:");
			for(int i=0;i<ROW2;i++){
				for(int j=0;j<COLUMN2;j++) {
					matrix2[i][j]=sc.nextInt();
				}
				
			}
			System.out.println("the resultend matrix is:");
			for(int i=0;i<ROW1;i++) {
				for(int j=0;j<COLUMN2;j++) {
					resultmatrix[i][j]=0;
					for(int k=0;k<ROW2;k++) {
						resultmatrix[i][j]=resultmatrix[i][j]+(matrix1[i][k]*matrix2[k][j]);
					}
					System.out.print(resultmatrix[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("multiplication is not possible");
		}
		
		
		
	}
}
