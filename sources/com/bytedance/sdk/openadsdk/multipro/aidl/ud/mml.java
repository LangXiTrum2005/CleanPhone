package com.bytedance.sdk.openadsdk.multipro.aidl.ud;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdl;

    public mml(com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar) {
        this.qdl = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml.3
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.qdl != null) {
                    mml.this.qdl.ud();
                }
                mml.this.qdl();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml.1
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.qdl != null) {
                    mml.this.qdl.qdl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml.2
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.qdl != null) {
                    mml.this.qdl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z2, final int i2, final String str, final int i3, final String str2) throws RemoteException {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml.4
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.qdl != null) {
                    mml.this.qdl.qdl(z2, i2, str, i3, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl() {
        this.qdl = null;
    }
}
