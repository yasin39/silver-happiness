
public class Main {

	public static void main(String[] args) {

		int number = 99;
		int remainder = 0;
		boolean asalmi = false;

		int[] bolenSayilar = { 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 8; i++) {

			remainder = number % bolenSayilar[i];
			if (remainder != 0)
				asalmi = true;
			else {
				asalmi=false;
				break;
			}
		}
		if(asalmi==true)
		System.out.println(number + " sayýsý asaldýr");
		else
			System.out.println(number + " sayýsý asal deðildir");

	}

}
