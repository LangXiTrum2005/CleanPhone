package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mo implements exu, rq, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private boolean jpc;
    private final com.bytedance.adsdk.ud.tvp lnr;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> mml;
    private final com.bytedance.adsdk.ud.lnr.ud.ud mo;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> mzz;
    private final String ud;
    private final Path qdl = new Path();
    private final ud wd = new ud();

    public mo(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.ud udVar) {
        this.ud = udVar.qdl();
        this.lnr = tvpVar;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl = udVar.lnr().qdl();
        this.mml = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = udVar.ud().qdl();
        this.mzz = qdlVarQdl2;
        this.mo = udVar;
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
    }

    private void ud() {
        this.jpc = false;
        this.lnr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        if (this.jpc) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.mo.mzz()) {
            this.jpc = true;
            return this.qdl;
        }
        PointF pointFWd = this.mml.wd();
        float f = pointFWd.x / 2.0f;
        float f2 = pointFWd.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.qdl.reset();
        if (this.mo.mml()) {
            float f5 = -f2;
            this.qdl.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.qdl.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.qdl.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.qdl.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.qdl.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.qdl.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.qdl.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.qdl.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.qdl.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.qdl.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFWd2 = this.mzz.wd();
        this.qdl.offset(pointFWd2.x, pointFWd2.y);
        this.qdl.close();
        this.wd.qdl(this.qdl);
        this.jpc = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        ud();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            lnr lnrVar = list.get(i2);
            if (lnrVar instanceof jyq) {
                jyq jyqVar = (jyq) lnrVar;
                if (jyqVar.ud() == com.bytedance.adsdk.ud.lnr.ud.exc.qdl.SIMULTANEOUSLY) {
                    this.wd.qdl(jyqVar);
                    jyqVar.qdl(this);
                }
            }
        }
    }
}
