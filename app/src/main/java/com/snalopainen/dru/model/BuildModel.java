package com.snalopainen.dru.model;

import java.util.List;

/**
 * Created by snajdan on 2017/1/6.
 */

public class BuildModel {
    private Component root = new ComponentGroup();

    public void buildModel() {
    }

    public Component getComponentRoot() {
        return root;
    }
}
