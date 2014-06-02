package org.virtualjug.bot.questions;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Created by shelajev on 02/06/14.
 */
public class TwitterPoster {

  private static final Twitter twitter = TwitterFactory.getSingleton();


  public static void tweet(String question) throws TwitterException {
//    String prettyQuestion = prettify(question);
    twitter.updateStatus(question);
  }




}
