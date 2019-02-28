package problem04;

public class Main {
	public static void main(String[] args) {
		
		for(int i=1; i<=18; i++) {
			int random = (int) (Math.random()*9)+1;
			int random2 = (int) (Math.random()*9)+1;
			System.out.println(random+"x"+random2);
		}
	}
}