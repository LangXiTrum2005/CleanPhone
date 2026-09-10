package com.bytedance.sdk.openadsdk.multipro.aidl.ud;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud qdl;

    public lnr(com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar) {
        this.qdl = udVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr.3
            @Override // java.lang.Runnable
            public void run() {
                if (lnr.this.qdl != null) {
                    lnr.this.qdl.ud();
                }
                lnr.this.qdl();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                if (lnr.this.qdl != null) {
                    lnr.this.qdl.qdl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr.2
            @Override // java.lang.Runnable
            public void run() {
                if (lnr.this.qdl != null) {
                    lnr.this.qdl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl() {
        this.qdl = null;
    }
}
