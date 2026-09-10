package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends ud {
    private int mml;

    public jpc(Integer num, View view, ljh ljhVar, mzz.qdl qdlVar) {
        super(num, view, ljhVar, 2000, qdlVar);
        this.mml = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public boolean fs() {
        int i2 = this.mml;
        boolean z2 = i2 == 2 || i2 == 0;
        if (z2) {
            this.lnr.set(false);
        }
        return !z2 || super.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public boolean lnr() {
        return mo.qdl(this.qdl.get(), this.ud.ok()) && this.mml == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public void mml() {
        super.mml();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public int mo() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public void qdl() {
        if (this.mml != 1) {
            return;
        }
        super.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public void ud(int i2) {
        if (tvp()) {
            return;
        }
        if (i2 == 6 || i2 == 5) {
            this.mml = 0;
            jpc();
        }
        if (i2 == 3 || i2 == 2) {
            this.mml = 2;
            jpc();
        }
        if (this.mml == 1 || i2 != 0) {
            return;
        }
        this.mml = 1;
        qdl();
    }
}
