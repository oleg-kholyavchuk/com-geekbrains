package geekbrains.lesson3;

public class MyLibMatrixProcessingException  extends MyLibException {
    private  int row;
    private  int column;
    private  int value;

    public MyLibMatrixProcessingException(int row, int column, int[][] array) {
        super("Invalid data in [" + row + "; " + column + "]: " + array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[row][column];
    }
}
