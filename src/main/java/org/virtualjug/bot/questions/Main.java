package org.virtualjug.bot.questions;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.UtilSSLSocketFactory;
import org.pircbotx.cap.TLSCapHandler;

/**
 * Created by shelajev on 02/06/14.
 */
public class Main {

  public static void main(String[] args) {
    Configuration configuration = new Configuration.Builder()
      .setName("VJUG_Questions")
      .setLogin("LQ")
      .setAutoNickChange(true)
      .setCapEnabled(true)
      .addCapHandler(new TLSCapHandler(new UtilSSLSocketFactory().trustAllCertificates(), true))
      .addListener(new QuestionsListener())
      .setServerHostname("irc.freenode.net")
      .addAutoJoinChannel("#virtualJUG")
      .buildConfiguration();

    try {
      PircBotX bot = new PircBotX(configuration);
      bot.startBot();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
