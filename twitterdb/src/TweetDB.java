
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seanmapanao
 */
public class TweetDB {

    private String comment;
    private ArrayList<Tweet> tweets;

    public TweetDB(String comment) {
        setComment(comment);
        tweets = new ArrayList<>();
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the tweets
     */
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    /**
     * @param tweets the tweets to set
     */
    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public int getNumberOfTweets() {
        return tweets.size();
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }
    
    //Sorts tweets based on date-time.
    public ArrayList<Tweet> getSortedTweet() {
        Collections.sort(tweets);
        return tweets;
    } 
    
    //takes a tweet object as a parameter and iterates through the arraylist
    //to see if the tweet object is already in the array list.
    public boolean isAlreadyStored(Tweet t) {
        for (int i = 0; i < tweets.size(); i++) {
            if (tweets.get(i).equals(t) == true) {
                return true;
            }
        }
        return false;
    }
    
    //String representation of TwitterDB object
    @Override
    public String toString() {
        return comment + ":\n" + tweets;
    }
}
