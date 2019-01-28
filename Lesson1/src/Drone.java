public class Drone

{
	String droneManufacturer; //назва виробника. Тип даних - текстовий рядок String.
	String droneModel; // назва моделі.
	int droneNumberOfEngines; //кількість двигунів, тип даних – цілі числа int.
	int droneWeight; //вага дрону, тип даних – цілі числа int
	int droneFlightTime; //тривалість польоту від одного заряду.
	boolean smartphoneControl; //підтримка керування дроном зі смартфону, тип даних - булева змінна, приймаюча значення true чи false.
    boolean emergencyLanding; //режим аварійної посадки.
	
	public void startVideoRecording(){
		//зменшення значення атрибута droneFlightTime на 5.
    }
    
	public void startVideoRecording(){
		//зменшення значення атрибута droneFlightTime на 5.
    }
    
	public void activateEmergencyLanding(){
		boolean emergencyLanding;
		emergencyLanding = true;
    }
	
	private void disableEmergencyLanding(){
		boolean emergencyLanding;
		emergencyLanding = false;
    }
	
	private void enableSmartControl(){
		boolean smartphoneControl;
		smartphoneControl = true;
    }

	private void disableSmartControl(){
		boolean smartphoneControl;
		smartphoneControl = false;
    }

}