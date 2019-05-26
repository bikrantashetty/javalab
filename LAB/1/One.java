public class One {
	public static void main(String[] args) {
		Bank bankAcc=new Bank();
		bankAcc=new SBAccount("Prashant\n", "Janakpur\n", "9844391989\n", "PRS10029\n", "334521564205\n", "0215460123\n");
		bankAcc.calcInt();
		bankAcc.displayDetails();
		System.out.println("\n");
		bankAcc=new LoanAccount("Sneha\n", "Bangalore\n", "9035270794\n", "SNE10923\n", "203145681233\n", "2356871234\n",20000);
		bankAcc.calcInt();
		bankAcc.displayDetails();
		}
}
