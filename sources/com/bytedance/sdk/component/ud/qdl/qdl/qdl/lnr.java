package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rdp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements com.bytedance.sdk.component.ud.qdl.jpc.qdl {
    int lnr = 0;
    List<com.bytedance.sdk.component.ud.qdl.jpc> qdl;
    fs ud;

    public lnr(List<com.bytedance.sdk.component.ud.qdl.jpc> list, fs fsVar) {
        this.qdl = list;
        this.ud = fsVar;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.jpc.qdl
    public fs qdl() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.jpc.qdl
    public rdp qdl(fs fsVar) throws IOException {
        this.ud = fsVar;
        int i2 = this.lnr + 1;
        this.lnr = i2;
        if (i2 >= this.qdl.size()) {
            return null;
        }
        return this.qdl.get(this.lnr).qdl(this);
    }
}
