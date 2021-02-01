package Final;
class FlavourMango extends Cake{
	Cake cake;
	FlavourMango(Cake cake){ 
	this.cake=cake; 
	} 
	String cakeName(){ 
	return cake.cakeName()+" Mango Flavour"; 
	} 
	int cakePrice(){ 
	return cake.cakePrice()+150; 
	} 
}