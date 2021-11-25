package Egitim_Ornekleri;

import java.util.Scanner;

public class EO_O5_Ekrandan_Taban_ve_Üs_Alma {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.println("Taban Sayýyý Girin= ");
		int a = oku.nextInt();
		System.out.println("Sayýnýn Kuvvetini Girin= ");
		int b = oku.nextInt();
		System.out.println("Girdiðiniz taban= " + a + " Girdiðiniz Kuvvet= " + b + " Sonuc= " + (int) Math.pow(a, b));
		oku.close();
	}
}
