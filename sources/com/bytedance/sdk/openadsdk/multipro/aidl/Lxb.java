package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.JXs;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.ZU;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.ebl;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.lc;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static final Lxb LD = new Lxb();
    private IBinderPool Lxb;
    private LD lk;
    private long ZU = 0;
    private final ServiceConnection JXs = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            hg.Lxb(new OY("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.2.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.this.Lxb = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        Lxb.this.Lxb.asBinder().linkToDeath(Lxb.this.lc, 0);
                    } catch (RemoteException e) {
                        sLN.Lxb("TTAD.BinderPool", "onServiceConnected throws :", e);
                    }
                    System.currentTimeMillis();
                    long unused = Lxb.this.ZU;
                    if (Lxb.this.lk != null) {
                        Lxb.this.lk.onServiceConnected();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private final IBinder.DeathRecipient lc = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            hg.Lxb(new OY("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (Lxb.this.Lxb.asBinder().isBinderAlive()) {
                            Lxb.this.Lxb.asBinder().unlinkToDeath(Lxb.this.lc, 0);
                        }
                    } catch (Exception e) {
                        sLN.Lxb("TTAD.BinderPool", e.getMessage());
                    }
                    Lxb.this.Lxb = null;
                    Lxb.this.ZU();
                }
            }, 5);
        }
    };

    private Lxb() {
        ZU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            lk();
        }
    }

    public void LD() {
        try {
            Context contextLxb = kqm.Lxb();
            contextLxb.startService(new Intent(contextLxb, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public void lk() {
        try {
            Context contextLxb = kqm.Lxb();
            contextLxb.bindService(new Intent(contextLxb, (Class<?>) BinderPoolService.class), this.JXs, 1);
            this.ZU = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public static Lxb Lxb() {
        return LD;
    }

    public void Lxb(LD ld) {
        this.lk = ld;
        if (this.Lxb != null) {
            hg.Lxb(new OY("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Lxb.this.lk != null) {
                        Lxb.this.lk.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder Lxb(int i) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                try {
                    IBinderPool iBinderPool = this.Lxb;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e) {
                    sLN.Lxb("TTAD.BinderPool", e.getMessage());
                    nJ.OY("queryBinder error");
                    return null;
                }
            }
            if (i == 0) {
                return ebl.Lxb();
            }
            if (i == 1) {
                return JXs.Lxb();
            }
            if (i == 5) {
                return lc.LD();
            }
            if (i == 6) {
                return ZU.Lxb();
            }
            if (i != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.LD.Lxb();
        } catch (Throwable unused) {
            return null;
        }
    }
}
