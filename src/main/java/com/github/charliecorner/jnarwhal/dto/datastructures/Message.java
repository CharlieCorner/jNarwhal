package com.github.charliecorner.jnarwhal.dto.datastructures;

import com.github.charliecorner.jnarwhal.constants.Kind;
import com.github.charliecorner.jnarwhal.dto.Thing;
import com.github.charliecorner.jnarwhal.interfaces.Created;

/**
 *
 * @author Charlie corner
 */
public class Message extends Thing implements Created {
    
    /**
     * It should be noted that, per API specification, this field is still 
     * subject to peer review.
     *
     * @see <a href="https://github.com/reddit/reddit/wiki/thing">Reddit
     * official API specification</a>
     */
    private Message firstMessage;
    private String author;
    private String body;
    private String bodyHTML;
    private String context;
    private String parentId;
    private String replies;
    private String subject;
    private String subreddit;
    private long created;
    private long createdUTC;
    private boolean newMessage;

    public Message(Message firstMessage, 
            String author, 
            String body, 
            String bodyHTML, 
            String context, 
            String parentId, 
            String replies, 
            String subject, 
            String subreddit,
            long created,
            long createdUTC,
            boolean newMessage, 
            String id, 
            String name, 
            Object data) {
        super(id, name, Kind.MESSAGE, data);
        this.firstMessage = firstMessage;
        this.author = author;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.context = context;
        this.parentId = parentId;
        this.replies = replies;
        this.subject = subject;
        this.subreddit = subreddit;
        this.newMessage = newMessage;
        this.created = created;
        this.createdUTC = createdUTC;
    }

    public Message getFirstMessage() {
        return firstMessage;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }

    public String getContext() {
        return context;
    }

    public String getParentId() {
        return parentId;
    }

    public String getReplies() {
        return replies;
    }

    public String getSubject() {
        return subject;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public boolean isNewMessage() {
        return newMessage;
    }
    
    public long getCreated() {
        return created;
    }

    public long getCreatedUTC() {
        return createdUTC;
    }
    
}
