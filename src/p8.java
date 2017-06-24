/**
 * Created by tanuj on 6/22/17.
 */
import java.util.*;
import java.text.*;

public class p8
{

    public static void main(String args[])
    {
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Date is : " + df.format(date));
    }
}