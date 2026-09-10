package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends fs {
    public lnr(Context context) {
        super(context);
        this.ud = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.fs
    public void qdl() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                lnr lnrVar = lnr.this;
                if (lnrVar.qdl != null) {
                    lnrVar.setVisibility(0);
                }
            }
        });
    }

    public void qdl(ljh ljhVar, String str, int i2, String str2, long j, boolean z2, int i3, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, i2, str2, SystemClock.elapsedRealtime() - j, z2, i3, j2);
            super.ud();
        }
    }
}
