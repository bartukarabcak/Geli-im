package Egitim_Ornekleri;

import java.util.Scanner;

public class EO_O5_Ekrandan_Taban_ve_�s_Alma {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.println("Taban Say�y� Girin= ");
		int a = oku.nextInt();
		System.out.println("Say�n�n Kuvvetini Girin= ");
		int b = oku.nextInt();
		System.out.println("Girdi�iniz taban= " + a + " Girdi�iniz Kuvvet= " + b + " Sonuc= " + (int) Math.pow(a, b));
		oku.close();
	}
}
