package view;

import docarmo.ArvoreChar.Arvore;

public class main {

	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		
		char [] vt = {'k', 'm', 'd', 'b', 'f', 'l', 't', 'c', 'p', 'z', 'r'};
		
		for(char i : vt) {
			a.insert(i);
		}
		
	
		try {
			System.out.print("=======================\n");
			a.infixSearch();
			System.out.print("\n=======================\n");
			System.out.println("removeu 'M' da arvore");
			a.remove('m');
			System.out.print("=======================\n");
			a.prefixSearch();
			System.out.print("\n=======================\n");
			a.infixSearch();
			System.out.print("\n=======================\n");
			a.postfixSearch();
			System.out.print("\n=======================\n");
			a.search('r');
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
