package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean fr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout hcw() {
        return this.lr.ay.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void oh() {
        if (wjv.fi(this.lr.lr)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.lr.ay;
        if (jbsVar == null || jbsVar.ri() == null) {
            return;
        }
        this.lr.ay.ri().setTime("0", 0, 0, false);
        if (this.lr.ay.jbs()) {
            this.lr.oh.ri("0", "X");
            this.lr.oh.fi(true);
            this.lr.oh.ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        igq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> pv() {
        return this.lr.jbs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ri(long j, long j2) {
        int i = (int) (j / 1000);
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.lr.ay;
        if (jbsVar != null && jbsVar.ri() != null) {
            this.lr.ay.ri().setTime(String.valueOf(this.fi), i, 0, false);
            this.lr.ay.ri().ri(j, j2);
        }
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar2 = this.lr.ay;
        if ((jbsVar2 == null || !jbsVar2.jbs()) && !this.lr.lr.vgs()) {
            return;
        }
        ri(i);
        if (this.fi >= 0) {
            this.lr.oh.ka(true);
            this.lr.oh.ri(String.valueOf(this.fi), null);
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
