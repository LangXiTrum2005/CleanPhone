package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class bch extends FrameLayout {
    private float jpc;
    private float lnr;
    private float mml;
    private Drawable mo;
    private Drawable mzz;
    LinearLayout qdl;
    LinearLayout ud;
    private double wd;
    private static final int tvp = (com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud("", 0.0f, true)[1] / 2) + 1;
    private static final int to = (com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud("", 0.0f, true)[1] / 2) + 3;

    public bch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.qdl = new LinearLayout(getContext());
        this.ud = new LinearLayout(getContext());
        this.qdl.setOrientation(0);
        this.qdl.setGravity(8388611);
        this.ud.setOrientation(0);
        this.ud.setGravity(8388611);
        this.mzz = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_star_thick");
        this.mo = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.lnr, (int) this.mml));
        imageView.setPadding(1, tvp, 1, to);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.mzz;
    }

    public Drawable getStarFillDrawable() {
        return this.mo;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.qdl.measure(i2, i3);
        double d = this.wd;
        float f = this.lnr;
        this.ud.measure(View.MeasureSpec.makeMeasureSpec((int) (((d - ((double) ((int) d))) * ((double) (f - 2.0f))) + ((double) ((((int) d) * f) + 1.0f))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.qdl.getMeasuredHeight(), 1073741824));
        if (this.jpc > 0.0f) {
            LinearLayout linearLayout = this.qdl;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.jpc)) / 2, 0, 0);
            this.ud.setPadding(0, ((int) (this.qdl.getMeasuredHeight() - this.jpc)) / 2, 0, 0);
        }
    }

    public void qdl(double d, int i2, int i3, int i4) {
        float f = i3;
        this.lnr = (int) com.bytedance.sdk.component.adexpress.mml.wd.lnr(getContext(), f);
        this.mml = (int) com.bytedance.sdk.component.adexpress.mml.wd.lnr(getContext(), f);
        this.wd = d;
        this.jpc = i4;
        removeAllViews();
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.ud.addView(starImageView);
        }
        for (int i6 = 0; i6 < 5; i6++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.qdl.addView(starImageView2);
        }
        addView(this.qdl);
        addView(this.ud);
        requestLayout();
    }
}
