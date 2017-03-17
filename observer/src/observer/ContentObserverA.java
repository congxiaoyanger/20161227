package observer;

public class ContentObserverA implements Observer {

	public ContentObserverA() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub

		System.out.println("ContentObserverA is :=" + str);
	}

}
