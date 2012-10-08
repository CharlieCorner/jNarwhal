package com.github.charliecorner.jnarwhal.dto.datastructures;

import com.github.charliecorner.jnarwhal.constants.Kind;
import com.github.charliecorner.jnarwhal.dto.Thing;
import com.github.charliecorner.jnarwhal.interfaces.Created;
import com.github.charliecorner.jnarwhal.interfaces.Votable;

/**
 *
 * @author Charlie Corner
 */
public class Comment extends Thing implements Votable, Created {

    /**
     * Implementations should note that, per API specification, whether one's
     * own upvote is included or note is still subject to peer review.
     *
     * @see <a href="https://github.com/reddit/reddit/wiki/thing">Reddit
     * official API specification</a>
     */
    private int ups;
    /**
     * Implementations should note that, per API specification, whether one's
     * own upvote is included or note is still subject to peer review.
     *
     * @see <a href="https://github.com/reddit/reddit/wiki/thing">Reddit
     * official API specification</a>
     */
    private int downs;
    private Boolean likes;
    /**
     * Implementation should note that, per API specification, whether one's own
     * upvote is included or note is still subject to peer review.
     *
     * @see <a href="https://github.com/reddit/reddit/wiki/thing">Reddit
     * official API specification</a>
     */
    private long created;
    /**
     * Implementation should note that, per API specification, whether one's own
     * upvote is included or note is still subject to peer review.
     *
     * @see <a href="https://github.com/reddit/reddit/wiki/thing">Reddit
     * official API specification</a>
     */
    private long createdUTC;
    private String author;
    private String authorFlairCssClass;
    private String authorFlairText;
    private String body;
    private String bodyHTML;
    private String linkID;
    private String parentID;
    private String subreddit;
    private String subredditID;

    public Comment(int ups, 
            int downs, 
            Boolean likes, 
            long created, 
            long createdUTC, 
            String author, 
            String authorFlairCssClass, 
            String authorFlairText, 
            String body, 
            String bodyHTML, 
            String linkID, 
            String parentID, 
            String subreddit, 
            String subredditID,
            String id, 
            String name,
            Object data) {
        super(id, name, Kind.COMMENT, data);
        this.ups = ups;
        this.downs = downs;
        this.likes = likes;
        this.created = created;
        this.createdUTC = createdUTC;
        this.author = author;
        this.authorFlairCssClass = authorFlairCssClass;
        this.authorFlairText = authorFlairText;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.linkID = linkID;
        this.parentID = parentID;
        this.subreddit = subreddit;
        this.subredditID = subredditID;
    }
    
    
    
    public int getUps() {
        return ups;
    }

    public int getDowns() {
        return downs;
    }

    public Boolean isLikes() {
        return likes;
    }

    public long getCreated() {
        return created;
    }

    public long getCreatedUTC() {
        return createdUTC;
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

    public String getBody() {
        return body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }

    public String getLinkID() {
        return linkID;
    }

    public String getParentID() {
        return parentID;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getSubredditID() {
        return subredditID;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public void setLikes(Boolean likes) {
        this.likes = likes;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthorFlairCssClass(String authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public void setAuthorFlairText(String authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setBodyHTML(String bodyHTML) {
        this.bodyHTML = bodyHTML;
    }

    public void setLinkID(String linkID) {
        this.linkID = linkID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public void setSubredditID(String subredditID) {
        this.subredditID = subredditID;
    }
}
