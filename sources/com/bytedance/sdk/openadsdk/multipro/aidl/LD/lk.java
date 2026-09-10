package com.bytedance.sdk.openadsdk.multipro.aidl.LD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.Lxb.lk.LD Lxb;

    public lk(com.bytedance.sdk.openadsdk.Lxb.lk.LD ld) {
        this.Lxb = ld;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.lk.3
            @Override // java.lang.Runnable
            public void run() {
                if (lk.this.Lxb != null) {
                    lk.this.Lxb.LD();
                }
                lk.this.Lxb();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.lk.1
            @Override // java.lang.Runnable
            public void run() {
                if (lk.this.Lxb != null) {
                    lk.this.Lxb.Lxb();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.lk.2
            @Override // java.lang.Runnable
            public void run() {
                if (lk.this.Lxb != null) {
                    lk.this.Lxb.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb() {
        this.Lxb = null;
    }
}
