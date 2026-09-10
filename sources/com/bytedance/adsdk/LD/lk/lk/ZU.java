package com.bytedance.adsdk.LD.lk.lk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends Lxb {
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> JVA;
    private final Paint OY;
    private final Rect QAg;
    protected final com.bytedance.adsdk.LD.nBu ebl;
    private final Rect nBu;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Bitmap, Bitmap> sLN;

    public ZU(com.bytedance.adsdk.LD.QAg qAg, JXs jXs) {
        super(qAg, jXs);
        this.OY = new com.bytedance.adsdk.LD.Lxb.Lxb(3);
        this.QAg = new Rect();
        this.nBu = new Rect();
        this.ebl = qAg.lc(jXs.ebl());
    }

    private Bitmap sLN() {
        Bitmap bitmapEbl;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Bitmap, Bitmap> lxb = this.sLN;
        if (lxb != null && (bitmapEbl = lxb.ebl()) != null) {
            return bitmapEbl;
        }
        Bitmap bitmapJXs = this.LD.JXs(this.lk.ebl());
        if (bitmapJXs != null) {
            return bitmapJXs;
        }
        com.bytedance.adsdk.LD.nBu nbu = this.ebl;
        if (nbu != null) {
            return nbu.JVA();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        super.LD(canvas, matrix, i);
        Bitmap bitmapSLN = sLN();
        if (bitmapSLN == null || bitmapSLN.isRecycled() || this.ebl == null) {
            return;
        }
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
        this.OY.setAlpha(i);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> lxb = this.JVA;
        if (lxb != null) {
            this.OY.setColorFilter(lxb.ebl());
        }
        canvas.save();
        canvas.concat(matrix);
        this.QAg.set(0, 0, bitmapSLN.getWidth(), bitmapSLN.getHeight());
        if (this.LD.JXs()) {
            this.nBu.set(0, 0, (int) (this.ebl.Lxb() * fLxb), (int) (this.ebl.LD() * fLxb));
        } else {
            this.nBu.set(0, 0, (int) (bitmapSLN.getWidth() * fLxb), (int) (bitmapSLN.getHeight() * fLxb));
        }
        canvas.drawBitmap(bitmapSLN, this.QAg, this.nBu, this.OY);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        super.Lxb(rectF, matrix, z);
        if (this.ebl != null) {
            float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
            rectF.set(0.0f, 0.0f, this.ebl.Lxb() * fLxb, this.ebl.LD() * fLxb);
            this.Lxb.mapRect(rectF);
        }
    }
}
