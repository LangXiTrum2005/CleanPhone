package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class rq implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mml;
    private final boolean mzz;
    private final String qdl;
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> ud;

    public rq(String str, com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar, com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, boolean z2) {
        this.qdl = str;
        this.ud = exuVar;
        this.lnr = exuVar2;
        this.mml = udVar;
        this.mzz = z2;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> lnr() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> mml() {
        return this.ud;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "RectangleShape{position=" + this.ud + ", size=" + this.lnr + AbstractJsonLexerKt.END_OBJ;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud ud() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.bjy(tvpVar, qdlVar, this);
    }
}
