package com.snalopainen.dru.pareser;

import com.snalopainen.dru.model.BuildModel;
import com.snalopainen.dru.model.Component;

/**
 * Created by snajdan on 2017/1/6.
 */

public class Parser {
    private BuildModel buildModel;
    private  void parser(){
        buildModel.buildModel();
        Component component = buildModel.getComponentRoot();
        component.getUnreadIndicatiorCount();
        component.getDrawable();
        component.getTitle();
    }

}
