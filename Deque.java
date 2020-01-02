/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
public class Deque<E> implements DequeInterface<E>{
    private LList dList;
    public Deque()
    {
        dList = new LList<E>();
    }
    public void add(E item)
    {
        dList.add(item);
    }
    public void addFront(E item) {
        
        
        dList.add(0, item);
    }
    public void addBack(E item) {
        dList.add(dList.size()-1, item);
    }
    public E removeFront() {
        if(isEmpty())
            return null;
       return (E)dList.remove(0);
    }

  
    public E removeBack() {
        if(isEmpty())
        {
            return null;
        }
        
        return (E)dList.remove(dList.size()-1);
    }

  
    public E peekFront() {
        if(isEmpty())
            return null;
        return (E)dList.get(0);
    }

    
    public E peekBack() {
        if(isEmpty())
            return null;
        return (E)dList.get(dList.size()-1);
    }

    
    public int size() {
        return dList.size();
    }

   
    public boolean isEmpty() {
       return dList.isEmpty();
    }
    
}
