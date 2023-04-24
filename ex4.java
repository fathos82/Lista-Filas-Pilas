import java.util.Random;

public class ex4 {
    

    
    public static void main(String[] args) {
        Random random = new Random();
        Fila F1 = new Fila(1000);
        Fila F2;

        for (int i = 0; i < 1000; i++) {
            int numAleatorio = random.nextInt(1000);
            F1.push(numAleatorio);
        }
        //reverse implementado dentro da propria classe fila.
        F2 = F1.reverse();
        while (F2.length()>0)  System.out.println(F2.pop());
    }
}
