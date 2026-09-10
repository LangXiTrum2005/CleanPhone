package com.bytedance.adsdk.ud.mml;

/* JADX INFO: loaded from: classes.dex */
public enum lnr {
    JSON(".json"),
    ZIP(".zip");

    public final String lnr;

    lnr(String str) {
        this.lnr = str;
    }

    public String qdl() {
        return ".temp" + this.lnr;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.lnr;
    }
}
