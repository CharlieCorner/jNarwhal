package com.github.charliecorner.jnarwhal.dto.datastructures;

import com.github.charliecorner.jnarwhal.constants.Kind;
import com.github.charliecorner.jnarwhal.dto.Thing;
import com.github.charliecorner.jnarwhal.interfaces.Created;
import com.github.charliecorner.jnarwhal.interfaces.Votable;

/**
 *
 * @author Charlie Corner
 */
public class Link extends Thing implements Votable, Created {
    
    private Object media;
    private Object mediaEmbed;
    private String author;
    private String authorFlairCssClass;
    private String authorFlairText;
    private String domain;
    private String permalink;
    private String selfText;
    private String selfTextHTML;
    private String subreddit;
    private String subredditID;
    private String thumbnail;
    private String title;
    private String url;
    private Boolean likes;
    private long created;
    private long createdUTC;
    private int ups;
    private int downs;
    private int numComments;
    private int score;
    private boolean clicked;
    private boolean hidden;
    private boolean self;
    private boolean over18;
    private boolean saved;

    public Link(Object media, 
            Object mediaEmbed, 
            String author, 
            String authorFlairCssClass, 
            String authorFlairText, 
            String domain, 
            String permalink, 
            String selfText, 
            String selfTextHTML, 
            String subreddit, 
            String subredditID,
            String thumbnail, 
            String title, 
            String url, 
            Boolean likes, 
            long created, 
            long createdUTC, 
            int ups, 
            int downs, 
            int numComments, 
            int score, 
            boolean clicked, 
            boolean hidden, 
            boolean self, 
            boolean over18, 
            boolean saved, 
            String id,
            String name, 
            Object data) {
        super(id, name, Kind.LINK, data);
        this.media = media;
        this.mediaEmbed = mediaEmbed;
        this.author = author;
        this.authorFlairCssClass = authorFlairCssClass;
        this.authorFlairText = authorFlairText;
        this.domain = domain;
        this.permalink = permalink;
        this.selfText = selfText;
        this.selfTextHTML = selfTextHTML;
        this.subreddit = subreddit;
        this.subredditID = subredditID;
        this.thumbnail = thumbnail;
        this.title = title;
        this.url = url;
        this.likes = likes;
        this.created = created;
        this.createdUTC = createdUTC;
        this.ups = ups;
        this.downs = downs;
        this.numComments = numComments;
        this.score = score;
        this.clicked = clicked;
        this.hidden = hidden;
        this.self = self;
        this.over18 = over18;
        this.saved = saved;
    }

    public Object getMedia() {
        return media;
    }

    public Object getMediaEmbed() {
        return mediaEmbed;
    }

    public String getAuthor() {
        return author;
    }

    public String getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public String getAuthorFlairText() {
        return authorFlairText;
    }

    public String getDomain() {
        return domain;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getSelfText() {
        return selfText;
    }

    public String getSelfTextHTML() {
        return selfTextHTML;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getSubredditID() {
        return subredditID;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getLikes() {
        return likes;
    }

    public int getNumComments() {
        return numComments;
    }

    public int getScore() {
        return score;
    }

    public boolean isClicked() {
        return clicked;
    }

    public boolean isHidden() {
        return hidden;
    }

    public boolean isSelf() {
        return self;
    }

    public boolean isOver18() {
        return over18;
    }

    public boolean isSaved() {
        return saved;
    }

    public Boolean isLikes() {
        return likes;
    }

    public void setLikes(Boolean likes) {
        this.likes = likes;
    }

    public long getCreated() {
        return created;
    }

    public long getCreatedUTC() {
        return createdUTC;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }
}
