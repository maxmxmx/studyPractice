/**
 * Created by redho on 26.04.2016.
 */
public class Message {

    private String id;
    private String message;
    private String author;
    private long timestamp;

    public Message( String id, String message, String author, long timestamp){
        this.id = id;
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTimestamp(long timastamp) {
        this.timestamp = timestamp;
    }
}
