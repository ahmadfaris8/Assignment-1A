/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexercise1parent;

/**
 *
 * @author user
 */
abstract class Parent{
    abstract void message();
    public void print(){
        System.out.println("message");
    }
}

class A extends Parent{
    public void message(){
        System.out.println("This is first subclass");
    }
}

class B extends Parent{
    public void message(){
        System.out.println("This is second subclass");
    }
}

public class AbstractExercise1Parent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.message();
        obj2.message();
        
    }
    
}
