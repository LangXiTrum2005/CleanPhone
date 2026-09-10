package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class mo extends qdl {
    public mo(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        super(tvpVar, mzzVar);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        super.qdl(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i2) {
        super.ud(canvas, matrix, i2);
    }
}
