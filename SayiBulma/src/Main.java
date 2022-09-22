
public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1,2,3,6,7,8,9,0,5,7,9,0};
		int aranacak = 4;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				System.out.println(aranacak + " sayýsý bulundu.");
				break;
			}
		}
	}

}
