/**
 * Created by tanuj on 6/22/17.
 */
import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee>{

    public int compare(Employee o1, Employee o2) {
        if(o1.salary == o2.salary) return 0;
        if(o2.salary > o1.salary) return 1;
        else return -1;
    }
}
