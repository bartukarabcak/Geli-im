package Egitim_Ornekleri;

import java.util.Scanner;

public class EO_O2_Kullan�c�dan_Girilen_Toplam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println((i + 1) + ". say�y� giriniz:");
			a = a + sc.nextInt();
		}
		System.out.println("Sonu�=" + a);
		sc.close();
	}
}
