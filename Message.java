import java.util.*

//simple static class containing a message, the sender and recipient. Immutable once created.
//TODO add date/time functionality.
public class Message{
	User sender;
	User reciever;
	String text;
	
	public Message(User send, User get,String text){
		this.sender = send;
		this.reciever = get;
		this.text = text;
		
	}
	
	public String toString(){
		return (this.sender.toString() + " sent " + this.text + " to " + this.reciever.toString() +".");
		
	}
	
	public User getSender(){
		return this.sender;
	}
	
	public User getRecipient(){
		return this.reciever;
		
	}
	
	public String getText(){
		return this.text();
		
	}
}