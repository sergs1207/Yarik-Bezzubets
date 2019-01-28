public class Airplane

{
	boolean refuelingInTheAir;  //атрибут можливості заправки літака в повітрі, тип даних - булева змінна, приймаюча значення true чи false.
	String airplanePurpose; //класифікація літаків за призначенням, військові, пасажирські, вантажні тощо. Тип даних - текстовий рядок String.
	int airplineIssueDate; //дата випуску, тип даних – цілі числа int.
	String airplaneWeight;
	int airplineNumberOfEngines; //кількість двигунів, тип даних – цілі числа int.
	int airplaneSpeed;
	boolean airplaneDashboardLight; // підсвітка панелі приладів
	boolean airplaneAutopilot;
	int emergencyExit; //аварійні виходи.
	int passengerCompartment; //кількість пасажирських місць.
    
	public void enadleAutopilot(){
		boolean airplaneAutopilot;
		airplaneAutopilot = true;
    }
	
	public void disableAutopilot(){
    	boolean airplaneAutopilot;
    	airplaneAutopilot = false;
    }

	public void turnOnDashboardLights(){
    	boolean airplaneDashboardLight;
    	airplaneDashboardLight = true;
    }
    
	private void turnOffDashboardLights(){
    	boolean airplaneDashboardLight;
    	airplaneDashboardLight = false;
    }
	
	private void addBaggage(){
    	// збільшує значення атрибуту airplaneWeight на 10;
    }
	
	private void throwOutBaggage(){
		// зменшує значення атрибуту airplaneWeight на 10;
    }
}