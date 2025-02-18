package com.example.diplomawork;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

public class CustomViewPager extends ViewPager {
    private boolean swipeEnabled;

    public CustomViewPager(Context context) {
        super(context);
        swipeEnabled = true;
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        swipeEnabled = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return this.swipeEnabled && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.swipeEnabled && super.onInterceptTouchEvent(event);
    }

    public void setSwipeEnabled(boolean enabled) {
        this.swipeEnabled = enabled;
    }
}