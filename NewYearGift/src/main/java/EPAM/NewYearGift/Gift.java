package EPAM.NewYearGift;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Gift{
	

	

	public static void main(String args[]){
		int choice;
		ArrayList<Integer> gift_wt=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter lower range\n");
		int lower=scan.nextInt();
		System.out.println("enter higher range\n");
		int higher=scan.nextInt();
		if (lower>higher) {
			System.out.println("please enter a valid range");
			}
		else {
		System.out.println("enter how many childrens\n");
		int count=scan.nextInt();

		for (int i=1;i<=count;i++){
			ArrayList<Integer> candies_wt=new ArrayList<Integer>();
			int sum=0;
			System.out.println("enter the items into the gift box for child: "+i);
			do{
				System.out.println("enter your choice\n 1.sweets\n 2.chocolates\n 3.exit	");
				choice=scan.nextInt();
				if (choice==2){
					System.out.println("enter your choice(name) \nAlmondJoy\nSwiss\n");
					String choice1=scan.next();
					if (choice1.equals("AlmondJoy") ||choice1.equals("Swiss")){
						Candies obj=new Candies(choice1);
						int wt=obj.calculate_Weight();
						sum+=wt;
						//System.out.println(sum);
						candies_wt.add(wt);
						/*for(int j=0;j<candies_wt.size();j++){
							System.out.print(candies_wt.get(j)+" ");
						}*/
					}
					else{
					System.out.println("please enter a valid candie name");
					}
				}
				else if (choice==1){
					System.out.println("enter your choice (name)\npeda\nBarphi\n");
					String choice1=scan.next();
					if (choice1.equals("peda" )||choice1.equals("Barphi")){
						Sweets obj=new Sweets(choice1);
						int wt=obj.calculate_Weight();
						sum+=wt;
						//System.out.println(sum);
					
					}
					else{
					System.out.println("please enter a valid candie name");
					}

				}
				else if (choice!=3){
					System.out.println("enter a valid candie type");
					System.out.println("enter your choice\n 1.sweets\n 2.chocolates\n 3.exit");
					choice=scan.nextInt();

					}
				
				
			}while(choice!=3);
			//System.out.println(sum);
			if (sum<=higher && sum>=lower){
				Collections.sort(candies_wt);
				if (candies_wt.size()==0) {
					System.out.println("There are no candies in the gift box of child "+i);
				}
				else {
					
				System.out.print("candies weights order in a gift of child "+i+":");
				for(int j=0;j<candies_wt.size();j++){
				System.out.print(candies_wt.get(j)+" ");
				}
			}}
				else {
					System.out.println("weight of gift box of child "+i+"is not in the  specified range");
				}
		}
			
		System.out.println();	
		//System.out.println("completed");
	}
}
}
		