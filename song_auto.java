/**
   * This program uses classes to store car's information
   * @author Selynna Song
   * @version 1.0
   * @since 4/16/2024
*/
public class Song_Auto
{
	/**
	 * Instance Variables
	 */
	private int milage;
	private int numOwners;
	private String make;
	private String vin;
	private String model;
	private int year;
	/**
	 * No argument constructor
	 */
	public Song_Auto()
	{
		milage = 0;
		numOwners = 0;
		make = "Mercedes";
		vin= "1FA42HG0000NE3S";
		model= "AMG GLC Coupe";
		year=2024;
	}
	/**
	 * Multiple arguments overloaded constructor
	 * @param milage This stores the milage of the car
	 * @param numOwners This stores how many pervious owners there were
	 * @param make This shows the car brand
	 * @param vin  This stores the vin of the car
	 * @param model This stores the model
	 * @param year This stores the year
	 */
	public Song_Auto(int milage, int numOwners, String make, String vin, String model, int year)
	{
		this.milage = milage;
		this.numOwners = numOwners;
		this.make = make;
		this.vin = vin;
		this.model = model;
		this.year = year;
	}	
	/**
	 * setMilage This displays all the information about the car
	 * @return String This returns the string of all the car's information. 
	 */
	public int setMilage()
	{
		return milage;
	}
	public int setNumOwners()
	{
		return numOwners;
	}
	public String getMake()
	{
		return make;
	}
	public String getVIN()
	{
		return vin;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	/**
	 * toString This displays all the information about the car
	 * @return String This returns the string of all the car's information. 
	 */
	public String toString()
	{
		return(String.format("This automobile is %d %s %s. \nIt has %d previous owners. The milage is: %d \nThe VIN is: %s",year, model, make, numOwners, milage, vin));
	}
		
}
