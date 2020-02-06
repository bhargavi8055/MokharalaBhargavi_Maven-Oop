package EPAM.NewYearGift;



public class Sweets implements Candies_Sweets {
	public String candie_name1;
	public int index;
	Sweets(String candie_name){
	this.candie_name1=candie_name;
	
	}
	
	public int calculate_Weight(){
	
	String[] candies_names={"Barphi","AlmondJoy","Peda","Swiss"};
	int[] candies_weights={150,200};
	//System.out.println("in candie method candie name"+candie_name1);
	for(int i=0;i<candies_names.length;i++){
	if (candies_names[i].equals(candie_name1)){
	index=i;
	}
	}
	//System.out.println("in candies method candie weight"+candies_weights[index]);
	return candies_weights[index];
	}
}