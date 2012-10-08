package com.github.charliecorner.jnarwhal.interfaces;

/**
 *
 * @author Charlie Corner
 */
public interface Votable {
    
    int getUps();
    int getDowns();
    Boolean isLikes();
    
    void setUps(int ups);
    void setDowns(int downs);
    void setLikes(Boolean likes);
}
