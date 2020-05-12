package cashbook;

import java.util.Scanner;

public class ClubCashBook extends GroupCashBook {
	
	public ClubCashBook(CashBookKind kind) {
		super(kind);
	}
	
	public void setUserInput(Scanner input) {

		System.out.println("동아리 가계부입니다.");
		setCashBookDate(input);
		setCashBookInwithYN(input);
		setCashBookOut(input);
		setCashBookSum(input);
	}
	public void setCashBookInwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("수입이 있나요 ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				System.out.print("수입을 입력하세요 : ");
				setCashBookIn(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("코로나로 인해 동아리활동을 못하여 수입이 없습니다.");
				this.setIn(0);
				break;
			}
			else {
			}
		}
	}		
	
}
