package Composition;

public class SmartKitchen {
    DishWasher dishWasher;
    CoffeeMaker brewMaster;
    Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox =  new Refrigerator();
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag){
        getDishWasher().setHasWorkToDo(dishWasherFlag);
        getBrewMaster().setHasWorkToDo(coffeeFlag);
        getIceBox().setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork(){
        getBrewMaster().brewCoffee();
        getIceBox().orderFood();
        getDishWasher().doDishes();
    }
}

class Refrigerator {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Food is order, please wait...");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("lalalalalala.......");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("coffee is brewing");
            hasWorkToDo = false;
        }
    }
}
