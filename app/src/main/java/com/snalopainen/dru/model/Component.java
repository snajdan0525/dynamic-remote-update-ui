package com.snalopainen.dru.model;

import android.graphics.drawable.Drawable;

/**
 * Created by snajdan on 2017/1/6.
 */

public abstract class Component {

    protected   boolean bUnreadIndicatior;
    public abstract int getUnreadIndicatiorCount();

    public abstract Drawable getDrawable();

    public abstract String getTitle();

    public abstract boolean isVisible();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild();
}
