import java.util.Scanner;
public class UEC {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        Luta UEC01= new Luta();
        Lutador l[]=new Lutador[4];
        int l1,l2;
        l[0]=new Lutador("Jeff", "Brasil", 18, 11, 5, 7, 1.73f, 70.5f);
        l[1]=new Lutador("Vakero", "India", 16, 20, 2, 5, 1.65f, 63.4f);
        l[2]=new Lutador("Junior", "Australia", 18, 15, 1, 7, 1.72f, 70.0f);
        l[3]=new Lutador("Leo", "Russia", 18, 21, 3, 4, 1.93f, 75.0f);
        System.out.println("Apresentando os lutadores");
        System.out.println("Você quer que quais lutador lutem?Lembrando, só é possivel lutar, os da mesma categoria");
        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        for(int i=0;i<l.length;i++){
        System.out.print("1° Lutador: ");
        l1=leia.nextInt()-1;
        System.out.print("2° Lutador: ");
        l2=leia.nextInt()-1;
        UEC01.marcarLuta(l[l1], l[l2]);
        UEC01.lutar();
        System.out.println("================");
        System.out.println("Curriculo de Lutas atualizado dos lutadores");
        l[l1].status();
        l[l2].status();
        break;
        }   
        
}
}
