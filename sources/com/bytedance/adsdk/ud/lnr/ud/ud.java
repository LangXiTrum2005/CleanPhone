package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class ud implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.mo lnr;
    private final boolean mml;
    private final boolean mzz;
    private final String qdl;
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> ud;

    public ud(String str, com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar, boolean z2, boolean z3) {
        this.qdl = str;
        this.ud = exuVar;
        this.lnr = moVar;
        this.mml = z2;
        this.mzz = z3;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo lnr() {
        return this.lnr;
    }

    public boolean mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.mo(tvpVar, qdlVar, this);
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> ud() {
        return this.ud;
    }

    public String qdl() {
        return this.qdl;
    }
}
