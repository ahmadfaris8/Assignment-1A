/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracyexercise2bank;

/**
 *
 * @author user
 */
abstract class bank{
    abstract void getBalance();
}

class bankA extends bank{
    void getBalance(){
        System.out.println("Balance Bank A : 100");
    }
}

class bankB extends bank{
    void getBalance(){
        System.out.println("Balance Bank B : 150");
    }
}

class bankC extends bank{
    void getBalance(){
        System.out.println("Balance Bank C : 200");
    }
}

public class AbstracyExercise2Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bankA A = new bankA();
        bankB B = new bankB();
        bankC C = new bankC();
        
        A.getBalance();
        B.getBalance();
        C.getBalance();
        
    }
    
}
