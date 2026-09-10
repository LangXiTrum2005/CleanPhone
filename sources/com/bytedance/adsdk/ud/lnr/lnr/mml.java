package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class mml extends qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Bitmap, Bitmap> fs;
    private final Paint jpc;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> rq;
    private final Rect to;
    private final Rect tvp;
    protected final com.bytedance.adsdk.ud.to wd;

    public mml(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        super(tvpVar, mzzVar);
        this.jpc = new com.bytedance.adsdk.ud.qdl.qdl(3);
        this.tvp = new Rect();
        this.to = new Rect();
        this.wd = tvpVar.mo(mzzVar.wd());
    }

    private Bitmap fs() {
        Bitmap bitmapWd;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Bitmap, Bitmap> qdlVar = this.fs;
        if (qdlVar != null && (bitmapWd = qdlVar.wd()) != null) {
            return bitmapWd;
        }
        Bitmap bitmapMzz = this.ud.mzz(this.lnr.wd());
        if (bitmapMzz != null) {
            return bitmapMzz;
        }
        com.bytedance.adsdk.ud.to toVar = this.wd;
        if (toVar != null) {
            return toVar.rq();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        super.qdl(rectF, matrix, z2);
        if (this.wd != null) {
            float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
            rectF.set(0.0f, 0.0f, this.wd.qdl() * fQdl, this.wd.ud() * fQdl);
            this.qdl.mapRect(rectF);
        }
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i2) {
        super.ud(canvas, matrix, i2);
        Bitmap bitmapFs = fs();
        if (bitmapFs == null || bitmapFs.isRecycled() || this.wd == null) {
            return;
        }
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        this.jpc.setAlpha(i2);
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.rq;
        if (qdlVar != null) {
            this.jpc.setColorFilter(qdlVar.wd());
        }
        canvas.save();
        canvas.concat(matrix);
        this.tvp.set(0, 0, bitmapFs.getWidth(), bitmapFs.getHeight());
        if (this.ud.mzz()) {
            this.to.set(0, 0, (int) (this.wd.qdl() * fQdl), (int) (this.wd.ud() * fQdl));
        } else {
            this.to.set(0, 0, (int) (bitmapFs.getWidth() * fQdl), (int) (bitmapFs.getHeight() * fQdl));
        }
        canvas.drawBitmap(bitmapFs, this.tvp, this.to, this.jpc);
        canvas.restore();
    }
}
