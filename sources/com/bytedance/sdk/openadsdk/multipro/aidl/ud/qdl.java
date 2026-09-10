package com.bytedance.sdk.openadsdk.multipro.aidl.ud;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.qdl.mml.ud qdl;

    public qdl(com.bytedance.sdk.openadsdk.qdl.mml.ud udVar) {
        this.qdl = udVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.qdl.2
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.qdl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.ud();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.qdl.4
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.lnr();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        qdl();
    }

    private void qdl() {
        this.qdl = null;
    }
}
