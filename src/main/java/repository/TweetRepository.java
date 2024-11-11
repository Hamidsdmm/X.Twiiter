package repository;

import entities.Tweet;

import java.sql.SQLException;

public interface TweetRepository {
    Tweet creat(Tweet tweet) throws SQLException;
    Tweet read (long tweet_id) throws SQLException;
    Tweet update(String text,long tweet_id) throws SQLException;
    Tweet delete(long tweet_id) throws SQLException;
}
