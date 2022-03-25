//Create 3*3 array for storing integers.
//Create single dimensional arrays to maintain rowwise sum and columnwise sum of the 2d Array

class TwoDArray {
    int[][] arr = { { 10, 12, 23 }, { 56, 45, 59 }, { 16, 43, 84 } };

    int rowsum[] = new int[3];
    {
        rowsum[0] = 0;
        rowsum[1] = 0;
        rowsum[2] = 0;
    }

    int colsum[] = new int[3];
    {
        colsum[0] = 0;
        colsum[1] = 0;
        colsum[2] = 0;
    }

    public void displayArray() {
        System.out.print("3*3 Array is ");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");
            }
        }
        System.out.println();
    }

    public void sumrowone() {
        for (int i = 0; i < 3; i++) {
            rowsum[0] += arr[0][i];
        }
        System.out.println("Sum of first row: " + rowsum[0]);
    }

    public void sumrowtwo() {
        for (int i = 0; i < 3; i++) {
            rowsum[1] += arr[1][i];
        }
        System.out.println("Sum of Second row: " + rowsum[1]);
    }

    public void sumrowthree() {
        for (int i = 0; i < 3; i++) {
            rowsum[2] += arr[2][i];
        }
        System.out.println("Sum of third row: " + rowsum[2]);
    }

    public void sumcolone() {
        for (int i = 0; i < 3; i++) {
            colsum[0] += arr[i][0];
        }
        System.out.println("Sum of first Column: " + colsum[0]);
    }

    public void sumcoltwo() {
        for (int i = 0; i < 3; i++) {
            colsum[1] += arr[i][1];
        }
        System.out.println("Sum of first Column: " + colsum[1]);
    }

    public void sumcolthree() {
        for (int i = 0; i < 3; i++) {
            colsum[2] += arr[i][2];
        }
        System.out.println("Sum of first Column: " + colsum[2]);
    }
}

public class TwoDArrayDemo {
    public static void main(String[] args) {
        TwoDArray a1 = new TwoDArray();
        a1.displayArray();
        a1.sumrowone();
        a1.sumrowtwo();
        a1.sumrowthree();

        a1.sumcolone();
        a1.sumcoltwo();
        a1.sumcolthree();
    }
}