package com.nackademin.foureverhh.addclass;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by foureverhh on 2018-01-25.
 */

public class FlipImage extends AppCompatImageView {

    int onDownImage;
    //int defaultImage;
   Drawable defaultImage;

    public FlipImage(Context context) {
        super(context);
        init();
    }

    public FlipImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FlipImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    void init()
    {
       defaultImage = getDrawable();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getActionMasked();


        switch(action)
        {
            case MotionEvent.ACTION_DOWN:
                Log.d("Flip Image","Down");
                setImageResource(onDownImage);
                return true;
            case MotionEvent.ACTION_UP:
                Log.d("Flip Image","Up");
                //setImageResource(defaultImage);
                setImageDrawable(defaultImage);
                return true;

        }


        return super.onTouchEvent(event);
    }
}
