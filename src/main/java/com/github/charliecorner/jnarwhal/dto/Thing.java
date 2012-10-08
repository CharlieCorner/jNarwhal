package com.github.charliecorner.jnarwhal.dto;

import com.github.charliecorner.jnarwhal.constants.Kind;

/**
 *
 * @author CharlieCorner
 */
public abstract class Thing {
    protected String id;
    protected String name;
    protected Kind kind;
    protected Object data;
    
    private Thing(){
    }

    protected Thing(String id, String name, Kind kind, Object data) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.data = data;
    }

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Kind getKind() {
        return kind;
    }

    protected void setKind(Kind kind) {
        this.kind = kind;
    }

    protected Object getData() {
        return data;
    }

    protected void setData(Object data) {
        this.data = data;
    }
}
