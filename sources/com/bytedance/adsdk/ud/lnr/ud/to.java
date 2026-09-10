package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class to implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.ud jpc;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mzz;
    private final String qdl;
    private final boolean rq;
    private final boolean to;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud tvp;
    private final qdl ud;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud wd;

    public enum qdl {
        STAR(1),
        POLYGON(2);

        private final int lnr;

        qdl(int i2) {
            this.lnr = i2;
        }

        public static qdl qdl(int i2) {
            for (qdl qdlVar : values()) {
                if (qdlVar.lnr == i2) {
                    return qdlVar;
                }
            }
            return null;
        }
    }

    public to(String str, qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar3, com.bytedance.adsdk.ud.lnr.qdl.ud udVar4, com.bytedance.adsdk.ud.lnr.qdl.ud udVar5, com.bytedance.adsdk.ud.lnr.qdl.ud udVar6, boolean z2, boolean z3) {
        this.qdl = str;
        this.ud = qdlVar;
        this.lnr = udVar;
        this.mml = exuVar;
        this.mzz = udVar2;
        this.mo = udVar3;
        this.wd = udVar4;
        this.jpc = udVar5;
        this.tvp = udVar6;
        this.to = z2;
        this.rq = z3;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud jpc() {
        return this.jpc;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud lnr() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> mml() {
        return this.mml;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mo() {
        return this.mo;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public boolean rq() {
        return this.rq;
    }

    public boolean to() {
        return this.to;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud tvp() {
        return this.tvp;
    }

    public qdl ud() {
        return this.ud;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud wd() {
        return this.wd;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.rdp(tvpVar, qdlVar, this);
    }
}
