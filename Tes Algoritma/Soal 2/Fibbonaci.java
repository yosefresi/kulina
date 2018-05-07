
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yosef
 */
public class Fibbonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int num = Integer.parseInt(line);
        int first = 0;
        int sec = 1;
        if (num == 1) {
            System.out.print(first);
        } else if (num > 1) {
            System.out.print(first + " " + sec + " ");
            if (num > 2) {
                for (int i = 2; i < num; i++) {
                    int res = first + sec;
                    System.out.print(res + " ");
                    first = sec;
                    sec = res;
                }
            }
        }
    }

}
