package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void bqt() {
        if (ljh.mzz(this.ud.ud)) {
            finish();
            return;
        }
        to toVar = this.ud.bqt;
        if (toVar == null || toVar.qdl() == null) {
            return;
        }
        this.ud.bqt.qdl().setTime("0", 0, 0, false);
        if (this.ud.bqt.tvp()) {
            this.ud.fco.qdl("0", "X");
            this.ud.fco.mzz(true);
            this.ud.fco.lnr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean jyq() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> koa() {
        return this.ud.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ljh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean oth() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qdl(long j, long j2) {
        int i2 = (int) (j / 1000);
        to toVar = this.ud.bqt;
        if (toVar != null && toVar.qdl() != null) {
            this.ud.bqt.qdl().setTime(String.valueOf(this.mo), i2, 0, false);
            this.ud.bqt.qdl().qdl(j, j2);
        }
        to toVar2 = this.ud.bqt;
        if ((toVar2 == null || !toVar2.tvp()) && !this.ud.ud.au()) {
            return;
        }
        lnr(i2);
        if (this.mo >= 0) {
            this.ud.fco.mml(true);
            this.ud.fco.qdl(String.valueOf(this.mo), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void wd() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        return (udVar == null || !(udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc) || this.ud.jjk) ? this.ud.bqt.ud() : ((com.bytedance.sdk.openadsdk.component.reward.ud.jpc) udVar).vu();
    }
}
