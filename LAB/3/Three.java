public class Three {
	public static void main(String args[])
	{
		TravelAgent ta = new TravelAgent();
		ta.chennaiToHyd("Plane\n",10000);
		ta.hydToIndore("Bus\n",7000);
		ta.indoreToDelhi("Train\n",6000);
		ta.totalTravelExpenditure();
	}
}