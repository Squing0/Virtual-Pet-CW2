public class Dog extends Animal {
    public Dog() {
        super("Dog", "Bones");
    }
    
    public void communicate() {
        System.out.println(getName() + " is barking...");
        setHappiness(getHappiness() + 2.5);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 2);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
    
    public void play() {
        System.out.println(getName() + " is playing fetch...");
        setHappiness(getHappiness() + 2);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1.5);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
}
