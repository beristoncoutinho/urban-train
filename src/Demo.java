
import java.util.Scanner;
/**
 * 
 * @author Beris
 *
 */
/**
 * 
 * Creating class Demo
 *
 */
public class Demo {
	Scanner sc =new Scanner (System.in);
	/**
	 * 
	 * Method To calculate factorial
	 * 
	 * @return factorial of Number given by user
	 */
	public int Fact() {
		
		int fact=1,num;
		System.out.print("Enter A num ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		
		return fact;
	}
	/**
	 * Method which give Fibonacci series for given range 
	 * Takes user input 
	 */
	public int fibonaci() {
		int num1=0,num2=1,sum=0, size;
		System.out.print("Enter Range");
		size=sc.nextInt()
		System.out.print(num1);
		System.out.print(num2);
		for (int i=1;i<size;i++) {
			
		
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
		return sum;
	}
	
	/**
	 * Method to check if number is  prime
	 * By using for loop the number will be divided from  rang 1 to it self
	 * if 
	 */
     public boolean primeNumber() {
    	 int num ,count=0;
    	 System.out.print("Enter number to check prime");
    	 num=sc.nextInt();
    		for(int i=1;i<num/2;i++) {
    			
    			if (num % i=0) {
    				
    				return false;
    				
    			}
    				
    			
    			System.out.print(" not Prime Number");
    		}
    			
    		return true;
}	
    				
     			
    			
    		
    			
    		
     
			
    	
     	
    			public void reverseArray() {
    				System.out.print("Enter the size of array")
    				int size=sc.nextInt();
    				int [] arr=  new int[size];
    				System.out.print("Enter The Element");
    				for (int i=0;i<arr.length;i++) {
    					arr[i]=sc.nextInt();
    					
    					
    				}
    				for(int i=arr.length-1;i>=0;i--) {
    					System.out.print(arr);
					System.out.print(arr);
    				}
    				
    			
    			
    			
    		}
    		
}			
     


