import java.util.Scanner;
public class fibo {
	
	Scanner sc =new Scanner(System.in);
	public static void main(String[]args) {
		fibonaci();
	}
	
	public static int fibonaci() {
		Scanner sc =new Scanner(System.in);
		int num1=0,num2=1,sum=0, size;
		System.out.print("Enter Range");
		size=sc.nextInt();
		System.out.print(num1);
		System.out.print(num2);
		for (int i=1;i<size;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+" ");
		}
		
	

	return sum;// returns num

}
}