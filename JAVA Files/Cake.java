package Final;
abstract public class Cake{
	public final void templateMethod(int quantity){
	makeCake(quantity);
	//makeCrust;
	//addLayers(layers);
	bake();
	refrigerate();
	}

	public void makeCake(int quantity){}
//	{
//	System.out.println("Quantity: "+quantity+" cake(s)");
//	}

	public void bake() {}                      //Hook Template (specific minutes of time to bake cake)

	public void refrigerate() {}               //Hook Template 

	abstract String cakeName();	

	abstract int cakePrice();
}
