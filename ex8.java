import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        Random random = new Random();
        TestePilha teste = new TestePilha();
        for (int i = 0; i < 1000; i++) {
            int numAleatorio =  random.nextInt(-100, 100) ;
            teste.inserir(numAleatorio);
        }
        
    }

    
}