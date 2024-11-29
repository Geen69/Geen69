/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g6482
 */
public class Lap2 {
    public class GameEntry {
    public int score;

    public GameEntry(int score) {
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // إنشاء مصفوفة A تحتوي على كائنات GameEntry
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 100); // قيم ابتدائية
        }

        // استنساخ المصفوفة A إلى B
        GameEntry[] B = A.clone();

        // تعديل قيمة score للكائن في الموقع A[4]
        A[4].score = 550;

        // طباعة قيمة B[4].score
        System.out.println("B[4].score = " + B[4].score); // النتيجة: 550
    }
}

    
}
