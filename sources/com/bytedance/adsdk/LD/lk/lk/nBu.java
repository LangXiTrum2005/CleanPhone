package com.bytedance.adsdk.LD.lk.lk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class nBu extends ZU {
    private Path OY;
    private int QAg;
    private int nBu;

    public nBu(com.bytedance.adsdk.LD.QAg qAg, JXs jXs, Context context) {
        super(qAg, jXs);
        this.OY = null;
        this.QAg = -1;
        this.nBu = -1;
        if (((ZU) this).ebl != null) {
            float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
            this.QAg = (int) (((ZU) this).ebl.Lxb() * fLxb);
            this.nBu = (int) (((ZU) this).ebl.LD() * fLxb);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.QAg, this.nBu);
            Path path = new Path();
            this.OY = path;
            float f = fLxb * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    private static void Lxb(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.ZU, com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        View viewLxb = this.LD.Lxb();
        if (this.QAg <= 0 || viewLxb == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Lxb(i);
        float fLc = lc();
        Lxb(viewLxb, this.QAg, this.nBu);
        viewLxb.setAlpha(fLc);
        canvas.clipPath(this.OY);
        viewLxb.draw(canvas);
        canvas.restore();
    }
}
