package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes3.dex */
public class jyq {
    private long qdl = 10000;
    private long ud = 10000;
    private long lnr = 10;
    private long mml = 20;
    private String mzz = "";

    public long lnr() {
        return this.lnr;
    }

    public long mml() {
        return this.mml;
    }

    public String mzz() {
        return this.mzz;
    }

    public long qdl() {
        return this.qdl;
    }

    public long ud() {
        return this.ud;
    }

    public void lnr(long j) {
        if (j <= 0) {
            this.lnr = 10L;
        } else {
            this.lnr = j;
        }
    }

    public void mml(long j) {
        if (j < 0) {
            this.mml = 20L;
        } else {
            this.mml = j;
        }
    }

    public void qdl(long j) {
        if (j <= 0) {
            this.qdl = 10L;
        } else {
            this.qdl = j;
        }
    }

    public void ud(long j) {
        if (j < 0) {
            this.ud = 20L;
        } else {
            this.ud = j;
        }
    }

    public void qdl(String str) {
        this.mzz = str;
    }
}
