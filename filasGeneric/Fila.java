public class Fila {
    int[] fila;
    int length;
    int tamanho;
    int inicio;
    int fim;

    public Fila(int tamanho) {
        this.fila = new int[tamanho];
        this.tamanho = tamanho;
        this.length = 0;
        this.inicio = 0;
        this.fim = -1;
    }
    public void push(int elemento){
        if (this.length == this.tamanho){
        System.out.println(" Fila cheia");
        }else{
            this.fim++;
            if (this.fim == this.tamanho){
                this.fim = 0;
            }
            this.fila[this.fim] = elemento;
            this.length++;
        }

    }
    public int pop(){
        if(this.length == 0){
            System.out.println("Fila vazia!");
            return -1;
        }else{
            int inicioAux = this.inicio;
            this.inicio++;
            if(this.inicio == this.tamanho){
                this.inicio = 0;
            }
            this.length--;
            return this.fila[inicioAux];
        }
    }
    public int length(){
        return this.length;
    }
    public Fila  reverse(){
        Fila aux = new Fila(this.tamanho);        
        for (int i = this.fim; i >= -1 ; i--) {
            
            
            aux.push(fila[i]);
            // System.out.println(i);
            if(i == this.inicio) break;
            if(i == 0) i = this.tamanho;
        } 
        // this.inicio = 0;
        // this.fim = j;
        // fila  = aux.clone();
        return aux;
    }

    public boolean contains(int elemento) {
        int posicao =this.inicio;
        for (int i = 0; i < this.length; i++) {
            
            if (i == this.tamanho) i =0;
            
            if(fila[posicao] ==  elemento) return true;
            posicao++;
        } 
        return false;
    }
    // public int get() {
    //     if(this.length == 0){
    //         System.out.println("Fila vazia!");
    //         return -1;
    //     }
    //     return this.fila[this.inicio];

    // }
}
