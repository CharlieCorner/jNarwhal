package com.github.charliecorner.jnarwhal.dto.datastructures;

import com.github.charliecorner.jnarwhal.constants.Kind;
import com.github.charliecorner.jnarwhal.dto.Thing;
import java.util.List;

/**
 *
 * @author Charlie Corner
 */
public class More extends Thing {
    private List<String> children;

    public More(List<String> children, 
            String id, 
            String name, 
            Object data) {
        super(id, name, Kind.MORE, data);
        this.children = children;
    }

    public List<String> getChildren() {
        return children;
    }
}
