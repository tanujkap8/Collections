import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Created by Tanuj Kapila on 6/21/17.
 */
public class p1
{
    public static void main(String[] args)
    {
        float sum=0;
         ArrayList<Float> listNumbers= new ArrayList<>();
         listNumbers.add(2.0f);
         listNumbers.add(3.0f);
         listNumbers.add(4.0f);
         listNumbers.add(5.0f);
         listNumbers.add(6.0f);
         Iterator<Float> itr=listNumbers.iterator();
         while(itr.hasNext()) {
             Float obj = itr.next();
             sum += obj;
             System.out.println(obj);
         }
        System.out.println("THE SUM OF NUMBERS IS : "+sum);
    }
}
