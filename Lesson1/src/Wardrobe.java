public class Wardrobe

{   
	String wardrobeBrand; //назва виробника. Тип даних - текстовий рядок String.
	String wardrobeModel; //назва моделі.
	int wardrobeHeight; //висота шафи, тип даних – цілі числа int.
	int wardrobeWeight; //вага шафи, тип даних – цілі числа int.
	boolean childrenDoorLock; //захиcт від вікриття дверей шафи дітьми, тип даних - булева змінна, приймаюча значення true чи false.
	boolean wardrobeDoorLight;
    
	public void addСlothesToWardrobe(){
		//збільшує значення атрибуту wardrobeWeight на 5;
	}
    
	public void removeClothesFromWardrobe(){
		//зменшує значення атрибуту wardrobeWeight на 5;
	}
    
	public void enableDoorLight(){
    	boolean wardrobeDoorLight;
    	wardrobeDoorLight = true;
	}
	
	private void disableDoorLight(){
    	boolean wardrobeDoorLight;
    	wardrobeDoorLight = false;
	}
	
	private void enableChildrenDoorLock(){
    	boolean childrenDoorLock;
    	childrenDoorLock = true;
	}
	
	private void disableChildrenDoorLock(){
    	boolean childrenDoorLock;
    	childrenDoorLock = false;
	}
}