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

//first in first out FIFO
public class queuee {
    
    int rear ; 
    int front ; 
    int max_size;
    int length ; 
    int arr[];
    
    
    public queuee (int size)
    {   //dynamic array
        arr = new int [size];
        rear = max_size -1 ;
        if(size<=0) max_size= 100;
        else size = max_size;
    
    front = 0 ; 
    length =0;
    arr = new int [max_size];
    }
    public boolean IsEmpty()
    {
        return length == 0;
    }
    
    public boolean isFull()
    {
        return length == max_size;
    }
    // function that add queue 
     
    public void enQueue(int element)
    {
    //first thing make sure that Queue is not full to add
    if(isFull()) 
        System.out.println("queue is full cant add any more");
    else 
       rear = ( rear + 1 ) % max_size;
        arr[rear] = element ;
  
        length++;
    
    }
    
    public void deletequeue()
    {
    if(IsEmpty())
        System.out.println("queue is already Empty ");
    else 
        front = (front +1)% max_size;
    
        length--;
    
    }
    public int Getfront()
    {
    assert (!IsEmpty());
    return arr[front];
    }
    public int Getrear()
    {
    assert (!IsEmpty());
    return arr[rear];
    }
    
     public void print_Queue()
     {
         if(!IsEmpty())
     for(int i=front ; i!=rear+1; i=(i+1)%max_size)
     {
         System.out.print(arr[i]+" ");
     
     }else System.out.println("Empty queue");
    }
    
    // search function 
     public int search_Queue(int element)
     {
              int pos=-1;

     if(!IsEmpty())
     {
         for(int i = front ; i!=rear; i=(i +1)%max_size )
         {
         if (arr[i] == element)
         {
             pos = i; 
              break;

         }
          if (pos ==-1){
             if(arr[rear] == element)
             pos = rear;
        }
         }
     
     }else System.out.println("queue is Empty");
     return pos;
     
     }
    
}
