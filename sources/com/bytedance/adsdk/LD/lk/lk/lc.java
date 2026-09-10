package com.bytedance.adsdk.LD.lk.lk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class lc extends Lxb {
    public lc(com.bytedance.adsdk.LD.QAg qAg, JXs jXs) {
        super(qAg, jXs);
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        super.LD(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        super.Lxb(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
