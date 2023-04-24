import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila(2000);
        Pilhas pilha = new Pilhas(1000);
        int contadorPositivos = 0;  
        int contadorNegativos = 0;  
       while (fila.length() < 2000) {
            int numAleatorio =  random.nextInt(-1000, 1000);
            if (contadorPositivos < 1001 & numAleatorio > 0 ) {
                fila.push(numAleatorio);
                contadorPositivos++;
            }
            else if (contadorNegativos < 1001 & numAleatorio < 0) {
                fila.push(numAleatorio);
                contadorNegativos++;
            }
        while(fila.length() > 0){
            int topoFila = fila.pop();
            if (topoFila  > 0){
                pilha.push(topoFila);
            }
            else{
                Integer topoPilha = ((Integer)pilha.pop());
                System.out.println("topo da pilha: "+ topoPilha);
            }

            
        }
        
    }

    }}
