package org.virtualjug.bot.questions;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;

public class QuestionsListener extends ListenerAdapter {

  @Override
  public void onGenericMessage(GenericMessageEvent event) throws Exception {
    String message = event.getMessage();
    if (!message.startsWith("??? "))
      return;

    String question = message.substring(4);
    TwitterPoster.tweet(question);

  }
}
