package com.bytedance.sdk.openadsdk.multipro.aidl.Lxb;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends Lxb {
    private static volatile LD LD;
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> Lxb = Collections.synchronizedMap(new HashMap());

    public static LD Lxb() {
        if (LD == null) {
            synchronized (LD.class) {
                try {
                    if (LD == null) {
                        LD = new LD();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        Lxb(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        Lxb.put(str, remoteCallbackList);
    }

    private synchronized void Lxb(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = Lxb;
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
                            IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i);
                            if (iAppOpenAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdShow();
                                } else if ("onAdClicked".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdClicked();
                                } else if ("onAdSkip".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdSkip();
                                } else if ("onAdTimeOver".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdTimeOver();
                                } else if ("recycleRes".equals(str2)) {
                                    iAppOpenAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            sLN.Lxb("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            sLN.Lxb("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th2);
        }
    }
}
