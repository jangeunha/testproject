import java.util.List;
import java.util.Scanner;

public class TestKings {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<King> kings = (new Kings()).getKings();
		
		for(King theKing : kings) {
			System.out.println(theKing.getName()+ " "
					+ theKing.getFrom() + " "
					+theKing.getTo());
		}
		
		System.out.println("ã�� ���� ���� �⵵��? ");
		int startYear = scanner.nextInt();
		System.out.println("ã�� ���� ���� �⵵��? ");
		int endYear = scanner.nextInt();
		scanner.close();
		
		
		for(King theKing : kings) {
			
			if(startYear<=theKing.getFrom()&&theKing.getTo()<=endYear) {
			System.out.println(theKing.getName()+ " " + theKing.getFrom() + " "+theKing.getTo());
				if(theKing.getTo()==endYear) break;
			}
			//else break;
		}
	}
}
