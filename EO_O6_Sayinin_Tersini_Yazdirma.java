package Egitim_Ornekleri;

public class EO_O6_Sayinin_Tersini_Yazdirma {
	public static void main(String[] args) {
		int sayi = 1234, tersi = 0;
		int yedek = sayi;

		for (; sayi != 0; sayi /= 10) {
			int basamak = sayi % 10;
			tersi = tersi * 10 + basamak;
		}
		System.out.println("Sayının      : " + yedek);
		System.out.println("Sayının Tersi: " + tersi);
	}
}
