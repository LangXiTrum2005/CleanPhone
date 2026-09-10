package com.bytedance.sdk.openadsdk.multipro.aidl.Lxb;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends Lxb {
    private static volatile ZU LD;
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> Lxb = new ConcurrentHashMap<>();

    public static ZU Lxb() {
        if (LD == null) {
            synchronized (ZU.class) {
                try {
                    if (LD == null) {
                        LD = new ZU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        Lxb(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        Lxb.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Lxb.remove(str);
    }

    private synchronized void Lxb(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = Lxb;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        sLN.Lxb("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            sLN.Lxb("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
