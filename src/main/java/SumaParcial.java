




public class SumaParcial extends Thread{

    private Matriz matriz;
    private int inicio,fin;
    private int sum;

    public SumaParcial(Matriz matriz, int inicio, int fin){
        this.matriz = matriz;
        this.inicio = inicio;
        this.fin = fin;
        this.sum = 0;
    }


    @Override
    public void run() {
        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = inicio; j <fin ; j++) {
                sum+=matriz.getElement(i,j);
            }
        }
    }

    public int getSumParcial(){
        return this.sum;
    }

}
