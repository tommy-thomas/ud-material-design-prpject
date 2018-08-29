package com.example.xyzreader.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

import android.util.AttributeSet;


public class InsetImageView extends AppCompatImageView {


    public InsetImageView(Context context) {
        super(context);
    }

    public InsetImageView(Context context, AttributeSet attributes){
        super(context, attributes);
    }

    public InsetImageView(Context context, AttributeSet attributes,  int defStyle){
        super(context, attributes, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int threeTwoHeight = MeasureSpec.getSize( widthMeasureSpec) * 2 / 3;

        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec( threeTwoHeight , MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
