package com.bytedance.sdk.openadsdk.multipro.aidl.LD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.lk.nBu;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends IDislikeClosedListener.Stub {
    private final String LD;
    private final com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb Lxb;

    public LD(String str, com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxb) {
        this.LD = str;
        this.Lxb = lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.LD.LD.1
            @Override // java.lang.Runnable
            public void run() {
                if (LD.this.Lxb != null) {
                    LD.this.Lxb.Lxb();
                    nBu.Lxb(6, LD.this.LD);
                }
            }
        });
    }
}
