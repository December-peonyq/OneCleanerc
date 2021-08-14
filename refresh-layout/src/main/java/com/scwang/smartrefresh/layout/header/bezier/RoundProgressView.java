package com.scwang.smartrefresh.layout.header.bezier;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.scwang.smartrefresh.layout.util.DensityUtil;


/**
 * 中心圆形加载进度视图
 * Created by Administrator on 2015/8/27.
 */
public class RoundProgressView extends View {

    private Paint mPath;
    private Paint mPantR;
    private ValueAnimator mAnimator;
    private int endAngle = 0;
    private int stratAngle = 270;
    private int mRadius = 0;
    private int mOutsideCircle = 0;
    private RectF mRect = new RectF(0,0,0,0);

    public RoundProgressView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPath = new Paint();
        mPantR = new Paint();
        mPath.setAntiAlias(true);
        mPantR.setAntiAlias(true);
        mPath.setColor(Color.WHITE);
        mPantR.setColor(0x55000000);

        DensityUtil density = new DensityUtil();
        mRadius = density.dip2px(20);
        mOutsideCircle = density.dip2px(7);
        mPath.setStrokeWidth(density.dip2px(3));
        mPantR.setStrokeWidth(density.dip2px(3));

        mAnimator = ValueAnimator.ofInt(0,360);
        mAnimator.setDuration(720);
        mAnimator.addUpdateListener(animation -> {
            endAngle = (int) animation.getAnimatedValue();
            postInvalidate();
        });
        mAnimator.setRepeatCount(ValueAnimator.INFINITE);
        mAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public void setBackColor(int backColor) {
        mPantR.setColor(backColor&0x00ffffff|0x55000000);
    }

    public void setFrontColor(int color) {
        mPath.setColor(color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();

        mPath.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width / 2, height / 2, mRadius, mPath);

        mPath.setStyle(Paint.Style.STROKE);//设置为空心
        canvas.drawCircle(width / 2, height / 2, mRadius + mOutsideCircle, mPath);

        mPantR.setStyle(Paint.Style.FILL);
        mRect.set(width/2- mRadius, height/2- mRadius, width/2+ mRadius, height/2+ mRadius);
        canvas.drawArc(mRect, stratAngle, endAngle, true, mPantR);

        mRadius += mOutsideCircle;
        mPantR.setStyle(Paint.Style.STROKE);
        mRect.set(width/2- mRadius, height/2- mRadius, width/2+ mRadius, height/2+ mRadius);
        canvas.drawArc(mRect, stratAngle, endAngle, false, mPantR);
        mRadius -= mOutsideCircle;
    }

    public void startAnim(){
        if (mAnimator !=null) mAnimator.start();
    }

    public void stopAnim(){
        if (mAnimator !=null && mAnimator.isRunning()) mAnimator.cancel();
    }
}
