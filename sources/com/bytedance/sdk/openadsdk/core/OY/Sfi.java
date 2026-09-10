package com.bytedance.sdk.openadsdk.core.OY;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class Sfi implements com.bytedance.sdk.openadsdk.core.JVA.JXs.lk {
    private String lc;
    private long Lxb = 0;
    private long LD = 0;
    private int lk = 0;
    private String ZU = null;
    private String JXs = null;
    private final AtomicBoolean ebl = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
    public void LD(String str) {
        this.JXs = str;
        this.LD = SystemClock.elapsedRealtime();
        this.ebl.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
    public void Lxb(String str) {
        this.lc = str;
        this.Lxb = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
    public void Lxb(int i, String str, String str2) {
        this.lk = i;
        this.ZU = str;
        this.JXs = str2;
        this.LD = SystemClock.elapsedRealtime();
        this.ebl.set(false);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str) {
        if (this.ebl.get()) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, false, str, "success", this.LD - this.Lxb, this.JXs, this.lc, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, false, str, "fail", this.LD - this.Lxb, this.JXs, this.lc, this.lk, this.ZU);
        }
    }
}
