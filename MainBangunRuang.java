package lab.amikom;

import java.util.Scanner;

public class MainBangunRuang {
public static void main(String[] args) {
		
	double p = 0, l = 0, t = 0;
	Scanner sc = new Scanner (System.in);
	try {
		System.out.println("isikan panjang:");
		p = sc.nextDouble();
		System.out.println("isikan lebar: ");
		l = sc.nextDouble();
		System.out.println("isikan tinggi");
		t = sc.nextDouble();
	}catch(Exception e){
		System.err.println("format yang anda isikan salah");
	}
	
	BangunRuang br = new BangunRuang(p, l, t);
	System.out.println("Volum Balok:"+br.VolumBalok());
	System.out.println("Volum Kerucut:"+br.VolumKerucut());
}
}