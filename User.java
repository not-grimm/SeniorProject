import java.util.*;


//class hosting user peripherals
//TODO complete gender and orientation functionality
//TODO create profile components
public class User{

	String name;
	 long userID;
	ArrayList<Boolean> orientation;
	ArrayList<Boolean> gender;
	ArrayList<Match> matches;
	ArrayList<User> likes;

	public User(String name){
		this.name = name;
		gender = this.createGender();
		orientation = this.createOrientation();
		this.matches = new ArrayList<Match>();
		this.likes = new ArrayList<User>();
		this.generateID();
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
		return this.likes.contains(liked);

	}
	public void addLike(User liked){
		if(liked.hasLiked(this)){
			Match match = new Match(liked,this);
			liked.addMatch(match);
			this.addMatch(match);
			this.likes.add(liked);

		}
		else{
			this.likes.add(liked);
		}
	}
	public void addMatch(Match freshMatch){
		this.matches.add(freshMatch);
	}

	//getters below
  public  long getID(){
		return this.userID;
	}
	public ArrayList<Boolean> getGender(){
		return this.gender;
	}
	public ArrayList<Boolean> getOrientation(){
		return this.orientation;
	}
	public ArrayList<Match> getMatches(){
		return this.matches;
	}
  private void generateID(){
		Random rand = new Random();
		this.userID = rand.nextLong();
	}
	//determines if the passed user is the same as this
	public Boolean equals(User check){
		 long id1 = check.getID();
		 long id2 = this.getID();
		 if(id1 == id2){
			 return true;
		 }
		 return false;
	}


}
