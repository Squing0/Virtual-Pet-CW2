import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Menu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Animal animal;
        while (true) {
            System.out.println("Choose an animal:");
            System.out.println("1. Bunny");
            System.out.println("2. Hamster");
            System.out.println("3. Cat");
            System.out.println("4. Fish");
            System.out.println("5. Dog");
            System.out.println("6. Parrot");

            System.out.print("Animal: ");
            
            int animalChoice;

            try {
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new Exception("The choice is empty.");
                }

                animalChoice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Number only!");
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            

            switch (animalChoice) {
                case 1 -> animal = new Bunny();
                case 2 -> animal = new Hamster();
                case 3 -> animal = new Cat();
                case 4 -> animal = new Fish();
                case 5 -> animal = new Dog();
                case 6 -> animal = new Parrot();
                default -> {
                    System.out.println("Invalid choice, please enter a number between 1 and 6.");
                    continue;
                }
            }

            while(animal.getName().isEmpty()) {
                System.out.println("Enter a name for your " + animal.getSpecies() + ":");
                System.out.print("Name:");

                String name;
            try {
                name = reader.readLine();
                String nameInput = name;
                if (name.isEmpty()) {
                    throw new Exception("The name cannot be empty!");
                }
                for(int i = 0; i < nameInput.length(); i++){
                    if(Character.isLetter(nameInput.charAt(i))){
                        continue;
                    }
                    else{
                        throw new IOException();
                    }
                }
                if (name.length() > 20){
                    throw new Exception("The name must be less than 20 characters!");
                }
            }
            catch(IOException e){
                System.out.println("Enter only letters!");
                continue;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            animal.setName(name);

            }


            while (true) {
                System.out.println("Choose an action:");
                System.out.println("1. Sleep");
                System.out.println("2. Eat");
                System.out.println("3. Communicate");
                System.out.println("4. Play");
                System.out.println("5. Display stats");

                int actionChoice;

                try {
                    String input = scanner.nextLine();

                    if (input.isEmpty()) {
                        throw new Exception("The choice is empty.");
                    }

                    actionChoice = Integer.parseInt(input);

                } catch (NumberFormatException e) {
                    System.out.println("Number only!");
                    continue;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                switch (actionChoice) {
                    case 1 -> animal.sleep();
                    case 2 -> animal.eat();
                    case 3 -> animal.communicate();
                    case 4 -> animal.play();
                    case 5 -> animal.displayStats();
                    default -> {
                        System.out.println("Invalid choice, please try again.");
                        continue;
                    }
                }
             
                boolean isPetDead = animal.checkDeath();
                if (isPetDead) {
                    System.out.println();
                    System.out.println(animal.getName() + " has died!");
                    System.out.println("Do you want to continue?\nIf so then please enter either 1 to continue or 2 to exit.");
                    int decision = scanner.nextInt();
                    if(decision == 1) {
                        break;
                    }
                    else if (decision == 2){ //
                        System.exit(0);
                    }
                }
                
                String hungerWarning = animal.checkHunger();
                if (hungerWarning.length() > 0) {
                    System.out.println(hungerWarning);
                }
                              
                String energyWarning = animal.checkEnergy();
                if (energyWarning.length() > 0) {
                    System.out.println(energyWarning);
                }
                
                String happinessWarning = animal.checkHappiness();
                if (happinessWarning.length() > 0) {
                    System.out.println(happinessWarning);
                }
            }
        }        
    }
}
