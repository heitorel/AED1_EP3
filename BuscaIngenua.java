package ep_aed1;

public class BuscaIngenua {
	
	public final int MAX = 1000000;
	public String[] arranjo;
	private int size = 0;
	
	public BuscaIngenua() {
		arranjo = new String[MAX];
	}
	
	public void insert(String s) {
		arranjo[size] = s;
		size++;
	}
	
	public boolean find(String a) {
		for(int i=0; i<size; i++) {
			if(arranjo[i].equals(a)) {
				return true;
			}
		}
		return false;
	}

}
