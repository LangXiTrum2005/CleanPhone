package com.bytedance.adsdk.ugeno.jbs.fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.xha.mj;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends FrameLayout {
    private LinearLayout di;
    private LinearLayout fi;
    private double ik;
    private float ka;
    private float lr;
    private ka mj;
    private float ri;
    private Context xha;

    public ri(Context context) {
        super(context);
        this.xha = context;
        this.fi = new LinearLayout(context);
        this.di = new LinearLayout(context);
        this.fi.setOrientation(0);
        this.fi.setGravity(8388611);
        this.di.setOrientation(0);
        this.di.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.ri, (int) this.lr);
        float f = this.ka;
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
        ka kaVar = this.mj;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.mj;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ka kaVar = this.mj;
        if (kaVar != null) {
            kaVar.ri(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ka kaVar = this.mj;
        if (kaVar != null) {
            kaVar.ri(i, i2);
        }
        super.onMeasure(i, i2);
        this.fi.measure(i, i2);
        double dFloor = Math.floor(this.ik);
        float f = this.ka;
        float f2 = this.ri;
        this.di.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f + f + f2)) * dFloor) + ((double) f) + ((this.ik - dFloor) * ((double) f2))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.fi.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ka kaVar = this.mj;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void ri(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.fi.removeAllViews();
        this.di.removeAllViews();
        this.ri = (int) mj.ri(this.xha, f);
        this.lr = (int) mj.ri(this.xha, f);
        this.ik = d;
        this.ka = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.xha.ka.lr(this.xha, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.di.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.xha.ka.lr(this.xha, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i2);
            this.fi.addView(starImageView2);
        }
        addView(this.fi);
        addView(this.di);
        requestLayout();
    }

    public void ri(ka kaVar) {
        this.mj = kaVar;
    }
}
