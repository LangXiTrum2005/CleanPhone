package com.bytedance.sdk.openadsdk.multipro.aidl.Lxb;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends Lxb {
    private static volatile JXs LD;
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> Lxb = Collections.synchronizedMap(new HashMap());

    public static JXs Lxb() {
        if (LD == null) {
            synchronized (JXs.class) {
                try {
                    if (LD == null) {
                        LD = new JXs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        Lxb(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        Lxb.put(str, remoteCallbackList);
    }

    private synchronized void Lxb(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = Lxb;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i);
                            if (iFullScreenVideoAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            sLN.Lxb("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            sLN.Lxb("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}
