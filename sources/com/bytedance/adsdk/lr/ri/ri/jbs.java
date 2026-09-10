package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends ri {
    private final com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> aw;
    private com.bytedance.adsdk.lr.ri.lr.bu bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> f18001co;
    private final LongSparseArray<LinearGradient> di;
    private final boolean fi;
    private final com.bytedance.adsdk.lr.ik.lr.xha jbs;
    private final String ka;
    private final RectF mj;
    private final int qt;
    private final com.bytedance.adsdk.lr.ri.lr.ri<com.bytedance.adsdk.lr.ik.lr.ka, com.bytedance.adsdk.lr.ik.lr.ka> sf;
    private final LongSparseArray<RadialGradient> xha;

    public jbs(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.di diVar) {
        super(jbsVar, riVar, diVar.mj().ri(), diVar.jbs().ri(), diVar.co(), diVar.ka(), diVar.xha(), diVar.qt(), diVar.sf());
        this.di = new LongSparseArray<>();
        this.xha = new LongSparseArray<>();
        this.mj = new RectF();
        this.ka = diVar.ri();
        this.jbs = diVar.lr();
        this.fi = diVar.aw();
        this.qt = (int) (jbsVar.su().fi() / 32.0f);
        com.bytedance.adsdk.lr.ri.lr.ri<com.bytedance.adsdk.lr.ik.lr.ka, com.bytedance.adsdk.lr.ik.lr.ka> riVarRi = diVar.ik().ri();
        this.sf = riVarRi;
        riVarRi.ri(this);
        riVar.ri(riVarRi);
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi2 = diVar.fi().ri();
        this.f18001co = riVarRi2;
        riVarRi2.ri(this);
        riVar.ri(riVarRi2);
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi3 = diVar.di().ri();
        this.aw = riVarRi3;
        riVarRi3.ri(this);
        riVar.ri(riVarRi3);
    }

    private RadialGradient ik() {
        long jKa = ka();
        RadialGradient radialGradient = this.xha.get(jKa);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFXha = this.f18001co.xha();
        PointF pointFXha2 = this.aw.xha();
        com.bytedance.adsdk.lr.ik.lr.ka kaVarXha = this.sf.xha();
        int[] iArrRi = ri(kaVarXha.lr());
        float[] fArrRi = kaVarXha.ri();
        float f = pointFXha.x;
        float f2 = pointFXha.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(pointFXha2.x - f, pointFXha2.y - f2), iArrRi, fArrRi, Shader.TileMode.CLAMP);
        this.xha.put(jKa, radialGradient2);
        return radialGradient2;
    }

    private int ka() {
        int iRound = Math.round(this.f18001co.mj() * this.qt);
        int iRound2 = Math.round(this.aw.mj() * this.qt);
        int iRound3 = Math.round(this.sf.mj() * this.qt);
        int i = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient lr() {
        long jKa = ka();
        LinearGradient linearGradient = this.di.get(jKa);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFXha = this.f18001co.xha();
        PointF pointFXha2 = this.aw.xha();
        com.bytedance.adsdk.lr.ik.lr.ka kaVarXha = this.sf.xha();
        LinearGradient linearGradient2 = new LinearGradient(pointFXha.x, pointFXha.y, pointFXha2.x, pointFXha2.y, ri(kaVarXha.lr()), kaVarXha.ri(), Shader.TileMode.CLAMP);
        this.di.put(jKa, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        if (this.fi) {
            return;
        }
        ri(this.mj, matrix, false);
        Shader shaderLr = this.jbs == com.bytedance.adsdk.lr.ik.lr.xha.LINEAR ? lr() : ik();
        shaderLr.setLocalMatrix(matrix);
        this.lr.setShader(shaderLr);
        super.ri(canvas, matrix, i);
    }

    private int[] ri(int[] iArr) {
        if (this.bgr == null) {
            return iArr;
        }
        throw null;
    }
}
