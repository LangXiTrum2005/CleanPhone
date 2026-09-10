package com.bytedance.sdk.openadsdk.multipro.aidl.Lxb;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends Lxb {
    private static volatile lk LD;
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> Lxb = new HashMap<>();

    public static lk Lxb() {
        if (LD == null) {
            synchronized (lk.class) {
                try {
                    if (LD == null) {
                        LD = new lk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackListRemove = Lxb.remove(str);
        if (remoteCallbackListRemove == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remoteCallbackListRemove.getBroadcastItem(i);
            if (iCommonPermissionListener != null) {
                if (str2 == null) {
                    iCommonPermissionListener.onGranted();
                } else {
                    iCommonPermissionListener.onDenied(str2);
                }
            }
        }
        remoteCallbackListRemove.finishBroadcast();
        remoteCallbackListRemove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        Lxb.put(str, remoteCallbackList);
    }
}
