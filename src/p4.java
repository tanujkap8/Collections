/**
 * Created by tanuj on 6/22/17.
 */

import java.util.ArrayList;
import java.util.Collections;

public class p4 {

    public static void main(String[] args)
    {
        ArrayList<Employee> ts = new ArrayList<Employee>();
        ts.add(new Employee("Ankur",21,15000));
        ts.add(new Employee("Tanuj",22,17000));
        ts.add(new Employee("Shubham",23,13000));
        ts.add(new Employee("Yashi",22,14000));
        ts.add(new Employee("Sahil",21,12000));
        Collections.sort(ts,new EmpSalaryComparator());
        System.out.println(ts);

    }

}