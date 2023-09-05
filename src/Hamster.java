public class Hamster extends Animal {
    public Hamster() {
        super("Hamster", "Seeds");
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " is squeaking...");
        setHappiness(getHappiness() + 1.5);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is running on its wheel...");
        setHappiness(getHappiness() + 1);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 2);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
}
