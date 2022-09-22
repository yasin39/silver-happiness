
public class Main {

	public static void main(String[] args) {
		//220-284
		int arkadas1=2620;
		int arkadas2=2958;
		boolean arkadasMi=false;
		int toplam1=1;
		int toplam2=1;
		
		for(int i=2;i<arkadas1;i++) {
			if(arkadas1%i==0) {
				toplam1+=i;
			}
			else continue;
			}
		for(int j=2;j<arkadas2;j++)
		{
			if(arkadas2%j==0)
			{
				toplam2+=j;
			}
			else continue;
		}
		
		if(toplam1==arkadas2&& toplam2==arkadas1) {
			System.out.println(arkadas1+" ve "+arkadas2+" sayýlarý arkadaþtýr");
		}
		else System.out.println("ARkadaþ deðiller");
		}
	}

