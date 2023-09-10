import java.util.Arrays;

public class Newsfeed {
  
  String[] topics;
  
  public Newsfeed(String[] initialTopics) {
	topics = initialTopics;
  }
  
public static void main(String[] args) {

	Newsfeed feed; //object of class Newsfeed not initialized

    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
        String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
	    feed = new Newsfeed(humanTopics); //Object of class Newsfeed  it's initialize with a array of Strings
        //de acordo com o metódo construtor o objeto deve ser inicializado com um Array de Strings. 
        
    } else if(args[0].equals("Robot")) {
      
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
} 
