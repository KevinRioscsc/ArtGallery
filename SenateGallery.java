/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
public class SenateGallery {
    Deque<Visitor> waitingLine = new Deque<>();
    LList<Visitor> visitorInGallery = new LList<>();
    LList<Visitor> visitorFinished = new LList<>();
    private String date;
    
    int totalTimeforVIP;
    int totalTimeforReg;
    int totalReg =0;
    int totalVIP = 0;
    double avgForViP;
    double avgForReg;
    
    public SenateGallery()
    {
        setDate("");
        
    }
    public SenateGallery(String date)
    {
       this.date = date; 
    }

    
    public void setDate(String date)
    {
        this.date = date;
    }
    public String getDate()
    {
        return date;
    }
    public void initializeSenateGallery()
    {
        
        for(int i =0; i < 96; i++)
        {
            waitingLine.addFront(new RegularVisitor(0));
            
        }
        for(int i = 0; i < 4; i ++)
        {   
            waitingLine.addFront(new VIPVisitor(0));
        }
        for(int i =0; i < 70; i ++)
        {
            Visitor temp = waitingLine.removeFront();
            temp.settimeOutofQueue(0);
            visitorInGallery.add(temp);
        }
    }
    public void runSenateGallerySimulation(int simMinutes)
    {
        for(int CurrentTime = 1; CurrentTime < simMinutes; CurrentTime ++)
        {
            for(int j =0; j<3 ; j++)
            {
                waitingLine.add(new RegularVisitor(CurrentTime));
            }
            if(CurrentTime%5==0)
            {
                waitingLine.addFront(new VIPVisitor(CurrentTime));
            }
            for(int z =0; z < visitorInGallery.size()-1;z++)
            {
              visitorInGallery.get(z).decrementtimeRemaining();
              
              if(visitorInGallery.get(z).getTimeremaining()==0)
              {
                  
                  Visitor temp2 = visitorInGallery.remove(z);
                  visitorFinished.add(temp2);
              }
            }
            
           
             while(visitorInGallery.size()<=55&&!waitingLine.isEmpty())
             {
                     Visitor PeopelinGallery = waitingLine.removeFront();
                     PeopelinGallery.settimeOutofQueue(CurrentTime);
                     visitorInGallery.add(PeopelinGallery); 
            }  
            
        }
    }
    public void outputStats()
    {
        System.out.print("\n The date of the visit to the Senate Gallery is " + date);
        System.out.print("\n Total who finished viewing: " + visitorFinished.size());
        System.out.print("\n Total who are still in the gallery: " + visitorInGallery.size());
        System.out.print("\n Total who are still waiting: " + waitingLine.size());
        
        for(int i =0; i < visitorFinished.size();i++)
        {
            
           
           if(visitorFinished.get(i).toString().equals("VIP"))
           {
               
               totalTimeforVIP +=visitorFinished.get(i).getTotaltimeinQueue();
               totalVIP++;
           }
           if(visitorFinished.get(i).toString().equals("Regular"))
           {
              totalTimeforReg += visitorFinished.get(i).getTotaltimeinQueue();
              totalReg++;
           }
           
        }
        for(int i =0; i < visitorInGallery.size();i++)
        {
            if(visitorInGallery.get(i).toString().equals("VIP"))
            {
               totalTimeforVIP +=visitorInGallery.get(i).getTotaltimeinQueue();
               totalVIP++;
            }
            if(visitorInGallery.get(i).toString().equals("Regular"))
            {
                totalTimeforReg += visitorInGallery.get(i).getTotaltimeinQueue();
              totalReg++;
            }
        }
        avgForViP = (double)totalTimeforVIP/totalVIP;
        avgForReg = (double)totalTimeforReg/totalReg;
        System.out.format("\nThe average wait time for VIP Visitors who are in the gallery or finished viewing is  %.2f  secs", avgForViP);
        
         System.out.format("\nThe average wait time for Regular Visitors who are in the gallery or finished viewing is  %.2f  secs", avgForReg );
        //Me Trying print.f
    }
    
}
