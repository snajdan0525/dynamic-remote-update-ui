package com.snalopainen.dru.model;

import android.graphics.drawable.Drawable;

/**
 * Created by snajdan on 2017/1/6.
 */

public abstract class Component {

    protected   boolean bUnreadIndicatior;
    protected abstract int getUnreadIndicatiorCount();

    protected abstract Drawable getDrawable();

    protected abstract String getTitle();

    protected abstract boolean isVisible();

    protected abstract void add(Component component);

    protected abstract void remove(Component component);

    protected abstract Component getChild();
}
