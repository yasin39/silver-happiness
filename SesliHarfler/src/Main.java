
public class Main {

	public static void main(String[] args) {
		char harfKontrol = 'O';
		boolean kalinMi = false;
		/*
		 * VERS�YON 1 char[] kalinHarfler = { 'A', 'I', 'O', 'U' };
		 * 
		 * for (char harf : kalinHarfler) { if (harfKontrol == harf) { kalinMi = true;
		 * break; } } if (kalinMi == true) System.out.println("Harf kal�nd�r."); else
		 * System.out.println("Harf incedir");
		 */
		
		switch (harfKontrol) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;
			default:
				System.out.println("�nce sesli harf");
		}
	}
}