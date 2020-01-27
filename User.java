import java.util.*;
public class User{

	String name;
	ArrayList<Boolean> orientation;
	ArrayList<Boolean> gender;
	ArrayList<User> matches;
	ArrayList<User> likes;
	
	public User(String name){
		this.name = name;
		gender = this.createGender();
		orientation = this.createOrientation();
		this.matches = new ArrayList<User>();
		this.likes = new ArrayList<User>();
	}
	
	public String toString(){
		return this.name;
		
	}
	//this is a method for updating gender or creating one, prompts user questions then fills array from values
	// Currently returning a nothing COMPLETE THIS LATER
	public ArrayList<Boolean> createGender(){
		ArrayList<Boolean> empty = new ArrayList<Boolean>();
		return empty;
	}
	//this is a method for updating sexual orientation or creating one, prompts user questions then fills array from values
	// Currently returning a nothing COMPLETE THIS LATER
	public ArrayList<Boolean> createOrientation(){
		ArrayList<Boolean> empty = new ArrayList<Boolean>();
		return empty;
	}
	public Boolean hasLiked(User liked){
		return this.likes.contains(liked));
		
	}
	public void addLike(User liked){
		if(liked.hasLiked(this){
			Match match = new Match(this,liked);
			liked.addMatch(match);
			this.addMatch(match);
			this.likes.add(liked);
			
		}
		else{
			this.likes.add(liked);
		}
	}
	public void addMatch(User freshMatch){
		this.matches.add(freshMatch);
	}
	
	//getters below
	{
	public ArrayList<Boolean> getGender(){
		return this.gender;	
	}
	public ArrayList<Boolean> getOrientation(){
		return this.orientation;
	}
	public ArrayList<User> getMatches(){
		return this.matches;
	}
	public ArrayList<User> getOrientation(){
		return this.orientation;
	}
	}


}