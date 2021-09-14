/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.queue;

/**
 *
 * @author farouk
 */
public class mainn {
    public static  void main (String[] args )
    {
    queuee st = new queuee(10);
    st.enQueue(10);
 
   st.print_Queue();
    // 10 11 12 13
    st.deletequeue();
    //11 12 13
        System.out.println(st.front);
    // 11 
      System.out.println(st.rear);
      //13
    
    }
    
}
