import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random random = new Random();
        Fila F1 = new Fila(100);
        Fila F2 = new Fila(100);
        

        for (int i = 0; i < 100; i++) {
            int numAleatorio = random.nextInt(100);
            if (F1.contains(numAleatorio)) F2.push(numAleatorio);
            else F1.push(numAleatorio);
        }
        //contains implementado dentro da propria classe fila.
        System.out.println("---------------------------------\nF1:\n---------------------------------");
        while (F1.length()>0)  System.out.println(F1.pop());
        System.out.println("---------------------------------\nF2:\n---------------------------------");
        while (F2.length()>0)  System.out.println(F2.pop());
    }
}
