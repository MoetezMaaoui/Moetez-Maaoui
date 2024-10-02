package ex4;

import ex4.c_livre;

public class test_main {

	public static void main(String[] args) {
		c_livre L1,L2,L3;
		L1 = new c_livre();
		
		L2 = new c_livre ("castro","risselte el 8ofrane",50);
		L2.setNbPages(54);
		
		L3 = new c_livre();
		L3.setauteur("psycom");
		L3.settitre("slow death");
		L3.setprix(60);
		L3.setNbPages(50);
		L3.setprix(630);
		
		c_livre Tab[] = new c_livre[3];
		Tab[0] = L1;
		Tab[1] = L2;
		Tab[2] = L3;

		for(int i=0;i<3;i++) {
			Tab[i].decrire();
		}
		
		L1.settitre("Mrama");
		L1.setNbPages(42);
		for(int i=0;i<3;i++) {
			Tab[i].decrire();
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(Tab[i].getAuteur());
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(Tab[i].getprix());
		}
		
		
	}

}
