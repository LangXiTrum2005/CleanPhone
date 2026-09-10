package com.bytedance.adsdk.ud.lnr.ud;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class tvp implements lnr {
    private final boolean lnr;
    private final String qdl;
    private final qdl ud;

    public enum qdl {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static qdl qdl(int i2) {
            if (i2 == 1) {
                return MERGE;
            }
            if (i2 == 2) {
                return ADD;
            }
            if (i2 == 3) {
                return SUBTRACT;
            }
            if (i2 != 4) {
                return i2 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public tvp(String str, qdl qdlVar, boolean z2) {
        this.qdl = str;
        this.ud = qdlVar;
        this.lnr = z2;
    }

    public boolean lnr() {
        return this.lnr;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "MergePaths{mode=" + this.ud + AbstractJsonLexerKt.END_OBJ;
    }

    public qdl ud() {
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.fs(this);
    }
}
