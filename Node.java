/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
public class Node <E>
{
	private E data; 
	private Node next;
        private Node previous;
	public Node() 
	{
		
	}
	public Node(E x) 
	{
		data = x;
		next = null;
	}
        public void setPrevious(Node previous)
        {
            this.previous = previous;
        }
        public Node getPrevious()
        {
            return previous;
        }
	public void setNext (Node next)
	{
		this.next = next;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(E data)
	{
		this.data = data;
	}
	public E getData()
	{
		return data;
	}
}