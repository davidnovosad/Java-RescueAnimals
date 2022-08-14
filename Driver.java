import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    //New Array list for storing monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in); //Initialization of scanner function for user input
    	

    	//initialization of both lists
        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
    char input = 0;
    int input1 = 0;
    //loop that will end only if user inputs letter q
    while(input != 'q') {
    	displayMenu();
        input = scan.next().charAt(0);
        input1 = Character.getNumericValue(input);
        if (input == 'q') {
        	input1 = 7;
        }
        switch (input1) { //switch case include all ases and a default for wrong input
        	case 1:
        		intakeNewDog(scan);
        		break;
        	case 2:
        		intakeNewMonkey(scan);
        		break;
        	case 3:
        		reserveAnimal(scan);
        		break;
        	case 4:
        		printAnimals("dog");
        		break;
        	case 5:
        		printAnimals("monkey");
        		break;
        	case 6:
        		printAnimals("available");
        		break;
        	case 7:
        		System.out.println("Thank you for using our site!");
        		System.exit(0);
        		break;
        	}
    	}
    }
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	//values in the monkey array list
    	Monkey monkey1 = new Monkey("Harambe", "Tamarin", "male", "8", "120", "04-30-2014", "United States", "Phase III", false, "United States", 12, 20, 30);
    	Monkey monkey2 = new Monkey("Garrison", "Marmoset", "male", "3", "30", "08-12-2019", "Mexico", "intake", false, "Mexico", 9, 21, 10);
    	Monkey monkey3 = new Monkey("Helena", "Capuchin", "female", "5", "41", "11-20-2017", "Egypt", "in service", true, "Peru", 12, 28, 8);
    	//addition of the monkeys to the list
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            scanner.useDelimiter(System.lineSeparator());
            System.out.println("What is the name of the monkey? ");
            String name = scanner.next();
            //this is checking if the monkey is already in the system
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nSorry, this monkey is already in our system!\n\n ");
            		return; //brings user back to the main menu
            	}
            }
            System.out.println("What species is the monkey? ");
            String species = scanner.next();
            // if function checks if monkey is the correct species
            if (!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && !(species.equalsIgnoreCase("Macaque")) && 
            	!(species.equalsIgnoreCase("Marmoset")) && !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))) {
            	System.out.println("Unfortunately, this species of monkey is not eligible for training!");
            	return; //brings user back to the main menu
            }
            //all the questions to be saved in the array list
            System.out.println("What is the monkey's gender? (Male/ Female) ");
            String gender = scanner.next();
            System.out.println("What is the monkey's age? (In years) ");
            String age = scanner.next();
            System.out.println("What is the monkey's weight? (In lbs) ");
            String weight = scanner.next();
            System.out.println("What is the date of acquisition of the monkey? (format mm-dd-yyy)");
            String acquisitionDate = scanner.next();
            System.out.println("In what country was this monkey acquired? ");
            String acquisitionCountry = scanner.next();
            System.out.println("What is the training status of the monkey?\n(Intake, Phase I, Phase II, Phase III,\nPhase IV, Phase V, In-service, Farm)");
            String trainingStatus = scanner.next();
            System.out.println("Is the monkey reserved? (True or False) ");
            Boolean reserved = scanner.nextBoolean();
            System.out.println("What is the monkey's service country? ");
            String inServiceCountry = scanner.next();
            System.out.println("What is the body length of the monkey? (In inches) ");
            int bodyLength = scanner.nextInt();
            System.out.println("What is the tail length of the monkey? (In inches) ");
            int tailLength = scanner.nextInt();
            System.out.println("What is the height of the monkey? (In inches) ");
            int height = scanner.nextInt();
            System.out.println("Thank you! Monkey " + name + " was successfully registered in our system.");
            monkeyList.add(new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, 
            		tailLength, height, bodyLength));
            
            
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String type) {
            if (type.toLowerCase().equals("dog")) { //checks for all the dogs in the list and prints their needed values
            	System.out.println("List of dogs:\n(name, training status, acquisition location, reserved) ");
                for(Dog dog: dogList){
                    System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved());
            	}
            }
            else if (type.toLowerCase().equals("monkey")) { //checks for all the monkeys in the list and prints their needed values
            	System.out.println("List of monkeys:\n(name, training status, acquisition location, reserved) ");
                for(Monkey monkey: monkeyList){
                    System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
            	}
            }
            else if (type.toLowerCase().equals("available")) { //checks for all the available animals in both lists and prints their needed values
            	System.out.println("This method needs to be implemented.");
            		}
            	}
}

