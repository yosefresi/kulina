
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
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int num = Integer.parseInt(line);
        int done = 0;
        int x = 0;
        while (done < num) {
            x++;
            for (int i = 2; i <= x; i++) {
                if (x == i) {
                    System.out.print(x + " ");
                    done++;
                } else if (x % i == 0) {
                    break;
                }
            }
        }
    }
}
