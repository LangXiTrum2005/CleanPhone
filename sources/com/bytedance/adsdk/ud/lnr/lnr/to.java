package com.bytedance.adsdk.ud.lnr.lnr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class to extends mml {
    private Path jpc;
    private int to;
    private int tvp;

    public to(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar, Context context) {
        super(tvpVar, mzzVar);
        this.jpc = null;
        this.tvp = -1;
        this.to = -1;
        if (((mml) this).wd != null) {
            float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
            this.tvp = (int) (((mml) this).wd.qdl() * fQdl);
            this.to = (int) (((mml) this).wd.ud() * fQdl);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.tvp, this.to);
            Path path = new Path();
            this.jpc = path;
            float f = fQdl * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    private static void qdl(View view, int i2, int i3) {
        view.layout(0, 0, i2, i3);
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.mml, com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i2) {
        View viewQdl = this.ud.qdl();
        if (this.tvp <= 0 || viewQdl == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        qdl(i2);
        float fMo = mo();
        qdl(viewQdl, this.tvp, this.to);
        viewQdl.setAlpha(fMo);
        canvas.clipPath(this.jpc);
        viewQdl.draw(canvas);
        canvas.restore();
    }
}
