package javaHelloWorld;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		  double[] myList = { 1.2, 1.3, 9.3, 5.6 }; double total = 0; double max =
		  myList[0]; String[][] sehirler = new String[3][3];
		  
		  sehirler[0][0] = "Ýstanbul"; sehirler[0][1] = "Bursa"; sehirler[0][2] =
		  "Bilecik"; sehirler[1][0] = "Ankara"; sehirler[1][1] = "Konya";
		  sehirler[1][2] = "Kayseri"; sehirler[2][0] = "Diyarbakýr"; sehirler[2][1] =
		  "Þanlýurfa"; sehirler[2][2] = "Gaziantep";
		  
		  for (int i = 0; i <= 2; i++) { for (int j = 0; j <= 2; j++) {
		  System.out.println(i + "  " + j + "   " + sehirler[i][j]); }
		  System.out.println("-----------------"); }
		  
		  for (double number : myList) { if (max < number) { max = number; } total =
		  total + number; System.out.println(number);
		  
		  } System.out.println("Toplam: " + total);
		  System.out.println("En büyük sayý: " + max);
		  
		  int number1 = 20; int sayi2 = 15; int sayi3 = 222; int max1 = 0; if (sayi2 >
		  number1) { max1 = sayi2; if (sayi3 > sayi2) { max1 = sayi3; } else max1 =
		  sayi2; } else { max1 = number1; if (sayi3 > number1) { max1 = sayi3; } else
		  max1 = number1; } System.out.println("Maximum number is: " + max1);
		 
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		  System.out.println("Eleman Sayýsý: " + mesaj.length());
		  
		  System.out.println("5. eleman : " + mesaj.charAt(4));
		  
		  System.out.println(mesaj.concat(" Yaþasýn!"));
		  System.out.println(mesaj.startsWith("B"));
		  System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		  mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		  System.out.println(mesaj.indexOf("av"));
		  System.out.println(mesaj.lastIndexOf("a"));
		 

		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj);
		String yenimesaj = mesaj.replace(" ", "-");
		System.out.println(yenimesaj);

		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}
}
