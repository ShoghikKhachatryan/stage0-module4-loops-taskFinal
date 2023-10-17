package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int i = 0;
        int resualt = 1;
        while (i < power) {
            resualt *= numberToPrint;
            ++i;
        }
        System.out.println(resualt);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
