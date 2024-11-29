/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g6482
 */
public class Lap9 {
    public static String removePunctuation(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
            continue;
        }
        sb.append(c);
    }
    return sb.toString();
}

}
