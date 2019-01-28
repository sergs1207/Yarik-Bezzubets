public class MobilePhones

{
	String phoneOS; //опереційна система, тип даних – текстовий рядок String.
	String phoneColour; // колір телефону.
	float phoneDisplayResolution; //роздільна здатність екрану.
	int phoneIssueDate; //дата випуску, тип даних – цілі числа int.
	int phoneProcessorTemperature; //вага телефону, тип даних – цілі числа int.
	boolean qiWirelessCharge;  //підтримка бездротвої зарядки телефонк, тип даних - булева змінна, приймаюча значення true чи false.
    boolean phoneNFCPayment;
    boolean phoneCallRecorder;
	
	public void startCall(){
		//збільшує значення атрибуту phoneProcessorTemperature на 5.
	}

	public void stopCall(){
		//зменшує значення атрибуту phoneProcessorTemperature на 5.
	}
    
	public void enablePhonePay(){
		boolean phoneNFCPayment;
		phoneNFCPayment = true;
    }
	
	private void disablePhonePay(){
		boolean phoneNFCPayment;
		phoneNFCPayment = false;
    }
	
	private void enableRecordCall(){
		boolean phoneCallRecorder;
		phoneCallRecorder = true;
    }
	
	private void disableRecordCall(){
		boolean phoneCallRecorder;
		phoneCallRecorder = false;
    }
}