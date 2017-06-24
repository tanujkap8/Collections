/**
 * Created by tanuj on 6/21/17.
 */
import java.util.*;

public class p3 {

    static void uniqueChar(String name)
    {
        List<Character> characterSet = new ArrayList<>();
        for(char c:name.toCharArray())
        {
            characterSet.add(c);
        }

        Set<Character> uniquearray = new HashSet<>(characterSet);
        Iterator<Character> characterIterator = uniquearray.iterator();
        while (characterIterator.hasNext()){
            Character obj = characterIterator.next();
            System.out.println(obj+" "+Collections.frequency(characterSet,obj));
        }
    }

    public static void main(String[] args)
    {
        String name = "My name is tanuj";
        uniqueChar(name);
    }
}