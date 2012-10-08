package com.github.charliecorner.jnarwhal.constants;

/**
 *
 * @author Charlie Corner
 */
public enum Kind {

    MORE("more", -2),
    LISTING("Listing", -1),
    COMMENT("comment", 1),
    ACCOUNT("account", 2),
    LINK("link", 3),
    MESSAGE("message", 4),
    SUBREDDIT("subreddit", 5);
    
    private final String officialDenomination;
    private final int kindId;

    private Kind(String officialDenomination, int kindId) {
        this.officialDenomination = officialDenomination;
        this.kindId = kindId;
    }

    public String getOfficialDenomination() {
        return officialDenomination;
    }

    public int getKindId() {
        return kindId;
    }
}
