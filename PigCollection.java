import java.util.Arrays;

public class PigCollection 
{
    private static Pig pigsarr[];
    private static int count;

    public PigCollection()
    {
        final int PIGMAXUMBER = 5;
        pigsarr= new Pig[PIGMAXUMBER];
        count = 0;
    }
    public void setPigArray(Pig[] pigsarr)
    {
        this.pigsarr = pigsarr;
    }
    public  Pig[] getPigArray()
    {
        return pigsarr;
    }
    public  void addPig(Pig uvel)
      {
        if (count >= pigsarr.length)
           {
            Pig newpigsarr[] = new Pig[2*pigsarr.length];
            for(int i =0; i< pigsarr.length; i++){
                newpigsarr[i] = pigsarr[i];
            }
            pigsarr = newpigsarr;
       }
        pigsarr[count] = uvel;
        count++;
 }

    public int getPigCount()
    {
        return count;
    }

    public String getPigList()
    {
        String string = "";
        for (int i = 0; i < count; i++) 
        {
            string += pigsarr[i].getName() + ", ";
        }
        if (string != "") 
        {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
        }
    public  boolean isEmpty() 
      {
        return count == 0;
      }
   }
