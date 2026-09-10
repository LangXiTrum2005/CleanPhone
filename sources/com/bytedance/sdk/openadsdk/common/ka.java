package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends co {
    public ka(Context context) {
        super(context);
        this.lr = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.co
    public void ri() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ka.1
            @Override // java.lang.Runnable
            public void run() {
                ka kaVar = ka.this;
                if (kaVar.ri != null) {
                    kaVar.setVisibility(0);
                }
            }
        });
    }

    public void ri(wjv wjvVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.lr();
        }
    }
}
