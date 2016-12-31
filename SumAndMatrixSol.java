public class Matrix {

   public static void main(String[] args) {
	// Input is not implemented   
	int N = 2;
	
	long sum = GetSum(N);
	System.out.println(sum);
   }
   // Function to get the sum of Matrix
   public static long GetSum(int N){
	   long sum = 0;
	   int divFloor, extraAddition;
	   // Gets the sum column-wise
	   for(int j = 1; j<= N; j++){
		   divFloor = N/j;
           extraAddition = ((N+1) % j) != 0 ? (divFloor * (j - (N+1) % j )) : 0;
		   sum += ((j * (divFloor * (divFloor + 1)) / 2) - extraAddition);							// Sum of values in jth column 
	   }
	   return sum;
   }
}