package com.bytedance.sdk.openadsdk.multipro.aidl.LD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.Lxb.ZU.LD Lxb;

    public Lxb(com.bytedance.sdk.openadsdk.Lxb.ZU.LD ld) {
        this.Lxb = ld;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.Lxb();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.Lxb.3
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.LD();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.Lxb.4
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.lk();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        Lxb();
    }

    private void Lxb() {
        this.Lxb = null;
    }
}
