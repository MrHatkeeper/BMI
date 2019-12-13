import java.util.Scanner;

public class BMI{
    public static void main(String[] args){
        Scanner strana = new Scanner(System.in);
        Scanner druStrana = new Scanner(System.in);
        Scanner tretiStrana = new Scanner(System.in);
        Scanner yes = new Scanner(System.in);

        
        while (0 < 1){
            System.out.println("Sup, pls gib délku základny: ");
            int z = strana.nextInt();

            System.out.println("Sup, pls gib délku první odvěsny: ");
            int y = druStrana.nextInt();
            
            System.out.println("Sup, pls gib délku druhé odvěsny: ");
            int x = tretiStrana.nextInt();

            if ((x+y) >= z){
                System.out.println("Můžeš udělat trojuhelník");
            }
               
            else{
                System.out.println("Nemůžeš udělat trojuhelník");
            }
        }
    }
}