import java.util.Scanner;


public class condicional {
    public static void main(String[] args) {
        System.out.println("Ingresa dos numeros");

        try (Scanner scanner = new Scanner(System.in)){

            int n = scanner.nextInt(); //lea 
            int m= scanner.nextInt();

            if (n%2==0 && m%2==0){
            
                System.out.println("n y m son pares "); //muestra

            }
            
            else if (n%2!=0 && m%2==0){

                System.out.println("Solo m es par ");

            }

            else if (n%2==0 && m%2!=0){

                System.out.println("Solo n es par");

            }

            else {
                
                System.out.println("n y m sonm impares");

            }
        }

    }

}

