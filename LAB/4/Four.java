import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice=0;
		double amt=0;
		
		AxisBank ab=new AxisBank("NMIT1", "Bangalore", "123456", "ASTPM1000", "111222", 1000);
		
		ab.display();
		
		do{
			System.out.println("1 : Deposit\n2 : Withdraw\n3 : Exit");
			choice=scan.nextInt();
			
			switch(choice){
			case 1:System.out.println("Enter amount to be deposited : ");
				amt=scan.nextDouble();
				ab.depositAmount(amt);
				ab.display();
				break;
				
			case 2:	
				System.out.println("Enter amount to withdraw : ");
				amt=scan.nextDouble();
				ab.withdrawAmount(amt);
				ab.display();
				break;
				
			default:System.out.println("Enter Valid Option");
			}
		}while(choice!=3);
	scan.close();
	}
}