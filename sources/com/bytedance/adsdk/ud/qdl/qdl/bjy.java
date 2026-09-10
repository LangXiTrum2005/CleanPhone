package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bjy implements exu, rq, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> jpc;
    private final String lnr;
    private final boolean mml;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> mo;
    private final com.bytedance.adsdk.ud.tvp mzz;
    private boolean rq;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> wd;
    private final Path qdl = new Path();
    private final RectF ud = new RectF();
    private final ud tvp = new ud();
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> to = null;

    public bjy(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.rq rqVar) {
        this.lnr = rqVar.qdl();
        this.mml = rqVar.mzz();
        this.mzz = tvpVar;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl = rqVar.mml().qdl();
        this.mo = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = rqVar.lnr().qdl();
        this.wd = qdlVarQdl2;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = rqVar.ud().qdl();
        this.jpc = qdlVarQdl3;
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVar.qdl(qdlVarQdl3);
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
        qdlVarQdl3.qdl(this);
    }

    private void ud() {
        this.rq = false;
        this.mzz.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar;
        if (this.rq) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.mml) {
            this.rq = true;
            return this.qdl;
        }
        PointF pointFWd = this.wd.wd();
        float f = pointFWd.x / 2.0f;
        float f2 = pointFWd.y / 2.0f;
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar2 = this.jpc;
        float fTvp = qdlVar2 == null ? 0.0f : ((com.bytedance.adsdk.ud.qdl.ud.mml) qdlVar2).tvp();
        if (fTvp == 0.0f && (qdlVar = this.to) != null) {
            fTvp = Math.min(qdlVar.wd().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fTvp > fMin) {
            fTvp = fMin;
        }
        PointF pointFWd2 = this.mo.wd();
        this.qdl.moveTo(pointFWd2.x + f, (pointFWd2.y - f2) + fTvp);
        this.qdl.lineTo(pointFWd2.x + f, (pointFWd2.y + f2) - fTvp);
        if (fTvp > 0.0f) {
            RectF rectF = this.ud;
            float f3 = pointFWd2.x;
            float f4 = fTvp * 2.0f;
            float f5 = pointFWd2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.qdl.arcTo(this.ud, 0.0f, 90.0f, false);
        }
        this.qdl.lineTo((pointFWd2.x - f) + fTvp, pointFWd2.y + f2);
        if (fTvp > 0.0f) {
            RectF rectF2 = this.ud;
            float f6 = pointFWd2.x;
            float f7 = pointFWd2.y;
            float f8 = fTvp * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.qdl.arcTo(this.ud, 90.0f, 90.0f, false);
        }
        this.qdl.lineTo(pointFWd2.x - f, (pointFWd2.y - f2) + fTvp);
        if (fTvp > 0.0f) {
            RectF rectF3 = this.ud;
            float f9 = pointFWd2.x;
            float f10 = pointFWd2.y;
            float f11 = fTvp * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.qdl.arcTo(this.ud, 180.0f, 90.0f, false);
        }
        this.qdl.lineTo((pointFWd2.x + f) - fTvp, pointFWd2.y - f2);
        if (fTvp > 0.0f) {
            RectF rectF4 = this.ud;
            float f12 = pointFWd2.x;
            float f13 = fTvp * 2.0f;
            float f14 = pointFWd2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.qdl.arcTo(this.ud, 270.0f, 90.0f, false);
        }
        this.qdl.close();
        this.tvp.qdl(this.qdl);
        this.rq = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        ud();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            lnr lnrVar = list.get(i2);
            if (lnrVar instanceof jyq) {
                jyq jyqVar = (jyq) lnrVar;
                if (jyqVar.ud() == com.bytedance.adsdk.ud.lnr.ud.exc.qdl.SIMULTANEOUSLY) {
                    this.tvp.qdl(jyqVar);
                    jyqVar.qdl(this);
                } else if (lnrVar instanceof yt) {
                    this.to = ((yt) lnrVar).ud();
                }
            } else if (lnrVar instanceof yt) {
                this.to = ((yt) lnrVar).ud();
            }
        }
    }
}
