package day19;

public class JumpingOnCloude {
    public static void main(String[] args) {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0, 0};

        int jumps = 0;
        int i = 0;

        while (i < clouds.length - 1) {
            if (i + 2 < clouds.length && clouds[i + 2] == 0) {
                i += 2;
            } else {
                i += 1;
            }
            jumps++;
        }

        System.out.println( jumps);
    }
}