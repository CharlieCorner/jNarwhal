package com.github.charliecorner.jnarwhal.dto;

import com.github.charliecorner.jnarwhal.constants.Kind;
import java.util.List;

/**
 *
 * @author Charlie Corner
 */
public final class Listing<E extends Thing> {

    private final Kind kind = Kind.LISTING;
    private List<E> data;
    private String before;
    private String after;
    private String modhash;

    private Listing() {
    }

    public String getKind() {
        return kind.getOfficialDenomination();
    }

    public List<E> getData() {
        return data;
    }

    public String getBefore() {
        return before;
    }

    public String getAfter() {
        return after;
    }

    public String getModhash() {
        return modhash;
    }
}
