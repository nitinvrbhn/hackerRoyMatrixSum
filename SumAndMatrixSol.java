public class Matrix {

   public static void main(String[] args) {
   int N = 2;
   
	long sum = GetSum(N);
   // call floor and print the result
   System.out.println(sum);
   }
   public static long GetSum(int N){
	   long sum = 0;
	   int divFloor, extraAddition;
	   for(int j = 1; j<= N; j++){
		   divFloor = N/j;
           extraAddition = ((N+1) % j) != 0 ? (divFloor * (j - (N+1) % j )) : 0;
		   sum += ((j * (divFloor * (divFloor + 1)) / 2) - extraAddition);
	   }
	   return sum;
   }
}