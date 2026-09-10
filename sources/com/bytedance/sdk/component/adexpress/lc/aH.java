package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes2.dex */
public class aH extends FrameLayout {
    private static final int QAg = (com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD("", 0.0f, true)[1] / 2) + 1;
    private static final int nBu = (com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD("", 0.0f, true)[1] / 2) + 3;
    private Drawable JXs;
    LinearLayout LD;
    LinearLayout Lxb;
    private float OY;
    private float ZU;
    private double ebl;
    private Drawable lc;
    private float lk;

    public aH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Lxb = new LinearLayout(getContext());
        this.LD = new LinearLayout(getContext());
        this.Lxb.setOrientation(0);
        this.Lxb.setGravity(GravityCompat.START);
        this.LD.setOrientation(0);
        this.LD.setGravity(GravityCompat.START);
        this.JXs = com.bytedance.sdk.component.utils.tD.lk(context, "tt_star_thick");
        this.lc = com.bytedance.sdk.component.utils.tD.lk(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.lk, (int) this.ZU));
        imageView.setPadding(1, QAg, 1, nBu);
        return imageView;
    }

    public void Lxb(double d, int i, int i2, int i3) {
        float f = i2;
        this.lk = (int) com.bytedance.sdk.component.adexpress.ZU.OY.lk(getContext(), f);
        this.ZU = (int) com.bytedance.sdk.component.adexpress.ZU.OY.lk(getContext(), f);
        this.ebl = d;
        this.OY = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.LD.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.Lxb.addView(starImageView2);
        }
        addView(this.Lxb);
        addView(this.LD);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.JXs;
    }

    public Drawable getStarFillDrawable() {
        return this.lc;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.Lxb.measure(i, i2);
        double d = this.ebl;
        float f = this.lk;
        this.LD.measure(View.MeasureSpec.makeMeasureSpec((int) (((d - ((double) ((int) d))) * ((double) (f - 2.0f))) + ((double) ((((int) d) * f) + 1.0f))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.Lxb.getMeasuredHeight(), 1073741824));
        if (this.OY > 0.0f) {
            LinearLayout linearLayout = this.Lxb;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.OY)) / 2, 0, 0);
            this.LD.setPadding(0, ((int) (this.Lxb.getMeasuredHeight() - this.OY)) / 2, 0, 0);
        }
    }
}
