package com.snalopainen.dru.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by snajdan on 2017/1/6.
 */

public class ComponentGroup extends Component {
    private List<Component> componentsList;

    public ComponentGroup() {
        componentsList = new ArrayList<Component>();
    }

    public List<Component> getComponentsList() {
        return componentsList;
    }

    @Override
    protected int getUnreadIndicatiorCount() {
        int count = 0;
        Iterator<Component> iterator = componentsList.iterator();
        while (iterator.hasNext()) {
            Component component = (Component) iterator.next();
            count += component.getUnreadIndicatiorCount();
        }
        if (count > 0) {
            bUnreadIndicatior = true;
        } else {
            bUnreadIndicatior = false;
        }
        return count;
    }

    @Override
    protected Drawable getDrawable() {
        return null;
    }

    @Override
    protected String getTitle() {
        return null;
    }

    @Override
    protected boolean isVisible() {
        return false;
    }

    @Override
    protected void add(Component component) {
        componentsList.add(component);

    }

    @Override
    protected void remove(Component component) {

        componentsList.remove(component);
    }

    @Override
    protected Component getChild() {
        return null;
    }
}
