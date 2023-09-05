public class Cat extends Animal {
    public Cat() {
        super("Cat", "Meat");
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " is meowing...");
        setHappiness(getHappiness() + 2.5);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 2);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball of yarn...");
        setHappiness(getHappiness() + 1.5);
        if (getHappiness() >= 10) {
            setHappiness(10);
        }
        setEnergy(getEnergy() - 1);
        setHunger(getHunger() - 1);

        setHappinessCounter(0);
    }
}
