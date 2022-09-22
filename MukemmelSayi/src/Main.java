
public class Main {

	public static void main(String[] args) {
		// 6-->1,2,3
		//28-->1,2,4,7,14
		int number=15;
		int total=1;
		
		int remainder=0;
		
		for(int i=2;i<number;i++)
		{
			remainder=number%i;
			if(remainder==0) {
				total+=i;
			}
		}
		
		if(total==number)
			System.out.println(number +" is a perfect number");
		else System.out.println(number+" is not a perfect number");

	}

}
