package com.bytedance.adsdk.lr.ik.ik;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> f17994co;
    private final float[] jbs;
    private final Paint mj;
    private final Path qt;
    private final fi sf;
    private final RectF xha;

    public mj(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar) {
        super(jbsVar, fiVar);
        this.xha = new RectF();
        com.bytedance.adsdk.lr.ri.ri riVar = new com.bytedance.adsdk.lr.ri.ri();
        this.mj = riVar;
        this.jbs = new float[8];
        this.qt = new Path();
        this.sf = fiVar;
        riVar.setAlpha(0);
        riVar.setStyle(Paint.Style.FILL);
        riVar.setColor(fiVar.slm());
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        super.lr(canvas, matrix, i);
        int iAlpha = Color.alpha(this.sf.slm());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.ka.ri() == null ? 100 : this.ka.ri().xha().intValue())) / 100.0f) * 255.0f);
        this.mj.setAlpha(iIntValue);
        com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> riVar = this.f17994co;
        if (riVar != null) {
            this.mj.setColorFilter(riVar.xha());
        }
        if (iIntValue > 0) {
            float[] fArr = this.jbs;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.sf.nr();
            float[] fArr2 = this.jbs;
            fArr2[3] = 0.0f;
            fArr2[4] = this.sf.nr();
            this.jbs[5] = this.sf.bu();
            float[] fArr3 = this.jbs;
            fArr3[6] = 0.0f;
            fArr3[7] = this.sf.bu();
            matrix.mapPoints(this.jbs);
            this.qt.reset();
            Path path = this.qt;
            float[] fArr4 = this.jbs;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.qt;
            float[] fArr5 = this.jbs;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.qt;
            float[] fArr6 = this.jbs;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.qt;
            float[] fArr7 = this.jbs;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.qt;
            float[] fArr8 = this.jbs;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.qt.close();
            canvas.drawPath(this.qt, this.mj);
        }
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        super.ri(rectF, matrix, z);
        this.xha.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.sf.nr(), this.sf.bu());
        this.ri.mapRect(this.xha);
        rectF.set(this.xha);
    }
}
