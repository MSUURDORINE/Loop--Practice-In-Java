public class numbersFrom1To100SkippingMultiplesOf{
  public static void main(String[] args){
  
    for(int numbers = 1; numbers <= 100; numbers++){
    
        if(numbers % 4 == 0){
          //contiun
          System.out.print(numbers + " ");
      }
      System.out.println();
    }
  }   
}      
