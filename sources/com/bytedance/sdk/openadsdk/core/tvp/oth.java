package com.bytedance.sdk.openadsdk.core.tvp;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class oth implements com.bytedance.sdk.openadsdk.core.rq.wd.lnr {
    private String mo;
    private long qdl = 0;
    private long ud = 0;
    private int lnr = 0;
    private String mml = null;
    private String mzz = null;
    private final AtomicBoolean wd = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
    public void qdl(String str) {
        this.mo = str;
        this.qdl = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
    public void ud(String str) {
        this.mzz = str;
        this.ud = SystemClock.elapsedRealtime();
        this.wd.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
    public void qdl(int i2, String str, String str2) {
        this.lnr = i2;
        this.mml = str;
        this.mzz = str2;
        this.ud = SystemClock.elapsedRealtime();
        this.wd.set(false);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str) {
        if (this.wd.get()) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, false, str, "success", this.ud - this.qdl, this.mzz, this.mo, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, false, str, "fail", this.ud - this.qdl, this.mzz, this.mo, this.lnr, this.mml);
        }
    }
}
