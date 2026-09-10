package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> exu;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> fs;
    private final RectF jpc;
    private final String mml;
    private final LongSparseArray<LinearGradient> mo;
    private final boolean mzz;
    private com.bytedance.adsdk.ud.qdl.ud.yt rdp;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<com.bytedance.adsdk.ud.lnr.ud.mml, com.bytedance.adsdk.ud.lnr.ud.mml> rq;
    private final int to;
    private final com.bytedance.adsdk.ud.lnr.ud.wd tvp;
    private final LongSparseArray<RadialGradient> wd;

    public tvp(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.mo moVar) {
        super(tvpVar, qdlVar, moVar.jpc().qdl(), moVar.tvp().qdl(), moVar.fs(), moVar.mml(), moVar.wd(), moVar.to(), moVar.rq());
        this.mo = new LongSparseArray<>();
        this.wd = new LongSparseArray<>();
        this.jpc = new RectF();
        this.mml = moVar.qdl();
        this.tvp = moVar.ud();
        this.mzz = moVar.exu();
        this.to = (int) (tvpVar.xmv().mzz() / 32.0f);
        com.bytedance.adsdk.ud.qdl.ud.qdl<com.bytedance.adsdk.ud.lnr.ud.mml, com.bytedance.adsdk.ud.lnr.ud.mml> qdlVarQdl = moVar.lnr().qdl();
        this.rq = qdlVarQdl;
        qdlVarQdl.qdl(this);
        qdlVar.qdl(qdlVarQdl);
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = moVar.mzz().qdl();
        this.fs = qdlVarQdl2;
        qdlVarQdl2.qdl(this);
        qdlVar.qdl(qdlVarQdl2);
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl3 = moVar.mo().qdl();
        this.exu = qdlVarQdl3;
        qdlVarQdl3.qdl(this);
        qdlVar.qdl(qdlVarQdl3);
    }

    private RadialGradient lnr() {
        long jMml = mml();
        RadialGradient radialGradient = this.wd.get(jMml);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFWd = this.fs.wd();
        PointF pointFWd2 = this.exu.wd();
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVarWd = this.rq.wd();
        int[] iArrQdl = qdl(mmlVarWd.ud());
        float[] fArrQdl = mmlVarWd.qdl();
        float f = pointFWd.x;
        float f2 = pointFWd.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(pointFWd2.x - f, pointFWd2.y - f2), iArrQdl, fArrQdl, Shader.TileMode.CLAMP);
        this.wd.put(jMml, radialGradient2);
        return radialGradient2;
    }

    private int mml() {
        int iRound = Math.round(this.fs.jpc() * this.to);
        int iRound2 = Math.round(this.exu.jpc() * this.to);
        int iRound3 = Math.round(this.rq.jpc() * this.to);
        int i2 = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private LinearGradient ud() {
        long jMml = mml();
        LinearGradient linearGradient = this.mo.get(jMml);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFWd = this.fs.wd();
        PointF pointFWd2 = this.exu.wd();
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVarWd = this.rq.wd();
        LinearGradient linearGradient2 = new LinearGradient(pointFWd.x, pointFWd.y, pointFWd2.x, pointFWd2.y, qdl(mmlVarWd.ud()), mmlVarWd.qdl(), Shader.TileMode.CLAMP);
        this.mo.put(jMml, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        if (this.mzz) {
            return;
        }
        qdl(this.jpc, matrix, false);
        Shader shaderUd = this.tvp == com.bytedance.adsdk.ud.lnr.ud.wd.LINEAR ? ud() : lnr();
        shaderUd.setLocalMatrix(matrix);
        this.ud.setShader(shaderUd);
        super.qdl(canvas, matrix, i2);
    }

    private int[] qdl(int[] iArr) {
        if (this.rdp == null) {
            return iArr;
        }
        throw null;
    }
}
