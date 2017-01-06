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
    protected int getUnreadIndicatiorCount() {
        return (bVisible && bNewFeature && unReadCnt > 0 && hasProfile) ? 1 : 0;
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

    }

    @Override
    protected void remove(Component component) {

    }

    @Override
    protected Component getChild() {
        return null;
    }
}
