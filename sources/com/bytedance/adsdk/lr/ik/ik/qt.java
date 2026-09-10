package com.bytedance.adsdk.lr.ik.ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends ka {
    private int jbs;
    private Path mj;
    private int qt;

    public qt(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar, Context context) {
        super(jbsVar, fiVar);
        this.mj = null;
        this.jbs = -1;
        this.qt = -1;
        if (((ka) this).xha != null) {
            float fRi = com.bytedance.adsdk.lr.di.di.ri();
            this.jbs = (int) (((ka) this).xha.ri() * fRi);
            this.qt = (int) (((ka) this).xha.lr() * fRi);
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.jbs, this.qt);
            Path path = new Path();
            this.mj = path;
            float f = fRi * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    private static void ri(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ka, com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        View viewRi = this.lr.ri();
        if (this.jbs <= 0 || viewRi == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ri(i);
        float fDi = di();
        ri(viewRi, this.jbs, this.qt);
        viewRi.setAlpha(fDi);
        canvas.clipPath(this.mj);
        viewRi.draw(canvas);
        canvas.restore();
    }
}
