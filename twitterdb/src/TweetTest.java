
import java.text.ParseException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seanmapanao
 */
public class TweetTest {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        
        TweetDB list = new TweetDB("Various tweets");
        
        //premade tweet objects to be added to array list - used to test sort and
        //size methods.
        Tweet tweet =  new Tweet("ABC", "23/03/2020 13:35:56", "This is a test3");
        Tweet tweet2 = new Tweet("ABC", "12/01/2020 13:35:56", "This is a test2");
        Tweet tweet3 = new Tweet("ABC", "12/03/2020 13:55:56", "This is a test1");
        Tweet tweet4 = new Tweet("ABC", "15/04/2020 13:36:56", "Thiis is a test");
        Tweet tweet6 = new Tweet("ABC", "10/07/2025 15:43:36", "Not in array");
        
        //Tweet object with user inputted parameters.
        System.out.println("Please Enter the Following Tweet Information.");
        System.out.println("Enter User ID: ");
        String userName = scan.nextLine();
        System.out.println("Enter current date and time in dd/MM/yyyy hh:mm:ss"
                + "format: ");
        String date = scan.nextLine();
        System.out.println("Enter Tweet: ");
        String userTweet = scan.nextLine();
        
        Tweet tweet5 = new Tweet(userName,date,userTweet);
        
        //add tweets to array list.
        list.addTweet(tweet);
        list.addTweet(tweet2);
        list.addTweet(tweet3);
        list.addTweet(tweet4);
        list.addTweet(tweet5);
        
        //print current list
        System.out.println(list); 
       
        //testing method to get array size
        System.out.println("Number of tweets: " + list.getNumberOfTweets());
        
        //sort tweets by date-time
        System.out.println("-----Sorted Tweet List -----");
        System.out.println(list.getSortedTweet());
        
        //testing get tweet @ specified index method
        System.out.println("Tweet at index 3: " + list.getTweet(3));
        
        //testing method that checks if tweet is already in array list.
        System.out.println(list.isAlreadyStored(tweet5));
    }
}
