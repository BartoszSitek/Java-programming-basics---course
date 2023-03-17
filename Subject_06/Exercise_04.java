package Subject_06;

public class Exercise_04 {
    public static void main(String[] args) {
        calculateSquares(2,3,4);

    }
    public static void calculateSquares (int screenWidth, int screenHeight, int side){
        int horizontalSquares = screenWidth / side;
        int verticalSquares = screenHeight / side;
        int squaresCount = horizontalSquares * verticalSquares;

        int[][] coords = new int[2][squaresCount];

        int row = 0, idx = 0, y = 0;
        while (row <= screenHeight / verticalSquares) {
            for (int col = 0; col < horizontalSquares; col++) {
                coords[0][idx] = col * (screenWidth / horizontalSquares);
                coords[1][idx] = y;
                idx++;
            }
            row++;
            y += 2;
        }

    }
}
