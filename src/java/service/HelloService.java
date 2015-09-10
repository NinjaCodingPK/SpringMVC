/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import crud.*;
import entity.*;

import java.util.List;
import java.util.Iterator;

public class HelloService {
    /*public static String SayHello(String name)
     {
     computer_crud computer = new computer_crud();
        
     List<Computer> computers = computer.ShowAll();
     Iterator<Computer> computer_iter = computers.iterator();
     return computers;
     //return "Hello "+name+"!";
     }  */

    public static String SayHello(String name, String surname) {
        //test_crud test = new test_crud();
        //test.deleteById(Computer.class, 5);
        
        crud<Computer> comp = new crud<Computer>();
        List<Computer> c_list = comp.ShowAll("Computer");
        
        //Computer_crud computer = new Computer_crud();
        //List<Computer> computers = computer.ShowAll();
        
        Iterator<Computer> iter = c_list.iterator();
        //Iterator<Computer> iter = computers.iterator();
        
        //System.out.println(iter.next().getCpu());
        
        //////////////////////////////
        //return c_list;
        //////////////////////////////
        
        /*if(iter.hasNext())
            return iter.next().getCpu();*/
        return "Hello "+name+" "+surname;
    }
}
