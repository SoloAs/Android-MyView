package com.example.alexander.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Alexander on 9/30/2014.
 */
public class MyView extends RelativeLayout {

    private TextView mainText;
    private TextView extraText;
    private ImageView iconView;

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
            String mMainText = a.getString(R.styleable.MyView_mainText);
            String mExtraText = a.getString(R.styleable.MyView_extraText);
            Drawable icon = a.getDrawable(R.styleable.MyView_icon);

            iconView = (ImageView) findViewById(R.id.custom_view_icon);
            mainText = (TextView) findViewById(R.id.custom_view_name);
            extraText = (TextView) findViewById(R.id.custom_view_work);

            mainText.setText(mMainText);
            extraText.setText(mExtraText);
            iconView.setImageDrawable(icon);

            invalidate();
            requestLayout();

        } finally {
            a.recycle();
        }
    }

    public void populate(Object o) {
        //TOOD populate
    }
}
