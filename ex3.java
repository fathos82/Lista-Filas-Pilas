import java.util.Scanner;

public class ex3 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
       
        FilaObject filaAvioes = new FilaObject(10);
        
       
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2 - Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar um avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila de espera");
            System.out.println("5 - Listar as características do primeiro avião da fila");
            System.out.println("0 - Sair");
            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + filaAvioes.length());
                    break;
                case "2":
                Aviao aviaoAutorizado = ((Aviao) filaAvioes.pop());
                System.out.println("Avião Autorizado.");
                System.out.println("Name: "+aviaoAutorizado.getName());
                System.out.println("Identificação: "+aviaoAutorizado.getIndetificador());
                    break;

                case "3":
                System.out.println("Digite o nome do avião");
                String nameAviao = scan.nextLine();
                System.out.println("Digite o identifcador do avião");
                int idenficacaoAviao = scan.nextInt();
                filaAvioes.push(new  Aviao(nameAviao, idenficacaoAviao));
                System.out.println("Avião adicionado a fila");
                break;

                case "4":
                FilaObject filaAuxiliar = new FilaObject(filaAvioes.length());
                System.out.println(filaAvioes.length());
                while (filaAvioes.length() > 0){
                    Aviao atualAvião = ((Aviao) filaAvioes.pop());
                    System.out.println("Nome: "+atualAvião.getName());
                    System.out.println("Identificação: "+atualAvião.getIndetificador());
                    System.out.println("-----------------------------------");
                    filaAuxiliar.push(atualAvião);
                }
                while (filaAuxiliar.length()>0) {
                    filaAvioes.push(filaAuxiliar.pop());
                }
                
                    break;
                case "5":
                Aviao primeiroFila = ((Aviao) filaAvioes.front());
                System.out.println("Primeiro Aviao na fila de espera:");
                System.out.println("Name: "+primeiroFila.getName());
                System.out.println("Identificação: "+primeiroFila.getIndetificador());
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println(filaAvioes.length());
            
        }
    }
}

//concerar caso 3  