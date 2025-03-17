package loops_pgms;

public class Series_2 {

	public static void main(String[] args) {
		// TO print series- 8 88 888 8888 88888
		int num=8;
		for(int i=1;i<=10;i++) {
			num=num*10+8;
			System.out.print(num+" ");
		}
	}

}
