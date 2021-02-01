package Final;
class FlavourChocolate extends Cake{
	Cake cake;
	FlavourChocolate(Cake cake){ 
	this.cake=cake; 
	} 
	String cakeName(){ 
	return cake.cakeName()+" Chocolate Flavour"; 
	} 
	int cakePrice(){ 
	return cake.cakePrice()+200; 
	} 
}