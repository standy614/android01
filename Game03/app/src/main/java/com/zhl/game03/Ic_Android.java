package com.zhl.game03;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by standy on 2016/7/4.
 */
public class Ic_Android extends View {
    public Ic_Android(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();//开启一个线程
        p.setColor(Color.GREEN);

        canvas.drawRoundRect(null,20,20,p);
    }
}
