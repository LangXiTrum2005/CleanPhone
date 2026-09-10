package com.bytedance.sdk.openadsdk.multipro.aidl.Lxb;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends Lxb {
    private static volatile ebl LD;
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> Lxb = Collections.synchronizedMap(new HashMap());

    public static ebl Lxb() {
        if (LD == null) {
            synchronized (ebl.class) {
                try {
                    if (LD == null) {
                        LD = new ebl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        Lxb(str, str2, z, i, str3, i2, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        Lxb.put(str, remoteCallbackList);
    }

    private synchronized void Lxb(String str, String str2, boolean z, int i, String str3, int i2, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = Lxb;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = remoteCallbackListRemove;
                if (remoteCallbackList != null) {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                        try {
                            IRewardAdInteractionListener iRewardAdInteractionListener = (IRewardAdInteractionListener) remoteCallbackList.getBroadcastItem(i3);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z, i, str3, i2, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            sLN.Lxb("MultiProcess", "reward1 '" + str2 + "'  throws Exception :", th);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            sLN.Lxb("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th2);
        }
    }
}
