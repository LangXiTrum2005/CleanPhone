package com.bytedance.sdk.openadsdk.multipro.aidl.LD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb Lxb;

    public ZU(com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb) {
        this.Lxb = lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.ZU.3
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.Lxb != null) {
                    ZU.this.Lxb.LD();
                }
                ZU.this.Lxb();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.Lxb != null) {
                    ZU.this.Lxb.Lxb();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.ZU.2
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.Lxb != null) {
                    ZU.this.Lxb.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z, final int i, final String str, final int i2, final String str2) throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.ZU.4
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.Lxb != null) {
                    ZU.this.Lxb.Lxb(z, i, str, i2, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb() {
        this.Lxb = null;
    }
}
