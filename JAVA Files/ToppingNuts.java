package Final;
class ToppingNuts extends Decorator{
	ToppingNuts(Cake cake){ 
	this.cake=cake; 
	} 
	String cakeName(){ 
	return cake.cakeName()+" with topping Nuts"; 
	} 
	int cakePrice(){ 
	return cake.cakePrice()+25; 
	}
}
