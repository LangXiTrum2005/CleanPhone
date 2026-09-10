package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mj implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, fi, sf {
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> ac;
    private final com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> aw;
    private final com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> bgr;
    private com.bytedance.adsdk.lr.ri.lr.bu bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.adsdk.lr.ri.lr.ri<com.bytedance.adsdk.lr.ik.lr.ka, com.bytedance.adsdk.lr.ik.lr.ka> f18002co;
    private com.bytedance.adsdk.lr.ri.lr.ik ihz;
    private final boolean ik;
    private final RectF jbs;
    private final com.bytedance.adsdk.lr.ik.ik.ri ka;
    private final String lr;
    private final Paint mj;
    private final com.bytedance.adsdk.lr.jbs nr;
    private final List<aw> qt;
    float ri;
    private final com.bytedance.adsdk.lr.ik.lr.xha sf;
    private com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> slm;
    private final int tan;
    private final com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> vr;
    private final Path xha;
    private final LongSparseArray<LinearGradient> fi = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> di = new LongSparseArray<>();

    public mj(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.fi fiVar) {
        Path path = new Path();
        this.xha = path;
        this.mj = new com.bytedance.adsdk.lr.ri.ri(1);
        this.jbs = new RectF();
        this.qt = new ArrayList();
        this.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ka = riVar;
        this.lr = fiVar.ri();
        this.ik = fiVar.mj();
        this.nr = jbsVar;
        this.sf = fiVar.lr();
        path.setFillType(fiVar.ik());
        this.tan = (int) (xhaVar.fi() / 32.0f);
        com.bytedance.adsdk.lr.ri.lr.ri<com.bytedance.adsdk.lr.ik.lr.ka, com.bytedance.adsdk.lr.ik.lr.ka> riVarRi = fiVar.ka().ri();
        this.f18002co = riVarRi;
        riVarRi.ri(this);
        riVar.ri(riVarRi);
        com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVarRi2 = fiVar.fi().ri();
        this.aw = riVarRi2;
        riVarRi2.ri(this);
        riVar.ri(riVarRi2);
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi3 = fiVar.di().ri();
        this.bgr = riVarRi3;
        riVarRi3.ri(this);
        riVar.ri(riVarRi3);
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi4 = fiVar.xha().ri();
        this.vr = riVarRi4;
        riVarRi4.ri(this);
        riVar.ri(riVarRi4);
        if (riVar.qt() != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi5 = riVar.qt().ri().ri();
            this.ac = riVarRi5;
            riVarRi5.ri(this);
            riVar.ri(this.ac);
        }
        if (riVar.sf() != null) {
            this.ihz = new com.bytedance.adsdk.lr.ri.lr.ik(this, riVar, riVar.sf());
        }
    }

    private RadialGradient ik() {
        long jKa = ka();
        RadialGradient radialGradient = this.di.get(jKa);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFXha = this.bgr.xha();
        PointF pointFXha2 = this.vr.xha();
        com.bytedance.adsdk.lr.ik.lr.ka kaVarXha = this.f18002co.xha();
        int[] iArrRi = ri(kaVarXha.lr());
        float[] fArrRi = kaVarXha.ri();
        float f = pointFXha.x;
        float f2 = pointFXha.y;
        float fHypot = (float) Math.hypot(pointFXha2.x - f, pointFXha2.y - f2);
        if (fHypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrRi, fArrRi, Shader.TileMode.CLAMP);
        this.di.put(jKa, radialGradient2);
        return radialGradient2;
    }

    private int ka() {
        int iRound = Math.round(this.bgr.mj() * this.tan);
        int iRound2 = Math.round(this.vr.mj() * this.tan);
        int iRound3 = Math.round(this.f18002co.mj() * this.tan);
        int i = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient lr() {
        long jKa = ka();
        LinearGradient linearGradient = this.fi.get(jKa);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFXha = this.bgr.xha();
        PointF pointFXha2 = this.vr.xha();
        com.bytedance.adsdk.lr.ik.lr.ka kaVarXha = this.f18002co.xha();
        LinearGradient linearGradient2 = new LinearGradient(pointFXha.x, pointFXha.y, pointFXha2.x, pointFXha2.y, ri(kaVarXha.lr()), kaVarXha.ri(), Shader.TileMode.CLAMP);
        this.fi.put(jKa, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.nr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ik ikVar = list2.get(i);
            if (ikVar instanceof aw) {
                this.qt.add((aw) ikVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        Shader shaderIk;
        if (this.ik) {
            return;
        }
        com.bytedance.adsdk.lr.fi.ri("GradientFillContent#draw");
        this.xha.reset();
        for (int i2 = 0; i2 < this.qt.size(); i2++) {
            this.xha.addPath(this.qt.get(i2).ka(), matrix);
        }
        this.xha.computeBounds(this.jbs, false);
        if (this.sf == com.bytedance.adsdk.lr.ik.lr.xha.LINEAR) {
            shaderIk = lr();
        } else {
            shaderIk = ik();
        }
        shaderIk.setLocalMatrix(matrix);
        this.mj.setShader(shaderIk);
        com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> riVar = this.slm;
        if (riVar != null) {
            this.mj.setColorFilter(riVar.xha());
        }
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar2 = this.ac;
        if (riVar2 != null) {
            float fFloatValue = riVar2.xha().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.mj.setMaskFilter(null);
            } else if (fFloatValue != this.ri) {
                this.mj.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.ri = fFloatValue;
        }
        com.bytedance.adsdk.lr.ri.lr.ik ikVar = this.ihz;
        if (ikVar != null) {
            ikVar.ri(this.mj);
        }
        this.mj.setAlpha(com.bytedance.adsdk.lr.di.fi.ri((int) ((((i / 255.0f) * this.aw.xha().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.xha, this.mj);
        com.bytedance.adsdk.lr.fi.lr("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        this.xha.reset();
        for (int i = 0; i < this.qt.size(); i++) {
            this.xha.addPath(this.qt.get(i).ka(), matrix);
        }
        this.xha.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] ri(int[] iArr) {
        if (this.bu == null) {
            return iArr;
        }
        throw null;
    }
}
