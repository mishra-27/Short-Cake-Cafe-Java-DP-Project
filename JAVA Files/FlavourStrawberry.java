package Final;
class FlavourStrawberry extends Cake{
	Cake cake;
	FlavourStrawberry(Cake cake){ 
	this.cake=cake; 
	} 
	String cakeName(){ 
	return cake.cakeName()+" Strawberry Flavour"; 
	} 
	int cakePrice(){ 
	return cake.cakePrice()+100; 
	} 
}
