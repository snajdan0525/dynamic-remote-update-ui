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
    public int getUnreadIndicatiorCount() {
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

    private List<Drawable> childrenDrawable;

    private List<Drawable> getChildrenDrawables() {
        Iterator<Component> iterator = componentsList.iterator();
        while (iterator.hasNext()) {
            Component component = (Component) iterator.next();
            childrenDrawable.add(component.getDrawable());
        }
        return childrenDrawable;
    }

    private List<String> childrenTitle;

    private List<String> getChildrenTitles() {
        Iterator<Component> iterator = componentsList.iterator();
        while (iterator.hasNext()) {
            Component component = (Component) iterator.next();
            childrenTitle.add(component.getTitle());
        }
        return childrenTitle;
    }


    @Override
    public Drawable getDrawable() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public void add(Component component) {
        componentsList.add(component);

    }

    @Override
    public void remove(Component component) {

        componentsList.remove(component);
    }

    @Override
    public Component getChild() {
        return null;
    }
}
