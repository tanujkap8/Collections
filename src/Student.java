/**
 * Created by tanuj on 6/22/17.
 */
public class Student {

    String name;
    double score, age;

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double getAge() {
        return age;
    }

    public Student(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    public String toString(){
        return name+" "+score+" "+age;
    }
}
