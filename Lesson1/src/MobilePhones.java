public class MobilePhones

{
	String phoneOS; //опереційна система, тип даних – текстовий рядок String.
	String phoneColour; // колір телефону.
	float phoneDisplayResolution; //роздільна здатність екрану.
	int phoneIssueDate; //дата випуску, тип даних – цілі числа int.
	int phoneWeight; //вага телефону, тип даних – цілі числа int.
	boolean qiWirelessCharge;  //підтримка бездротвої зарядки телефонк, тип даних - булева змінна, приймаюча значення true чи false.
    boolean phoneNFCPayment;
    boolean phoneCallRecorder;
	
	public void enableRecordCall(){
		boolean phoneCallRecorder;
		phoneCallRecorder = true;
	}

	public void disableRecordCall(){
		boolean phoneCallRecorder;
		phoneCallRecorder = false;
	}
    
	public void enablePhonePay(){
		boolean phoneNFCPayment;
		phoneNFCPayment = true
    }
}