package Subject;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public abstract class Subject {
	
	List<Observer> list = new ArrayList<Observer>();

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public void attach(Observer observer){
		
		list.add(observer);
	}
	
	public void detach(Observer observer) {
		
		list.remove(observer);
	}
	
	public void nodifyObservers(String str) {
		
		for(Observer obs : list) {
			
			obs.update(str);
		}
	}
}
