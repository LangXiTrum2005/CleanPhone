package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class wjv extends FrameLayout {
    private static final int jbs = (com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 1;
    private static final int qt = (com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 3;
    private Drawable di;
    private Drawable fi;
    private float ik;
    private float ka;
    LinearLayout lr;
    private float mj;
    LinearLayout ri;
    private double xha;

    public wjv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ri = new LinearLayout(getContext());
        this.lr = new LinearLayout(getContext());
        this.ri.setOrientation(0);
        this.ri.setGravity(8388611);
        this.lr.setOrientation(0);
        this.lr.setGravity(8388611);
        this.fi = com.bytedance.sdk.component.utils.uq.ik(context, "tt_star_thick");
        this.di = com.bytedance.sdk.component.utils.uq.ik(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.ik, (int) this.ka));
        imageView.setPadding(1, jbs, 1, qt);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.fi;
    }

    public Drawable getStarFillDrawable() {
        return this.di;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.ri.measure(i, i2);
        double d = this.xha;
        float f = this.ik;
        this.lr.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d) * f) + 1.0f)) + (((double) (f - 2.0f)) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.ri.getMeasuredHeight(), 1073741824));
        if (this.mj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            LinearLayout linearLayout = this.ri;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.mj)) / 2, 0, 0);
            this.lr.setPadding(0, ((int) (this.ri.getMeasuredHeight() - this.mj)) / 2, 0, 0);
        }
    }

    public void ri(double d, int i, int i2, int i3) {
        float f = i2;
        this.ik = (int) com.bytedance.sdk.component.adexpress.ka.xha.ik(getContext(), f);
        this.ka = (int) com.bytedance.sdk.component.adexpress.ka.xha.ik(getContext(), f);
        this.xha = d;
        this.mj = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.lr.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.ri.addView(starImageView2);
        }
        addView(this.ri);
        addView(this.lr);
        requestLayout();
    }
}
