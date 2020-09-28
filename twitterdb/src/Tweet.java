
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seanmapanao
 */
//Class to act as a twitter database
public class Tweet implements Comparable<Tweet> {

    private String userID;
    private Date date;
    private String tweet;

    public Tweet(String userID, String dateTime, String tweet)
            throws ParseException {
        setUserID(userID);
        setTweet(tweet);
        setDate(dateTime);
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    
//This method takes in a string representation of a date and time
    //(uses dd/MM/yyyy hh:mm:ss format)
    //Converts string into a date object
    public void setDate(String date) throws ParseException {
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        this.date = sdt.parse(date);
    }

    /**
     * @return the tweet
     */
    public String getTweet() {
        return tweet;
    }

    /**
     * @param tweet the tweet to set
     */
    public void setTweet(String tweet) {
        this.tweet = tweet;
    }
    
    //Takes in an Object object and converts Object object into a Tweet object to 
    //be used to compare.
    @Override
    public boolean equals(Object other) {
        Tweet otherTweet = (Tweet) other;
        return this.getTweet() == otherTweet.getTweet();
    }
    
    //return -1,0 or 1 after comparing date-times.
    @Override
    public int compareTo(Tweet o) {
        if (this.getDate() == null || o.getDate() == null) {
            return 0;
        } else {
            return this.getDate().compareTo(o.getDate());
        }
    }
    
    //String representaion of tweet object
    @Override
    public String toString() {
        return "\nUser ID: " + getUserID() + "\nDate Tweeted: " + getDate()
                + "\nTweet: " + getTweet() + 
                "\n---------------------------------------------------------";
    }
}
