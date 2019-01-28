public class AlcoholDrinks

{
	boolean alcoholCocktail; //поєднання із іншими напоями, тип даних - булева змінна, приймаюча значення true чи false.
	float bottleVolume; //об'єм бутилки.
	String alcoholCountry; //країна виробник.
	float ABV; //вміст спирту в напої.
	String alcoholType; //тип спирту, з якого вироблено алкогольний напий, зерновий, виноградний і т.д. 
   
	public void startShakeCocktail() {
		boolean alcoholCocktail;
		alcoholCocktail = true;
    }

	public void stopShakeCocktail() {
		boolean alcoholCocktail;
		alcoholCocktail = false;
    }

	public void addNonAlcoholDrink(){
		float ABV;
		ABV = 0,01;
    }
	
	private void addMoreABV(){
		//збільшує значення атрибуту ABV на 5.
    }
	
	private void pourAHalfLiter(){
		//збільшує значення атрибуту bottleVolume на 0,5.
    }

	private void pourALiter(){
		//збільшує значення атрибутe bottleVolume на 1.
    }
}