import java.util.Random;

public class Matriz {

    private int[][] matriz;
    private int rows, columns;

    public Matriz(int rows, int columns){
        this.matriz = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
        loadMatriz();
    }

    private void loadMatriz(){
        Random random = new Random();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matriz[i][j]= random.nextInt(100)+1;
            }
        }
    }


   public int sumaTotal(){
        int s=0;
       for (int i = 0; i < this.rows; i++) {
           for (int j = 0; j < this.columns; j++) {
            s+=this.matriz[i][j];
           }
       }

       return s;
   }

   public int getElement(int i, int j){
        if( (i>=0 && i<this.rows) && (j>=0 && j<this.columns))
            return this.matriz[i][j];
        else {
            System.out.println("Posicion invalida");
            return -1;
        }
   }


   public void showMatriz(){
       for (int i = 0; i < this.rows; i++) {
           for (int j = 0; j < this.columns; j++) {
               System.out.print(this.matriz[i][j]+" ");
           }
           System.out.println();
       }
   }


    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
