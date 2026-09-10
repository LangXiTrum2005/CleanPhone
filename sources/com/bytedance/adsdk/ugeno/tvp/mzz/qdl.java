package com.bytedance.adsdk.ugeno.tvp.mzz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.wd.jpc;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends FrameLayout {
    private mml jpc;
    private double lnr;
    private float mml;
    private LinearLayout mo;
    private LinearLayout mzz;
    private float qdl;
    private float ud;
    private Context wd;

    public qdl(Context context) {
        super(context);
        this.wd = context;
        this.mzz = new LinearLayout(context);
        this.mo = new LinearLayout(context);
        this.mzz.setOrientation(0);
        this.mzz.setGravity(8388611);
        this.mo.setOrientation(0);
        this.mo.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.qdl, (int) this.ud);
        float f = this.mml;
        layoutParams.leftMargin = (int) f;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.qdl(i2, i3, i4, i5);
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.qdl(i2, i3);
        }
        super.onMeasure(i2, i3);
        this.mzz.measure(i2, i3);
        double dFloor = Math.floor(this.lnr);
        float f = this.mml;
        float f2 = this.qdl;
        this.mo.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.lnr - dFloor) * ((double) f2)) + (((double) (f + f + f2)) * dFloor) + ((double) f)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mzz.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void qdl(double d, int i2, int i3, float f, int i4) {
        removeAllViews();
        this.mzz.removeAllViews();
        this.mo.removeAllViews();
        this.qdl = (int) jpc.qdl(this.wd, f);
        this.ud = (int) jpc.qdl(this.wd, f);
        this.lnr = d;
        this.mml = i4;
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.wd.mml.ud(this.wd, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            this.mo.addView(starImageView);
        }
        for (int i6 = 0; i6 < 5; i6++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.wd.mml.ud(this.wd, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i3);
            this.mzz.addView(starImageView2);
        }
        addView(this.mzz);
        addView(this.mo);
        requestLayout();
    }

    public void qdl(mml mmlVar) {
        this.jpc = mmlVar;
    }
}
