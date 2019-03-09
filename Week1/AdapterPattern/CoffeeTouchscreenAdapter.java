
// Part of the demo of Adpater design pattern
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	OldCoffeeMachine OldVendingMachine;
	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		OldVendingMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		OldVendingMachine.selectA();
	}
	public void chooseSecondSelection() {
		OldVendingMachine.selectB();
	}
}
