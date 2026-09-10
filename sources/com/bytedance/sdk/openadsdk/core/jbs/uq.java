package com.bytedance.sdk.openadsdk.core.jbs;

import android.os.SystemClock;
import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class uq implements com.bytedance.sdk.openadsdk.core.co.xha.ik {
    private String di;
    private long ri = 0;
    private long lr = 0;
    private int ik = 0;
    private String ka = null;
    private String fi = null;
    private final AtomicBoolean xha = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
    public void lr(String str) {
        this.fi = str;
        this.lr = SystemClock.elapsedRealtime();
        this.xha.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
    public void ri(String str) {
        this.di = str;
        this.ri = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
    public void ri(int i, String str, String str2) {
        this.ik = i;
        this.ka = str;
        this.fi = str2;
        this.lr = SystemClock.elapsedRealtime();
        this.xha.set(false);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        if (this.xha.get()) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, false, str, "success", this.lr - this.ri, this.fi, this.di, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, false, str, X3.g.e, this.lr - this.ri, this.fi, this.di, this.ik, this.ka);
        }
    }
}
