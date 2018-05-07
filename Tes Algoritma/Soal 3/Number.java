/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yosef
 */
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 1345679;
        String val = String.valueOf(num);
        for (int i = 0; i < val.length(); i++) {
            System.out.print(val.charAt(i));
            for (int j = val.length()-1; j > i; j--) {
                System.out.print("0");
            }
            System.out.println("");
        }
    }
    
}
