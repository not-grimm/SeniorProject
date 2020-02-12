import java.util.*;
import java.time.*;

//simple static class containing a message, the sender and recipient. Immutable once created.

public class Message{
	User sender;
	User reciever;
	String text;
	LocalDateTime sent;

	public Message(User send, User get,String text){
		this.sender = send;
		this.reciever = get;
		this.text = text;
		this.generateReceipt();

	}

	public String toString(){
		return (this.sender.toString() + " sent " + this.text + " to " + this.reciever.toString() +".");

	}

	public User getSender(){
		return this.sender;
	}
	private void generateReceipt(){
		this.sent = LocalDateTime.now();
	}

	public User getRecipient(){
		return this.reciever;

	}

	public String getText(){
		return this.text;

	}
}
