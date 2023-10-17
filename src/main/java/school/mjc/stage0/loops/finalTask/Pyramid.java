package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i, j;

        for (i = 1; i <= cathetusLength; i++) {
            for (int k = 0; k < cathetusLength - i; k++ ) {
                System.out.print(" ");
            }
             for (j = i; j > 0; j--) {
                System.out.print(j);
            }

            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
