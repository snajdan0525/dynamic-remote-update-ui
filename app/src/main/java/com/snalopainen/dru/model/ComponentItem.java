package com.snalopainen.dru.model;

import android.graphics.drawable.Drawable;

/**
 * Created by snajdan on 2017/1/6.
 */

public class ComponentItem extends Component {


    private boolean bVisible;
    private boolean bNewFeature;
    private int unReadCnt;
    private boolean hasProfile;

    @Override
    public int getUnreadIndicatiorCount() {
        return (bVisible && bNewFeature && unReadCnt > 0 && hasProfile) ? 1 : 0;
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

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild() {
        return null;
    }
}
