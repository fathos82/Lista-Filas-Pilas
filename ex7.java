public class ex7 {
    public static Fila reverse(Fila fila){
        Pilhas pilha = new Pilhas(20);
        while (fila.length() > 0) {
            pilha.push(fila.pop());
        } 
        while(pilha.length() > 0){
            fila.push(((Integer)pilha.pop()));
        }
        return fila;
    }
    public static void main(String[] args) {
        

        Fila fila = new Fila(20);
        

        //inserindo valores dentro da fila
        for (int i = 0; i < 20; i++) {
            fila.push(i);
        }
        fila = reverse(fila);
        while (fila.length() >0) System.out.println(fila.pop());

    }


    
}
