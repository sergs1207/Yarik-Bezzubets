public class PC

{   
	String pcFirmware; //прошивка (UEFI, BIOS), тип даних - текстовий рядок String.
	String pcOS; //опереційна система, тип даних – текстовий рядок String.
	String processorArchitecture; //архітектура процесора, x86, x64, ARM і т.д, тип даних – текстовий рядок String.
	boolean discreteGraphicsCard; //тип даних - булева змінна, приймаюча значення true чи false.
    float pcRAMMemory;
    float hardDriveMemory;
	
	public void installApp () {
		//зменшує значення атрибуту hardDriveMemory на 50.
	}

	public void removeApp(){
		//збільшує значення атрибуту hardDriveMemory на 50.
	}

	public void launchApp(){
		//зменшує значення атрибуту pcRAMMemory на 25.
	}
    
	private void closeApp(){
		//збільшує значення атрибуту pcRAMMemory на 25.
    }
	
	private void enableDiskcreteGraphic(){
		boolean discreteGraphicsCard;
		discreteGraphicsCard = true;
    }
	
	private void disableDiskcreteGraphic(){
		boolean discreteGraphicsCard;
		discreteGraphicsCard = false;
    }
}