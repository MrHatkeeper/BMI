import java.util.Scanner;

public class BMI{
    public static void main(String[] args){
        Scanner strana = new Scanner(System.in);


        
        while (0 < 1){
            System.out.println("Sup, pls gib délku strany: ");
            int z = strana.nextInt();

            System.out.println("Sup, pls gib délku první strany: ");
            int y = strana.nextInt();
            
            System.out.println("Sup, pls gib délku druhé strany: ");
            int x = strana.nextInt();

            if (z == 0 || x == 0 || y == 0){
                System.out.println("Víš, že potřebuješ nejméně tři délky, right ?");
            }

            else if (x < 0 || y < 0 || z < 0){
                System.out.println("Jako, jestli při tvoření trojuhelníku chceš jít do jiné dimenze tak ok, ale já bych zůstal u kladných čísel");
            }

            else if ((x+y) > z){
                System.out.println("Můžeš udělat trojuhelník");
            }

            else if ((y+z) > x){
                System.out.println("Můžeš udělat trojuhelník");
            }

            else if ((x+z) > y){
                System.out.println("Můžeš udělat trojuhelník");
            }
               
            else{
                System.out.println("Nemůžeš udělat trojuhelník");
            }
        }
    }
}