public class Parrot extends Animal {
    public Parrot() {
        super("Parrot", "Seeds");
    }
    
    public void communicate() {
        System.out.println(getName() + " is talking...");
        setHappiness(getHappiness() + 2);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1.5);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
    
    public void play() {
        System.out.println(getName() + " is playing with its toys...");
        setHappiness(getHappiness() + 1.5);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
}
