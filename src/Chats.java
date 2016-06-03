import java.util.ArrayList;
import java.util.List;

/**
 * Created by redho on 26.04.2016.
 */
public class Messages {
    private List<Message> messages;

    public Messages() { messages = new ArrayList<Message>();}

    public void addMessage(Message message){
        messages.add(message);
    }

    public List<Message> deleteMessage(String message){
        List<Message> list = new ArrayList<>();

        message = message.toLowerCase();

        for(Message item : messages){
            if(item.getMessage().toLowerCase().equals(message)){
                list.remove(item);
            }
        }
        return list;
    }
}
