package com.example.alexander.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Alexander on 9/30/2014.
 */
public class MyView extends RelativeLayout {
    String mMainText, mExtraText;
    public MyView(Context context) {
        super(context);
        init(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);

    }

    void init(Context context, AttributeSet attrs)
    {
        inflate(getContext(), R.layout.my_view_layout, this);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.MyView,
                0, 0);

        try {
            mMainText = a.getString(R.styleable.MyView_mainText);
            mExtraText = a.getString(R.styleable.MyView_extraText);

            invalidate();
            requestLayout();
        } finally {
            a.recycle();
        }
    }
}
