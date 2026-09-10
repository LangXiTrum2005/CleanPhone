package com.bytedance.sdk.openadsdk.component.mzz;

import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private ljh lnr;
    private com.bytedance.sdk.openadsdk.core.model.qdl mml;
    private String mo;
    private int mzz;
    private int qdl;
    private int ud;
    private boolean wd;

    public ud(int i2, int i3, ljh ljhVar, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.qdl = i2;
        this.ud = i3;
        this.lnr = ljhVar;
        this.mml = qdlVar;
    }

    public int lnr() {
        return this.ud;
    }

    public ljh mml() {
        return this.lnr;
    }

    public String mo() {
        return this.mo;
    }

    public int mzz() {
        return this.mzz;
    }

    public com.bytedance.sdk.openadsdk.core.model.qdl qdl() {
        return this.mml;
    }

    public int ud() {
        return this.qdl;
    }

    public void qdl(boolean z2) {
        this.wd = z2;
    }

    public ud(int i2, int i3, int i4, String str) {
        this.qdl = i2;
        this.ud = i3;
        this.mzz = i4;
        this.mo = str;
    }
}
