public class CoffeeTouchScreenAdapter implements IcoffeeMachine {
    private OldCoffeeMachine oldCoffeeMachine;

    public void initializeOldCoffeeMachine(OldCoffeeMachine oldCoffeeMachine)
    {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}
