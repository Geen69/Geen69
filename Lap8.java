/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g6482
 */
public class Lap8 {
    public static int countVowels(String s) {
    int count = 0;
    s = s.toLowerCase();
    for (char c : s.toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            count++;
        }
    }
    return count;
}

}
