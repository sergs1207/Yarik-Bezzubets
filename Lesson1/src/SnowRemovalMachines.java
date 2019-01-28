public class SnowRemovalMachines

{   
	String machinesBrand; //назва виробника. Тип даних - текстовий рядок String.
	String machinesFuelType;
	int machineSpeeds;
	int machinesWeight;
	boolean machineHeadLight;
	boolean electricStart;  //електричний запуск, тип даних - булева змінна, приймаюча значення true чи false.
    
	public void startCleaningSnow(){
		//збільшує значення атрибута machineSpeeds на 1.
	}

	public void stopCleaningSnow(){
		int machineSpeeds;
		machineSpeeds=0;
	}
    
	public void turnOnHeadlight(){
		boolean machineHeadLight;
		machineHeadLight = true;
	}
	
	private void turnOffHeadlight(){
		boolean machineHeadLight;
		machineHeadLight = false;
	}
	
	private void startElectricRun(){
		boolean electricStart;
		electricStart = true;
	}
	
	private void stopElectricRun(){
		boolean electricStart;
		electricStart = false;
	}
}