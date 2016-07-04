package com.zhl.game02;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by standy on 2016/7/4.
 */
public class MyView extends View {

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        p.setStyle(Paint.Style.STROKE);

        p.setColor(Color.BLUE);
        canvas.drawCircle(140, 300, 80, p);

        p.setColor(Color.YELLOW);
        canvas.drawCircle(270, 300, 80, p);

        p.setColor(Color.GRAY);
        canvas.drawCircle(400, 300, 80, p);

        p.setColor(Color.BLACK);
        canvas.drawCircle(215, 430, 80, p);

        p.setColor(Color.WHITE);
        canvas.drawCircle(345, 430, 80, p);


//        p.setColor(Color.BLACK);
//        canvas.drawText("别逼逼，要走快跟上",500,1000,p);



    }
}
