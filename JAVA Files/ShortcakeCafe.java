package Final;
import java.util.Scanner;
class ShortcakeCafe extends CakeFactory{

	public static void main(String[] args) {
		System.out.println("-----------Welcome to SHORT-CAKE CAFE-----------");
		CakeFactory cf=new CakeFactory();
		Cake c;
		StringBuilder cake_name= new StringBuilder();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of cakes: ");
		int number_of_cakes=s.nextInt();
		int price=0;
		for(int i=0;i<number_of_cakes;i++){
			System.out.println("Do you want an");
			System.out.println("1)Eggless cake, or");
			System.out.println("2)Egg cake");
			System.out.println("Enter your choice: ");
			int base_choice=s.nextInt();
			final String base;
			if(base_choice==1){
				base="eggless";
				c=cf.createCake(base);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
//				cake_name.append(c.cakeName());
			}
			else if(base_choice==2){
				base="";
				c=cf.createCake(base);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
//				cake_name.append(c.cakeName());
			}
			System.out.println("Which flavour of cake would you like to have?");
			System.out.println("1)Chocolate cake, or");
			System.out.println("2)Mango cake, or");
			System.out.println("3)Strawberry cake");
			int flavour_num=s.nextInt();
			final String flavour;
			if(flavour_num==1){
				flavour="chocolate";
				c=cf.createCake(flavour);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
//				cake_name.append(c.cakeName());
			}
			else if(flavour_num==2){
				flavour="mango";
				c=cf.createCake(flavour);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
//				cake_name.append(c.cakeName());
			}
			else if(flavour_num==3){
				flavour="strawberry";
				c=cf.createCake(flavour);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
//				cake_name.append(c.cakeName());
			}
			System.out.println("Which topping would you like to have on your cake?");
			System.out.println("1)Nuts, or");
			System.out.println("2)Oreo, or");
			int topping_num=s.nextInt();
			final String topping;
			if(topping_num==1){
				topping="nuts";
				c=cf.createCake(topping);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
				cake_name.append(c.cakeName());
			}
			else if(topping_num==2){
				topping="oreo";
				c=cf.createCake(topping);
				c.templateMethod(number_of_cakes);
				price+=c.cakePrice();
				cake_name.append(c.cakeName());
			}
			cake_name.append(" and a ");
		}
		System.out.println("Your order details: ");
		System.out.println("Number of cake(s): "+number_of_cakes);
		System.out.println("Cake: "+cake_name);
		System.out.println("Total Amount: Rs "+price);
		System.out.print("Bon Appétit (:");
	}
}