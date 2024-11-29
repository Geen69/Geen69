/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g6482
 */
public class Lap13 {
    public static void main(String[] args) {
    CreditCard[] wallet = new CreditCard[3];
    wallet[0] = new CreditCard("Customer 1", "Bank 1", "1234", 5000);
    wallet[1] = new CreditCard("Customer 2", "Bank 2", "5678", 3000);
    wallet[2] = new CreditCard("Customer 3", "Bank 3", "9101", 2000);

    // تعديل الحلقة لجعل البطاقة الثالثة تتجاوز الحد
    for (int i = 1; i <= 20; i++) {
        wallet[0].charge(100); // لا تتجاوز
        wallet[1].charge(200); // لا تتجاوز
        wallet[2].charge(150); // تتجاوز الحد بعد عدد معين من العمليات
    }
}

}
