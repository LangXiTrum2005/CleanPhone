package com.bytedance.adsdk.ud.lnr.ud;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class yt implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.jpc lnr;
    private final boolean mml;
    private final String qdl;
    private final int ud;

    public yt(String str, int i2, com.bytedance.adsdk.ud.lnr.qdl.jpc jpcVar, boolean z2) {
        this.qdl = str;
        this.ud = i2;
        this.lnr = jpcVar;
        this.mml = z2;
    }

    public boolean lnr() {
        return this.mml;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.qdl);
        sb.append(", index=");
        return a.p(sb, this.ud, AbstractJsonLexerKt.END_OBJ);
    }

    public com.bytedance.adsdk.ud.lnr.qdl.jpc ud() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.jl(tvpVar, qdlVar, this);
    }
}
