/**
 * Created by tanuj on 6/24/17.
 */
import java.util.Comparator;

public class InputNumber {
    static int counter=0;
    private int number,frequency,order;

    public InputNumber()
    {

    }

    public InputNumber(int number, int frequency, int order) {
        this.number = number;
        this.frequency = frequency;
        this.order = order;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return number+":"+frequency;
    }
}

class FrequencyComparator implements Comparator<InputNumber>
{
    @Override
    public int compare(InputNumber o1, InputNumber o2) {
        if(o1.getFrequency()>o2.getFrequency())
        {
            return -1;
        }
        else if (o1.getFrequency()==o2.getFrequency())
        {
            return o1.getOrder()<o2.getOrder()?-1:1;
        }
        else
        {
            return 1;
        }
    }
}