public class Food

{   
	String foodSources; //джерело походження, тваринне чи рослинне.
	int foodProteins; //вміст білків, тип даних – цілі числа int.
	int foodFats; //вміст жирів, тип даних – цілі числа int.
	int foodCarbohydrates; //вміст вуглеводів, тип даних – цілі числа int.
	int foodShelfLife; //термін придатності.
	boolean rawFood;  //атрибут можливості вживання в сирому вигляді, тип даних - булева змінна, приймаюча значення true чи false.
	boolean foodGlutenFree; //атрибут наявності глютену в їжі, тип даних - булева змінна, приймаюча значення true чи false.
    
	public void fryFoodOnOil(){
		//збільшення атрибута foodFats на 1.
	}

	public void fryFoodOnFire(){
		//зменшення атрибуту foodFats на 1.
	}
	
	public void startFreezingFood(){
		//збільшення атрибута foodShelfLife на 10.
	}
}