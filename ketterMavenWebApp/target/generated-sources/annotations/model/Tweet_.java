package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.User;

@Generated(value="EclipseLink-2.6.0.v20150330-rNA", date="2017-03-06T14:31:20")
@StaticMetamodel(Tweet.class)
public class Tweet_ { 

    public static volatile SingularAttribute<Tweet, User> createdBy;
    public static volatile ListAttribute<Tweet, User> likedBy;
    public static volatile SingularAttribute<Tweet, Long> id;
    public static volatile SingularAttribute<Tweet, String> content;

}