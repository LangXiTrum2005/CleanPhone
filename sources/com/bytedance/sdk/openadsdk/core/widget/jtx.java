package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class jtx extends View {
    private int lnr;
    private Drawable mml;
    private float mo;
    private Drawable mzz;
    private final Path qdl;
    private final boolean ud;

    public jtx(Context context) {
        this(context, false);
    }

    private void qdl() {
        Context context = getContext();
        this.mml = ljh.lnr(context, this.ud ? "tt_star_thick_dark" : "tt_star_thick");
        this.mzz = ljh.lnr(context, "tt_star");
    }

    private void ud() {
        int width = getWidth();
        int height = getHeight();
        if (this.mo <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.qdl.reset();
        this.qdl.addRect(new RectF(0.0f, 0.0f, width * this.mo, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.lnr <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i2 = 0; i2 < 5; i2++) {
            this.mml.draw(canvas);
            canvas.translate(this.lnr, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.qdl);
        for (int i3 = 0; i3 < 5; i3++) {
            this.mzz.draw(canvas);
            canvas.translate(this.lnr, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.lnr * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.lnr, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        ud();
    }

    public jtx(Context context, boolean z2) {
        super(context);
        this.qdl = new Path();
        this.ud = z2;
        qdl();
    }

    public void qdl(double d, int i2) {
        int iQdl = (int) ax.qdl(getContext(), i2, false);
        this.lnr = iQdl;
        this.mml.setBounds(0, 0, iQdl, iQdl);
        Drawable drawable = this.mzz;
        int i3 = this.lnr;
        drawable.setBounds(0, 0, i3, i3);
        this.mo = ((float) d) / 5.0f;
        ud();
        requestLayout();
    }
}
