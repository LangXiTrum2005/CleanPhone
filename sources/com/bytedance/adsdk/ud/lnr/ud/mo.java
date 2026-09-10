package com.bytedance.adsdk.ud.lnr.ud;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mo implements lnr {
    private final boolean exu;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud fs;
    private final jl.qdl jpc;
    private final com.bytedance.adsdk.ud.lnr.qdl.lnr lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mzz;
    private final String qdl;
    private final List<com.bytedance.adsdk.ud.lnr.qdl.ud> rq;
    private final float to;
    private final jl.ud tvp;
    private final wd ud;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud wd;

    public mo(String str, wd wdVar, com.bytedance.adsdk.ud.lnr.qdl.lnr lnrVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, jl.qdl qdlVar, jl.ud udVar2, float f, List<com.bytedance.adsdk.ud.lnr.qdl.ud> list, com.bytedance.adsdk.ud.lnr.qdl.ud udVar3, boolean z2) {
        this.qdl = str;
        this.ud = wdVar;
        this.lnr = lnrVar;
        this.mml = mmlVar;
        this.mzz = moVar;
        this.mo = moVar2;
        this.wd = udVar;
        this.jpc = qdlVar;
        this.tvp = udVar2;
        this.to = f;
        this.rq = list;
        this.fs = udVar3;
        this.exu = z2;
    }

    public boolean exu() {
        return this.exu;
    }

    public float fs() {
        return this.to;
    }

    public jl.qdl jpc() {
        return this.jpc;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.lnr lnr() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml mml() {
        return this.mml;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo mo() {
        return this.mo;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud rq() {
        return this.fs;
    }

    public List<com.bytedance.adsdk.ud.lnr.qdl.ud> to() {
        return this.rq;
    }

    public jl.ud tvp() {
        return this.tvp;
    }

    public wd ud() {
        return this.ud;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud wd() {
        return this.wd;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.tvp(tvpVar, qdlVar, this);
    }
}
