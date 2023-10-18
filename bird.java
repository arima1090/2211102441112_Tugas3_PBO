import greenfoot.*;

public class bird extends Actor
{
    private GreenfootImage[] images=new GreenfootImage[2];
    private int jeda=10,num=0,deltax=30;
    
    public void addedToWorld(World Latar)
    {
        for(int i=0;i<images.length; i++){
            images[i]=new GreenfootImage("bird"+i+".png");
        }
        setImage(images[0]);
    }    

    public void act()
    {
        if(jeda==0)jeda=10;
        if(jeda==1){
            setImage(images[num]);
            num++;
            if(num>=images.length)num=0;
            
        }
        if(jeda>0)jeda--;
    }
}
