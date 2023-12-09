import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int notas;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua nota");
        int n1 = scan.nextInt();
        System.out.println("Digite sua nota");
        int n2 = scan.nextInt();
        System.out.println("Digite sua nota");
        int n3 = scan.nextInt();
        System.out.println("Digite sua nota");
        int n4 = scan.nextInt();
        notas = (n1+n2+n3+n4)/4;
        i = notas;
        System.out.println("--------------------------------------");
        System.out.println("Sua nota é: " + i);

        if(notas > 6){
            System.out.println("Aprovado!!!");
        } else if (notas <=5.99 ) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado!!!!!");
        }

    }

}
