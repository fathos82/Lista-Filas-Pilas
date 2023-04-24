public class TestePilha {
    private Pilhas P = new Pilhas(1000);
    private Pilhas N = new Pilhas(1000);

    public void inserir(int number) {
        
        if(number > 0) P.push(number);
        else if(number < 0) N.push(number);
        else this.isZero();
    }
    private void isZero() {
        System.out.println("Retirado de P: "+P.pop());;
        System.out.println("Retirado de N: "+N.pop());;
        
    }
}
