public abstract class Animal {
    private String name;
    private final String species;
    private final String food;
    private double hunger;
    private double happiness;
    private double energy;
    private int happinessCounter;

    public Animal(String s, String f) { // It made more sense to put both of these in here
        this.name = "";
        this.species = s;
        this.food = f;
        this.hunger = 5;
        this.happiness = 5;
        this.energy = 5;
        this.happinessCounter = 0;
    }
    
    public void sleep() {
        this.energy += 2.5;
        this.hunger += 1;
        this.happiness -= 0.5;
        System.out.println(this.name + " is sleeping."); 
        
        if (this.energy >= 10) {
            this.energy = 10;
        }

        this.happinessCounter += 1;
        checkHappinessCounter();
    }

    public void eat() {
//        setEnergy(getEnergy() + 5); 		// Not sure about including this as it essentially means that no stats go down here!
        this.hunger -= 2;
        System.out.println(this.name + " is eating " + this.food + ".");

        if(this.hunger <= 0) {
        	this.hunger = 0;
        }

        this.happinessCounter += 1;
        checkHappinessCounter();
    }
    abstract void communicate();

    abstract void play(); // Both play and communicate can be made abstract as they are changed in each individual animal class.

    public void displayStats() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Food: " + getFood());
        System.out.println(createBar("Hunger: ", this.hunger));
        System.out.println(createBar("Happiness: ", this.happiness));
        System.out.println(createBar("Energy: ", this.hunger));
    }
    public static String createBar(String name, double currentHealth) {
        int max = 10;
        int length = 10;
        double healthRatio = currentHealth / max;
        int barFillLength = (int) (healthRatio * length);

        String barFill = "|".repeat(barFillLength);
        String barEmpty = " ".repeat(length - barFillLength);

        return name + "[" + barFill + barEmpty + "] " + currentHealth + "/" + max;
    }
    public String checkHunger() {
    	if (this.hunger >= 8) {
            return this.name + " is very hungry.";
        }
    	
    	else if (this.hunger >= 6) {
            return this.name + " is hungry.";
        }
    	
    	else if (this.hunger <= 0) {
        	return this.name + " is full! ";
        }
        
        return "";
    }
    
    public String checkEnergy() {
        if (this.energy <= 2) {
            return this.name + " is very tired.";
        } else if (this.energy <= 4) {
            return this.name + " is tired. ";
        }
        else if (this.energy >= 10) {
        	return this.name + " is full of energy! ";
        }
    	return "";
    }
    
    public String checkHappiness() {
        if (this.happiness >= 10) {
            System.out.println(this.name + " is extremely happy! ");
        } else if (this.happiness >= 8) {
            System.out.println(this.name + " is very happy. ");
        } else if (this.happiness >= 6) {
            System.out.println(this.name + " is happy.");
        }
        else if (this.happiness <= 4) {
        	System.out.println(this.name + " is sad. ");
        }
        else if (this.happiness <= 2) {
        	System.out.println(this.name + " is severely sad!");
        }
		return "";
    }
    
    public boolean checkDeath() {
    	return this.hunger >= 10 || this.energy <= 0 || this.happiness <= 0;
        
    }

    public void checkHappinessCounter(){
        if(happinessCounter >= 3) {
            this.happiness -= 2;
            System.out.println(this.name + "is feeling neglected");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getSpecies() {
        return species;
    }
    public String getFood() {
        return food;
    }
    public double getHunger() {
        return hunger;
    }
    public void setHunger(double hu) {
        this.hunger = hu;
    }
    public double getHappiness() {
        return happiness;
    }
    public void setHappiness(double ha) {
        this.happiness = ha;
    }
    public double getEnergy() {
        return energy;
    }
    public void setEnergy(double e) {
        this.energy = e;
    }
    public void setHappinessCounter(int HC){this.happinessCounter = HC;}

}
