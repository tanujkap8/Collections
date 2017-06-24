/**
 * Created by tanuj on 6/24/17.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p6 {
    public static void main(String[] args) {
        int[] arr ={3,1,5,8,3,2,3,2,4,5,1,1,1};
        int temp=0;
        List<InputNumber> inputNumbers = new ArrayList<>();
        for(int i:arr)
        {
            for(InputNumber in : inputNumbers)
            {
                if(in.getNumber()==i)
                {
                    in.setFrequency(in.getFrequency()+1);
                    temp=1;
                    break;
                }

            }
            if(temp==0)
            {
                inputNumbers.add(new InputNumber(i,1,InputNumber.counter));
                InputNumber.counter++;
            }
            else
            {
                temp=0;
            }
        }
        inputNumbers.sort(new FrequencyComparator());
        System.out.print(inputNumbers);
    }
}