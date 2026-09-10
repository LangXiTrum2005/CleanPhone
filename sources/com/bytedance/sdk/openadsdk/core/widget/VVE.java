package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class VVE extends View {
    private Drawable JXs;
    private final boolean LD;
    private final Path Lxb;
    private Drawable ZU;
    private float lc;
    private int lk;

    public VVE(Context context) {
        this(context, false);
    }

    private void LD() {
        int width = getWidth();
        int height = getHeight();
        if (this.lc <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.Lxb.reset();
        this.Lxb.addRect(new RectF(0.0f, 0.0f, width * this.lc, height), Path.Direction.CCW);
    }

    private void Lxb() {
        Context context = getContext();
        this.ZU = com.bytedance.sdk.component.utils.tD.lk(context, this.LD ? "tt_star_thick_dark" : "tt_star_thick");
        this.JXs = com.bytedance.sdk.component.utils.tD.lk(context, "tt_star");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.lk <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.ZU.draw(canvas);
            canvas.translate(this.lk, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.Lxb);
        for (int i2 = 0; i2 < 5; i2++) {
            this.JXs.draw(canvas);
            canvas.translate(this.lk, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.lk * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.lk, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LD();
    }

    public VVE(Context context, boolean z) {
        super(context);
        this.Lxb = new Path();
        this.LD = z;
        Lxb();
    }

    public void Lxb(double d, int i) {
        int iLxb = (int) le.Lxb(getContext(), i, false);
        this.lk = iLxb;
        this.ZU.setBounds(0, 0, iLxb, iLxb);
        Drawable drawable = this.JXs;
        int i2 = this.lk;
        drawable.setBounds(0, 0, i2, i2);
        this.lc = ((float) d) / 5.0f;
        LD();
        requestLayout();
    }
}
