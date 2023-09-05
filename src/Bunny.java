public class Bunny extends Animal {
    public Bunny() {
        super("Bunny", "Carrots");
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " is thumping its foot...");
        setHappiness(getHappiness() + 2);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1.5);
        setHunger(getHunger() + 1);

        setHappinessCounter(0);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is hopping around...");
        setHappiness(getHappiness() + 2);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1.5);
        setHunger(getHunger() + 1);

        setHappinessCounter(0);
    }
}
