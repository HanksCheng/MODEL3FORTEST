import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int dignum[]=new int[4];
        for (int i=0;i<4;i++){
            dignum[i]=Integer.parseInt(str.substring(i,i+1));
        }
        String digits[][] = {{"*****",
                              "*   *",
                              "*   *",
                              "*   *",
                              "*****"},
                             {"    *",
                              "    *",
                              "    *",
                              "    *",
                              "    *"},
                             {"*****",
                              "    *",
                              "*****",
                              "*    ",
                              "*****"},
                             {"*****",
                              "    *",
                              "*****",
                              "    *",
                              "*****"},
                             {"*   *",
                              "*   *",
                              "*****",
                              "    *",
                              "    *"},
                             {"*****",
                              "*    ",
                              "*****",
                              "    *",
                              "*****"},
                             {"*****",
                              "*    ",
                              "*****",
                              "*   *",
                              "*****"},
                             {"*****",
                              "    *",
                              "    *",
                              "    *",
                              "    *"},
                             {"*****",
                              "*   *",
                              "*****",
                              "*   *",
                              "*****"},
                             {"*****",
                              "*   *",
                              "*****",
                              "    *",
                              "*****"}};
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print(digits[dignum[j]][i]+" ");
            }
            System.out.println(" ");
        }
    }
}