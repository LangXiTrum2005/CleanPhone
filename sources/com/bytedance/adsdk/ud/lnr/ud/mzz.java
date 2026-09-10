package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class mzz implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.ud jpc;
    private final com.bytedance.adsdk.ud.lnr.qdl.lnr lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mzz;
    private final wd qdl;
    private final boolean to;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud tvp;
    private final Path.FillType ud;
    private final String wd;

    public mzz(String str, wd wdVar, Path.FillType fillType, com.bytedance.adsdk.ud.lnr.qdl.lnr lnrVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, boolean z2) {
        this.qdl = wdVar;
        this.ud = fillType;
        this.lnr = lnrVar;
        this.mml = mmlVar;
        this.mzz = moVar;
        this.mo = moVar2;
        this.wd = str;
        this.jpc = udVar;
        this.tvp = udVar2;
        this.to = z2;
    }

    public boolean jpc() {
        return this.to;
    }

    public Path.FillType lnr() {
        return this.ud;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.lnr mml() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo mo() {
        return this.mzz;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml mzz() {
        return this.mml;
    }

    public String qdl() {
        return this.wd;
    }

    public wd ud() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo wd() {
        return this.mo;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.jpc(tvpVar, wdVar, qdlVar, this);
    }
}
