package com.github.charliecorner.jnarwhal.dto.datastructures;

import com.github.charliecorner.jnarwhal.constants.Kind;
import com.github.charliecorner.jnarwhal.dto.Thing;

/**
 *
 * @author Charlie Corner
 */
public class Subreddit extends Thing {
    private String description;
    private String displayName;
    private boolean over18;
    private long subscribers;
    private String title;
    private String url;

    public Subreddit(String description, 
            String displayName, 
            boolean over18, 
            long subscribers, 
            String title, 
            String url, 
            String id, 
            String name, 
            Object data) {
        super(id, name, Kind.SUBREDDIT, data);
        this.description = description;
        this.displayName = displayName;
        this.over18 = over18;
        this.subscribers = subscribers;
        this.title = title;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isOver18() {
        return over18;
    }

    public long getSubscribers() {
        return subscribers;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
