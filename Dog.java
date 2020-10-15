public class Dog{
  private String emoji = ":)";
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;
  
  public Dog(String name,String breed,double weight, String color,boolean houseTrained){
    this.name = name;
    this.breed = breed;
    this.color = color; 
    this.weight = weight;
    this.houseTrained = houseTrained;
  }

  //getter methods


  public String getName()
  {
    return name;
  }
  public String getBreed()
  {
    return breed;
  }
  public double getWeight()
  {
    return weight;
  }
  public String getColor()
  {
    return color;
  }
  public boolean isHouseTrained()
  {
    return houseTrained;
  }

  //@override
  public String toString(){
    return this.name + emoji;
  }












}