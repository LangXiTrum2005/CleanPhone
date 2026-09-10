package com.bytedance.adsdk.ud.qdl.qdl;

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
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jpc implements mzz, rq, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> aaj;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> bjy;
    private final int exc;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> exu;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<com.bytedance.adsdk.ud.lnr.ud.mml, com.bytedance.adsdk.ud.lnr.ud.mml> fs;
    private final com.bytedance.adsdk.ud.tvp jl;
    private final Paint jpc;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> jtx;
    private com.bytedance.adsdk.ud.qdl.ud.lnr jyq;
    private final boolean lnr;
    private final com.bytedance.adsdk.ud.lnr.lnr.qdl mml;
    float qdl;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> rdp;
    private final com.bytedance.adsdk.ud.lnr.ud.wd rq;
    private final List<exu> to;
    private final RectF tvp;
    private final String ud;
    private final Path wd;
    private com.bytedance.adsdk.ud.qdl.ud.yt yt;
    private final LongSparseArray<LinearGradient> mzz = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> mo = new LongSparseArray<>();

    public jpc(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.mzz mzzVar) {
        Path path = new Path();
        this.wd = path;
        this.jpc = new com.bytedance.adsdk.ud.qdl.qdl(1);
        this.tvp = new RectF();
        this.to = new ArrayList();
        this.qdl = 0.0f;
        this.mml = qdlVar;
        this.ud = mzzVar.qdl();
        this.lnr = mzzVar.jpc();
        this.jl = tvpVar;
        this.rq = mzzVar.ud();
        path.setFillType(mzzVar.lnr());
        this.exc = (int) (wdVar.mzz() / 32.0f);
        com.bytedance.adsdk.ud.qdl.ud.qdl<com.bytedance.adsdk.ud.lnr.ud.mml, com.bytedance.adsdk.ud.lnr.ud.mml> qdlVarQdl = mzzVar.mml().qdl();
        this.fs = qdlVarQdl;
        qdlVarQdl.qdl(this);
        qdlVar.qdl(qdlVarQdl);
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl2 = mzzVar.mzz().qdl();
        this.exu = qdlVarQdl2;
        qdlVarQdl2.qdl(this);
        qdlVar.qdl(qdlVarQdl2);
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl3 = mzzVar.mo().qdl();
        this.rdp = qdlVarQdl3;
        qdlVarQdl3.qdl(this);
        qdlVar.qdl(qdlVarQdl3);
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl4 = mzzVar.wd().qdl();
        this.bjy = qdlVarQdl4;
        qdlVarQdl4.qdl(this);
        qdlVar.qdl(qdlVarQdl4);
        if (qdlVar.to() != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl5 = qdlVar.to().qdl().qdl();
            this.aaj = qdlVarQdl5;
            qdlVarQdl5.qdl(this);
            qdlVar.qdl(this.aaj);
        }
        if (qdlVar.rq() != null) {
            this.jyq = new com.bytedance.adsdk.ud.qdl.ud.lnr(this, qdlVar, qdlVar.rq());
        }
    }

    private RadialGradient lnr() {
        long jMml = mml();
        RadialGradient radialGradient = this.mo.get(jMml);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFWd = this.rdp.wd();
        PointF pointFWd2 = this.bjy.wd();
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVarWd = this.fs.wd();
        int[] iArrQdl = qdl(mmlVarWd.ud());
        float[] fArrQdl = mmlVarWd.qdl();
        float f = pointFWd.x;
        float f2 = pointFWd.y;
        float fHypot = (float) Math.hypot(pointFWd2.x - f, pointFWd2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrQdl, fArrQdl, Shader.TileMode.CLAMP);
        this.mo.put(jMml, radialGradient2);
        return radialGradient2;
    }

    private int mml() {
        int iRound = Math.round(this.rdp.jpc() * this.exc);
        int iRound2 = Math.round(this.bjy.jpc() * this.exc);
        int iRound3 = Math.round(this.fs.jpc() * this.exc);
        int i2 = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private LinearGradient ud() {
        long jMml = mml();
        LinearGradient linearGradient = this.mzz.get(jMml);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFWd = this.rdp.wd();
        PointF pointFWd2 = this.bjy.wd();
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVarWd = this.fs.wd();
        LinearGradient linearGradient2 = new LinearGradient(pointFWd.x, pointFWd.y, pointFWd2.x, pointFWd2.y, qdl(mmlVarWd.ud()), mmlVarWd.qdl(), Shader.TileMode.CLAMP);
        this.mzz.put(jMml, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.jl.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            lnr lnrVar = list2.get(i2);
            if (lnrVar instanceof exu) {
                this.to.add((exu) lnrVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        Shader shaderLnr;
        if (this.lnr) {
            return;
        }
        com.bytedance.adsdk.ud.mzz.qdl("GradientFillContent#draw");
        this.wd.reset();
        for (int i3 = 0; i3 < this.to.size(); i3++) {
            this.wd.addPath(this.to.get(i3).mml(), matrix);
        }
        this.wd.computeBounds(this.tvp, false);
        if (this.rq == com.bytedance.adsdk.ud.lnr.ud.wd.LINEAR) {
            shaderLnr = ud();
        } else {
            shaderLnr = lnr();
        }
        shaderLnr.setLocalMatrix(matrix);
        this.jpc.setShader(shaderLnr);
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.jtx;
        if (qdlVar != null) {
            this.jpc.setColorFilter(qdlVar.wd());
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar2 = this.aaj;
        if (qdlVar2 != null) {
            float fFloatValue = qdlVar2.wd().floatValue();
            if (fFloatValue == 0.0f) {
                this.jpc.setMaskFilter(null);
            } else if (fFloatValue != this.qdl) {
                this.jpc.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.qdl = fFloatValue;
        }
        com.bytedance.adsdk.ud.qdl.ud.lnr lnrVar = this.jyq;
        if (lnrVar != null) {
            lnrVar.qdl(this.jpc);
        }
        this.jpc.setAlpha(com.bytedance.adsdk.ud.mo.mzz.qdl((int) ((((i2 / 255.0f) * this.exu.wd().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.wd, this.jpc);
        com.bytedance.adsdk.ud.mzz.ud("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        this.wd.reset();
        for (int i2 = 0; i2 < this.to.size(); i2++) {
            this.wd.addPath(this.to.get(i2).mml(), matrix);
        }
        this.wd.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] qdl(int[] iArr) {
        if (this.yt == null) {
            return iArr;
        }
        throw null;
    }
}
