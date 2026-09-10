package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long lr;
    private long ri;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j = this.ri;
        if (j > 0) {
            com.bytedance.sdk.openadsdk.utils.fi.ri(j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.lr > 0) {
            this.ri += SystemClock.elapsedRealtime() - this.lr;
            this.lr = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.fi.ik()) {
            this.lr = SystemClock.elapsedRealtime();
        }
    }
}
