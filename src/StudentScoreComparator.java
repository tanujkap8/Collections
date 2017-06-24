/**
 * Created by tanuj on 6/22/17.
 */
import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student>{

    public int compare(Student s1, Student s2) {
        if(s1.score == s2.score)
        {
            return s1.getName().compareTo(s2.getName());
        }
        if(s2.score > s1.score) return 1;
        else return -1;
    }
}
