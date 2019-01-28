public class PC

{   
	String pcFirmware; //прошивка (UEFI, BIOS), тип даних - текстовий рядок String.
	String pcOS; //опереційна система, тип даних – текстовий рядок String.
	String processorArchitecture; //архітектура процесора, x86, x64, ARM і т.д, тип даних – текстовий рядок String.
	boolean discreteGraphicsCard; //атрибут наявності дискретної відеокарти, тип даних - булева змінна, приймаюча значення true чи false.
    float pcLoadingRAM;
	
	void turnOn() {
	}

	void turnOff(){
	}

	void reboot(){
	}
    
	void enableAutoUpdate(){
    }
}