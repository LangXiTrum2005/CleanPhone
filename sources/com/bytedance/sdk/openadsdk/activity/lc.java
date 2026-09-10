package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lc {
    protected IListenerManager JVA;
    private final LD Lxb;
    protected final tD OY;
    public int QAg;
    public boolean nBu;
    protected com.bytedance.sdk.openadsdk.sLN.JXs sLN = new com.bytedance.sdk.openadsdk.sLN.JXs() { // from class: com.bytedance.sdk.openadsdk.activity.lc.1
        @Override // com.bytedance.sdk.openadsdk.sLN.JXs
        public void Lxb() {
            lc.this.STP();
        }
    };

    public lc(LD ld, tD tDVar, int i) {
        this.Lxb = ld;
        this.OY = tDVar;
        this.QAg = i;
    }

    public Activity CSn() {
        return this.Lxb.lk();
    }

    public abstract String DY();

    public abstract com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb HD();

    public void IeN() {
    }

    public final void Ivz() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdVideoBarClick");
        } else {
            this.Lxb.JVA();
        }
    }

    public void JXs(Activity activity) {
    }

    public void KPU() {
        if (this.Lxb.VVE()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdShow");
        } else {
            this.Lxb.NXR();
        }
        this.Lxb.kqm();
    }

    public void LD(Activity activity) {
    }

    public abstract void LD(boolean z);

    public abstract View Lxb();

    public void Lxb(Activity activity) {
    }

    public void STP() {
    }

    public void ZU(Activity activity) {
    }

    public LD aH() {
        return this.Lxb;
    }

    public abstract boolean a_();

    public abstract String b_();

    public void foI() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdClose");
        } else {
            this.Lxb.sLN();
        }
    }

    public void id() {
        if (this.OY != null) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("videoForceBreak", this.OY);
        }
        this.Lxb.Lxb(this);
    }

    public void kqm() {
    }

    public void lk(Activity activity) {
    }

    public abstract boolean tD();

    private void LD(final String str) {
        hg.lk(new OY("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.lc.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    lc.this.lk(1).executeFullVideoCallback(lc.this.DY(), str);
                } catch (Throwable th) {
                    sLN.Lxb("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void Lxb(Activity activity, Bundle bundle) {
    }

    public final IListenerManager lk(int i) {
        if (this.JVA == null) {
            this.JVA = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(i));
        }
        return this.JVA;
    }

    public void Lxb(Activity activity, LD.JXs jXs) {
    }

    public void Lxb(lc lcVar, lc lcVar2, LD.JXs jXs) {
    }

    public void Lxb(boolean z, boolean z2, boolean z3, int i) {
        this.Lxb.Lxb(this, z, z2, z3, i);
    }

    public void Lxb(String str) {
        if (a_()) {
            Lxb(str, false, 0, "", 0, "");
        } else {
            LD(str);
        }
    }

    private void Lxb(final String str, final boolean z, final int i, final String str2, final int i2, final String str3) {
        hg.lk(new OY("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.lc.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    lc.this.lk(0).executeRewardVideoCallback(lc.this.DY(), str, z, i, str2, i2, str3);
                } catch (Throwable th) {
                    sLN.Lxb("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public final void Lxb(boolean z, int i, String str, int i2, String str2) {
        if (this.Lxb.STP()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onRewardVerify", z, i, str, i2, str2);
            this.Lxb.IeN();
        } else {
            this.Lxb.Lxb(this, z, i, str, i2, str2);
        }
    }
}
