package Lesson1;

public class Airplane {   
	String airplanePurpose; //класифікація літаків за призначенням, військові, пасажирські, вантажні тощо. Тип даних - текстовий рядок String.
	String airplaneFuelType; // тип пального.
	int airplineNumberOfEngines; //кількість двигунів, тип даних – цілі числа int.
    int airplineIssueDate; //дата випуску, тип даних – цілі числа int.
    int airplineWeight; //вага літака, тип даних – цілі числа int.
    int emergencyExit; //аварійні виходи.
    int passengerCompartment; // Кількість пасажирських місць.
    boolean refuelingInTheAir;  //атрибут можливості заправки літака в повітрі, тип даних - булева змінна, приймаюча значення true чи false.
    
    void activateAutopilot(){
    }

    void turnOnTheLights(){
    	//включити підсвітку панелі приборів.
    }
    
    void turnOnHeating(){
    	//включити обігрів салону.
    }
    
    void openСhassis(){
    	//активувати відкриття шассі.
    }
}