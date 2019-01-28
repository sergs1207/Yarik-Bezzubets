public class Drone

{
	String droneManufacturer; //назва виробника. Тип даних - текстовий рядок String.
	String droneModel; // назва моделі.
	int droneNumberOfEngines; //кількість двигунів, тип даних – цілі числа int.
	int droneWeight; //вага дрону, тип даних – цілі числа int
	int droneFlightTime; //тривалість польоту від одного заряду.
	boolean smartphoneControl; //підтримка керування дроном зі смартфону, тип даних - булева змінна, приймаюча значення true чи false.
    boolean emergencyLanding; //режим аварійної посадки.
	
	public void enableSmartControl(){
		boolean smartphoneControl;
		smartphoneControl = true;
    }
    
	public void disableSmartControl(){
		boolean smartphoneControl;
		smartphoneControl = false;
    }
    
	public void activateEmergencyLanding(){
		boolean emergencyLanding;
		emergencyLanding = true;
    }
}