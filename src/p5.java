/**
 * Created by tanuj on 6/22/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p5 {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("Ankur",91,22));
        ls.add(new Student("Tanuj",90,21));
        ls.add(new Student("Shubham",89,22));
        ls.add(new Student("Yashi",88,21));
        ls.add(new Student("Sahil",90,20));
        Collections.sort(ls,new StudentScoreComparator());
        System.out.println(ls);
    }
}
