package problem02;

public class MyService extends BaseService {
	int a=0;
	
	public String afternoon() {
		a++;
		return "오후서비스시작";
	}
	
	@Override
	public String day() {
		return "낮서비스시작";
	}
	
	@Override
	public String night() {		
		if(a==0) {
			return afternoon();
		}
		return "밤서비스시작";
	}

	
}
