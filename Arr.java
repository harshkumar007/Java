import java.util.Scanner;
import java.*;
public class Arr {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int array[][] = new int[20][20];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                if (i == 1 && j == 3) break;
                if (i == 2 && j == 2) break;
                System.out.println("Enter the student in school "+i+" Class "+j);
                array[i][j] = s.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("S"+i);
            for (int j = 0; j < 4; j++) { if (i == 1 && j == 3) break;
                if (i == 2 && j == 2) break;
                System.out.print("c"+j+" : ");
                for(int k=1; k<=array[i][j];k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
