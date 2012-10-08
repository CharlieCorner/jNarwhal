package com.github.charliecorner.jnarwhal.dto.datastructures;

import com.github.charliecorner.jnarwhal.constants.Kind;
import com.github.charliecorner.jnarwhal.dto.Thing;
import com.github.charliecorner.jnarwhal.interfaces.Created;

/**
 *
 * @author Charlie Corner
 */
public class Account extends Thing implements Created {
    private String modhash;
    private long created;
    private long createdUTC;
    private int commentKarma;
    private int linkKarma;
    private boolean hasMail;
    private boolean hasModMail;
    private boolean isGold;
    private boolean isMod;

    public Account(String modhash, 
            long created, 
            long createdUTC, 
            int commentKarma, 
            int linkKarma, 
            boolean hasMail, 
            boolean hasModMail, 
            boolean isGold, 
            boolean isMod, 
            String id, 
            String name, 
            Object data) {
        super(id, name, Kind.ACCOUNT, data);
        this.modhash = modhash;
        this.created = created;
        this.createdUTC = createdUTC;
        this.commentKarma = commentKarma;
        this.linkKarma = linkKarma;
        this.hasMail = hasMail;
        this.hasModMail = hasModMail;
        this.isGold = isGold;
        this.isMod = isMod;
    }

    public long getCreated() {
        return this.created;
    }

    public long getCreatedUTC() {
        return this.created;
    }
}
