
public class Main {

	public static void main(String[] args) {
		char harfKontrol = 'O';
		boolean kalinMi = false;
		/*
		 * VERSÝYON 1 char[] kalinHarfler = { 'A', 'I', 'O', 'U' };
		 * 
		 * for (char harf : kalinHarfler) { if (harfKontrol == harf) { kalinMi = true;
		 * break; } } if (kalinMi == true) System.out.println("Harf kalýndýr."); else
		 * System.out.println("Harf incedir");
		 */
		
		switch (harfKontrol) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break;
			default:
				System.out.println("Ýnce sesli harf");
		}
	}
}