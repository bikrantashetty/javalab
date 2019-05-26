class TravelAgent implements TourPlan
{
	double totalFare=0;
	
	public void chennaiToHyd(String mode,double fare){
		System.out.println("Travel Chennai to Hyderabad by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
	
	public void hydToIndore(String mode,double fare){
		System.out.println("Travel Hyderabad to Indore by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
	
	public void indoreToDelhi(String mode,double fare){
		System.out.println("Travel Indore to Delhi by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
	
	void totalTravelExpenditure(){
		System.out.println("Total Travell Expenditure to reach from chennai to Delhi is "+totalFare);
	}
}