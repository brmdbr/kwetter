package dao;

import model.Tweet;
import model.User;

import java.util.List;

public interface TweetDao {

    List<Tweet> findByContent(String query);

    boolean create(String content, User user);

    boolean remove(Tweet tweet);



}
