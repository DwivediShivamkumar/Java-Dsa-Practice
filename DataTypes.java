public class DataTypes {
  public static void main(String[] args) {
   
   long value1 = 10000L;
   int value2 = (int)value1;
   System.out.println("The value of NewNum is: " + value2);
   
   
    // Example of using different data types
    byte num1 = 100;
    long num8 = num1;
    System.out.println("The value of NewNum is: " + num8);
    System.out.println(num1);
    short num2 = 10000;
    System.out.println(num2);
    int num3 = 555567;
    System.out.println(num3);
    long num4 = 10000000000L;
    System.out.println(num4);


    //floating data types

    float num5 = 5.67843f;
    System.out.println(num5);
    double num6 = 5.67843678903444;
    System.out.println(num6);


    //other data types such as characters and Boolean

    char letter = 'A';
    System.out.println(letter);
    boolean Life = true;
    System.out.println(Life);
  
    char gender = ('M' + 2);
    System.out.println(gender);

    char myFirstCharacter = ('S' + 4);
    System.out.println(myFirstCharacter);
    System.out.println(" This is my FirstCharacter is: " + (char)(myFirstCharacter + 2) );



//non primitive data types
        String name = "Shivam"; 
    System.out.println(name);

    
  }
}