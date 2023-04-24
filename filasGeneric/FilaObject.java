public class FilaObject {
        Object[] fila;
        int length;
        int tamanho;
        int inicio;
        int fim;
    
        public FilaObject(int tamanho) {
            this.fila = new Object[tamanho];
            this.tamanho = tamanho;
            this.length = 0;
            this.inicio = 0;
            this.fim = -1;
        }
        public void push(Object elemento){
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
        public Object pop(){
            if(this.length == 0){
                System.out.println("Fila vazia!");
                return null;
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
        public Object front(){
            if(this.length == 0){
                System.out.println("Fila vazia!");
                return null;
            }
            return this.fila[this.inicio];
        }
        public int length(){
            return this.length;
        }
        
         
    
    
}
