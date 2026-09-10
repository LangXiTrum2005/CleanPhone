package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class slm extends View {
    private float di;
    private Drawable fi;
    private int ik;
    private Drawable ka;
    private final boolean lr;
    private final Path ri;

    public slm(Context context) {
        this(context, false);
    }

    private void lr() {
        int width = getWidth();
        int height = getHeight();
        if (this.di <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width <= 0 || height <= 0) {
            return;
        }
        this.ri.reset();
        this.ri.addRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width * this.di, height), Path.Direction.CCW);
    }

    private void ri() {
        Context context = getContext();
        this.ka = uq.ik(context, this.lr ? "tt_star_thick_dark" : "tt_star_thick");
        this.fi = uq.ik(context, "tt_star");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ik <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.ka.draw(canvas);
            canvas.translate(this.ik, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.ri);
        for (int i2 = 0; i2 < 5; i2++) {
            this.fi.draw(canvas);
            canvas.translate(this.ik, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.ik * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.ik, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lr();
    }

    public slm(Context context, boolean z) {
        super(context);
        this.ri = new Path();
        this.lr = z;
        ri();
    }

    public void ri(double d, int i) {
        int iRi = (int) qd.ri(getContext(), i, false);
        this.ik = iRi;
        this.ka.setBounds(0, 0, iRi, iRi);
        Drawable drawable = this.fi;
        int i2 = this.ik;
        drawable.setBounds(0, 0, i2, i2);
        this.di = ((float) d) / 5.0f;
        lr();
        requestLayout();
    }
}
