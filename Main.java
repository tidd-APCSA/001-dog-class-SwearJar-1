public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 

    Dog sam = new Dog("Sam", "Boxer", 15, "Brown", true);
    Dog vod = new Dog("Vog", "Weiner",12,"Brown",true);
    Dog ryan = new Dog("Ryan", "Golden Retriever",12,"Golden",true);

    System.out.println(sam);
    System.out.println(sam.getBreed());
    System.out.println(sam.getWeight());
    System.out.println(sam.getColor());
    System.out.println(sam.isHouseTrained());
    System.out.println();
    //Second dog
    System.out.println(vod);
    System.out.println(vod.getBreed());
    System.out.println(vod.getWeight());
    System.out.println(vod.getColor());
    System.out.println(vod.isHouseTrained());
    System.out.println();
    //third dog
    System.out.println(ryan);
    System.out.println(ryan.getBreed());
    System.out.println(ryan.getWeight());
    System.out.println(ryan.getColor());
    System.out.println(ryan.isHouseTrained());
    System.out.println();












  } 

}