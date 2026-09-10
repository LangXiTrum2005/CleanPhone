package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean jyq() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> koa() {
        return this.ud.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ljh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean oth() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qdl(long j, long j2) {
        int iQg = this.ud.ud.qg();
        boolean z2 = this.ud.bqt.tvp() && iQg >= 0;
        int i2 = (int) (j / 1000);
        lnr(j, j2);
        to toVar = this.ud.bqt;
        if (toVar != null && toVar.qdl() != null) {
            this.ud.bqt.qdl().setTime(String.valueOf(this.mo), i2, 0, false);
            this.ud.bqt.qdl().qdl(j, j2);
        }
        int i3 = this.mo;
        if (i3 > 0) {
            if (!z2) {
                this.ud.fco.qdl(String.valueOf(i3), null);
                return;
            }
            if (i2 < iQg) {
                this.ud.fco.qdl(String.valueOf(i3), null);
                return;
            }
            if (this.ud.ud.taz() == 5 || this.ud.ud.taz() == 33) {
                this.ud.fco.qdl(String.valueOf(this.mo), null);
                return;
            }
            this.ud.qdl(true);
            this.ud.fco.qdl(String.valueOf(this.mo), TTAdDislikeToast.getSkipText());
            this.ud.fco.mzz(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void wd() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        return this.ud.bqt.ud();
    }
}
