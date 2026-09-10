package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean fr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout hcw() {
        return this.lr.ay.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        igq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> pv() {
        return this.lr.jbs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ri(long j, long j2) {
        int iPlm = this.lr.lr.plm();
        boolean z = this.lr.ay.jbs() && iPlm >= 0;
        int i = (int) (j / 1000);
        ik(j, j2);
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.lr.ay;
        if (jbsVar != null && jbsVar.ri() != null) {
            this.lr.ay.ri().setTime(String.valueOf(this.fi), i, 0, false);
            this.lr.ay.ri().ri(j, j2);
        }
        int i2 = this.fi;
        if (i2 > 0) {
            if (!z) {
                this.lr.oh.ri(String.valueOf(i2), null);
                return;
            }
            if (i < iPlm) {
                this.lr.oh.ri(String.valueOf(i2), null);
                return;
            }
            if (this.lr.lr.nd() == 5 || this.lr.lr.nd() == 33) {
                this.lr.oh.ri(String.valueOf(this.fi), null);
                return;
            }
            this.lr.ri(true);
            this.lr.oh.ri(String.valueOf(this.fi), TTAdDislikeToast.getSkipText());
            this.lr.oh.fi(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean su() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void bgr() {
    }
}
