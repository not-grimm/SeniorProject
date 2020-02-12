import java.util.*;
//holding class for profile details
//TODO add location data
public class Profile{

  String bio;
  Object[] pictures;

  public Profile(){
    this.bio = "";
    this.pictures = new Object[10];
  }

  public void updateBio(String newBio){
    this.bio = newBio;
  }
  public void replacePicture(Object foo, int index){
      this.pictures[index] = foo;
  }
  public String getBio(){
    return this.bio;
  }
  public Object getImage(int index){
    return this.pictures[index];
  }


}
