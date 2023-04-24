import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String chave = scan.nextLine(); 
        Pilhas pilha = new Pilhas(5);
        Pilhas auxiliar = new Pilhas(5);
        pilha.push("1");
        pilha.push("2");
        pilha.push("3");
        pilha.push("4");
        pilha.push("5");
        while (pilha.length() > 0) {
            String l = ((String)pilha.pop());
            
            if (!l.equals(chave)) {
                auxiliar.push(l);
            }
        } 
        
        while(auxiliar.length() >0)  pilha.push(auxiliar.pop());
        
        
        while(pilha.length() >0) System.out.println(pilha.pop());
               

        
    }        
    
    
}
