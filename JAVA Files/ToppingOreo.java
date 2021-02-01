package Final;
class ToppingOreo extends Decorator{
	ToppingOreo(Cake cake){ 
	this.cake=cake; 
	} 
	String cakeName(){ 
	return cake.cakeName()+" with topping Oreo"; 
	} 
	int cakePrice(){ 
	return cake.cakePrice()+55; 
	}
}