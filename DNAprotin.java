//This program will determine whether there is a protin in a strand of DNA.
public class DNA{

  public static void main (String[] args){
    String dna1= "ATGCGATACGCTTGA";
    String dna2= "ATGCGATACGTGA";
    String dna3= "ATTAATATGTACTGA";

    String dna= dna2;
    System.out.println(dna.length());
    //Protin requires the strand of DNA to start with the codon: ATG
    System.out.println(dna.indexOf("ATG")); //Should print 0
    //It also requires the strand to end with the codon: TGA
    System.out.println(dna.indexOf("TGA")); //Should print 10

    //Check all the conditions together
    if ((dna.indexOf("ATG")==0)&&(dna.indexOf("TGA")==10)&&((dna.indexOf("ATG")-dna.indexOf("TGA"))%3==0)){
      String protin= dna.substring(dna.indexOf("ATG"),dna.indexOf("TGA")+3);
      System.out.println("There is protin: "+ protin);
    }else{
      System.out.println("No protin");
    }


  }
}