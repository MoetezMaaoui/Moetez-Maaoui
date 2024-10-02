package ex3;

public class test_main {

	public static void main(String[] args) {
		livre L1,L2,L3;
		L1 = new livre();
		L2 = new livre ("castro","risselte el 8ofrane");
		L2.setNbPages(54);
		L3 = new livre();
		L3.setauteur("psycom");
		L3.settitre("slow death");
		L3.setNbPages(50);
		
		livre Tab[] = new livre[3];
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
			
	}

}
