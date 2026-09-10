package com.bytedance.sdk.openadsdk.multipro.aidl.ud;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.mml.wd;
import com.bytedance.sdk.openadsdk.lnr.to;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends IDislikeClosedListener.Stub {
    private final wd.qdl qdl;
    private final String ud;

    public ud(String str, wd.qdl qdlVar) {
        this.ud = str;
        this.qdl = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ud.ud.1
            @Override // java.lang.Runnable
            public void run() {
                if (ud.this.qdl != null) {
                    ud.this.qdl.qdl();
                    to.qdl(6, ud.this.ud);
                }
            }
        });
    }
}
