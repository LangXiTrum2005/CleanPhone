package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.Path;
import androidx.media3.extractor.text.ttml.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class bjy implements lnr {
    private final String lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.qdl mml;
    private final boolean mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mzz;
    private final boolean qdl;
    private final Path.FillType ud;

    public bjy(String str, boolean z2, Path.FillType fillType, com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, boolean z3) {
        this.lnr = str;
        this.qdl = z2;
        this.ud = fillType;
        this.mml = qdlVar;
        this.mzz = mmlVar;
        this.mo = z3;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml lnr() {
        return this.mzz;
    }

    public Path.FillType mml() {
        return this.ud;
    }

    public boolean mzz() {
        return this.mo;
    }

    public String qdl() {
        return this.lnr;
    }

    public String toString() {
        return a.r(new StringBuilder("ShapeFill{color=, fillEnabled="), this.qdl, AbstractJsonLexerKt.END_OBJ);
    }

    public com.bytedance.adsdk.ud.lnr.qdl.qdl ud() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.wd(tvpVar, qdlVar, this);
    }
}
