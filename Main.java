class Main {
  public static void main(String[] args) {
    int counter = 0;
    System.out.println("Counting from 0 to 10.");
   
   // loop counting up
    while (counter <= 10) {
      System.out.println(counter);
      counter++;
    }
    counter--;
    System.out.println("\nCounting from 10 to 0.");
    //loop counting down   
    while (counter >= 0) {
      System.out.println(counter);
      counter--;
    }
    counter++;
    System.out.println("\nCounting in multiples of two from 0 to 20.");
    //loop counting in mult. of 2
    while (counter <= 10) {
      System.out.println(counter * 2);
      counter++;
    }
  }
}
