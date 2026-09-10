package com.bytedance.adsdk.ud.lnr.ud;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class jtx implements lnr {
    private final boolean lnr;
    private final String qdl;
    private final List<lnr> ud;

    public jtx(String str, List<lnr> list, boolean z2) {
        this.qdl = str;
        this.ud = list;
        this.lnr = z2;
    }

    public boolean lnr() {
        return this.lnr;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.qdl + "' Shapes: " + Arrays.toString(this.ud.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }

    public List<lnr> ud() {
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.mml(tvpVar, qdlVar, this, wdVar);
    }
}
