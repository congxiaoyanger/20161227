package observer;

public class ContentObserver implements Observer {

	public ContentObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		
		System.out.println("ContentObserver state:" + str);

	}

}
