package com.bytedance.adsdk.ugeno.QAg.JXs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.bytedance.adsdk.ugeno.ebl.ZU;
import com.bytedance.adsdk.ugeno.lk;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends FrameLayout {
    private LinearLayout JXs;
    private float LD;
    private float Lxb;
    private lk OY;
    private float ZU;
    private Context ebl;
    private LinearLayout lc;
    private double lk;

    public Lxb(Context context) {
        super(context);
        this.ebl = context;
        this.JXs = new LinearLayout(context);
        this.lc = new LinearLayout(context);
        this.JXs.setOrientation(0);
        this.JXs.setGravity(GravityCompat.START);
        this.lc.setOrientation(0);
        this.lc.setGravity(GravityCompat.START);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.Lxb, (int) this.LD);
        float f = this.ZU;
        layoutParams.leftMargin = (int) f;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void Lxb(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.JXs.removeAllViews();
        this.lc.removeAllViews();
        this.Lxb = (int) OY.Lxb(this.ebl, f);
        this.LD = (int) OY.Lxb(this.ebl, f);
        this.lk = d;
        this.ZU = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(ZU.Lxb(this.ebl, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.lc.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(ZU.Lxb(this.ebl, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i2);
            this.JXs.addView(starImageView2);
        }
        addView(this.JXs);
        addView(this.lc);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.Lxb(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.Lxb(i, i2);
        }
        super.onMeasure(i, i2);
        this.JXs.measure(i, i2);
        double dFloor = Math.floor(this.lk);
        float f = this.ZU;
        float f2 = this.Lxb;
        this.lc.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.lk - dFloor) * ((double) f2)) + (((double) (f + f + f2)) * dFloor) + ((double) f)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.JXs.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void Lxb(lk lkVar) {
        this.OY = lkVar;
    }
}
