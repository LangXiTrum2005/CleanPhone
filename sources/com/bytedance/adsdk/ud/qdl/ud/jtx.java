package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class jtx {
    private qdl<?, Float> exu;
    private mml fs;
    private qdl<com.bytedance.adsdk.ud.wd.lnr, com.bytedance.adsdk.ud.wd.lnr> jpc;
    private final Matrix lnr;
    private final Matrix mml;
    private qdl<PointF, PointF> mo;
    private final float[] mzz;
    private final Matrix qdl = new Matrix();
    private qdl<?, Float> rdp;
    private mml rq;
    private qdl<Integer, Integer> to;
    private qdl<Float, Float> tvp;
    private final Matrix ud;
    private qdl<?, PointF> wd;

    public jtx(com.bytedance.adsdk.ud.lnr.qdl.fs fsVar) {
        this.mo = fsVar.qdl() == null ? null : fsVar.qdl().qdl();
        this.wd = fsVar.ud() == null ? null : fsVar.ud().qdl();
        this.jpc = fsVar.lnr() == null ? null : fsVar.lnr().qdl();
        this.tvp = fsVar.mml() == null ? null : fsVar.mml().qdl();
        mml mmlVar = fsVar.jpc() == null ? null : (mml) fsVar.jpc().qdl();
        this.rq = mmlVar;
        if (mmlVar != null) {
            this.ud = new Matrix();
            this.lnr = new Matrix();
            this.mml = new Matrix();
            this.mzz = new float[9];
        } else {
            this.ud = null;
            this.lnr = null;
            this.mml = null;
            this.mzz = null;
        }
        this.fs = fsVar.tvp() == null ? null : (mml) fsVar.tvp().qdl();
        if (fsVar.mzz() != null) {
            this.to = fsVar.mzz().qdl();
        }
        if (fsVar.mo() != null) {
            this.exu = fsVar.mo().qdl();
        } else {
            this.exu = null;
        }
        if (fsVar.wd() != null) {
            this.rdp = fsVar.wd().qdl();
        } else {
            this.rdp = null;
        }
    }

    private void mzz() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.mzz[i2] = 0.0f;
        }
    }

    public qdl<?, Float> lnr() {
        return this.rdp;
    }

    public Matrix mml() {
        PointF pointFWd;
        PointF pointFWd2;
        this.qdl.reset();
        qdl<?, PointF> qdlVar = this.wd;
        if (qdlVar != null && (pointFWd2 = qdlVar.wd()) != null) {
            float f = pointFWd2.x;
            if (f != 0.0f || pointFWd2.y != 0.0f) {
                this.qdl.preTranslate(f, pointFWd2.y);
            }
        }
        qdl<Float, Float> qdlVar2 = this.tvp;
        if (qdlVar2 != null) {
            float fFloatValue = qdlVar2 instanceof yt ? qdlVar2.wd().floatValue() : ((mml) qdlVar2).tvp();
            if (fFloatValue != 0.0f) {
                this.qdl.preRotate(fFloatValue);
            }
        }
        mml mmlVar = this.rq;
        if (mmlVar != null) {
            mml mmlVar2 = this.fs;
            float fCos = mmlVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-mmlVar2.tvp()) + 90.0f));
            mml mmlVar3 = this.fs;
            float fSin = mmlVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-mmlVar3.tvp()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(mmlVar.tvp()));
            mzz();
            float[] fArr = this.mzz;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.ud.setValues(fArr);
            mzz();
            float[] fArr2 = this.mzz;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.lnr.setValues(fArr2);
            mzz();
            float[] fArr3 = this.mzz;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.mml.setValues(fArr3);
            this.lnr.preConcat(this.ud);
            this.mml.preConcat(this.lnr);
            this.qdl.preConcat(this.mml);
        }
        qdl<com.bytedance.adsdk.ud.wd.lnr, com.bytedance.adsdk.ud.wd.lnr> qdlVar3 = this.jpc;
        if (qdlVar3 != null) {
            com.bytedance.adsdk.ud.wd.lnr lnrVarWd = qdlVar3.wd();
            if (lnrVarWd.qdl() != 1.0f || lnrVarWd.ud() != 1.0f) {
                this.qdl.preScale(lnrVarWd.qdl(), lnrVarWd.ud());
            }
        }
        qdl<PointF, PointF> qdlVar4 = this.mo;
        if (qdlVar4 != null && (((pointFWd = qdlVar4.wd()) != null && pointFWd.x != 0.0f) || pointFWd.y != 0.0f)) {
            this.qdl.preTranslate(-pointFWd.x, -pointFWd.y);
        }
        return this.qdl;
    }

    public void qdl(com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        qdlVar.qdl(this.to);
        qdlVar.qdl(this.exu);
        qdlVar.qdl(this.rdp);
        qdlVar.qdl(this.mo);
        qdlVar.qdl(this.wd);
        qdlVar.qdl(this.jpc);
        qdlVar.qdl(this.tvp);
        qdlVar.qdl(this.rq);
        qdlVar.qdl(this.fs);
    }

    public qdl<?, Float> ud() {
        return this.exu;
    }

    public Matrix ud(float f) {
        qdl<?, PointF> qdlVar = this.wd;
        PointF pointFWd = qdlVar == null ? null : qdlVar.wd();
        qdl<com.bytedance.adsdk.ud.wd.lnr, com.bytedance.adsdk.ud.wd.lnr> qdlVar2 = this.jpc;
        com.bytedance.adsdk.ud.wd.lnr lnrVarWd = qdlVar2 == null ? null : qdlVar2.wd();
        this.qdl.reset();
        if (pointFWd != null) {
            this.qdl.preTranslate(pointFWd.x * f, pointFWd.y * f);
        }
        if (lnrVarWd != null) {
            double d = f;
            this.qdl.preScale((float) Math.pow(lnrVarWd.qdl(), d), (float) Math.pow(lnrVarWd.ud(), d));
        }
        qdl<Float, Float> qdlVar3 = this.tvp;
        if (qdlVar3 != null) {
            float fFloatValue = qdlVar3.wd().floatValue();
            qdl<PointF, PointF> qdlVar4 = this.mo;
            PointF pointFWd2 = qdlVar4 != null ? qdlVar4.wd() : null;
            this.qdl.preRotate(fFloatValue * f, pointFWd2 == null ? 0.0f : pointFWd2.x, pointFWd2 != null ? pointFWd2.y : 0.0f);
        }
        return this.qdl;
    }

    public void qdl(qdl.InterfaceC0060qdl interfaceC0060qdl) {
        qdl<Integer, Integer> qdlVar = this.to;
        if (qdlVar != null) {
            qdlVar.qdl(interfaceC0060qdl);
        }
        qdl<?, Float> qdlVar2 = this.exu;
        if (qdlVar2 != null) {
            qdlVar2.qdl(interfaceC0060qdl);
        }
        qdl<?, Float> qdlVar3 = this.rdp;
        if (qdlVar3 != null) {
            qdlVar3.qdl(interfaceC0060qdl);
        }
        qdl<PointF, PointF> qdlVar4 = this.mo;
        if (qdlVar4 != null) {
            qdlVar4.qdl(interfaceC0060qdl);
        }
        qdl<?, PointF> qdlVar5 = this.wd;
        if (qdlVar5 != null) {
            qdlVar5.qdl(interfaceC0060qdl);
        }
        qdl<com.bytedance.adsdk.ud.wd.lnr, com.bytedance.adsdk.ud.wd.lnr> qdlVar6 = this.jpc;
        if (qdlVar6 != null) {
            qdlVar6.qdl(interfaceC0060qdl);
        }
        qdl<Float, Float> qdlVar7 = this.tvp;
        if (qdlVar7 != null) {
            qdlVar7.qdl(interfaceC0060qdl);
        }
        mml mmlVar = this.rq;
        if (mmlVar != null) {
            mmlVar.qdl(interfaceC0060qdl);
        }
        mml mmlVar2 = this.fs;
        if (mmlVar2 != null) {
            mmlVar2.qdl(interfaceC0060qdl);
        }
    }

    public void qdl(float f) {
        qdl<Integer, Integer> qdlVar = this.to;
        if (qdlVar != null) {
            qdlVar.qdl(f);
        }
        qdl<?, Float> qdlVar2 = this.exu;
        if (qdlVar2 != null) {
            qdlVar2.qdl(f);
        }
        qdl<?, Float> qdlVar3 = this.rdp;
        if (qdlVar3 != null) {
            qdlVar3.qdl(f);
        }
        qdl<PointF, PointF> qdlVar4 = this.mo;
        if (qdlVar4 != null) {
            qdlVar4.qdl(f);
        }
        qdl<?, PointF> qdlVar5 = this.wd;
        if (qdlVar5 != null) {
            qdlVar5.qdl(f);
        }
        qdl<com.bytedance.adsdk.ud.wd.lnr, com.bytedance.adsdk.ud.wd.lnr> qdlVar6 = this.jpc;
        if (qdlVar6 != null) {
            qdlVar6.qdl(f);
        }
        qdl<Float, Float> qdlVar7 = this.tvp;
        if (qdlVar7 != null) {
            qdlVar7.qdl(f);
        }
        mml mmlVar = this.rq;
        if (mmlVar != null) {
            mmlVar.qdl(f);
        }
        mml mmlVar2 = this.fs;
        if (mmlVar2 != null) {
            mmlVar2.qdl(f);
        }
    }

    public qdl<?, Integer> qdl() {
        return this.to;
    }
}
