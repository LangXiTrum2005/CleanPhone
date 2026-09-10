package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mml;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mzz;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.wd;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static final qdl ud = new qdl();
    private ud lnr;
    private IBinderPool qdl;
    private long mml = 0;
    private final ServiceConnection mzz = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.qdl.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            fco.qdl(new jpc("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.qdl.2.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        qdl.this.qdl.asBinder().linkToDeath(qdl.this.mo, 0);
                    } catch (RemoteException e2) {
                        aaj.qdl("TTAD.BinderPool", "onServiceConnected throws :", e2);
                    }
                    System.currentTimeMillis();
                    long unused = qdl.this.mml;
                    if (qdl.this.lnr != null) {
                        qdl.this.lnr.onServiceConnected();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private final IBinder.DeathRecipient mo = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.qdl.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            fco.qdl(new jpc("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.qdl.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (qdl.this.qdl.asBinder().isBinderAlive()) {
                            qdl.this.qdl.asBinder().unlinkToDeath(qdl.this.mo, 0);
                        }
                    } catch (Exception e2) {
                        aaj.lnr("TTAD.BinderPool", e2.getMessage());
                    }
                    qdl.this.qdl = null;
                    qdl.this.mml();
                }
            }, 5);
        }
    };

    private qdl() {
        mml();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            lnr();
        }
    }

    public void lnr() {
        try {
            Context contextQdl = yt.qdl();
            contextQdl.bindService(new Intent(contextQdl, (Class<?>) BinderPoolService.class), this.mzz, 1);
            this.mml = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void ud() {
        try {
            Context contextQdl = yt.qdl();
            contextQdl.startService(new Intent(contextQdl, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public static qdl qdl() {
        return ud;
    }

    public void qdl(ud udVar) {
        this.lnr = udVar;
        if (this.qdl != null) {
            fco.qdl(new jpc("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (qdl.this.lnr != null) {
                        qdl.this.lnr.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder qdl(int i2) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                try {
                    IBinderPool iBinderPool = this.qdl;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i2);
                    }
                    return null;
                } catch (RemoteException e2) {
                    aaj.lnr("TTAD.BinderPool", e2.getMessage());
                    gy.jpc("queryBinder error");
                    return null;
                }
            }
            if (i2 == 0) {
                return wd.qdl();
            }
            if (i2 == 1) {
                return mzz.qdl();
            }
            if (i2 == 5) {
                return mo.ud();
            }
            if (i2 == 6) {
                return mml.qdl();
            }
            if (i2 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.qdl.ud.qdl();
        } catch (Throwable unused) {
            return null;
        }
    }
}
