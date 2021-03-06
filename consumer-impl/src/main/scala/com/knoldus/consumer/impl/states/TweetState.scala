package com.knoldus.consumer.impl.states

import com.knoldus.producer.api.models.Tweet
import play.api.libs.json.Json

/**
  * Created by Harmeet Singh(Taara) on 19/2/17.
  */
case class TweetState(tweet: Option[Tweet], timeStamp: String)

object TweetState {
  implicit val formatter = Json.format[TweetState]
}
