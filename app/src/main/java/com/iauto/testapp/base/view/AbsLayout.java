package com.iauto.testapp.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsoluteLayout;

public class AbsLayout extends AbsoluteLayout {

    public AbsLayout(Context context) {
        this(context, null);
    }

    public AbsLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AbsLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public AbsLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setMotionEventSplittingEnabled(false);
    }

//    @Override
//    public void setEnabled(boolean enabled) {
//        super.setEnabled(enabled);
//        int count = getChildCount();
//        for (int i = 0; i < count; i++) {
//            View child = getChildAt(i);
//            child.setEnabled(enabled);
//        }
//    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    // for wrap content
//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        measureChildren(widthMeasureSpec, heightMeasureSpec);
//
//        int maxWidth = 0;
//        int maxHeight = 0;
//        int childState = 0;
//        int count = getChildCount();
//
//        for (int i = 0; i < count; i++) {
//            View child = getChildAt(i);
//            if (child.getVisibility() != GONE) {
//                LayoutParams lp = (LayoutParams) child.getLayoutParams();
//                int childRight = lp.x + child.getMeasuredWidth();
//                int childBottom = lp.y + child.getMeasuredHeight();
//                maxWidth = Math.max(maxWidth, childRight);
//                maxHeight = Math.max(maxHeight, childBottom);
//                childState = combineMeasuredStates(childState, child.getMeasuredState()); // diff
//            }
//        }
//
//        maxWidth += getPaddingLeft() + getPaddingRight();
//        maxHeight += getPaddingTop() + getPaddingBottom();
//        maxWidth = Math.max(maxWidth, getSuggestedMinimumWidth());
//        maxHeight = Math.max(maxHeight, getSuggestedMinimumHeight());
//
//        setMeasuredDimension(resolveSizeAndState(maxWidth, widthMeasureSpec, childState),
//                resolveSizeAndState(maxHeight, heightMeasureSpec, childState << MEASURED_HEIGHT_STATE_SHIFT)); // diff
//    }


}

