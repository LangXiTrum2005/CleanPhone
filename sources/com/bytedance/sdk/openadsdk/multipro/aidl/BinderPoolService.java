package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.tvp;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mml;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mzz;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.wd;

/* JADX INFO: loaded from: classes3.dex */
public class BinderPoolService extends Service {
    private static boolean lnr;
    public static volatile boolean qdl;
    private final Binder ud = new qdl();

    public static class qdl extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i2) throws RemoteException {
            if (i2 == 0) {
                return wd.qdl();
            }
            if (i2 == 1) {
                return mzz.qdl();
            }
            if (i2 == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.qdl.lnr.qdl();
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
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.ud;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        yt.ud(getApplicationContext());
        qdl = true;
        if (!lnr) {
            tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    rq.lnr().lnr(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        lnr = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
