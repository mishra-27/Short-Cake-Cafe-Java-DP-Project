package Final;
class CakeFactory
{
	Cake cake;
	Cake createCake(String type){
		switch (type){
			case "eggless":
				cake= new EgglessCake();
				return cake;
			case "chocolate":
				cake= new FlavourChocolate(cake);
				return cake;
			case "mango":
				cake= new FlavourMango(cake);
				return cake;
			case "strawberry":
				cake= new FlavourStrawberry(cake);
				return cake;
			case "nuts":
				cake= new ToppingNuts(cake);
				return cake;
			case "oreo":
				cake= new ToppingOreo(cake);
				return cake;
			default:
				cake= new EggCake();
				return cake;
		}
	}
}