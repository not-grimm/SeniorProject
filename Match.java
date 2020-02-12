import java.util.*;


//class hosting a match conversation
//TODO add image sending functionality
public class Match{
	User person1;
	User person2;
	ArrayList<Message> chat;

	public Match(User bip, User bop){
		this.person1 = bip;
		this.person2 = bop;
		this.chat = new ArrayList<Message>();


	}

	//adds a sent message to chat
	public void addMessage(String text, User sender){

				if(sender.equals(this.person1)){
					Message sent =  new Message(person1,person2,text);
					this.chat.add(sent);
				}
				else{
					Message sent =  new Message(person2,person1,text);
					this.chat.add(sent);
				}
	}





}
