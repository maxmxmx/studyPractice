/**
 * Created by redho on 30.05.2016.
 */
import java.util.Comparator;
import java.util.GregorianCalendar;

public class TimeCompare implements Comparator<Chat>  {
    @Override
    public int compare(Chat temp1, Chat  temp2) {
        return Long.compare(temp2.getTimestamp() , temp1.getTimestamp());
    }
}