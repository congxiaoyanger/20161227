package Subject;

public class ContentSubject extends Subject {

	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public ContentSubject() {
		// TODO Auto-generated constructor stub
	}

	public void chang(String str) {
		
		this.state = str;
		this.nodifyObservers(str);
	}
	
}
