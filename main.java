import java.util.Scanner;
public class Main{
    public static int fibo(int number){
        if (number <= 1){
            return number;
        }
        return fibo(number - 1) + fibo(number - 2);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number higher than 0: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++){
		    System.out.println(fibo(i));
		}
	}
}
