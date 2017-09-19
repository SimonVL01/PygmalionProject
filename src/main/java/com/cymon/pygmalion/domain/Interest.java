package com.cymon.pygmalion.domain;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class Interest {

    private List<String> categories;

    public Interest(List<String> categories) {
        for (String s : categories) {
            categories.add(s);
        }
    }

}
