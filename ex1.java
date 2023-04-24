import java.util.Scanner;

class ex1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String msg = scan.nextLine(); 
        
        Pilhas pilha = new Pilhas(msg.length());
        for (int i = 0; i < msg.length(); i++) {
            String letter =  String.valueOf(msg.charAt(i));
            pilha.push(letter);           
        } 

        String newMsg = ""; 
        
        for (int j = 0; j < msg.length(); j++) {
            newMsg += ((String)pilha.pop());
        }
        
        System.out.println("Msg invertida: "+newMsg);
        
        msg = msg.replace(".","").replace(" ", "");
        newMsg = newMsg.replace(".","").replace(" ", "");
        if (msg.equals(newMsg)) {
            System.out.println("é um palíndromo");
        }
    }
}