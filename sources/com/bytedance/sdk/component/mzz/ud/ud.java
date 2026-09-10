package com.bytedance.sdk.component.mzz.ud;

import com.bytedance.sdk.component.mzz.mzz;
import com.bytedance.sdk.component.mzz.rdp;

/* JADX INFO: loaded from: classes.dex */
public class ud implements mzz {
    private boolean lnr;
    private rdp mml;
    private String qdl;
    private boolean ud;

    public ud(String str, boolean z2, boolean z3, rdp rdpVar) {
        this.qdl = str;
        this.ud = z2;
        this.lnr = z3;
        this.mml = rdpVar;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz
    public boolean lnr() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz
    public String qdl() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz
    public boolean ud() {
        return this.ud;
    }
}
