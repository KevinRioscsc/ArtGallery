/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
import java.util.Random;
public class Visitor {
   private int timeOntoQueue;
private int timeOutOfQueue;
private int totalTimeInQueue;
private int timeInGallery;
private int timeRemainingInGallery;
private static Random randy = new Random(2);
public Visitor(int timeOnline)
{
    settimeOntoQueue(timeOnline);
    settimeInGallery();
}

    
public void settimeOntoQueue(int timeOntoQueue)
{
    this.timeOntoQueue= timeOntoQueue;
}
public void settimeInGallery()
{
    int Percent = randy.nextInt(99)+1;//percentage of the time
    if(Percent < 60)
    {
        timeInGallery = 10;
    }
    else if(Percent < 80)
    {
        timeInGallery= 5;
    }
    else
    {
        timeInGallery=20;
    }
}
public void settimeOutofQueue(int timeOutofQueue)
{
    this.timeOutOfQueue = timeOutofQueue;
    totalTimeInQueue = timeOutofQueue - timeOntoQueue;
    
}
public int decrementtimeRemaining()
{
    return timeInGallery--;
}
public int getTotaltimeinQueue()
{
    return totalTimeInQueue;
}
public int getTimeremaining()
{
    return timeInGallery;
}
public String toString()
{
    return "This is a: ";
}

   


 
}
