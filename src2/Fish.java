public class Fish extends Animal {
    public Fish() {
        super("Fish", "Flakes");
    }
    
    public void communicate() {
        System.out.println(getName() + " is swimming...");
        setHappiness(getHappiness() + 1.5);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
    
    public void play() {
        System.out.println(getName() + " is swimming...");
        setHappiness(getHappiness() + 2);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
}
