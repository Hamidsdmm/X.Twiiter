package repository;

import entities.Tweet;

import java.sql.SQLException;

public interface TweetRepository {
    Tweet creat(Tweet tweet) throws SQLException;
    Tweet read (int id) throws SQLException;
    Tweet update(int id) throws SQLException;
    Tweet delete(int id) throws SQLException;
}
