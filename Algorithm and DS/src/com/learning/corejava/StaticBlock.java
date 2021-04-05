package com.learning.corejava;

public class StaticBlock{

     public static void main(String []args){
        System.out.println("Hello World");
        dad ds = new son();
        ds.method("Mahendra");

        System.out.println("===============================");

        son ss = new son();
        ss.method("Mahendra");
        
        /*The flow of execution is following
        
        static - dad-> child
        Constructor - dad-> child
        method - child ->dad
        */
     }
}


interface abt
{
    void print();
}


class dad
{
    
    void method(String m)
    {
         System.out.println("dad method");
    }
    
    
    dad(){
    System.out.println("dad cons");
    }
    
    static{
    System.out.println("dad stat");
    }
}

class son extends dad
{
    
    void method()
    {
         System.out.println("son method");
    }
    
    son(){
    System.out.println("son cons");
    }
    
    static{
    System.out.println("son stat");
    }
}