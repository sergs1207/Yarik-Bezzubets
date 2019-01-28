public class DaylightLamps

{   
	String lampBrand; //назва виробника. Тип даних - текстовий рядок String.
	String lampModel; //назва моделі.
	int lampPartNumber; //номер партії, тип даних – цілі числа int.
	int lampWeight; //вага лампи, тип даних – цілі числа int
	boolean wifiControl; //підтримка керування зі смартфону, тип даних - булева змінна, приймаюча значення true чи false.
	boolean lampSafeMode;
	int lampBrightness;
	int lampColorTone; //колір світопередачі (теплий, холодний)

	public void turnOn(){
		//збільшує значення атрибута lampBrightness на 1
	}

	public void turnOff(){
		int lampBrightness;
		lampBrightness = 0;
	}

	public void enableEnergySafeMode(){
		boolean lampSafeMode;
		lampSafeMode = true
	}
}