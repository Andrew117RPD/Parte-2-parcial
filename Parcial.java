import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    System.out.println("Ingresa el primer número: ");
    int a = sc.nextInt();
    System.out.println("Ingresa el segundo número: ");
    int b = sc.nextInt();

    System.out.println( " el residuo es" + "=" + a / b);
    
    
    if (a % b == 0) {
      System.out.println(a + " es múltiplo de " + b);
 
      if (b % a == 0);
       System.out.println(b + " es múltiplo de " + a);
       

      
    } 
    
    else if (b % a == 0) {
      System.out.println(b + " es múltiplo de " + a);
    } 
    
    else {
      System.out.println(a + " y " + b + " no son múltiplos entre sí.");
      System.out.println("El residuo es" + "=" + b/a);

      
    }
  }
}
