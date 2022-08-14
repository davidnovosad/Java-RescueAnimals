//Monkey class inherits from RescueAnimal class
public class Monkey extends RescueAnimal {
	
	//Monkey-specific attributes
	private int tailLength;
	private int height;
	private int bodyLength;
	private String species;
	
	//default constructor
	public Monkey(String name, String species, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, 
			String trainingStatus, boolean reserved, String inServiceCountry, int tailLength, 
			int height, int bodyLength) {
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		setName(name);
		setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
       }
	
	//Accessor method for Tail Length
	public int getTailLength() {
		return tailLength;
	}
	
	//Mutator method for Tail Length
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	
	//Accessor method for Height
	public int getHeight() {
		return height;
	}
	
	//Mutator method for Height
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Accessor method for Body Length
	public int getBodyLength() {
		return bodyLength;
	}
	
	//Mutator method for Body Length
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	//Accessor method for Species
	public String getSpecies() {
		return species;
	}
	
	//Mutator method for Species
	public void setSpecies( String species) {
		this.species = species;
	}
}
