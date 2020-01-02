/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
public class VIPVisitor extends Visitor {
    private static int  vipCounter = 0;
    private String vipID;
    public VIPVisitor(int timeOntoQueue)
    {
        super(timeOntoQueue);
        setVIPid();
    }
    public void setVIPid()
    {
        vipCounter++;
        vipID = "VIP" + vipCounter;
    }
    @Override
    public String toString()
    {
        return "VIP";
    }
    
}
