/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Thuong
 */
public class ValidationAndNormalizingTextUtils {

    public static String getStringByRegex(String mess, String erro, String regex) {
        Scanner sc = new Scanner(System.in);
        String output = null;
        while (true) {
            System.out.println(mess);
            output = sc.nextLine();
            if (output.matches(regex)) {
                return output;
            } else {
                System.out.println(erro);
            }
        }
    }

    public static int getInt(String mess, String erroNumberFormat, String outOfranger, int min, int max) {
        while (true) {
            int ret = Integer.parseInt(getStringByRegex(mess, erroNumberFormat, "[0-9]+"));
            if (ret < min || ret > max) {
                System.out.println(outOfranger);
            } else {
                return ret;
            }
        }
    }
}
