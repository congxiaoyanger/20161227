package customer;

import Subject.ContentSubject;
import observer.ContentObserver;
import observer.ContentObserverA;

public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContentObserver co = new ContentObserver();
		ContentObserverA coa = new ContentObserverA();


		
		ContentSubject cs = new ContentSubject();
		cs.attach(co);
		cs.attach(coa);
		
		cs.chang("congxin lai la.");
		

	}

}
