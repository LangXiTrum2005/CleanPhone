package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends sLN {
    public lk(@NonNull Context context) {
        super(context);
        this.LD = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.sLN
    public void Lxb() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lk.1
            @Override // java.lang.Runnable
            public void run() {
                lk lkVar = lk.this;
                if (lkVar.Lxb != null) {
                    lkVar.setVisibility(0);
                }
            }
        });
    }

    public void Lxb(tD tDVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.LD();
        }
    }
}
