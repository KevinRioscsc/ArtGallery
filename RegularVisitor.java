/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
public class RegularVisitor extends Visitor {
    private static int Regularcounter = 0;
    private String regularID;
    public RegularVisitor(int timeOntoQueue)
    {
        super(timeOntoQueue);
        setRegularID();
    }
    public void setRegularID()
    {
        Regularcounter++;
        regularID = "Regular" + Regularcounter;
    }
    @Override
    public String toString()
    {
        return "Regular";
    }
}
