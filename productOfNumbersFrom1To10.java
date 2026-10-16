public class productOfNumbersFrom1To10{
  public static void main(String[] args){
    int product = 1;
    for(int number = 1; number <= 20; number++){
        product =  product * number;
      System.out.println("product: " + product);
    }
  }   
}      
