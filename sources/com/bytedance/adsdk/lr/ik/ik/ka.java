package com.bytedance.adsdk.lr.ik.ik;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.adsdk.lr.ri.lr.ri<Bitmap, Bitmap> f17992co;
    private final Rect jbs;
    private final Paint mj;
    private final Rect qt;
    private com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> sf;
    protected final com.bytedance.adsdk.lr.qt xha;

    public ka(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar) {
        super(jbsVar, fiVar);
        this.mj = new com.bytedance.adsdk.lr.ri.ri(3);
        this.jbs = new Rect();
        this.qt = new Rect();
        this.xha = jbsVar.di(fiVar.xha());
    }

    private Bitmap co() {
        Bitmap bitmapXha;
        com.bytedance.adsdk.lr.ri.lr.ri<Bitmap, Bitmap> riVar = this.f17992co;
        if (riVar != null && (bitmapXha = riVar.xha()) != null) {
            return bitmapXha;
        }
        Bitmap bitmapFi = this.lr.fi(this.ik.xha());
        if (bitmapFi != null) {
            return bitmapFi;
        }
        com.bytedance.adsdk.lr.qt qtVar = this.xha;
        if (qtVar != null) {
            return qtVar.sf();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        super.lr(canvas, matrix, i);
        Bitmap bitmapCo = co();
        if (bitmapCo == null || bitmapCo.isRecycled() || this.xha == null) {
            return;
        }
        float fRi = com.bytedance.adsdk.lr.di.di.ri();
        this.mj.setAlpha(i);
        com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> riVar = this.sf;
        if (riVar != null) {
            this.mj.setColorFilter(riVar.xha());
        }
        canvas.save();
        canvas.concat(matrix);
        this.jbs.set(0, 0, bitmapCo.getWidth(), bitmapCo.getHeight());
        if (this.lr.fi()) {
            this.qt.set(0, 0, (int) (this.xha.ri() * fRi), (int) (this.xha.lr() * fRi));
        } else {
            this.qt.set(0, 0, (int) (bitmapCo.getWidth() * fRi), (int) (bitmapCo.getHeight() * fRi));
        }
        canvas.drawBitmap(bitmapCo, this.jbs, this.qt, this.mj);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        super.ri(rectF, matrix, z);
        if (this.xha != null) {
            float fRi = com.bytedance.adsdk.lr.di.di.ri();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xha.ri() * fRi, this.xha.lr() * fRi);
            this.ri.mapRect(rectF);
        }
    }
}
